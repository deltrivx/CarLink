package net.easyconn.gwmec.hud

import android.content.Context
import net.easyconn.gwmec.iap2.wire.Iap2Frame
import net.easyconn.gwmec.transport.VehicleSpeedSource
import net.easyconn.gwmec.transport.VehicleStatusProvider

/**
 * The vendor HUD output was removed; every call here is inert.
 *
 * The signatures are the ones the callers were written against, so no
 * call site changes. What each returns is the neutral value: a status
 * provider with no reading, a speed source that reports nothing, and no
 * cluster or turn callbacks ever firing.
 */
object BydNavigationOutputs {
    /**
     * The route the turn overlay reads. Its windows are the overlay's own, wider than
     * the dashboard's: the card must outlast a wireless drop, so the instruction stays
     * for 120 s and an empty list only hides it after 8 s.
     */
    private val overlayRoute = BydHudRouteState(
        staleRouteNs = 120_000_000_000L,
        emptyListHideNs = 8_000_000_000L,
        keepAcrossNoRoute = true,
    )
    @Volatile private var turnOverlayListener: ((ClusterTurnGuidance?) -> Unit)? = null

    @JvmStatic fun onAppOpened(context: Context) {
        BydDiLink3ClusterOutput.restoreIfNeeded(context)
    }
    fun start(context: Context) {}
    @JvmStatic fun setClusterStreamControl(control: (Boolean) -> Unit) {}
    @JvmStatic fun clearClusterStreamControl(control: (Boolean) -> Unit) {}
    @JvmStatic fun onFrame(frame: Iap2Frame) {}
    @JvmStatic fun setClusterMapShown(shown: Boolean) {}
    /**
     * Ends the session. A wireless drop often looks like the route ending, so the card is
     * kept when asked: clearing it would drop the last instruction the driver still needs.
     */
    @JvmStatic fun endNow(preserveTurnOverlay: Boolean = false) {
        if (preserveTurnOverlay) {
            refreshTurnOverlay()
            return
        }
        overlayRoute.clear()
        lastPublished = null
        publishedOnce = false
        turnOverlayListener?.invoke(null)
    }
    @JvmStatic fun carPlaySessionStarted() = BydCarPlayCall.sessionStarted()
    @JvmStatic fun setClusterNaviModeListener(listener: ((BydClusterNaviMode?) -> Unit)?) {}
    @Volatile private var lastPublished: ClusterTurnGuidance? = null
    @Volatile private var publishedOnce = false

    @JvmStatic fun setTurnOverlayListener(listener: ((ClusterTurnGuidance?) -> Unit)?) {
        turnOverlayListener = listener
        if (listener != null) {
            // A listener joining an already-published card sees it at once, so the card
            // survives a rebinding without waiting for the next refresh.
            lastPublished = currentGuidance()
            publishedOnce = true
            listener.invoke(lastPublished)
        } else {
            lastPublished = null
            publishedOnce = false
        }
    }

    @JvmStatic fun refreshTurnOverlay() {
        val guidance = currentGuidance()
        if (publishedOnce && guidance == lastPublished) return
        lastPublished = guidance
        publishedOnce = true
        turnOverlayListener?.invoke(guidance)
    }

    private fun currentGuidance(): ClusterTurnGuidance? = overlayRoute.currentApple()
        ?.let(BydClusterFrame::from)
        ?.let(ClusterTurnGuidance::from)

    /** No parked state is read; video gating sees unknown. */
    @JvmStatic fun parked(context: Context): Boolean? = null
    @JvmStatic fun setDiagnosticHold(hold: Boolean) {}
    @JvmStatic fun clusterNaviMode(): BydClusterNaviMode? = null

    /** No call card: the call keys see no active call. */
    /** The iPhone's current call, for the steering wheel's call keys. */
    @JvmStatic fun carPlayCall(): CarPlayCallCard? = BydCarPlayCall.current()

    /** No vendor battery source: no reading, so no EV is declared. */
    @JvmStatic fun batteryStatus(context: Context): VehicleStatusProvider =
        VehicleStatusProvider { null }

    /** The vehicle-speed provider wraps this; it reports nothing. */
    @JvmStatic fun wheelSpeed(context: Context): VehicleSpeedSource =
        object : VehicleSpeedSource {
            override fun start() {}
            override fun stop() {}
            override fun drain() = null
        }

    @JvmStatic fun clusterSongChanged(enabled: Boolean) {}
    @JvmStatic fun clusterSongOnChangeChanged() {}
    @JvmStatic fun carPlayCallsChanged(enabled: Boolean) = BydCarPlayCall.settingChanged(enabled)
    @JvmStatic fun dashboardNote(text: String, source: Int? = null) = BydClusterSong.note(text, source)
}
