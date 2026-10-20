package net.easyconn.gwmec.network.wireguard

import org.bouncycastle.crypto.agreement.X25519Agreement
import org.bouncycastle.crypto.digests.Blake2sDigest
import org.bouncycastle.crypto.macs.HMac
import org.bouncycastle.crypto.modes.ChaCha20Poly1305
import org.bouncycastle.crypto.params.AEADParameters
import org.bouncycastle.crypto.params.KeyParameter
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters
import org.bouncycastle.crypto.params.X25519PublicKeyParameters
import org.bouncycastle.math.ec.rfc7748.X25519
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.security.SecureRandom

/**
 * Standard WireGuard Noise_IKpsk2 handshake implementation compatible with Linux kernel
 * WireGuard and official wireguard-go.
 */
internal object WireGuardHandshake {
    private val CONSTRUCTION = "Noise_IKpsk2_25519_ChaChaPoly_BLAKE2s".toByteArray(Charsets.US_ASCII)
    // WireGuard's fixed protocol identifier, hashed into every handshake. The exact
    // 34 ASCII bytes matter byte-for-byte: the peer's MAC and hash chain are computed
    // over them, and any deviation makes the server drop the packet silently.
    internal val PROTOCOL_IDENTIFIER = "WireGuard v1 zx2c4 Jason@zx2c4.com".toByteArray(Charsets.US_ASCII)
    private val IDENTIFIER = PROTOCOL_IDENTIFIER
    private val LABEL_MAC1 = "mac1----".toByteArray(Charsets.US_ASCII)

    const val KEY_LEN = 32
    const val TIMESTAMP_LEN = 12

    private val random = SecureRandom()

    data class KeyPair(val privateKey: ByteArray, val publicKey: ByteArray) {
        override fun equals(other: Any?): Boolean =
            this === other || (other is KeyPair && privateKey.contentEquals(other.privateKey))

        override fun hashCode(): Int = privateKey.contentHashCode()
    }

    data class TransportKeys(
        val sendingKey: ByteArray,
        val receivingKey: ByteArray,
        val sendingIndex: Int,
        val receivingIndex: Int,
    )

    fun generateKeyPair(): KeyPair {
        val private = ByteArray(KEY_LEN).also { random.nextBytes(it) }
        private[0] = (private[0].toInt() and 0xF8).toByte()
        private[31] = (private[31].toInt() and 0x7F).toByte()
        private[31] = (private[31].toInt() or 0x40).toByte()
        return KeyPair(private, publicKey(private))
    }

    fun publicKey(privateKey: ByteArray): ByteArray =
        ByteArray(KEY_LEN).also { out -> X25519.scalarMultBase(privateKey, 0, out, 0) }

    fun decodeKey(value: String): ByteArray? {
        val cleaned = value.trim().replace("=", "")
        if (cleaned.length != 43) return null
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
        var accumulator = 0
        var bits = 0
        val out = ArrayList<Byte>(32)
        for (character in cleaned) {
            val index = alphabet.indexOf(character)
            if (index < 0) return null
            accumulator = (accumulator shl 6) or index
            bits += 6
            if (bits >= 8) {
                bits -= 8
                out.add(((accumulator shr bits) and 0xFF).toByte())
            }
        }
        return out.takeIf { it.size == KEY_LEN }?.toByteArray()
    }

