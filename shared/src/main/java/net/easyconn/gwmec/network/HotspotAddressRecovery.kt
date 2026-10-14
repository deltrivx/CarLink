package net.easyconn.gwmec.network

import java.io.InterruptedIOException
import java.net.Inet6Address
import java.net.InetAddress

/** Addresses can appear after the framework reports a newly created group ready. */
internal class HotspotAddressRecovery(
    private val sample: () -> List<InetAddress>,
    private val cancelled: () -> Boolean,
    private val pause: (Long) -> Unit,
    private val nowMillis: () -> Long = { System.nanoTime() / 1_000_000 },
    private val log: (String) -> Unit = {},
) {
    fun awaitCandidates(
        initial: List<InetAddress>,
        preferredFamily: String?,
        timeoutMillis: Long = WirelessStartupPolicy.HOTSPOT_READY_MILLIS,
    ): List<InetAddress> {
        require(timeoutMillis >= 0)
        val started = nowMillis()
        val deadline = started + timeoutMillis
        var candidates = initial
        if (preferredFamily == HotspotAddressPolicy.FAMILY_IPV6 && !candidates.any(::scopedLinkLocal)) {
            log("wireless address waiting preference=IPv6 timeoutMs=$timeoutMillis")
        }
        // A freshly created group often has only its IPv6 link-local address for a moment;
        // the IPv4 address the iPhone will actually connect to arrives just after. Waiting
        // for it here costs a fraction of a second, while publishing the link-local address
        // instead costs the whole first-TCP timeout — thirty seconds of a black screen,
        // after which the family flips and the same group connects immediately. The
        // preference is honoured first, as before, when one was recorded.
        while (candidates.none(::usableForPublishing) && preferredFamily != HotspotAddressPolicy.FAMILY_IPV6) {
            checkActive()
            val remaining = deadline - nowMillis()
            if (remaining <= 0) {
                log("wireless address no routable family elapsedMs=${nowMillis() - started}; publishing what there is")
                return candidates
            }
            pause(minOf(WirelessStartupPolicy.INTERFACE_POLL_MILLIS, remaining))
            checkActive()
            candidates = sample()
            checkActive()
        }
        while (true) {
            checkActive()
            if (preferredFamily != HotspotAddressPolicy.FAMILY_IPV6) return candidates
            if (candidates.any(::scopedLinkLocal)) {
                log("wireless address preference=IPv6 ready elapsedMs=${nowMillis() - started}")
                return candidates.filter { it !is Inet6Address || !it.isLinkLocalAddress || scopedLinkLocal(it) }
            }
            val remaining = deadline - nowMillis()
            if (remaining <= 0) {
                log("wireless address preference=IPv6 unavailable elapsedMs=${nowMillis() - started}; using available family")
                return candidates
            }
            pause(minOf(WirelessStartupPolicy.INTERFACE_POLL_MILLIS, remaining))
            checkActive()
            candidates = sample()
            checkActive()
        }
    }

    /** Re-sample at timeout; a missing alternate at group creation is not a single-family AP. */
    fun nextFamily(published: InetAddress): String? {
        if (cancelled()) return null
        val candidates = sample().filter { it !is Inet6Address || scopedLinkLocal(it) }
        if (cancelled()) return null
        if (HotspotAddressPolicy.alternateFamilyCandidate(candidates, published) == null) return null
        return HotspotAddressPolicy.flipFamily(
            if (published is Inet6Address) HotspotAddressPolicy.FAMILY_IPV6 else HotspotAddressPolicy.FAMILY_IPV4,
        )
    }

    private fun checkActive() {
        if (cancelled()) throw InterruptedIOException("Hotspot address recovery cancelled")
    }

    /** Whether the iPhone could connect to this address: routable, and not link-local. */
    private fun usableForPublishing(address: InetAddress): Boolean =
        address is java.net.Inet4Address && HotspotAddressPolicy.isRoutable(address)

    private fun scopedLinkLocal(address: InetAddress): Boolean =
        address is Inet6Address && address.isLinkLocalAddress && address.scopeId != 0
}
