package net.easyconn.gwmec.network

import java.net.Inet4Address
import java.net.Inet6Address
import java.net.InetAddress

internal object HotspotAddressPolicy {
    const val FAMILY_IPV4 = "IPv4"
    const val FAMILY_IPV6 = "IPv6"

    fun parseFamily(raw: String?): String? = when (raw) {
        FAMILY_IPV4 -> FAMILY_IPV4
        FAMILY_IPV6 -> FAMILY_IPV6
        else -> null
    }

    fun flipFamily(family: String): String = if (family == FAMILY_IPV6) FAMILY_IPV4 else FAMILY_IPV6

    fun select(addresses: List<InetAddress>): InetAddress? {
        var linkLocal: InetAddress? = null
        for (address in addresses) {
            if (address is Inet4Address && usable(address)) {
                return address
            }
            if (address is Inet6Address && address.isLinkLocalAddress && linkLocal == null) {
                linkLocal = address
            }
        }
        return linkLocal
    }

    fun select(addresses: List<InetAddress>, preferredFamily: String?): InetAddress? {
        if (preferredFamily != FAMILY_IPV6) {
            return select(addresses)
        }
        for (address in addresses) {
            if (address is Inet6Address && address.isLinkLocalAddress) {
                return address
            }
        }
        return select(addresses)
    }

    fun alternateFamilyCandidate(addresses: List<InetAddress>, published: InetAddress): InetAddress? {
        val publishedIsIpv6 = published is Inet6Address
        var linkLocal: InetAddress? = null
        for (address in addresses) {
            if (address is Inet4Address && usable(address) && publishedIsIpv6) {
                return address
            }
            if (address is Inet6Address && address.isLinkLocalAddress && !publishedIsIpv6 && linkLocal == null) {
                linkLocal = address
            }
        }
        return if (publishedIsIpv6) null else linkLocal
    }

    private fun usable(address: InetAddress): Boolean =
        !address.isLoopbackAddress && !address.isAnyLocalAddress && !address.isLinkLocalAddress &&
            !address.isMulticastAddress

    /**
     * Whether a peer on the same group could connect to this address.
     *
     * A link-local IPv6 address needs a scope identifier the iPhone is never told, so
     * publishing one leaves it with nothing to dial: the group is up, the iPhone is in
     * it, and nothing happens until the first-TCP timeout flips the family — thirty
     * seconds of a black screen for a group that was working all along.
     */
    fun isRoutable(address: InetAddress): Boolean =
        address is Inet4Address && usable(address)
}