    class Initiator(
        private val localPrivate: ByteArray,
        private val localPublic: ByteArray,
        private val peerPublic: ByteArray,
        private val preSharedKey: ByteArray? = null,
    ) {
        private val ephemeral = generateKeyPair()
        private var chainingKey: ByteArray
        private var hash: ByteArray
        val handshakeIndex: Int = random.nextInt()
        var peerIndex: Int = 0
            private set

        init {
            val initialChainKey = blake2s(CONSTRUCTION)
            chainingKey = initialChainKey
            hash = mixHash(initialChainKey, IDENTIFIER)
            hash = mixHash(hash, peerPublic)
        }

        fun initiation(): ByteArray {
            // e
            hash = mixHash(hash, ephemeral.publicKey)
            chainingKey = kdf1(chainingKey, ephemeral.publicKey)

            // es
            val ssEs = ecdh(ephemeral.privateKey, peerPublic)
            val (c1, k1) = kdf2(chainingKey, ssEs)
            chainingKey = c1

            // s
            val encStatic = encryptAead(k1, 0, localPublic, hash)
            hash = mixHash(hash, encStatic)

            // ss
            val ssSs = ecdh(localPrivate, peerPublic)
            val (c2, k2) = kdf2(chainingKey, ssSs)
            chainingKey = c2

            // {t}
            val tai = tai64n()
            val encTimestamp = encryptAead(k2, 0, tai, hash)
            hash = mixHash(hash, encTimestamp)

            val unmac = ByteBuffer.allocate(116).order(ByteOrder.LITTLE_ENDIAN).apply {
                putInt(1) // Type 1: Initiation
                putInt(handshakeIndex)
                put(ephemeral.publicKey)
                put(encStatic)
                put(encTimestamp)
            }.array()

            // mac1
            val mac1Key = blake2s(LABEL_MAC1, peerPublic)
            val mac1 = blake2s128(mac1Key, unmac)
            val mac2 = ByteArray(16) // 16 zero bytes

            return ByteBuffer.allocate(148).apply {
                put(unmac)
                put(mac1)
                put(mac2)
            }.array()
        }

        fun consumeResponse(reply: ByteArray): TransportKeys? {
            if (reply.size < 92) return null
            val bb = ByteBuffer.wrap(reply).order(ByteOrder.LITTLE_ENDIAN)
            val msgType = bb.int
            if (msgType != 2) return null // Type 2: Response

            val senderIndex = bb.int
            val receiverIndex = bb.int
            if (receiverIndex != handshakeIndex) return null
            peerIndex = senderIndex

            val ephPublic = ByteArray(KEY_LEN)
            bb.get(ephPublic)

            val encNothing = ByteArray(16)
            bb.get(encNothing)

            // e
            hash = mixHash(hash, ephPublic)
            chainingKey = kdf1(chainingKey, ephPublic)

            // ee
            val ssEe = runCatching { ecdh(ephemeral.privateKey, ephPublic) }.getOrNull() ?: return null
            chainingKey = kdf1(chainingKey, ssEe)

            // se
            val ssSe = runCatching { ecdh(localPrivate, ephPublic) }.getOrNull() ?: return null
            chainingKey = kdf1(chainingKey, ssSe)

            // psk
            val psk = preSharedKey ?: ByteArray(KEY_LEN)
            val (cPsk, tau, keyResp) = kdf3(chainingKey, psk)
            chainingKey = cPsk
            hash = mixHash(hash, tau)

            // verify empty encrypted auth tag
            val decrypted = decryptAead(keyResp, 0, encNothing, hash) ?: return null
            if (decrypted.isNotEmpty()) return null
            hash = mixHash(hash, encNothing)

            // derive transport keys
            val (sendingKey, receivingKey) = kdf2(chainingKey, ByteArray(0))
            return TransportKeys(sendingKey, receivingKey, handshakeIndex, peerIndex)
        }

        private fun tai64n(): ByteArray {
            val now = System.currentTimeMillis()
            val s = 0x400000000000000aL + (now / 1000)
            val n = ((now % 1000) * 1_000_000).toInt()
            return ByteBuffer.allocate(TIMESTAMP_LEN).order(ByteOrder.BIG_ENDIAN).apply {
                putLong(s)
                putInt(n)
            }.array()
        }
    }

    /** ChaCha20-Poly1305 data packet cipher with 64-bit little-endian counter. */
    class Aead(private val key: ByteArray, private val counter: Long) {
        fun encrypt(plain: ByteArray, associated: ByteArray = ByteArray(0)): ByteArray =
            encryptAead(key, counter, plain, associated)

        fun verify(cipherText: ByteArray, associated: ByteArray = ByteArray(0)): ByteArray? =
            decryptAead(key, counter, cipherText, associated)
    }

    // --- WireGuard Primitive Functions ---

    private fun blake2s(vararg parts: ByteArray): ByteArray {
        val digest = Blake2sDigest(256)
        parts.forEach { digest.update(it, 0, it.size) }
        val out = ByteArray(32)
        digest.doFinal(out, 0)
        return out
    }

    private fun mixHash(h: ByteArray, data: ByteArray): ByteArray {
        val digest = Blake2sDigest(256)
        digest.update(h, 0, h.size)
        digest.update(data, 0, data.size)
        val out = ByteArray(32)
        digest.doFinal(out, 0)
        return out
    }

