package net.easyconn.gwmec.carlife

import java.io.BufferedOutputStream
import java.net.DatagramSocket
import java.net.InetSocketAddress
import java.net.Socket
import kotlin.concurrent.thread

/**
 * CarLife WiFi 传输：监听 UDP 7999 手机广播，主动连手机 7 个 TCP 通道。
 * 每通道一条连接，通道 1/6 帧头 8 字节、其余 12 字节（大端）。
 */
class CarLifeWifiTransport(private val onLog: (String) -> Unit) : CarLifeTransport {
    private val sockets = HashMap<Int, Socket>()
    private val outputs = HashMap<Int, BufferedOutputStream>()
    private var udpSocket: DatagramSocket? = null
    @Volatile private var running = false
    private var videoSeq = 0

    override fun start(onMessage: (channel: Int, serviceType: Int, payload: ByteArray) -> Unit): Boolean {
        if (running) return true
        running = true
        // UDP socket 同步创建：7999 可能刚被 CarLifeDiscovery 释放（返回主页再进入
        // 的经典时序）。绑定失败重试一小会儿，仍失败就如实返回 false——
        // 旧版在线程里构造 socket 且在 try 之外，BindException 后线程静默死亡，
        // start() 却返回 true，握手循环空转约 80 秒，界面钉死在「连接中」。
        val sock = bindUdpWithRetry()
        if (sock == null) {
            running = false
            onLog("UDP 7999 绑定失败：端口被占用且重试无效")
            return false
        }
        udpSocket = sock
        thread(name = "CarLife-UdpListen") {
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

    private fun bindUdpWithRetry(): DatagramSocket? {
        var lastError: Exception? = null
        repeat(10) {
            if (!running) return null
            try {
                val s = DatagramSocket(null)
                s.reuseAddress = true
                s.bind(InetSocketAddress(CarLifeProtocol.UDP_DISCOVERY_PORT))
                return s
            } catch (e: Exception) {
                lastError = e
                try { Thread.sleep(200) } catch (_: InterruptedException) { return null }
            }
        }
        if (lastError != null) onLog("UDP 绑定重试耗尽: ${lastError?.message}")
        return null
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

    /** 运行中且有至少一条通道连着，才算链路还活着。 */
    override fun isAlive(): Boolean {
        if (!running) return false
        synchronized(sockets) {
            return sockets.values.any { it.isConnected && !it.isClosed }
        }
    }

    /** 无线链路没有可复用的端点，重连交给中心层重新拨号。 */
    override fun retryHandshake() = Unit

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
