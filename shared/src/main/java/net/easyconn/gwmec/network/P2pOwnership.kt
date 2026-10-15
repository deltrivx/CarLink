package net.easyconn.gwmec.network

import java.io.IOException

/**
 * The namespace this app's Wi-Fi Direct groups live in.
 *
 * The prefix is readable — a driver looking at the phone's Wi-Fi list should be able to
 * tell whose network it is — and still ends in a separator, so the four random characters
 * that follow are what makes each group's name unique. The device scope is no longer
 * hashed into the prefix: two cars side by side would then carry different names, and
 * [canReclaim] already tells our own group apart by the name it recorded, so nothing was
 * gained by the digest that was not already there.
 */
internal object P2pOwnership {
    const val PREFIX = "DIRECT-carplay-"

    fun prefix(packageName: String, scopedId: String): String = PREFIX

    fun canReclaim(isOwner: Boolean, ssid: String?, recorded: String?, prefix: String): Boolean =
        isOwner && !ssid.isNullOrBlank() &&
            (ssid == recorded || (ssid.startsWith(prefix) &&
                ssid.removePrefix(prefix).matches(Regex("[A-Za-z0-9]{4}"))))
}

class P2pResetRequiredException : IOException("An existing Wi-Fi Direct connection needs a reset")
