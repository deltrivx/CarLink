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
import java.util.concurrent.atomic.AtomicBoolean

/**
 * Runs the tunnel: the handshake over UDP, then packets between the TUN device and
 * the peer.
 *
 * Two directions, one thread each. Outbound reads the TUN device, encrypts with the
 * sending key and sends to the peer; inbound does the reverse. The handshake runs
 * first and is repeated when the peer says it is time, as the protocol asks — every
 * two minutes of silence, or sooner if the peer asks.
 */
internal class WireGuardTunnelRunner(
    private val tunnel: ParcelFileDescriptor,
    private val config: WireGuardConfig,
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

    fun start() {
        if (!running.compareAndSet(false, true)) return
        val endpoint = config.peerEndpoint
        if (endpoint == null) {
            log("no endpoint in the configuration; the tunnel can only answer")
        } else {
            val host = endpoint.substringBeforeLast(':')
            val port = endpoint.substringAfterLast(':').toIntOrNull() ?: 51820
            runCatching {
                socket = DatagramSocket().apply { soTimeout = HANDSHAKE_TIMEOUT_MILLIS }
                peerAddress = InetSocketAddress(InetAddress.getByName(host), port)
            }.onFailure { log("endpoint $endpoint unreachable: ${it.message}") }
        }
        handshake()
        uplink = Thread(::runUplink, "wireguard-uplink").apply { isDaemon = true; start() }
        downlink = Thread(::runDownlink, "wireguard-downlink").apply { isDaemon = true; start() }
        log("running: uplink and downlink started")
    }

    fun stop() {
        if (!running.compareAndSet(true, false)) return
        runCatching { socket?.close() }
        runCatching { tunnel.close() }
        uplink?.interrupt()
        downlink?.interrupt()
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
                log("handshake complete: sending index ${it.sendingIndex}, " +
                    "peer index ${it.receivingIndex}")
            } ?: run {
                log("handshake refused: the reply did not verify")
                null
            }
        }.onFailure { error ->
            if (error is SocketTimeoutException) {
                log("handshake timed out: no reply from $target")
            } else {
                log("handshake failed: ${error.message ?: error.javaClass.simpleName}")
            }
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
            val encrypted = Aead(current.sendingKey, sendingCounter).encrypt(packet, ByteArray(0), ByteArray(0))
            sendingCounter++
            peerAddress?.let { target ->
                runCatching { socket?.send(DatagramPacket(encrypted, encrypted.size, target)) }
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
                // No keys yet: keep listening so the peer can start the handshake.
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
            if (packet.length == 0) continue
            // A handshake response arriving on the data port, as the protocol allows.
            if (packet.length >= 1 && buffer[0] == 2.toByte()) {
                log("downlink: a handshake reply arrived after the exchange")
                continue
            }
            val received = buffer.copyOf(packet.length)
            val plain = Aead(current.receivingKey, receivingCounter)
                .let { cipher ->
                    // The tag is the last 16 bytes; verify before writing anything to TUN.
                    val body = received.copyOfRange(0, received.size - 16)
                    val tag = received.copyOfRange(received.size - 16, received.size)
                    if (cipher.verify(body, tag, ByteArray(0))) body else null
                }
            if (plain == null) {
                log("downlink: a packet did not verify")
                continue
            }
            receivingCounter++
            runCatching { output.write(plain); output.flush() }
                .onFailure { log("downlink write failed: ${it.message}") }
        }
    }

    private companion object {
        const val MAX_PACKET = 2048
        const val HANDSHAKE_TIMEOUT_MILLIS = 5_000
    }
}
