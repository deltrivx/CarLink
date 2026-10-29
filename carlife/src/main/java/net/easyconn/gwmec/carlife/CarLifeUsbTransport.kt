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
 *   bulkTransfer 用 timeout=0 阻塞等待，与百度 SDK 一致（0 不是失败）。
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
            release()
            val fresh = manager.deviceList.values.firstOrNull { isAccessory(it) }
                ?: manager.deviceList.values.firstOrNull { it == reconnectDevice }
                ?: manager.deviceList.values.firstOrNull()
            if (fresh == null) { onLog("USB 设备已拔出"); stop(); return@thread }
            reconnectDevice = fresh
            if (open(manager, fresh, onMessageSink ?: return@thread)) {
                reconnectAttempts = 0
                onLog("USB 已重连，继续握手")
                // 重连成功后重新发起版本协商
                dispatch?.let { d -> d(CarLifeProtocol.CHANNEL_CMD, CarLifeProtocol.MSG_HU_PROTOCOL_VERSION, CarLifeMessages.protocolVersion(4, 0)) }
            } else {
                scheduleReconnect()
            }
        }
    }

    @Volatile private var onMessageSink: ((Int, Int, ByteArray) -> Unit)? = null

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

    private fun readLoop() {
        val conn = connection ?: return
        val ep = endpointIn ?: return
        try {
            while (running) {
                // 原版 UsbAccessoryCommunicator: 循环 bulkTransfer 读 8 字节 headerBuffer (timeout=0 阻塞)
                var nHeader = 0
                while (running && nHeader == 0) {
                    // 原版：bulkTransfer(..., 0) —— 0 表示无限等待，不把"没数据"当断链
                    nHeader = conn.bulkTransfer(ep, header, 0, 8, 0)
                }
                if (nHeader < 0) {
                    if (running) onLog("USB 帧头读取中断 (ret=$nHeader)")
                    break
                }
                val channel = beInt(header, 0)
                val size = beInt(header, 4)
                if (channel !in 1..7 || size < 0 || size > MAX_MESSAGE) {
                    onLog("USB 帧头非法 channel=$channel size=$size")
                    break
                }

                // 读取 body：原版是 while (remaining > 0) bulkTransfer(ep, body, offset, Math.min(remaining, maxPacketSize), 1000)
                val body = ByteArray(size)
                var remaining = size
                var bodyReadFailed = false
                while (running && remaining > 0) {
                    val chunk = Math.min(remaining, ep.maxPacketSize)
                    val nBody = conn.bulkTransfer(ep, body, size - remaining, chunk, 0)
                    if (nBody > 0) {
                        remaining -= nBody
                    } else if (nBody < 0) {
                        onLog("USB 消息体读取失败 (ret=$nBody, want=$size, remain=$remaining)")
                        bodyReadFailed = true
                        break
                    }
                }
                if (bodyReadFailed || !running) break

                val (serviceType, inner) = splitChannelFrame(channel, body)
                dispatch?.invoke(channel, serviceType, inner)
            }
        } catch (e: Exception) {
            if (running) onLog("USB 读取异常: ${e.message}")
        }
        if (running) {
            onLog("USB 读取结束")
            // 读失败才复位设备：管道已经不可用，不复位下一轮 openDevice 仍然读不动
            release(resetDevice = true)
            scheduleReconnect()
        }
    }

    /**
     * USB 单管道消息体解析：
     * 通道 1/6 是 [u16 len][u16 rsv][u32 BE serviceType] + body；
     * 其余通道是 [u32 len][u32 seq][u32 BE serviceType] + body。
     */
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

    private var txLogBudget = 24

    override fun send(channel: Int, serviceType: Int, payload: ByteArray, seqOrTs: Int): Boolean {
        val conn = connection ?: return false
        val ep = endpointOut ?: return false
        val frame = CarLifeProtocol.pack(channel, serviceType, payload, seqOrTs)
        // 长度字段是"整帧长度（含通道内头）"，与 CarLifeMessage.getSize() 一致：
        // getSize() = payloadSize + commandSize，而 frame 就是 header(commandSize) + payload。
        val muxHeader = beBytes(channel) + beBytes(frame.size)
        if (txLogBudget > 0) {
            txLogBudget--
            onLog("TX ch=$channel st=0x${serviceType.toString(16)} len=${frame.size} hdr=" +
                muxHeader.joinToString("") { "%02X".format(it) } +
                " body=" + frame.take(24).joinToString("") { "%02X".format(it) })
        }

        // 原版 UsbAccessoryCommunicator:
        // bulkTransfer(endpointOut, header, 0, 8, 0)
        // bulkTransfer(endpointOut, body, 0, size, 0)
        var nHead = 0
        while (running && nHead == 0) {
            nHead = conn.bulkTransfer(ep, muxHeader, 0, 8, 0)
        }
        if (nHead < 0) {
            onLog("USB 多路复用头发送失败 (ret=$nHead)")
            return false
        }

        if (frame.isNotEmpty()) {
            var nBody = 0
            while (running && nBody == 0) {
                nBody = conn.bulkTransfer(ep, frame, 0, frame.size, 0)
            }
            if (nBody < 0) {
                onLog("USB 消息体发送失败 (ret=$nBody)")
                return false
            }
        }
        return true
    }

    override fun stop() {
        running = false
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
        private const val MAX_MESSAGE = 64 * 1024 * 1024
        private const val TOTAL_TIMEOUT_NS = 30_000_000_000L
        private const val MAX_RECONNECT = 12

        fun beBytes(v: Int) = byteArrayOf(
            (v ushr 24).toByte(), (v ushr 16).toByte(), (v ushr 8).toByte(), v.toByte())
        fun beInt(b: ByteArray, off: Int) =
            ((b[off].toInt() and 0xFF) shl 24) or ((b[off + 1].toInt() and 0xFF) shl 16) or
                ((b[off + 2].toInt() and 0xFF) shl 8) or (b[off + 3].toInt() and 0xFF)
    }
}
