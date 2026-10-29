package net.easyconn.gwmec.carlife

import android.content.Context
import android.hardware.usb.UsbConstants
import android.hardware.usb.UsbDevice
import android.hardware.usb.UsbDeviceConnection
import android.hardware.usb.UsbEndpoint
import android.hardware.usb.UsbInterface
import android.hardware.usb.UsbManager
import android.util.Log
import kotlin.concurrent.thread

/**
 * CarLife USB 有线传输：AOA 配件模式切换 + 单 bulk 管道上的通道多路复用。
 *
 * 协议对照原 APK（com.baidu.carlife SDK / c5 包）反编译结论：
 * - AOA 握手：GET_PROTOCOL(51) → SEND_STRING(52)×6 → START_ACCESSORY(53)；
 *   已在配件模式的设备 VID=0x18D1、PID=0x2D00..0x2D05，跳过握手。
 * - 配件身份串："Baidu","CarLife","Baidu CarLife","1.0.0",
 *   "http://carlife.baidu.com/","0720SerialNo."
 * - 多路复用帧（小端，区别于 WiFi 通道的大端帧头）：
 *   [int32LE channel][int32LE size][payload]，channel ∈ 1..7，size ≤ 64MB。
 * - 读写都在 interface 0：endpoint 0 = IN，endpoint 1 = OUT；
 *   与百度 SDK 一致：多路复用头用 timeout=0 阻塞，body 用 1000ms 分片读。
 */
