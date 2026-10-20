package net.easyconn.gwmec

import android.content.Context

/**
 * Whether the home's corner carries the remote assistant switch.
 *
 * Off by default: the corner is the driver's, and the assistant is a debug tool
 * most installs never import. A driver who wants it at hand turns it on here, and
 * from then on their choice is the one that counts.
 */
internal object RemoteAssistantPreferences {
    private const val PREFS = "diplay_wireguard"
    private const val KEY_SHOW_ON_HOME = "showOnHome"

    fun showOnHome(context: Context): Boolean =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .getBoolean(KEY_SHOW_ON_HOME, false)

    fun saveShowOnHome(context: Context, show: Boolean) {
        // commit(): a crash after this write must not eat the driver's choice.
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit()
            .putBoolean(KEY_SHOW_ON_HOME, show).commit()
    }
}
