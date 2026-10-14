package net.easyconn.gwmec

import net.easyconn.gwmec.media.CarPlayNowPlaying

/**
 * Whether [next] is a different recording, which invalidates the decoded cover.
 *
 * Lyrics can occupy the title: an app showing a lyric line changes it every few seconds while
 * the album, artist, duration and artwork reference all stay put. Judging a track by its title
 * alone would drop the cover on every line — the driver would see the artwork flicker through
 * the whole song. A title change is only a new track when the position also restarted from
 * well into the previous one, and even then only when the artwork reference did not survive:
 * the iPhone keeps the same reference across tracks on one album, which is exactly the case
 * where the cover should stay.
 */
internal fun albumTrackChanged(previous: CarPlayNowPlaying, next: CarPlayNowPlaying): Boolean {
    if (previous.artworkTransferId != next.artworkTransferId) return true
    fun changed(old: Any?, new: Any?) = old != null && old != new
    if (changed(previous.sourceApp, next.sourceApp) || changed(previous.artist, next.artist) ||
        changed(previous.album, next.album) || changed(previous.durationMillis, next.durationMillis)) return true
    // Same album and reference. A restart from deep in the previous one is a new track; a lyric
    // line, or a seek the driver made, keeps the cover that is already on screen.
    val restarted = previous.elapsedMillis?.let { it > 15_000 } == true &&
        next.elapsedMillis?.let { it < 3_000 } == true
    return restarted && previous.title != null && next.title != null &&
        !previous.title.equals(next.title, ignoreCase = true)
}
