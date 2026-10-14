package net.easyconn.gwmec.network.wireguard

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * What can be checked without a peer on the other end: that the keys are the right
 * shape, that a configuration survives the round trip, and that a handshake whose
 * reply does not verify is refused. The full exchange — both ends' arithmetic — is
 * checked against a real peer on the car, which is the only place a peer exists.
 */
class WireGuardHandshakeTest {
    @Test
    fun aKeyPairIsItsOwnPublicKey() {
        val pair = WireGuardHandshake.generateKeyPair()
        assertArrayEquals(pair.publicKey, WireGuardHandshake.publicKey(pair.privateKey))
    }

    @Test
    fun thePrivateKeyIsClampedAsTheProtocolRequires() {
        val pair = WireGuardHandshake.generateKeyPair()
        // The low three bits clear, the high bit clear and bit 6 set, as X25519 asks.
        assertEquals(0, pair.privateKey[0].toInt() and 0x07)
        assertEquals(0x40, pair.privateKey[31].toInt() and 0xC0)
    }

    @Test
    fun theParsedConfigurationKeepsItsPeer() {
        val config = WireGuardConfigParser.parse("imported", CAR_HOME_CONF)
        assertNotNull(config)
        config!!
        assertTrue(config.usable)
        assertTrue(config.addresses.contains("10.66.0.3/24"))
        assertTrue(config.allowedIps.contains("192.168.31.0/24"))
        assertTrue(config.allowedIps.contains("10.66.0.0/24"))
        assertEquals("107.172.90.165:51820", config.peerEndpoint)
        assertEquals(1420, config.mtu)
        assertEquals(25, config.persistentKeepalive)
        assertTrue(config.dnsServers.contains("192.168.31.251"))
    }

    @Test
    fun aConfigurationWithoutAPeerIsRefused() {
        val text = """
            [Interface]
            PrivateKey = gMX8MXAq6ZRHn5oMQsfy3cocwBUzr65sTeUD1UScL3o=
            Address = 10.66.0.3/24
        """.trimIndent()
        // No peer means no tunnel: the parser refuses it rather than half-reading it.
        assertNull(WireGuardConfigParser.parse("imported", text))
    }

    @Test
    fun anInitiationIsTheSizeTheProtocolSpecifies() {
        val ours = WireGuardHandshake.generateKeyPair()
        val theirs = WireGuardHandshake.generateKeyPair()
        val withPsk = WireGuardHandshake.Initiator(ours.privateKey, ours.publicKey, theirs.publicKey,
            preSharedKey = ByteArray(32) { 7 })
        // 1 type + 32 ephemeral + 48 static + 28 timestamp + 48 pre-shared key.
        assertEquals(157, withPsk.initiation().size)

        val without = WireGuardHandshake.Initiator(ours.privateKey, ours.publicKey, theirs.publicKey)
        // The same, without the pre-shared key's payload and tag.
        assertEquals(109, without.initiation().size)
    }

    @Test
    fun aReplyThatDoesNotVerifyIsRefused() {
        val ours = WireGuardHandshake.generateKeyPair()
        val theirs = WireGuardHandshake.generateKeyPair()
        val initiator = WireGuardHandshake.Initiator(ours.privateKey, ours.publicKey, theirs.publicKey,
            preSharedKey = ByteArray(32) { 7 })
        initiator.initiation()
        // A reply of the right length but the wrong bytes: the AEAD must refuse it,
        // or the tunnel would carry traffic it never authenticated.
        val reply = ByteArray(92) { 0 }
        reply[0] = 2
        assertNull(initiator.consumeResponse(reply))
    }

    @Test
    fun aReplyOfTheWrongTypeIsRefused() {
        val ours = WireGuardHandshake.generateKeyPair()
        val theirs = WireGuardHandshake.generateKeyPair()
        val initiator = WireGuardHandshake.Initiator(ours.privateKey, ours.publicKey, theirs.publicKey)
        initiator.initiation()
        val reply = ByteArray(92) { 9 }
        reply[0] = 3 // neither initiation nor response
        assertNull(initiator.consumeResponse(reply))
    }

    @Test
    fun keysDecodeOnlyWhenTheyAreThirtyTwoBytes() {
        assertNotNull(WireGuardHandshake.decodeKey("gMX8MXAq6ZRHn5oMQsfy3cocwBUzr65sTeUD1UScL3o="))
        assertNull(WireGuardHandshake.decodeKey("too short"))
    }

    private companion object {
        /** The configuration the car's own tunnel uses, as imported from the NAS. */
        const val CAR_HOME_CONF = """
            [Interface]
            PrivateKey = gMX8MXAq6ZRHn5oMQsfy3cocwBUzr65sTeUD1UScL3o=
            Address = 10.66.0.3/24
            DNS = 192.168.31.251
            MTU = 1420

            [Peer]
            PublicKey = 9uFAuncBs4mrAgP0a+pTtkVK0KS7F++yVFVxEwj0oE8=
            AllowedIPs = 10.66.0.0/24, 192.168.31.0/24
            Endpoint = 107.172.90.165:51820
            PersistentKeepalive = 25
        """
    }
}
