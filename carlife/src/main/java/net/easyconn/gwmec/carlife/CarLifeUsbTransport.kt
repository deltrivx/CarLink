package net.easyconn.gwmec.carlife

import android.content.Context
import android.hardware.usb.UsbDevice
import android.hardware.usb.UsbDeviceConnection
import android.hardware.usb.UsbEndpoint
import android.hardware.usb.UsbInterface
import android.hardware.usb.UsbManager
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
 * - 读写都在 interface 0：endpoint 0 = IN，endpoint 1 = OUT。
 *
 * 授权生命周期对齐原版（仅首次初始化连接弹授权窗）：
 * 本传输是进程级单例（obtain）。断开时不关闭 USB 连接——手机保持配件模式、
 * 系统授权不丢，读写线程停驻待命；下次 start() 直接复用同一连接，
 * 不再触发系统授权弹窗，也不再重走 AOA 切换。只有设备真的消失（拔线）
 * 或授权失效才丢弃连接，回到完整流程。
 */
class CarLifeUsbTransport private constructor(
    private val context: Context,
    private val onLog: (String) -> Unit,
) : CarLifeTransport {
    override var onLinkLost: (() -> Unit)? = null

    override fun start(onMessage: (channel: Int, serviceType: Int, payload: ByteArray) -> Unit): Boolean {
        dispatch = onMessage
        val manager = context.getSystemService(Context.USB_SERVICE) as? UsbManager ?: return fail("无 USB 服务")

        // 先试复用保留的配件连接：设备还在、授权还在 → 直接接着用（对齐原版仅首次弹窗）。
        val kept = reconnectDevice
        if (connection != null && kept != null && isAccessory(kept)) {
            val stillThere = manager.deviceList.values.any { it.deviceName == kept.deviceName }
            if (stillThere && manager.hasPermission(kept)) {
                onLog("复用已授权的配件连接（对齐原版：仅首次连接弹授权）")
                running = true
                ensureIoThreads()
                return true
            }
            onLog("保留的配件已拔出或授权失效，走完整连接流程")
            discardRetained()
        }

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

    private fun fail(msg: String): Boolean { onLog(msg); return false }

    /** 记录用于自动重连的上下文（盒子/手机在 AOA 建立初期会多次重置）。 */
    private var reconnectManager: UsbManager? = null
    private var reconnectDevice: UsbDevice? = null

    private var connection: UsbDeviceConnection? = null
    private var usbInterface: UsbInterface? = null
    private var endpointIn: UsbEndpoint? = null
    private var endpointOut: UsbEndpoint? = null
    private var readerThread: Thread? = null
    private var writerThread: Thread? = null
    private val txQueue = java.util.concurrent.LinkedBlockingQueue<ByteArray>()
    @Volatile private var running = false
    @Volatile private var dispatch: ((channel: Int, serviceType: Int, payload: ByteArray) -> Unit)? = null
    @Volatile private var isReconnecting = false
    @Volatile private var onMessageSink: ((Int, Int, ByteArray) -> Unit)? = null
    private var reconnectAttempts = 0

    /** 真正打开设备并启动读写线程；AOA 切换指令发出后设备会重新枚举，需要等重新插入。 */
    fun open(manager: UsbManager, device: UsbDevice, onMessage: (channel: Int, serviceType: Int, payload: ByteArray) -> Unit = { _, _, _ -> }): Boolean {
        reconnectManager = manager
        reconnectDevice = device
        dispatch = onMessage
        onMessageSink = onMessage
        // AOA 切换会生成新的配件实例（18d1:2d00），它的授权与手机普通模式实例相互独立。
        // 原版 UsbAccessoryScanner 对每个新枚举设备都会补授权；这里漏了配件这一环，
        // 导致「允许了手机弹窗 → 切配件 → 新实例无授权 → openDevice=null → 永远连不上」，
        // 且每次重枚举又对手机实例重新弹窗——表现为每次连接都弹、一次都连不上。
        if (!manager.hasPermission(device)) {
            manager.requestPermission(device, permissionPendingIntent())
            return fail(if (isAccessory(device)) "USB配件需要授权，请在弹窗中允许" else "USB设备需要授权，请在弹窗中允许")
        }
        val conn = manager.openDevice(device) ?: return fail("USB设备打开失败，请重新插拔USB线")
        val iface = device.getInterface(0)
        if (!conn.claimInterface(iface, true)) {
            conn.close(); return fail("USB 接口声明失败")
        }
        connection = conn
        usbInterface = iface
        // 严格对齐原版 UsbAccessoryCommunicator: getEndpoint(0) 读，getEndpoint(1) 写
        endpointIn = iface.getEndpoint(0)
        endpointOut = iface.getEndpoint(1)
        if (endpointIn == null || endpointOut == null) {
            release(); return fail("USB 端点不可用（IN/OUT 缺失）")
        }
        if (isAccessory(device)) {
            // 严格对齐原版 UsbAccessoryStarter.openAccessory()：if (isAccessory()) return true;
            // 绝不在已枚举的配件上发 controlTransfer，直接使用原有端点正常通信！
            onLog("设备已是配件模式，直接建立连接通道")
        } else {
            when (aoaHandshake(conn)) {
                AoaResult.ALREADY -> Unit
                AoaResult.SWITCHED -> {
                    // 原版 changeToAccessoryMode() 之后把控制权交回扫描循环，
                    // 下一轮发现 2d00 就接着 initUsbDevice。
                    release()
                    onLog("已发送AOA切换指令，等待设备重新枚举")
                    return awaitAccessoryReenumeration()
                }
                AoaResult.UNSUPPORTED -> { release(); return fail("该手机不支持AOA配件模式，请改用无线连接") }
            }
        }
        running = true
        reconnectAttempts = 0  // 成功建立即重置预算，避免跨会话累计（审计 P2-2）
        // 原版 initUsbDevice 在 isAccessoryMode() 分支里先起 socket 线程，
        // Thread.sleep(SLEEP_TIME_MS) 睡 1000ms 再起读线程：给配件固件拉起协议栈的时间。
        onLog("USB设备连接成功，等待设备就绪")
        Thread.sleep(AOA_READY_DELAY_MS)
        if (!running) { release(); return fail("连接被取消") }
        ensureIoThreads()
        return true
    }

    /** 读写线程活着就复用（保留停驻），死了才重建。 */
    private fun ensureIoThreads() {
        if (readerThread?.isAlive != true) {
            readerThread = Thread({ readLoop() }, "CarLife-UsbRead").apply { start() }
        }
        if (writerThread?.isAlive != true) {
            writerThread = Thread({ writeLoop() }, "CarLife-UsbWrite").apply { start() }
        }
    }

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
            return open(manager, fresh, dispatch ?: return fail("消息通道未就绪"))
        }
        return fail("切换 AOA 后设备未重新枚举，请重新插拔盒子")
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

    /** 韧性重连：读取失败 → 重开设备，若干轮后数据通路才稳定（对齐原版盒子行为）。 */
    private fun scheduleReconnect() {
        if (!running || isReconnecting) return
        isReconnecting = true
        val manager = reconnectManager ?: run { isReconnecting = false; return }
        if (reconnectAttempts >= MAX_RECONNECT) {
            onLog("USB 重连次数用尽")
            isReconnecting = false
            stop()
            // 重启用尽 = 链路死亡，上报会话层收尾（审计 P1-1）
            onLinkLost?.invoke()
            return
        }
        reconnectAttempts++
        val attempt = reconnectAttempts
        onLog("USB 断开，重连第 $attempt/$MAX_RECONNECT 次…")
        thread(name = "CarLife-UsbReconnect") {
            try {
                // 对齐原版：resetDevice 后 ~3s 重扫成功（端点复位+重枚举需要时间），1.2s 会撞上设备未就绪。
                Thread.sleep(RECONNECT_DELAY_MS)
                if (!running) return@thread
                discardConnection()
                val fresh = manager.deviceList.values.firstOrNull { isAccessory(it) }
                    ?: manager.deviceList.values.firstOrNull { it == reconnectDevice }
                    ?: manager.deviceList.values.firstOrNull()
                if (fresh == null) { onLog("USB 设备已拔出"); stop(); return@thread }
                reconnectDevice = fresh
                if (open(manager, fresh, onMessageSink ?: return@thread)) {
                    onLog("USB 已重连，继续握手")
                    send(CarLifeProtocol.CHANNEL_CMD, CarLifeProtocol.MSG_HU_PROTOCOL_VERSION,
                        CarLifeMessages.protocolVersion(4, 0), 0)
                } else {
                    isReconnecting = false
                    scheduleReconnect()
                }
            } finally {
                isReconnecting = false
            }
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

    /** 版本协商超时后的重连：链路没报错，只是手机这轮没在听。 */
    override fun retryHandshake() {
        if (!running) return
        onLog("手机本轮未响应，重新打开 USB 再试")
        scheduleReconnect()
    }

    override fun stop() {
        val retain = connection != null && reconnectDevice?.let { isAccessory(it) } == true
        if (retain) {
            // 对齐原版：正常断开不释放连接、不打回普通模式——手机保持配件模式、
            // 授权不丢，IO 线程停驻待命，下次连接直接复用（仅首次连接弹授权）。
            // 先给断开帧（VALUE_DISCONNECT）一个发送窗口，再停驻。
            try { writerThread?.join(800) } catch (_: InterruptedException) {}
            running = false
            onLog("配件连接保留待复用（不断开 USB，不重复授权）")
            return
        }
        running = false
        discardConnection()
    }

    /** 关闭连接并结束 IO 线程（设备已消失/授权失效/彻底清场时用）。 */
    private fun discardConnection() {
        // 先关连接解除 bulkTransfer 阻塞，线程自行退出。
        try { connection?.close() } catch (_: Exception) {}
        try { readerThread?.interrupt() } catch (_: Exception) {}
        try { writerThread?.interrupt() } catch (_: Exception) {}
        readerThread = null
        writerThread = null
        txQueue.clear()
        release(resetDevice = false)
    }

    private fun discardRetained() = discardConnection()

    /**
     * 关闭连接。正常停止只释放接口，不碰设备本身。
     * resetDevice 是破坏性的：设备会重新枚举，正在跑的数据通路也会断，只用于异常终止。
     */
    private fun release(resetDevice: Boolean = false) {
        // 对齐原版 terminate(resetUsbDevice=true)：连接还开着时先 resetDevice（实测 result:true），
        // 再释放接口与关闭。复位会让设备重新枚举，僵死端点随之恢复。
        if (resetDevice) {
            try {
                connection?.let { conn -> conn.javaClass.getMethod("resetDevice").invoke(conn) }
            } catch (_: Exception) {}
        }
        try { usbInterface?.let { connection?.releaseInterface(it) } } catch (_: Exception) {}
        try { connection?.close() } catch (_: Exception) {}
        connection = null; usbInterface = null; endpointIn = null; endpointOut = null
    }

    /**
     * 读线程：独占 bulk IN，严格照原版 AOAReadThread。
     * 会话停驻（!running）时每 150ms 醒一次等待复用，不再钉死在内核 bulkTransfer 里。
     */
    private fun readLoop() {
        val msgHead = ByteArray(LEN_OF_MSG_HEAD)
        var payload = ByteArray(12)
        while (true) {
            if (!running) { Thread.sleep(150); continue }
            val conn = connection ?: return
            val ep = endpointIn ?: return
            try {
                while (running) {
                    val nHead = bulkTransferIn(conn, ep, msgHead, LEN_OF_MSG_HEAD, /* timeoutMs= */ 0)
                    if (nHead == 0) continue
                    if (nHead < 0) { onLog("bulkTransferIn fail 1 (ret=$nHead)"); break }

                    val typeMsg = beInt(msgHead, 0)
                    val lenMsg = beInt(msgHead, 4)
                    if (typeMsg < 1 || typeMsg > 6 || lenMsg < 8 || lenMsg > AOA_MAX_BYTES) {
                        onLog("typeMsg=$typeMsg lenMsg=$lenMsg 非法")
                        break
                    }

                    if (payload.size < lenMsg) payload = ByteArray(lenMsg)
                    // 原版 body 读 timeout=1000（UsbAccessoryCommunicator.read）。
                    val nBody = bulkTransferIn(conn, ep, payload, lenMsg, /* timeoutMs= */ 1000)
                    if (nBody < 0) { onLog("bulkTransferIn fail 2 (ret=$nBody)"); break }

                    val msg = payload.copyOfRange(0, lenMsg)
                    val (serviceType, inner) = splitChannelFrame(typeMsg, msg)
                    dispatch?.invoke(typeMsg, serviceType, inner)
                }
            } catch (_: InterruptedException) {
                return
            } catch (e: Exception) {
                if (running) onLog("读线程异常: ${e.message}")
            }
            if (!running) continue
            onLog("读取结束")
            // 对齐原版 UsbAccessoryCommunicator：读失败 terminate(resetUsbDevice=true)。
            // 实测（原版 APK 复现）：前一进程 close 后盒子端点僵死，首次 open 必 EIO，
            // 原版靠 resetDevice(true) 复位后 3 秒重扫恢复（15:56:35 resetDevice→15:56:38 成功）。
            release(resetDevice = true)
            scheduleReconnect()
            return
        }
    }

    /**
     * 写线程：独占 bulk OUT，照原版 SocketReadThread。
     * send() 只入队，绝不直接碰 connection；停驻时空转等待复用。
     */
    private fun writeLoop() {
        val head = ByteArray(LEN_OF_MSG_HEAD)
        val body = ByteArray(AOA_WRITE_CHUNK)
        val scratch = ByteArray(AOA_WRITE_CHUNK)
        while (true) {
            if (!running) { Thread.sleep(150); continue }
            val conn = connection ?: return
            val ep = endpointOut ?: return
            try {
                val queued = txQueue.poll(200, java.util.concurrent.TimeUnit.MILLISECONDS) ?: continue
                if (queued.size <= 4) continue

                val channel = beInt(queued, 0)
                val frameLen = queued.size - 4
                System.arraycopy(queued, 4, body, 0, frameLen)
                beBytes(channel, head, 0)
                beBytes(frameLen, head, 4)

                if (bulkTransferOutFixed(conn, ep, head, LEN_OF_MSG_HEAD, scratch) <= 0) {
                    onLog("bulkTransferOut fail 1")
                    // 对齐原版 terminate(resetUsbDevice=true)：写失败同样是端点僵死，需复位。 
                    release(resetDevice = true)
                    scheduleReconnect()
                    return
                }
                if (frameLen > 0 && bulkTransferOutFixed(conn, ep, body, frameLen, scratch) <= 0) {
                    onLog("bulkTransferOut fail 2")
                    release(resetDevice = true)
                    scheduleReconnect()
                    return
                }
            } catch (_: InterruptedException) {
                return
            } catch (e: Exception) {
                if (running) onLog("写线程异常: ${e.message}")
            }
        }
    }

    /**
     * 照抄 AOAHostSetup.bulkTransferOut(data, len)：
     * 短包（<= 16KB）单次调用，长度传实际字节数；长包才拷进固定缓冲分段发。
     * 千万别把固定缓冲的 buf.size 当长度传出去——那样会把声明 12 字节的帧连
     * 16KB 垃圾一起灌进端点，盒子直接不认。
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

    /**
     * 照抄 AOAHostSetup.bulkTransferIn，但用 500ms 轮询超时：
     * 原版 timeout=0 无限阻塞，读线程在会话结束后仍钉死在内核里，保留复用就无从谈起。
     * 500ms 无数据返回 0 → 上层 continue，语义与原版的“本次没数据”完全一致，
     * 数据通路行为不变。不要用带 offset 的 bulkTransfer 重载——部分内核/设备组合
     * 会直接返回 -1，原版永远从缓冲区起点收发。
     */
    private fun bulkTransferIn(conn: UsbDeviceConnection, ep: UsbEndpoint, buf: ByteArray, len: Int, timeoutMs: Int = USB_READ_POLL_MS): Int {
        var total = 0
        while (total < len) {
            if (!running) return 0
            val n = conn.bulkTransfer(ep, buf, total, len - total, timeoutMs)
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
        /** 读线程轮询周期：会话停驻后每 500ms 醒一次检查状态。 */
        private const val USB_READ_POLL_MS = 500
        private const val MAX_RECONNECT = 12
        /** 原版实测节奏：resetDevice 后 ~3s 重扫成功，太早会撞上设备未就绪。 */
        private const val RECONNECT_DELAY_MS = 3000L

        /** 进程级单例：连接与授权生命周期跨会话保留的前提。 */
        @Volatile private var singleton: CarLifeUsbTransport? = null
        fun obtain(context: Context, onLog: (String) -> Unit): CarLifeUsbTransport =
            synchronized(this) {
                singleton ?: CarLifeUsbTransport(context.applicationContext, onLog).also { singleton = it }
            }

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
