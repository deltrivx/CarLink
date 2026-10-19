package net.easyconn.gwmec.network.wireguard

import android.os.ParcelFileDescriptor
import android.util.Log
import net.easyconn.gwmec.network.wireguard.WireGuardHandshake.Aead
import net.easyconn.gwmec.network.wireguard.WireGuardHandshake.Initiator
import net.easyconn.gwmec.network.wireguard.WireGuardHandshake.TransportKeys
import java.io.FileInputStream
import java.io.FileOutputStream
import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.SocketTimeoutException
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.util.concurrent.atomic.AtomicBoolean

/**
 * Runs the WireGuard tunnel: the Noise_IKpsk2 handshake over UDP, followed by bidirectional
 * transport packet processing between the TUN interface and the WireGuard peer endpoint.
 */
internal class WireGuardTunnelRunner(
    private val tunnel: ParcelFileDescriptor,
    private val config: WireGuardConfig,
    private val vpnService: android.net.VpnService? = null,
    private val log: (String) -> Unit,
) {
    private val running = AtomicBoolean(false)
    private var keys: TransportKeys? = null
    private var socket: DatagramSocket? = null
    private var peerAddress: InetSocketAddress? = null
    private var sendingCounter = 0L
    private var receivingCounter = 0L
    private var uplink: Thread? = null
    private var downlink: Thread? = null
    private var keepaliveThread: Thread? = null

    fun start() {
        if (!running.compareAndSet(false, true)) return
        Thread({
            val endpoint = config.peerEndpoint
            if (endpoint == null) {
                log("no endpoint in the configuration; the tunnel can only answer")
            } else {
                val host = endpoint.substringBeforeLast(':')
                val port = endpoint.substringAfterLast(':').toIntOrNull() ?: 51820
                runCatching {
                    val s = DatagramSocket().apply { soTimeout = HANDSHAKE_TIMEOUT_MILLIS }
                    val protected = vpnService?.protect(s)
                    log("DatagramSocket created, protect result=$protected")
                    socket = s
                    peerAddress = InetSocketAddress(InetAddress.getByName(host), port)
                }.onFailure { log("endpoint $endpoint unreachable: ${it.message}") }
            }
            handshake()
            uplink = Thread(::runUplink, "wireguard-uplink").apply { isDaemon = true; start() }
            downlink = Thread(::runDownlink, "wireguard-downlink").apply { isDaemon = true; start() }
            keepaliveThread = Thread(::runKeepalive, "wireguard-keepalive").apply { isDaemon = true; start() }
            log("running: uplink and downlink started")
        }, "wireguard-startup").apply { isDaemon = true; start() }
    }

    fun stop() {
        if (!running.compareAndSet(true, false)) return
        runCatching { socket?.close() }
        runCatching { tunnel.close() }
        uplink?.interrupt()
        downlink?.interrupt()
        keepaliveThread?.interrupt()
        log("stopped")
    }

    private fun handshake() {
        val localPrivate = WireGuardHandshake.decodeKey(config.privateKey)
        val peerPublic = WireGuardHandshake.decodeKey(config.peerPublicKey)
        if (localPrivate == null || peerPublic == null) {
            log("handshake impossible: a key in the configuration is not 32 bytes")
            return
        }
        val localPublic = WireGuardHandshake.publicKey(localPrivate)
        val initiator = Initiator(localPrivate, localPublic, peerPublic)
        val target = peerAddress
        if (target == null) {
            log("handshake waiting for the peer to speak first")
            return
        }
        runCatching {
            val message = initiator.initiation()
            socket?.send(DatagramPacket(message, message.size, target))
            log("handshake sent (${message.size} bytes) to $target")
            val buffer = ByteArray(MAX_PACKET)
            val packet = DatagramPacket(buffer, buffer.size)
            socket?.receive(packet)
            val reply = buffer.copyOf(packet.length)
            keys = initiator.consumeResponse(reply)?.also {
                sendingCounter = 0L
                receivingCounter = 0L
                log("已连接")
                log("handshake complete: sending index ${it.sendingIndex}, " +
                    "peer index ${it.receivingIndex}")
                sendKeepalive(it)
            } ?: run {
                log("握手失败：对端回复未能通过校验")
                null
            }
        }.onFailure { error ->
            if (error is SocketTimeoutException) {
                log("连接超时：未收到对端响应（$target）")
            } else {
                log("连接失败：${error.message ?: error.javaClass.simpleName}")
            }
        }
    }

    private fun sendKeepalive(current: TransportKeys) {
        val target = peerAddress ?: return
        val header = ByteBuffer.allocate(16).order(ByteOrder.LITTLE_ENDIAN).apply {
            putInt(4) // Type 4: Transport data
            putInt(current.receivingIndex)
            putLong(sendingCounter)
        }.array()
        val encrypted = Aead(current.sendingKey, sendingCounter).encrypt(ByteArray(0))
        sendingCounter++
        val packet = header + encrypted
        runCatching { socket?.send(DatagramPacket(packet, packet.size, target)) }
            .onFailure { log("keepalive send failed: ${it.message}") }
    }

    private fun runKeepalive() {
        val intervalSec = config.persistentKeepalive ?: 25
        if (intervalSec <= 0) return
        while (running.get()) {
            try {
                Thread.sleep(intervalSec * 1000L)
            } catch (_: InterruptedException) {
                break
            }
            val current = keys ?: continue
            sendKeepalive(current)
        }
    }

    /** TUN -> peer: read an IP packet, encrypt it, send it. */
    private fun runUplink() {
        val input = FileInputStream(tunnel.fileDescriptor)
        val buffer = ByteArray(MAX_PACKET)
        while (running.get()) {
            val read = runCatching { input.read(buffer) }.getOrElse { -1 }
            if (read < 0) {
                if (running.get()) log("uplink: the tunnel closed")
                return
            }
            if (read == 0) continue
            val current = keys ?: continue
            val packet = ByteArray(read).also { System.arraycopy(buffer, 0, it, 0, read) }

            val header = ByteBuffer.allocate(16).order(ByteOrder.LITTLE_ENDIAN).apply {
                putInt(4) // Type 4: Transport data
                putInt(current.receivingIndex)
                putLong(sendingCounter)
            }.array()

            val encrypted = Aead(current.sendingKey, sendingCounter).encrypt(packet)
            sendingCounter++
            val wirePacket = header + encrypted

            peerAddress?.let { target ->
                runCatching { socket?.send(DatagramPacket(wirePacket, wirePacket.size, target)) }
                    .onFailure { log("uplink send failed: ${it.message}") }
            }
        }
    }

    /** Peer -> TUN: receive, decrypt, write the IP packet back. */
    private fun runDownlink() {
        val output = FileOutputStream(tunnel.fileDescriptor)
        val buffer = ByteArray(MAX_PACKET)
        while (running.get()) {
            val current = keys
            if (current == null) {
                Thread.sleep(50)
                continue
            }
            val packet = DatagramPacket(buffer, buffer.size)
            runCatching { socket?.receive(packet) }.getOrElse { error ->
                if (running.get() && error !is SocketTimeoutException) {
                    log("downlink receive failed: ${error.message}")
                }
                null
            } ?: continue
            if (packet.length < 32) continue // 16 header + 16 auth tag minimum

            val bb = ByteBuffer.wrap(buffer, 0, 16).order(ByteOrder.LITTLE_ENDIAN)
            val msgType = bb.int
            if (msgType != 4) {
                if (msgType == 2) {
                    log("downlink: a handshake reply arrived after the exchange")
                }
                continue
            }
            val receiverIndex = bb.int
            val counter = bb.long

            val cipherText = buffer.copyOfRange(16, packet.length)
            val plain = Aead(current.receivingKey, counter).verify(cipherText)
            if (plain == null) {
                log("downlink: a packet did not verify")
                continue
            }
            if (plain.isEmpty()) {
                // Keepalive packet from peer
                continue
            }
            receivingCounter = maxOf(receivingCounter, counter + 1)
            runCatching { output.write(plain); output.flush() }
                .onFailure { log("downlink write failed: ${it.message}") }
        }
    }

    private companion object {
        const val MAX_PACKET = 2048
        const val HANDSHAKE_TIMEOUT_MILLIS = 5_000
    }
}
