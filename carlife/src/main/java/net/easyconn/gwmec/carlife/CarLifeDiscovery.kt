package net.easyconn.gwmec.carlife

import java.net.DatagramPacket
import java.net.DatagramSocket
import kotlin.concurrent.thread

/** 轻量 UDP 7999 广播探测：主页自动连接用，发现手机即回调一次。 */
object CarLifeDiscovery {
    @Volatile private var running = false
    private var socket: DatagramSocket? = null

    @Synchronized
    fun start(onFound: (String) -> Unit) {
        if (running) return
        running = true
        thread(name = "CarLife-Discovery") {
            val sock = DatagramSocket(CarLifeProtocol.UDP_DISCOVERY_PORT)
            socket = sock
            val buf = ByteArray(1024)
            try {
                while (running) {
                    val pkt = DatagramPacket(buf, buf.size)
                    sock.receive(pkt)
                    val ip = pkt.address.hostAddress ?: continue
                    running = false
                    onFound(ip)
                    break
                }
            } catch (_: Exception) {
            } finally {
                try { sock.close() } catch (_: Exception) {}
            }
        }
    }

    @Synchronized
    fun stop() {
        running = false
        try { socket?.close() } catch (_: Exception) {}
        socket = null
    }
}
