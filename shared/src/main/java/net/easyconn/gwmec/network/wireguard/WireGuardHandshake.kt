package net.easyconn.gwmec.network.wireguard

import org.bouncycastle.crypto.Digest
import org.bouncycastle.crypto.agreement.X25519Agreement
import org.bouncycastle.crypto.digests.Blake2sDigest
import org.bouncycastle.crypto.generators.HKDFBytesGenerator
import org.bouncycastle.crypto.params.HKDFParameters
import org.bouncycastle.crypto.params.KeyParameter
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters
import org.bouncycastle.crypto.params.X25519PublicKeyParameters
import org.bouncycastle.math.ec.rfc7748.X25519
import java.security.SecureRandom

/**
 * The WireGuard handshake: Noise_IK, as the protocol defines it.
 *
 * This is the part that turns an imported configuration into a tunnel: the key
 * exchange that proves both ends hold the keys in the configuration, and the two
 * derived keys that carry the traffic afterwards.
 *
 * Everything here is arithmetic on the keys the configuration carries. No key is
 * logged, and the shared secret is dropped as soon as the transport keys are out.
 */
internal object WireGuardHandshake {
    /** WireGuard's Noise construction and identifier, hashed into every derivation. */
    private val CONSTRUCTION = "Noise_IKpsk2_WireGuard_v1_psks".toByteArray(Charsets.US_ASCII)
    private val IDENTIFIER = "WireGuard v1 zx2c4 Jason@zx2c4.com".toByteArray(Charsets.US_ASCII)

    const val KEY_LEN = 32
    const val TIMESTAMP_LEN = 12

    private val random = SecureRandom()

    data class KeyPair(val privateKey: ByteArray, val publicKey: ByteArray) {
        override fun equals(other: Any?): Boolean =
            this === other || (other is KeyPair && privateKey.contentEquals(other.privateKey))

        override fun hashCode(): Int = privateKey.contentHashCode()
    }

    /** What a completed handshake produces: the keys the tunnel carries traffic with. */
    data class TransportKeys(
        val sendingKey: ByteArray,
        val receivingKey: ByteArray,
        val sendingIndex: Int,
        val receivingIndex: Int,
    )

    fun generateKeyPair(): KeyPair {
        val private = ByteArray(KEY_LEN).also { random.nextBytes(it) }
        // WireGuard clamps the private key: the low three bits clear, the high bits set.
        private[0] = (private[0].toInt() and 0xF8).toByte()
        private[31] = (private[31].toInt() and 0x7F).toByte()
        private[31] = (private[31].toInt() or 0x40).toByte()
        return KeyPair(private, publicKey(private))
    }

    /** The public key a private key pairs with, as X25519 defines it. */
    fun publicKey(privateKey: ByteArray): ByteArray =
        ByteArray(KEY_LEN).also { out -> X25519.scalarMultBase(privateKey, 0, out, 0) }

    /**
     * Decodes a base64 key, tolerating the padding a configuration may omit.
     *
     * WireGuard keys are 32 bytes, which base64 writes as 43 characters plus one
     * padding mark. Decoding them by hand rather than through the platform's Base64
     * keeps this working on the API 25 devices the project still supports, where the
     * two decoders disagree about what an unpadded 43-character string means.
     */
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

    /**
     * Runs the initiator's half of Noise_IK against [peerPublicKey].
     *
     * The initiation message is the first thing sent on the tunnel's UDP socket; the
     * reply comes back to [consumeResponse]. The indices say which handshake each
     * belongs to, so a reply for an older attempt is not mistaken for this one.
     */
    class Initiator(
        private val localPrivate: ByteArray,
        private val localPublic: ByteArray,
        private val peerPublic: ByteArray,
        /** WireGuard's pre-shared key: an optional third secret both ends already hold. */
        private val preSharedKey: ByteArray? = null,
    ) {
        private val ephemeral = generateKeyPair()
        private var chainingKey: ByteArray
        var handshakeIndex: Int = random.nextInt()
            private set
        var peerIndex: Int = 0
            private set

        init {
            // h = HASH(CONSTRUCTION || IDENTIFIER || peer static)
            chainingKey = blake2s(CONSTRUCTION, IDENTIFIER, peerPublic)
        }

        fun initiation(): ByteArray {
            // MixHash(ephemeral public)
            chainingKey = blake2s(chainingKey, ephemeral.publicKey)

            // es: ECDH(ephemeral, peer static)
            val (newChaining, chainKey) = kdf(chainingKey, ecdh(ephemeral.privateKey, peerPublic))
            chainingKey = newChaining

            // Encrypt the static key with the chain key; the tag proves we hold ours.
            val staticCipher = Aead(chainKey, 0)
            val encryptedStatic = staticCipher.encrypt(localPublic, ByteArray(0), chainingKey)
            chainingKey = blake2s(chainingKey, encryptedStatic)

            // ss: ECDH(static, peer static)
            val (newChaining2, chainKey2) = kdf(chainingKey, ecdh(localPrivate, peerPublic))
            chainingKey = newChaining2

            // The timestamp, encrypted with the second chain key.
            val timestampCipher = Aead(chainKey2, 0)
            val timestamp = ByteArray(TIMESTAMP_LEN).also { random.nextBytes(it) }
            val encryptedTimestamp = timestampCipher.encrypt(timestamp, ByteArray(0), chainingKey)
            chainingKey = blake2s(chainingKey, encryptedTimestamp)

            // psk: mix the pre-shared key in, as IKpsk2 requires. Its tag rides along so
            // both ends prove they hold it, and a configuration with no psk is IK and
            // still interoperates.
            var encryptedPsk = ByteArray(0)
            if (preSharedKey != null) {
                val (pskChaining, pskChain) = kdf(chainingKey, preSharedKey)
                chainingKey = pskChaining
                val psk = ByteArray(32).also { random.nextBytes(it) }
                encryptedPsk = Aead(pskChain, 0).encrypt(psk, ByteArray(0), chainingKey)
                chainingKey = blake2s(chainingKey, encryptedPsk)
            }

            val message = ByteArray(1 + KEY_LEN + encryptedStatic.size +
                encryptedTimestamp.size + encryptedPsk.size)
            message[0] = 1 // message type: initiation
            message.putAt(1, ephemeral.publicKey)
            message.putAt(1 + KEY_LEN, encryptedStatic)
            message.putAt(1 + KEY_LEN + encryptedStatic.size, encryptedTimestamp)
            message.putAt(1 + KEY_LEN + encryptedStatic.size + encryptedTimestamp.size, encryptedPsk)
            return message
        }

        fun consumeResponse(reply: ByteArray): TransportKeys? {
            // 1 type + 4 receiver index + 4 sender index + 32 ephemeral + 16 tag + 16 tag
            if (reply.size < 1 + 4 + 4 + KEY_LEN + 16 + 16) return null
            if (reply[0].toInt() != 2) return null // 2 = response
            peerIndex = reply.intAt(5 + KEY_LEN) // the sender's index is ours to receive under
            val ephemeralPublic = reply.copyOfRange(5, 5 + KEY_LEN)
            val empty = reply.copyOfRange(5 + KEY_LEN, reply.size - 16)
            val tag = reply.copyOfRange(reply.size - 16, reply.size)

            chainingKey = blake2s(chainingKey, ephemeralPublic)

            // ee: ECDH(our ephemeral, their ephemeral). A reply built from bytes that are
            // not a valid public point fails here, and that is a refused handshake, not
            // a crash.
            val shared = runCatching { ecdh(ephemeral.privateKey, ephemeralPublic) }.getOrNull()
                ?: return null
            val (newChaining, chainKey) = kdf(chainingKey, shared)
            chainingKey = newChaining
            if (!Aead(chainKey, 0).verify(empty, tag, chainingKey)) return null
            chainingKey = blake2s(chainingKey, empty)

            // se: ECDH(our static, their ephemeral)
            val (finalChaining, finalChain) = kdf(chainingKey, ecdh(localPrivate, ephemeralPublic))
            val (sending, receiving) = kdf(finalChain, ByteArray(0))

            return TransportKeys(sending, receiving, handshakeIndex, peerIndex)
        }
    }