class CarLifeUsbTransport(
    private val context: Context,
    private val onLog: (String) -> Unit,
) : CarLifeTransport {
    private var connection: UsbDeviceConnection? = null
    private var usbInterface: UsbInterface? = null
    private var endpointIn: UsbEndpoint? = null
    private var endpointOut: UsbEndpoint? = null
    private val header = ByteArray(8)
    @Volatile private var running = false
    private var dispatch: ((channel: Int, serviceType: Int, payload: ByteArray) -> Unit)? = null
    private var readerThread: Thread? = null
    private var writerThread: Thread? = null
    /** 待发帧队列，承担原版 SocketReadThread 里 ServerSocket 的角色。 */
    private val txQueue = java.util.concurrent.LinkedBlockingQueue<ByteArray>()
    /** 前若干帧打印 TX hex，便于对照原版，之后静默。 */
    private var txLogBudget = 24

    override fun start(onMessage: (channel: Int, serviceType: Int, payload: ByteArray) -> Unit): Boolean {
        dispatch = onMessage
        val manager = context.getSystemService(Context.USB_SERVICE) as? UsbManager ?: return fail("无 USB 服务")
        val device = findAccessory(manager) ?: return fail("未发现USB设备，请插入安卓手机")
        if (!manager.hasPermission(device)) {
            // 车机通常预授权系统 USB；未授权时请求一次，用户确认后由调用方重试。
            manager.requestPermission(device, permissionPendingIntent())
            return fail("USB设备需要授权，请在弹窗中允许")
        }
        return open(manager, device)
    }

    private fun permissionPendingIntent(): android.app.PendingIntent {
        val flags = if (android.os.Build.VERSION.SDK_INT >= 31) android.app.PendingIntent.FLAG_MUTABLE else 0
        return android.app.PendingIntent.getBroadcast(
            context, 0,
            android.content.Intent(ACTION_USB_PERMISSION).setPackage(context.packageName),
            flags,
        )
    }

    /** 记录用于自动重连的上下文（盒子/手机在 AOA 建立初期会多次重置）。 */
    private var reconnectManager: UsbManager? = null
    private var reconnectDevice: UsbDevice? = null
    private var reconnectAttempts = 0

    /**
     * 读取结束后的韧性重连：原版对盒子的实际行为是读取失败 → resetDevice →
     * 重新 open，若干轮后数据通路才稳定。这里复刻同样的循环。
     */
    private fun scheduleReconnect() {
        if (!running) return
        val manager = reconnectManager ?: return
        if (reconnectAttempts >= MAX_RECONNECT) { onLog("USB 重连次数用尽"); stop(); return }
        reconnectAttempts++
        val attempt = reconnectAttempts
        onLog("USB 断开，重连第 $attempt/$MAX_RECONNECT 次…")
        thread(name = "CarLife-UsbReconnect") {
            Thread.sleep(1200L)
            if (!running) return@thread
            // 先停掉旧读写线程：它们手里握着已关闭 connection 的旧引用，
            // 不先停就重开，会变成新旧两组线程抢同一个端点。
            stopIoThreads()
            release()
            val fresh = manager.deviceList.values.firstOrNull { isAccessory(it) }
                ?: manager.deviceList.values.firstOrNull { it == reconnectDevice }
                ?: manager.deviceList.values.firstOrNull()
            if (fresh == null) { onLog("USB 设备已拔出"); stop(); return@thread }
            reconnectDevice = fresh
            if (open(manager, fresh, onMessageSink ?: return@thread)) {
                reconnectAttempts = 0
                onLog("USB 已重连，继续握手")
                // 版本协商必须走 send() 入队，由写线程发出；直接 dispatch 会绕过 USB。
                send(CarLifeProtocol.CHANNEL_CMD, CarLifeProtocol.MSG_HU_PROTOCOL_VERSION,
                    CarLifeMessages.protocolVersion(4, 0), 0)
            } else {
                scheduleReconnect()
            }
        }
    }

    @Volatile private var onMessageSink: ((Int, Int, ByteArray) -> Unit)? = null

    /** 停掉当前读写线程（重连前调用，避免旧线程持着已关闭的连接继续读）。 */
    private fun stopIoThreads() {
        try { readerThread?.interrupt() } catch (_: Exception) {}
        try { writerThread?.interrupt() } catch (_: Exception) {}
        readerThread = null
        writerThread = null
        txQueue.clear()
    }

    /** 真正打开设备并启动读线程；AOA 切换指令发出后设备会重新枚举，需要等重新插入。 */
    fun open(manager: UsbManager, device: UsbDevice, onMessage: (channel: Int, serviceType: Int, payload: ByteArray) -> Unit = { _, _, _ -> }): Boolean {
        reconnectManager = manager
        reconnectDevice = device
        onMessageSink = onMessage
        val conn = manager.openDevice(device) ?: return fail("USB设备打开失败，请重新插拔USB线")
        val iface = device.getInterface(0)
        if (!conn.claimInterface(iface, true)) {
            conn.close(); return fail("USB 接口声明失败")
        }
        connection = conn
        usbInterface = iface
        // 与百度 SDK 一致：getEndpoint(0) 读，getEndpoint(1) 写。
        endpointIn = iface.getEndpoint(0)
        endpointOut = iface.getEndpoint(1)
        if (endpointIn == null || endpointOut == null) {
            release(); return fail("USB 端点不可用（IN/OUT 缺失）")
        }
        if (!isAccessory(device)) {
            when (aoaHandshake(conn)) {
                AoaResult.ALREADY -> Unit
                AoaResult.SWITCHED -> {
                    release()
                    return fail("已发送AOA切换指令，手机重新识别后自动继续")
                }
                AoaResult.UNSUPPORTED -> { release(); return fail("该手机不支持AOA配件模式，请改用无线连接") }
            }
        }
        running = true
        readerThread = Thread({ readLoop() }, "CarLife-UsbRead").apply { start() }
        writerThread = Thread({ writeLoop() }, "CarLife-UsbWrite").apply { start() }
        onLog("USB设备连接成功")
        return true
    }

    private enum class AoaResult { ALREADY, SWITCHED, UNSUPPORTED }

    private fun isAccessory(d: UsbDevice) =
        d.vendorId == AOA_VID && d.productId in AOA_PIDS

    private fun aoaHandshake(conn: UsbDeviceConnection): AoaResult {
        val proto = ByteArray(2)
        val got = conn.controlTransfer(0xC0, 51, 0, 0, proto, 2, 0)
        if (got < 0) return AoaResult.UNSUPPORTED
        ACCESSORY_STRINGS.forEachIndexed { index, value ->
            val bytes = value.toByteArray(Charsets.UTF_8)
            if (conn.controlTransfer(0x40, 52, 0, index, bytes, bytes.size, 0) < 0) {
                onLog("AOA 身份串 $index 发送失败")
            }
        }
        val started = conn.controlTransfer(0x40, 53, 0, 0, null, 0, 0)
        return if (started >= 0) AoaResult.SWITCHED else AoaResult.UNSUPPORTED
    }

    private fun findAccessory(manager: UsbManager): UsbDevice? =
        manager.deviceList.values.firstOrNull { isAccessory(it) }
            ?: manager.deviceList.values.firstOrNull {
                // 常见安卓手机厂商 VID；仅作为“插了安卓手机”的启发提示，
                // 真正能否 AOA 由握手决定。
                it.vendorId in PHONE_VID_HINTS && it.deviceClass != 0
            }
            ?: manager.deviceList.values.firstOrNull()

    /**
     * 读线程：独占 bulk IN，严格照原版 AOAReadThread。
     *
     * 原版一个线程只碰 IN，另一个（SocketReadThread）只碰 OUT，两者从不并发。
     * 我们之前读写在同一个 connection 上并发调用 bulkTransfer，内核直接回 -1。
     */
    private fun readLoop() {
        val conn = connection ?: return
        val ep = endpointIn ?: return
        val msgHead = ByteArray(LEN_OF_MSG_HEAD)
        var payload = ByteArray(12)
        try {
            while (running) {
                // 原版：bulkTransferIn(msgHead, 8)，TIME_OUT = 0，读到才返回
                val nHead = bulkTransferIn(conn, ep, msgHead, LEN_OF_MSG_HEAD)
                if (nHead < 0) { onLog("bulkTransferIn fail 1 (ret=$nHead)"); break }
                if (nHead == 0) continue

                val typeMsg = beInt(msgHead, 0)
                val lenMsg = beInt(msgHead, 4)
                if (typeMsg < 1 || typeMsg > 6 || lenMsg < 8 || lenMsg > AOA_MAX_BYTES) {
                    onLog("typeMsg=$typeMsg lenMsg=$lenMsg 非法")
                    break
                }

                if (payload.size < lenMsg) payload = ByteArray(lenMsg)
                val nBody = bulkTransferIn(conn, ep, payload, lenMsg)
                if (nBody < 0) { onLog("bulkTransferIn fail 2 (ret=$nBody)"); break }

                // 原版按通道把整段（内头+载荷）交给上层
                val msg = payload.copyOfRange(0, lenMsg)
                val (serviceType, inner) = splitChannelFrame(typeMsg, msg)
                dispatch?.invoke(typeMsg, serviceType, inner)
            }
        } catch (e: Exception) {
            if (running) onLog("读线程异常: ${e.message}")
        }
        if (running) {
            onLog("读取结束")
            release(resetDevice = true)
            scheduleReconnect()
        }
    }

    /**
     * 写线程：独占 bulk OUT，照原版 SocketReadThread。
     *
     * 原版从 ServerSocket 读待发数据再写 USB；这里用队列承担同样的角色，
     * send() 只入队，绝不直接碰 connection。
     */
    private fun writeLoop() {
        val conn = connection ?: return
        val ep = endpointOut ?: return
        // 原版复用 this.header 和 mDataBuffer 两个固定缓冲；这里同样只分配一次。
        val head = ByteArray(LEN_OF_MSG_HEAD)
        val body = ByteArray(AOA_WRITE_CHUNK)
        // 对应原版 mDataBuffer：长包分段时的落点
        val scratch = ByteArray(AOA_WRITE_CHUNK)
        try {
            while (running) {
                val queued = txQueue.poll(200, java.util.concurrent.TimeUnit.MILLISECONDS) ?: continue
                if (queued.size <= 4) continue

                // 队列元素 = [4B BE channel][整帧]；整帧长度就是原版 getSize()
                val channel = beInt(queued, 0)
                val frameLen = queued.size - 4
                System.arraycopy(queued, 4, body, 0, frameLen)
                beBytes(channel, head, 0)
                beBytes(frameLen, head, 4)

                // 日志放在写之前：写阻塞时也能看到实际交给端点的字节
                if (txLogBudget > 0) {
                    txLogBudget--
                    onLog("TX ch=$channel len=$frameLen hdr=" +
                        head.joinToString("") { "%02X".format(it) } +
                        " body=" + body.copyOfRange(0, minOf(frameLen, 24)).joinToString("") { "%02X".format(it) })
                }

                if (bulkTransferOutFixed(conn, ep, head, LEN_OF_MSG_HEAD, scratch) <= 0) {
                    onLog("bulkTransferOut fail 1"); break
                }
                if (frameLen > 0 && bulkTransferOutFixed(conn, ep, body, frameLen, scratch) <= 0) {
                    onLog("bulkTransferOut fail 2"); break
                }
            }
        } catch (e: Exception) {
            if (running) onLog("写线程异常: ${e.message}")
        }
    }

    /**
     * 照抄 AOAHostSetup.bulkTransferOut(data, len)。
     *
     * 短包（<= 16KB）单次调用，长度传实际字节数；长包才拷进固定的 mDataBuffer
     * 分段发。千万别把固定缓冲的 buf.size 当长度传出去——那样会把声明 12 字节的
     * 帧连 16KB 垃圾一起灌进端点，盒子直接不认。
     */
    private fun bulkTransferOutFixed(
        conn: UsbDeviceConnection,
        ep: UsbEndpoint,
        data: ByteArray,
        len: Int,
        scratch: ByteArray,
    ): Int {
        if (len <= 0) return 0
        if (len <= AOA_WRITE_CHUNK) {
            val n = conn.bulkTransfer(ep, data, len, 0)
            return if (n <= 0) -1 else n
        }
        var sent = 0
        while (sent < len) {
            val chunk = Math.min(len - sent, AOA_WRITE_CHUNK)
            System.arraycopy(data, sent, scratch, 0, chunk)
            val n = conn.bulkTransfer(ep, scratch, chunk, 0)
            if (n <= 0) return if (sent > 0) sent else -1
            sent += n
        }
        return sent
    }

    /** 原版 bulkTransferIn：0 表示无限等待，负数才是断链。 */
    /**
     * 原版 AOAHostSetup.bulkTransferIn：整段读，timeout 0。
     *
     * 注意不要用 bulkTransfer(ep, buf, offset, length, timeout)：offset 非 0 时
     * 部分内核/设备组合会直接返回 -1。原版永远从缓冲区起点收发。
     */
    /**
     * 照抄 AOAHostSetup.bulkTransferIn：TIME_OUT = 0，无限阻塞。
     *
     * 返回值语义与原版一致：
     *   > 0  读到字节
     *   == 0 本次没数据（原版 return 0，由调用方继续循环，不是失败）
     *   < 0  真正断链
     * 不要在这里加超时兜底——3 秒兜底会把"手机还没回"误判成断链，
     * 上一版就是这么把自己读断的。
     */
    private fun bulkTransferIn(conn: UsbDeviceConnection, ep: UsbEndpoint, buf: ByteArray, len: Int): Int {
        var total = 0
        while (total < len) {
            if (!running) return -1
            val n = conn.bulkTransfer(ep, buf, total, len - total, 0)
            if (n < 0) return if (total > 0) total else -1
            if (n == 0) continue
            total += n
        }
        return total
    }

    private fun splitChannelFrame(channel: Int, payload: ByteArray): Pair<Int, ByteArray> {
        return try {
            val (len, _, serviceType) = CarLifeProtocol.parseHeader(channel, payload)
            val headerLen = CarLifeProtocol.headerSize(channel)
            val body = if (len in 1..payload.size) payload.copyOfRange(headerLen, Math.min(payload.size, headerLen + len)) else ByteArray(0)
            serviceType to body
        } catch (e: Exception) {
            0 to payload
        }
    }

    override fun send(channel: Int, serviceType: Int, payload: ByteArray, seqOrTs: Int): Boolean {
        if (!running) return false
        val frame = CarLifeProtocol.pack(channel, serviceType, payload, seqOrTs)
        // 交给写线程，调用方不碰 USB。队列元素 = [4B BE channel][整帧]，与 writeLoop 对齐。
        val queued = ByteArray(4 + frame.size)
        beBytes(channel, queued, 0)
        System.arraycopy(frame, 0, queued, 4, frame.size)
        return txQueue.offer(queued)
    }

    override fun stop() {
        running = false
        stopIoThreads()
        release()
    }

    /**
     * 关闭连接。正常停止只释放接口，不碰设备本身。
     *
     * resetDevice 是破坏性的：盒子会重新枚举，正在跑的数据通路也会断。百度 SDK 只在
     * 异常终止（terminate(true)）时才复位，正常停止走 terminate(false)。这里照做，
     * 否则每次退出都白白折腾一遍盒子。
     */
    private fun release(resetDevice: Boolean = false) {
        try { usbInterface?.let { connection?.releaseInterface(it) } } catch (_: Exception) {}
        if (resetDevice) {
            try {
                connection?.let { conn -> conn.javaClass.getMethod("resetDevice").invoke(conn) }
            } catch (_: Exception) {}
        }
        try { connection?.close() } catch (_: Exception) {}
        connection = null; usbInterface = null; endpointIn = null; endpointOut = null
    }

    private fun fail(msg: String): Boolean { onLog(msg); return false }

    companion object {
        const val ACTION_USB_PERMISSION = "net.easyconn.gwmec.carlife.USB_PERMISSION"
        const val AOA_VID = 0x18D1
        val AOA_PIDS = 0x2D00..0x2D05
        val ACCESSORY_STRINGS = arrayOf(
            "Baidu", "CarLife", "Baidu CarLife", "1.0.0", "http://carlife.baidu.com/", "0720SerialNo.",
        )
        val PHONE_VID_HINTS = setOf(0x04E8, 0x2717, 0x12D1, 0x22D9, 0x2A70, 0x18D1, 0x0BB4, 0x054C)
        /** 与原版 LEN_OF_MSG_HEAD 一致：多路复用头 8 字节。 */
        private const val LEN_OF_MSG_HEAD = 8
        /** 原版 AOA_MAX_BYTES。 */
        private const val AOA_MAX_BYTES = 64 * 1024 * 1024
        /** 原版 AOA_MAX_BUFFER_BYTES：单次 bulkTransfer 上限 16KB。 */
        private const val AOA_WRITE_CHUNK = 16 * 1024
        private const val MAX_MESSAGE = 64 * 1024 * 1024
        private const val TOTAL_TIMEOUT_NS = 30_000_000_000L
        private const val MAX_RECONNECT = 12

        fun beBytes(v: Int) = byteArrayOf(
            (v ushr 24).toByte(), (v ushr 16).toByte(), (v ushr 8).toByte(), v.toByte())

        /** 写入 BE 整数到固定缓冲，避免每次发送都新建数组。 */
        fun beBytes(v: Int, out: ByteArray, off: Int = 0) {
            out[off] = (v ushr 24).toByte()
            out[off + 1] = (v ushr 16).toByte()
            out[off + 2] = (v ushr 8).toByte()
            out[off + 3] = v.toByte()
        }
        fun beInt(b: ByteArray, off: Int) =
            ((b[off].toInt() and 0xFF) shl 24) or ((b[off + 1].toInt() and 0xFF) shl 16) or
                ((b[off + 2].toInt() and 0xFF) shl 8) or (b[off + 3].toInt() and 0xFF)
    }
}
