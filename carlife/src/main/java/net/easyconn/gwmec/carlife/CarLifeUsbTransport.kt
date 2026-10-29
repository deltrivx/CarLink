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
    /** 当前要打开的 accessory 实例是本进程刚切出来的，不需要再补发身份串。 */
    @Volatile private var assumeCleanAccessory = false

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
                // 不在这里清零：open() 成功不等于链路可用，紧接着 -1 失败的话
                // 计数会被重置，重连上限形同虚设，变成连上→失败→再连的死循环。
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
        if (isAccessory(device)) {
            // 已是配件模式：不再发 START_ACCESSORY（对已切换的设备无效，只会把 open()
            // 变成"发一次→释放→重连"的死循环）。但把 6 条 AOA 身份串重发一遍是安全的
            // ——SEND_STRING 只写字符串，不改设备模式，却能让盒子的配件协议栈重新拿到
            // 主机身份、真正进入可通信状态。遗留的 2d00 实例能收 USB 包却不解析
            // CarLife 帧，就是缺这一步。
            onLog("设备已是配件模式，补发 AOA 身份串")
            resendIdentities(conn)
        } else {
            when (aoaHandshake(conn)) {
                AoaResult.ALREADY -> Unit
                AoaResult.SWITCHED -> {
                    // 原版 changeToAccessoryMode() 之后是把控制权交回扫描循环，
                    // 下一轮 scanUsbDevices 发现 2d00 就接着 initUsbDevice。
                    // 原来这里直接 fail 返回，等一个永远不会来的"自动继续"，
                    // 插线后界面就一直停在连接不上。
                    release()
                    onLog("已发送AOA切换指令，等待设备重新枚举")
                    return awaitAccessoryReenumeration()
                }
                AoaResult.UNSUPPORTED -> { release(); return fail("该手机不支持AOA配件模式，请改用无线连接") }
            }
        }
        running = true
        // 原版 initUsbDevice 在 isAccessoryMode() 分支里先起 socket 线程，
        // Thread.sleep(SLEEP_TIME_MS) 睡 1000ms，再起读线程。
        // 这一秒是给盒子 AOA 固件把协议栈拉起来的时间：这段时间里它能收 USB 包
        // （bulkTransferOut 不报错），但还不解析 CarLife 帧，协商帧会被直接丢掉。
        // 之前连接成功后 5ms 就发版本协商，手机自然回不了。
        onLog("USB设备连接成功，等待设备就绪")
        Thread.sleep(AOA_READY_DELAY_MS)
        if (!running) { release(); return fail("连接被取消") }
        readerThread = Thread({ readLoop() }, "CarLife-UsbRead").apply { start() }
        writerThread = Thread({ writeLoop() }, "CarLife-UsbWrite").apply { start() }
        return true
    }

    /**
     * AOA 切换后等盒子以 18d1:2d00 重新枚举出来，然后接着打开它继续握手。
     * 对应原版扫描循环的下一轮；等不到就明确失败，不再留一个悬空的"自动继续"。
     */
    private fun awaitAccessoryReenumeration(): Boolean {
        val manager = reconnectManager ?: return fail("USB 管理器不可用")
        val deadline = System.currentTimeMillis() + AOA_REENUM_TIMEOUT_MS
        var polled = 0
        while (System.currentTimeMillis() < deadline) {
            Thread.sleep(300)
            if (!running && polled > 0) return fail("连接被取消")
            polled++
            val fresh = manager.deviceList.values.firstOrNull { isAccessory(it) } ?: continue
            onLog("盒子已重新枚举为配件模式，继续握手")
            reconnectDevice = fresh
            // 这个实例是刚刚自己切出来的，不需要再补发身份串。
            assumeCleanAccessory = true
            val opened = open(manager, fresh, onMessageSink ?: return fail("消息通道未就绪"))
            assumeCleanAccessory = false
            return opened
        }
        return fail("切换 AOA 后设备未重新枚举，请重新插拔盒子")
    }

    private enum class AoaResult { ALREADY, SWITCHED, UNSUPPORTED }

    private fun isAccessory(d: UsbDevice) =
        d.vendorId == AOA_VID && d.productId in AOA_PIDS

    /**
     * 只补发身份串，不发 START_ACCESSORY：对已经处于 accessory 模式的设备，
     * 这一步只是让固件的配件协议栈重新绑定主机身份，不触发重新枚举。
     */
    private fun resendIdentities(conn: UsbDeviceConnection) {
        ACCESSORY_STRINGS.forEachIndexed { index, value ->
            val bytes = value.toByteArray(Charsets.UTF_8)
            if (conn.controlTransfer(0x40, 52, 0, index, bytes, bytes.size, 0) < 0) {
                onLog("AOA 身份串 $index 补发失败")
            }
        }
    }

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
            // 不 reset：原版读失败只是重新 openAccessory，reset 会把盒子打回普通模式
            // （0bb4:1001），重连又要重走 AOA 切换，来回震荡反而更连不上。
            release()
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

    /** 连接对象在、运行标志在、读写线程都还没死，才算活着。 */
    override fun isAlive(): Boolean =
        running && connection != null &&
            readerThread?.isAlive == true && writerThread?.isAlive == true

    /**
     * 版本协商超时后的重连：链路没报错，只是手机这轮没在听。
     * 走一遍和读失败相同的重开流程，让盒子和手机重新对齐。
     */
    override fun retryHandshake() {
        if (!running) return
        onLog("手机本轮未响应，重新打开 USB 再试")
        scheduleReconnect()
    }

    override fun stop() {
        running = false
        stopIoThreads()
        // 原版 AOAConnectManager.uninit() 在 CONNECTED_BY_AOA 时调 resetUsb()：
        // 断开就把盒子打回普通模式（0bb4:1001），下次连接自然会重新走完整 AOA 切换，
        // 拿到一个干净实例。不清场的话盒子一直挂在 2d00，第二次连接接手的是
        // 半死实例——能收发 USB 包却不解析 CarLife 帧，版本协商永远没回应。
        release(resetDevice = true)
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
        /** 原版 AOAHostSetup.SLEEP_TIME_MS：起读线程前的设备就绪等待。 */
        private const val AOA_READY_DELAY_MS = 1000L
        /** AOA 切换后等盒子重新枚举成配件模式的时限。 */
        private const val AOA_REENUM_TIMEOUT_MS = 8000L
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