    /** ChaCha20-Poly1305 as WireGuard uses it: a 64-bit nonce, zero-padded to 96 bits. */
    class Aead(private val key: ByteArray, private val counter: Long) {
        fun encrypt(plain: ByteArray, associated: ByteArray, hash: ByteArray): ByteArray {
            val cipher = org.bouncycastle.crypto.modes.ChaCha20Poly1305()
            cipher.init(true, params(plain.size + 16))
            cipher.processAADBytes(associated, 0, associated.size)
            cipher.processAADBytes(hash, 0, hash.size)
            val out = ByteArray(plain.size + 16)
            val length = cipher.processBytes(plain, 0, plain.size, out, 0)
            cipher.doFinal(out, length)
            return out
        }

        fun verify(plain: ByteArray, tag: ByteArray, hash: ByteArray): Boolean {
            val cipher = org.bouncycastle.crypto.modes.ChaCha20Poly1305()
            cipher.init(false, params(plain.size + 16))
            cipher.processAADBytes(hash, 0, hash.size)
            val candidate = plain + tag
            val out = ByteArray(plain.size)
            val length = cipher.processBytes(candidate, 0, candidate.size, out, 0)
            return runCatching { cipher.doFinal(out, length) }.isSuccess
        }

        private fun params(size: Int) =
            org.bouncycastle.crypto.params.AEADParameters(KeyParameter(key), 128, nonce(), null)

        private fun nonce(): ByteArray = ByteArray(12).also { bytes ->
            for (index in 0 until 8) {
                bytes[index] = ((counter shr (8 * index)) and 0xFF).toByte()
            }
        }
    }

    // --- primitives ---

    private fun blake2s(vararg parts: ByteArray): ByteArray {
        val digest = Blake2sDigest(256)
        parts.forEach { part -> digest.update(part, 0, part.size) }
        return ByteArray(32).also { digest.doFinal(it, 0) }
    }

    private fun ecdh(privateKey: ByteArray, publicKey: ByteArray): ByteArray {
        val agreement = X25519Agreement()
        agreement.init(X25519PrivateKeyParameters(privateKey, 0))
        val out = ByteArray(agreement.agreementSize)
        agreement.calculateAgreement(X25519PublicKeyParameters(publicKey, 0), out, 0)
        return out
    }

    /** WireGuard's KDF, HKDF over BLAKE2s. */
    private fun kdf(chainingKey: ByteArray, input: ByteArray): Pair<ByteArray, ByteArray> {
        val generator = HKDFBytesGenerator(Blake2sDigest(256))
        generator.init(HKDFParameters(chainingKey, null, input))
        val out = ByteArray(KEY_LEN * 2)
        generator.generateBytes(out, 0, out.size)
        return out.copyOfRange(0, KEY_LEN) to out.copyOfRange(KEY_LEN, out.size)
    }
}

private fun ByteArray.putAt(at: Int, value: ByteArray) =
    System.arraycopy(value, 0, this, at, value.size)

private fun ByteArray.intAt(at: Int): Int =
    ((this[at].toInt() and 0xFF) shl 24) or ((this[at + 1].toInt() and 0xFF) shl 16) or
        ((this[at + 2].toInt() and 0xFF) shl 8) or (this[at + 3].toInt() and 0xFF)
