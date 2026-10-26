package net.easyconn.gwmec.carlife

import android.content.Context
import java.net.InetSocketAddress
import java.net.NetworkInterface
import java.net.Socket
import kotlin.concurrent.thread

/**
 * CarLife USB 网卡传输（AutoBox 类盒子）：
 * 盒子向车机枚举为 USB hub + RTL8153 网卡，CarLife 手机端服务在盒子的 IP 上
 * 监听 7240 等通道端口。本传输：
 * 1. 等待 USB 网卡（eth*）出现并拿到载波/IPv4（root 下可强制 link up）；
 * 2. 扫描所在 /24 网段找 7240 端口（先试网关，再扫全网段）；
 * 3. 找到后按标准 7 通道 TCP 会话连接（与 WiFi 相同的收发帧）。
 */
class CarLifeNicTransport(
    private val context: Context,
    private val onLog: (String) -> Unit,
) : CarLifeTransport {
    @Volatile private var running = false
    private val sockets = HashMap<Int, Socket>()
    private val outputs = HashMap<Int, java.io.BufferedOutputStream>()
    private var videoSeq = 0
    private var boundInterface: NetworkInterface? = null

    override fun start(onMessage: (channel: Int, serviceType: Int, payload: ByteArray) -> Unit): Boolean {
        if (running) return true
        running = true
        thread(name = "CarLife-NicWait") {
            val nic = waitNic()
            if (nic == null) { onLog("未检测到盒子的USB网卡（eth*）"); return@thread }
            onLog("USB网卡已就绪：${nic.name} ${nic.inetAddresses.toList().firstOrNull() ?: ""}")
            val boxIp = findBox(nic)
            if (boxIp == null) { onLog("未在网段内发现盒子的 CarLife 服务（7240）"); return@thread }
            onLog("发现盒子服务：$boxIp")
            if (connectChannels(boxIp, onMessage)) {
                onLog("盒子连接成功")
            }
        }
        return true
    }

    /** 等 eth* 出现载波和 IPv4；root 下强制 link up，最长等 60 秒。 */
    private fun waitNic(): NetworkInterface? {
        val deadline = System.currentTimeMillis() + 60_000
        while (running && System.currentTimeMillis() < deadline) {
            for (nif in NetworkInterface.getNetworkInterfaces()) {
                if (!nif.name.startsWith("eth")) continue
                val hasV4 = nif.inetAddresses.toList().any { it.address.size == 4 && !it.isLoopbackAddress }
                if (hasV4) return nif
            }
            // root 强制拉起（有 root 时框架未自动 DHCP 也能手动补）
            runCatching {
                val p = Runtime.getRuntime().exec(arrayOf("su", "-c", "ip link set eth0 up"))
                p.waitFor()
            }
            Thread.sleep(2000)
        }
        return null
    }

    /** 在网卡的 IPv4 网段内找监听 7240 的盒子：先扫常见网关地址再扫全网段。 */
    private fun findBox(nic: NetworkInterface): String? {
        val self = nic.inetAddresses.toList().firstOrNull { it.address.size == 4 } ?: return null
        val bytes = self.address
        val subnet = "${bytes[0].toInt() and 0xFF}.${bytes[1].toInt() and 0xFF}.${bytes[2].toInt() and 0xFF}."
        val selfIp = subnet + (bytes[3].toInt() and 0xFF)
        val candidates = mutableListOf("$subnet.1", "$subnet.2")
        for (i in 1..254) { val ip = "$subnet.$i"; if (ip != selfIp && ip !in candidates) candidates.add(ip) }
        onLog("扫描盒子网段 $subnet.0/24（7240 端口）…")
        val found = java.util.Collections.synchronizedList(mutableListOf<String>())
        val pool = java.util.concurrent.Executors.newFixedThreadPool(48)
        val futures = candidates.map { ip ->
            pool.submit(java.lang.Runnable {
                val s = Socket(); s.setSoTimeout(1500)
                try { s.connect(InetSocketAddress(ip, 7240), 1500); found.add(ip) } catch (_: Exception) {} finally { runCatching { s.close() } }
            } })
        }
        futures.forEach { runCatching { it.get() } }
        pool.shutdown()
        return found.firstOrNull()
    }

    private fun connectChannels(boxIp: String, onMessage: (Int, Int, ByteArray) -> Unit): Boolean {
        for ((ch, port) in CarLifeProtocol.ALL_CHANNELS) {
            val s = Socket()
            try {
                s.connect(InetSocketAddress(boxIp, port), 3000)
                s.tcpNoDelay = true
                synchronized(sockets) {
                    sockets[ch] = s
                    outputs[ch] = java.io.BufferedOutputStream(s.getOutputStream(), 1 shl 16)
                }
            } catch (e: Exception) {
                onLog("通道 $ch 连接失败: ${e.message}"); stop(); return false
            }
        }
        CarLifeProtocol.ALL_CHANNELS.forEach { (ch, _) ->
            thread(name = "CarLife-NicRead-$ch") { readLoop(ch, onMessage) }
        }
        return true
    }

    private fun readLoop(channel: Int, onMessage: (Int, Int, ByteArray) -> Unit) {
        val s = synchronized(sockets) { sockets[channel] } ?: return
        val headerSize = CarLifeProtocol.headerSize(channel)
        val header = ByteArray(headerSize)
        try {
            val input: java.io.InputStream = s.getInputStream()
            while (running) {
                if (!readFully(input, header)) break
                val (len, ts, serviceType) = CarLifeProtocol.parseHeader(channel, header)
                if (len < 0 || len > (1 shl 24)) break
                val payload = if (len > 0) ByteArray(len).also { if (!readFully(input, it)) return } else ByteArray(0)
                onMessage(channel, serviceType, payload)
            }
        } catch (e: Exception) { if (running) onLog("通道 $channel 读取异常: ${e.message}") }
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
        } catch (e: Exception) { onLog("发送失败(通道$channel): ${e.message}"); stop(); false }
    }

    override fun stop() {
        if (!running) return
        running = false
        synchronized(sockets) {
            sockets.values.forEach { try { it.close() } catch (_: Exception) {} }
            sockets.clear(); outputs.clear()
        }
    }
}
