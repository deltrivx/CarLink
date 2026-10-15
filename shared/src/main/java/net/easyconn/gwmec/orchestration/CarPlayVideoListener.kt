package net.easyconn.gwmec.orchestration

import net.easyconn.gwmec.airplay.VideoInCar
import java.io.Closeable

/** iOS 27 video in car, played by the host in the car's own player (see [VideoInCar]). */
interface CarPlayVideoListener {
    /** Whether the car is in P, or null when it cannot tell. Blocking; read once a second while CarPlay runs. */
    fun readParked(): Boolean?

    /** Video became allowed or not; when not, the player must close. Any thread. */
    fun onVideoAllowedChanged(allowed: Boolean)

    /** A playback message from the iPhone, e.g. insertPlayQueueItem, setRate, seek, stop. Any thread. */
    fun onVideoMessage(streamId: Long, message: Map<String, Any?>)

    /** The iPhone asks the car to show its video player (requestUI "videoplayback:"). Any thread. */
    fun onVideoUiRequested()

    /** The CarPlay session ended; the player must close. Any thread. */
    fun onVideoSessionEnded()
}

/**
 * Keeps [VideoInCar.allowed] in step with the car.
 *
 * A gear that reads P allows video; a gear that reads anything else does not. A gear that
 * cannot be read at all — no ADB, a head unit that will not say — is not a prohibition:
 * the driver who turned CarPlay video on chose to have it, and treating "unknown" as
 * "moving" told the iPhone this car had no screen, which is why video apps came across
 * as audio only on a car with no gear feed.
 */
internal class VideoInCarGate(
    private val readParked: () -> Boolean?,
    private val onChanged: (Boolean) -> Unit,
    private val onObserved: (Boolean?) -> Unit = {},
) : Closeable {
    @Volatile private var closed = false
    private var observed = false
    private var lastParked: Boolean? = null

    fun start() {
        Thread({
            while (!closed) {
                update(runCatching(readParked).getOrNull())
                try {
                    Thread.sleep(POLL_MILLIS)
                } catch (_: InterruptedException) {
                    return@Thread
                }
            }
        }, "diplay-video-gate").apply { isDaemon = true }.start()
    }

    internal fun update(parked: Boolean?) {
        val first = !observed
        if (first || parked != lastParked) {
            observed = true
            lastParked = parked
            onObserved(parked)
        }
        val allowed = parked != false
        // The first answer is always pushed, even when it agrees with the default: /info may
        // already have been served with video off while the gear was still unread, and the
        // iPhone keeps what it was told until something says otherwise.
        if ((allowed == VideoInCar.allowed && !first) || closed) return
        VideoInCar.allowed = allowed
        onChanged(allowed)
    }

    override fun close() {
        closed = true
        VideoInCar.allowed = false
    }

    private companion object {
        const val POLL_MILLIS = 1_000L
    }
}
