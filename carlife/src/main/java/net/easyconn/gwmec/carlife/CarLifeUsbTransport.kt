package net.easyconn.gwmec.carlife

import android.content.Context
import android.hardware.usb.UsbConstants
import android.hardware.usb.UsbDevice
import android.hardware.usb.UsbDeviceConnection
import android.hardware.usb.UsbEndpoint
import android.hardware.usb.UsbInterface
import android.hardware.usb.UsbManager
import android.util.Log

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
 *   bulkTransfer 单次 3s 超时，整段 30s 总超时，空转重试 50ms。
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
        val device = findAccessory(manager) ?: return fail("未发现安卓手机（AOA）。请插好数据线后重试")
        if (!manager.hasPermission(device)) {
            // 车机通常预授权系统 USB；未授权时请求一次，用户确认后由调用方重试。
            manager.requestPermission(device, permissionPendingIntent())
            return fail("等待 USB 授权（请在手机上允许）")
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

    /** 真正打开设备并启动读线程；AOA 切换指令发出后设备会重新枚举，需要等重新插入。 */
    fun open(manager: UsbManager, device: UsbDevice): Boolean {
        val conn = manager.openDevice(device) ?: return fail("USB 设备打开失败，请重新插拔")
        val iface = device.getInterface(0)
        if (!conn.claimInterface(iface, true)) {
            conn.close(); return fail("USB 接口声明失败")
        }
        connection = conn
        usbInterface = iface
        endpointIn = iface.getEndpoint(0).takeIf { it.direction == UsbConstants.USB_DIR_IN }
            ?: iface.getEndpoint(1).takeIf { it.direction == UsbConstants.USB_DIR_IN }
        endpointOut = iface.getEndpoint(1).takeIf { it.direction == UsbConstants.USB_DIR_OUT }
            ?: iface.getEndpoint(0).takeIf { it.direction == UsbConstants.USB_DIR_OUT }
        if (endpointIn == null || endpointOut == null) {
            release(); return fail("USB 端点不可用（IN/OUT 缺失）")
        }
        if (!isAccessory(device)) {
            when (aoaHandshake(conn)) {
                AoaResult.ALREADY -> Unit
                AoaResult.SWITCHED -> {
                    release()
                    return fail("已发送 AOA 切换指令，手机重新识别后自动继续（若未继续请重插数据线）")
                }
                AoaResult.UNSUPPORTED -> { release(); return fail("该手机不支持 AOA 配件模式") }
            }
        }
        running = true
        readerThread = Thread({ readLoop() }, "CarLife-UsbRead").apply { start() }
        onLog("USB 通道已建立")
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
                if (!readExact(conn, ep, header, 8, "帧头")) break
                val channel = leInt(header, 0)
                val size = leInt(header, 4)
                if (channel !in 1..7 || size < 0 || size > MAX_MESSAGE) {
                    onLog("USB 帧头非法 channel=$channel size=$size"); break
                }
                // WiFi 帧头语义复用：把 [channel][size] 后的负载按通道帧解析
                val payload = if (size > 0) ByteArray(size).also { if (!readExact(conn, ep, it, size, "消息体")) return } else ByteArray(0)
                val (serviceType, inner) = splitChannelFrame(channel, payload)
                dispatch?.invoke(channel, serviceType, inner)
            }
        } catch (e: Exception) {
            if (running) onLog("USB 读取异常: ${e.message}")
        }
        if (running) { onLog("USB 读取结束"); stop() }
    }

    /**
     * USB 单管道上每条 CarLife 消息就是通道帧本体：负载即该通道的标准帧。
     * 通道 1/6 是 [u16 len][u16 rsv][u32 BE serviceType]+body；
     * 其余通道是 [u32 len][u32 seq][u32 BE serviceType]+body。
     * 拆出 serviceType 与纯 body 交给会话层，与 WiFi 路径统一。
     */
    private fun splitChannelFrame(channel: Int, payload: ByteArray): Pair<Int, ByteArray> {
        return try {
            val (len, _, serviceType) = CarLifeProtocol.parseHeader(channel, payload)
            val body = if (len in 1..payload.size) payload.copyOfRange(CarLifeProtocol.headerSize(channel), CarLifeProtocol.headerSize(channel) + len) else ByteArray(0)
            serviceType to body
        } catch (e: Exception) {
            0 to payload
        }
    }

    private val ioChunk = ByteArray(64 * 1024)

    private fun readExact(conn: UsbDeviceConnection, ep: UsbEndpoint, buf: ByteArray, total: Int, what: String): Boolean {
        var off = 0
        val deadline = System.nanoTime() + TOTAL_TIMEOUT_NS
        while (off < total) {
            if (!running) return false
            val want = Math.min(total - off, Math.min(ioChunk.size, Math.max(ep.maxPacketSize, 512)))
            val n = conn.bulkTransfer(ep, ioChunk, want, 3000)
            if (n > 0) { System.arraycopy(ioChunk, 0, buf, off, n); off += n }
            else if (n < 0) { onLog("USB $what 读取失败"); return false }
            else if (System.nanoTime() >= deadline) { onLog("USB $what 读取超时"); return false }
            else Thread.sleep(50)
        }
        return true
    }

    override fun send(channel: Int, serviceType: Int, payload: ByteArray, seqOrTs: Int): Boolean {
        val conn = connection ?: return false
        val ep = endpointOut ?: return false
        val frame = CarLifeProtocol.pack(channel, serviceType, payload, seqOrTs)
        val muxHeader = leBytes(channel) + leBytes(frame.size)
        if (!writeExact(conn, ep, muxHeader, "多路复用头")) return false
        if (frame.isNotEmpty() && !writeExact(conn, ep, frame, "消息体")) return false
        return true
    }

    private fun writeExact(conn: UsbDeviceConnection, ep: UsbEndpoint, data: ByteArray, what: String): Boolean {
        var off = 0
        val deadline = System.nanoTime() + TOTAL_TIMEOUT_NS
        while (off < data.size) {
            if (!running) return false
            val want = Math.min(data.size - off, ioChunk.size)
            System.arraycopy(data, off, ioChunk, 0, want)
            val n = conn.bulkTransfer(ep, ioChunk, want, 3000)
            if (n > 0) off += n
            else if (n < 0) { onLog("USB $what 发送失败"); return false }
            else if (System.nanoTime() >= deadline) { onLog("USB $what 发送超时"); return false }
            else Thread.sleep(50)
        }
        return true
    }

    override fun stop() {
        running = false
        release()
    }

    private fun release() {
        try { usbInterface?.let { connection?.releaseInterface(it) } } catch (_: Exception) {}
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

        fun leBytes(v: Int) = byteArrayOf(
            v.toByte(), (v ushr 8).toByte(), (v ushr 16).toByte(), (v ushr 24).toByte())
        fun leInt(b: ByteArray, off: Int) =
            (b[off].toInt() and 0xFF) or ((b[off + 1].toInt() and 0xFF) shl 8) or
                ((b[off + 2].toInt() and 0xFF) shl 16) or ((b[off + 3].toInt() and 0xFF) shl 24)
    }
}
