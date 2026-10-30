package net.easyconn.gwmec.carlife

import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetSocketAddress
import kotlin.concurrent.thread

/** 轻量 UDP 7999 广播探测：主页自动连接用，发现手机即回调一次。 */
object CarLifeDiscovery {
    @Volatile private var running = false
    private var socket: DatagramSocket? = null
    private var worker: Thread? = null

    /**
     * socket 在调用线程同步创建并绑定：旧版在线程里 `DatagramSocket(7999)`，
     * 绑定失败（与传输层抢端口的经典时序）线程静默死亡，界面永远停在「连接中」。
     * 现在失败立刻返回 false，绝不留黑洞。
     */
    @Synchronized
    fun start(onFound: (String) -> Unit): Boolean {
        if (running) return true
        val sock = try {
            DatagramSocket(null).apply {
                reuseAddress = true
                bind(InetSocketAddress(CarLifeProtocol.UDP_DISCOVERY_PORT))
            }
        } catch (_: Exception) {
            return false
        }
        running = true
        socket = sock
        worker = thread(name = "CarLife-Discovery") {
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
        return true
    }

    /**
     * 停止并同步等待线程退出，确保 7999 端口在返回前真正释放。
     * CarlinkActivity.startCarLife() 先调这里再进连接页，随后传输层才能绑定成功——
     * 这是「返回主界面再进入卡死」的第一处根因。
     */
    @Synchronized
    fun stop() {
        running = false
        try { socket?.close() } catch (_: Exception) {}
        socket = null
        val t = worker
        if (t != null && t !== Thread.currentThread()) {
            try { t.join(1000) } catch (_: InterruptedException) {}
        }
        worker = null
    }
}
