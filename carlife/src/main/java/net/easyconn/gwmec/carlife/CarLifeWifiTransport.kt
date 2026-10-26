package net.easyconn.gwmec.carlife

import java.io.BufferedOutputStream
import java.net.InetSocketAddress
import java.net.Socket
import kotlin.concurrent.thread

/**
 * CarLife WiFi 传输：监听 UDP 7999 手机广播，主动连手机 7 个 TCP 通道。
 * 每通道一条连接，通道 1/6 帧头 8 字节、其余 12 字节（大端）。
 */
class CarLifeWifiTransport(
    private val onLog: (String) -> Unit,
    private val fixedPhoneIp: String? = null,
) : CarLifeTransport {
    private val sockets = HashMap<Int, Socket>()
    private val outputs = HashMap<Int, BufferedOutputStream>()
    private var udpSocket: java.net.DatagramSocket? = null
    @Volatile private var running = false
    private var videoSeq = 0

    override fun start(onMessage: (channel: Int, serviceType: Int, payload: ByteArray) -> Unit): Boolean {
        if (running) return true
        running = true
        if (fixedPhoneIp != null) {
            thread(name = "CarLife-DirectIp") { connectChannels(fixedPhoneIp, onMessage) }
            return
        }
        thread(name = "CarLife-UdpListen") {
            val sock = java.net.DatagramSocket(CarLifeProtocol.UDP_DISCOVERY_PORT)
            udpSocket = sock
            onLog("正在监听手机广播（UDP 7999）…")
            val buf = ByteArray(1024)
            while (running) {
                val pkt = java.net.DatagramPacket(buf, buf.size)
                try { sock.receive(pkt) } catch (e: Exception) { break }
                val ip = pkt.address.hostAddress ?: continue
                onLog("发现手机广播来自 $ip")
                if (connectChannels(ip, onMessage)) return@thread
            }
        }
        return true
    }

    private fun connectChannels(phoneIp: String, onMessage: (Int, Int, ByteArray) -> Unit): Boolean {
        for ((ch, port) in CarLifeProtocol.ALL_CHANNELS) {
            val s = Socket()
            try {
                s.connect(InetSocketAddress(phoneIp, port), 3000)
                s.tcpNoDelay = true
                synchronized(sockets) {
                    sockets[ch] = s
                    outputs[ch] = BufferedOutputStream(s.getOutputStream(), 1 shl 16)
                }
            } catch (e: Exception) {
                onLog("通道 $ch ($port) 连接失败: ${e.message}")
                stop()
                return false
            }
        }
        onLog("已连接手机 $phoneIp（7 通道）")
        CarLifeProtocol.ALL_CHANNELS.forEach { (ch, _) ->
            thread(name = "CarLife-Read-$ch") { readLoop(ch, onMessage) }
        }
        return true
    }

    private fun readLoop(channel: Int, onMessage: (Int, Int, ByteArray) -> Unit) {
        val s = synchronized(sockets) { sockets[channel] } ?: return
        val headerSize = CarLifeProtocol.headerSize(channel)
        val header = ByteArray(headerSize)
        try {
            val input = s.getInputStream()
            while (running) {
                if (!readFully(input, header)) break
                val (len, ts, serviceType) = CarLifeProtocol.parseHeader(channel, header)
                if (len < 0 || len > (1 shl 24)) { onLog("通道 $channel 流失步 len=$len"); break }
                val payload = if (len > 0) ByteArray(len).also { if (!readFully(input, it)) return } else ByteArray(0)
                onMessage(channel, serviceType, payload)
                if (ts < 0 && false) Unit
            }
        } catch (e: Exception) {
            if (running) onLog("通道 $channel 读取异常: ${e.message}")
        }
        if (running) { onLog("通道 $channel 断开"); stop() }
    }

    private fun readFully(input: java.io.InputStream, buf: ByteArray): Boolean {
        var off = 0
        while (off < buf.size) {
            val n = input.read(buf, off, buf.size - off)
            if (n < 0) return false
            off += n
        }
        return true
    }

    override fun send(channel: Int, serviceType: Int, payload: ByteArray, seqOrTs: Int): Boolean {
        val out = synchronized(outputs) { outputs[channel] } ?: return false
        return try {
            val seq = if (channel == CarLifeProtocol.CHANNEL_VIDEO) (videoSeq++ * 33) else seqOrTs
            out.write(CarLifeProtocol.pack(channel, serviceType, payload, seq))
            out.flush()
            true
        } catch (e: Exception) {
            onLog("发送失败(通道$channel): ${e.message}")
            stop()
            false
        }
    }

    override fun stop() {
        if (!running) return
        running = false
        try { udpSocket?.close() } catch (_: Exception) {}
        synchronized(sockets) {
            sockets.values.forEach { try { it.close() } catch (_: Exception) {} }
            sockets.clear(); outputs.clear()
        }
    }
}
