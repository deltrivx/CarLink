package net.easyconn.gwmec

import android.media.browse.MediaBrowser
import android.os.Bundle
import android.service.media.MediaBrowserService

/**
 * Lets a launcher, a cluster or any other app ask what CarPlay is playing.
 *
 * The media session already publishes the iPhone's NowPlaying information — title,
 * artist, album, cover and play state — but a session is only ever pushed at whoever
 * is listening right now. A dashboard or a third-party home screen has to be able to
 * ask, and to keep asking across a restart; that is what this service is for.
 *
 * It owns no state of its own: everything it answers with comes from
 * [CarPlayMediaKeys], which holds the session the CarPlay feed fills. With no CarPlay
 * session there is nothing to show, and an empty result is the honest answer — a
 * launcher that finds an empty queue simply has nothing to put on screen.
 */
class CarPlayBrowserService : MediaBrowserService() {
    override fun onGetRoot(
        clientPackageName: String,
        clientUid: Int,
        rootHints: Bundle?,
    ): BrowserRoot = BrowserRoot(ROOT_ID, null)

    override fun onLoadChildren(
        parentId: String,
        result: Result<MutableList<MediaBrowser.MediaItem>>,
    ) {
        // The source is a single item — whatever the iPhone is playing right now — and it
        // exists only while there is something to show. Sending an empty list, rather
        // than a detach, keeps the launcher's connection for the next track.
        val metadata = CarPlayMediaKeys.published()
        val items: MutableList<MediaBrowser.MediaItem> = mutableListOf()
        metadata?.let {
            items.add(MediaBrowser.MediaItem(it.description, MediaBrowser.MediaItem.FLAG_PLAYABLE))
        }
        result.sendResult(items)
    }

    private companion object {
        const val ROOT_ID = "carlink_now_playing"
    }
}
