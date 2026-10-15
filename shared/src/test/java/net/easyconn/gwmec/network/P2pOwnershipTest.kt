package net.easyconn.gwmec.network

import org.junit.Assert.*
import org.junit.Test

class P2pOwnershipTest {
    @Test fun reinstallWithoutPreferencesCanReclaimOnlyItsOwnNamespace() {
        val prefix = P2pOwnership.prefix("net.easyconn.gwmec", "device-user-signing-key-id")
        val ssid = prefix + "aB23"
        // The prefix is the same for every device now: it is the app's namespace, not a
        // per-device digest. What still makes a group ours is the name we recorded, or
        // the prefix plus exactly four random characters.
        assertEquals("DIRECT-carplay-", prefix)
        assertTrue(P2pOwnership.canReclaim(true, ssid, null, prefix))
        assertFalse(P2pOwnership.canReclaim(false, ssid, null, prefix))
        // A generic DIRECT-* from another app is never ours.
        assertFalse(P2pOwnership.canReclaim(true, "DIRECT-xY-aB23", null, prefix))
        assertTrue(ssid.length <= 32)
    }

    @Test fun aGroupWithNoSuffixIsNotReclaimableByPrefixAlone() {
        val prefix = P2pOwnership.prefix("net.easyconn.gwmec", "id")
        // The four characters are what make the name ours; the prefix on its own is not.
        assertFalse(P2pOwnership.canReclaim(true, prefix, null, prefix))
    }

    @Test fun legacyGroupNeedsExactRecordAndUnknownGroupsNeedExplicitReset() {
        val prefix = P2pOwnership.prefix("app", "id")
        assertTrue(P2pOwnership.canReclaim(true, "DIRECT-xcaB23", "DIRECT-xcaB23", prefix))
        assertFalse(P2pOwnership.canReclaim(true, "DIRECT-xcaB23", null, prefix))
        assertFalse(P2pOwnership.canReclaim(true, null, null, prefix))
        assertFalse(P2pOwnership.canReclaim(true, prefix + "aB23-extra", null, prefix))
    }
}