    private fun blake2s128(key: ByteArray, data: ByteArray): ByteArray {
        val digest = Blake2sDigest(key, 16, null, null)
        digest.update(data, 0, data.size)
        val out = ByteArray(16)
        digest.doFinal(out, 0)
        return out
    }

    private fun hmac(key: ByteArray, input: ByteArray): ByteArray {
        val hmac = HMac(Blake2sDigest(256))
        hmac.init(KeyParameter(key))
        hmac.update(input, 0, input.size)
        val out = ByteArray(32)
        hmac.doFinal(out, 0)
        return out
    }

    private fun kdf1(key: ByteArray, input: ByteArray): ByteArray {
        val prk = hmac(key, input)
        val hmac1 = HMac(Blake2sDigest(256))
        hmac1.init(KeyParameter(prk))
        hmac1.update(byteArrayOf(1), 0, 1)
        val out = ByteArray(32)
        hmac1.doFinal(out, 0)
        return out
    }

    private fun kdf2(key: ByteArray, input: ByteArray): Pair<ByteArray, ByteArray> {
        val prk = hmac(key, input)
        val hmac1 = HMac(Blake2sDigest(256))
        hmac1.init(KeyParameter(prk))
        hmac1.update(byteArrayOf(1), 0, 1)
        val t1 = ByteArray(32)
        hmac1.doFinal(t1, 0)

        val hmac2 = HMac(Blake2sDigest(256))
        hmac2.init(KeyParameter(prk))
        hmac2.update(t1, 0, t1.size)
        hmac2.update(byteArrayOf(2), 0, 1)
        val t2 = ByteArray(32)
        hmac2.doFinal(t2, 0)
        return t1 to t2
    }

    private fun kdf3(key: ByteArray, input: ByteArray): Triple<ByteArray, ByteArray, ByteArray> {
        val prk = hmac(key, input)
        val hmac1 = HMac(Blake2sDigest(256))
        hmac1.init(KeyParameter(prk))
        hmac1.update(byteArrayOf(1), 0, 1)
        val t1 = ByteArray(32)
        hmac1.doFinal(t1, 0)

        val hmac2 = HMac(Blake2sDigest(256))
        hmac2.init(KeyParameter(prk))
        hmac2.update(t1, 0, t1.size)
        hmac2.update(byteArrayOf(2), 0, 1)
        val t2 = ByteArray(32)
        hmac2.doFinal(t2, 0)

        val hmac3 = HMac(Blake2sDigest(256))
        hmac3.init(KeyParameter(prk))
        hmac3.update(t2, 0, t2.size)
        hmac3.update(byteArrayOf(3), 0, 1)
        val t3 = ByteArray(32)
        hmac3.doFinal(t3, 0)
        return Triple(t1, t2, t3)
    }

    private fun ecdh(priv: ByteArray, pub: ByteArray): ByteArray {
        val agreement = X25519Agreement()
        agreement.init(X25519PrivateKeyParameters(priv, 0))
        val out = ByteArray(32)
        agreement.calculateAgreement(X25519PublicKeyParameters(pub, 0), out, 0)
        return out
    }

    private fun encryptAead(key: ByteArray, counter: Long, plain: ByteArray, ad: ByteArray): ByteArray {
        val cipher = ChaCha20Poly1305()
        val nonce = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN).putInt(0).putLong(counter).array()
        cipher.init(true, AEADParameters(KeyParameter(key), 128, nonce, ad))
        val out = ByteArray(plain.size + 16)
        val len = cipher.processBytes(plain, 0, plain.size, out, 0)
        cipher.doFinal(out, len)
        return out
    }

    private fun decryptAead(key: ByteArray, counter: Long, cipherText: ByteArray, ad: ByteArray): ByteArray? =
        runCatching {
            val cipher = ChaCha20Poly1305()
            val nonce = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN).putInt(0).putLong(counter).array()
            cipher.init(false, AEADParameters(KeyParameter(key), 128, nonce, ad))
            val out = ByteArray(cipherText.size - 16)
            val len = cipher.processBytes(cipherText, 0, cipherText.size, out, 0)
            cipher.doFinal(out, len)
            out
        }.getOrNull()
}
