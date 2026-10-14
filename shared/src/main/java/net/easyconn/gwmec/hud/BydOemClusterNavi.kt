package net.easyconn.gwmec.hud

import android.content.Context

/**
 * Holding the cluster for a launch was part of the removed vendor
 * output. Without it the cluster is never held, so a launch proceeds on
 * whatever display the platform chooses.
 */
object BydOemClusterNavi {
    @JvmStatic
    fun holdForLaunch(context: Context, token: String, release: () -> Boolean): Boolean = false

    @JvmStatic
    fun restoreIfNeeded(context: Context) = Unit

    @JvmStatic
    fun release(context: android.content.Context, token: String?) = Unit

    @JvmStatic
    fun applicable(context: android.content.Context): Boolean = false
}
