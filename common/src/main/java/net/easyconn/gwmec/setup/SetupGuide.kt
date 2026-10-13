package net.easyconn.gwmec.setup

import android.content.Context

/** Which features the setup guide offers for each DiLink generation, and how well each is proven. */
object SetupGuide {
    const val STEP_CAR = 0
    const val STEP_CONNECTION = 1
    const val STEP_IPHONE = 2
    const val STEP_FEATURES = 3
    const val STEP_DONE = 4
    const val STEP_COUNT = 5

    enum class Feature { AUTO_CONNECT, LOCATION, CALLS_ON_DASHBOARD, CALL_KEYS }

    /** TESTED: confirmed on at least one car of this generation. HIDDEN: not offered in the guide. */
    enum class Status { TESTED, EXPERIMENTAL, HIDDEN }

    data class Entry(val feature: Feature, val status: Status, val needsAdb: Boolean)

    /** Claims follow docs/COMPATIBILITY.md: community reports, not a certified support list. */
    fun features(generation: DiLinkGeneration): List<Entry> {
        fun entry(feature: Feature, status: Status, needsAdb: Boolean = false) = Entry(feature, status, needsAdb)
        val dilink3 = generation == DiLinkGeneration.DILINK_3
            return listOf(
            entry(Feature.AUTO_CONNECT, Status.TESTED),
            entry(Feature.LOCATION, Status.TESTED),
            entry(Feature.CALLS_ON_DASHBOARD, if (dilink3) Status.EXPERIMENTAL else Status.HIDDEN, needsAdb = true),
            entry(Feature.CALL_KEYS, if (dilink3) Status.EXPERIMENTAL else Status.HIDDEN, needsAdb = true),
        ).filter { it.status != Status.HIDDEN }
    }

    private fun prefs(context: Context) = context.getSharedPreferences("diplay", Context.MODE_PRIVATE)

    fun seen(context: Context): Boolean = prefs(context).getBoolean("setup_guide_seen", false)

    fun markSeen(context: Context) {
        prefs(context).edit().putBoolean("setup_guide_seen", true).apply()
    }

    /** Only a first launch opens the guide by itself; anyone with a saved iPhone has already set up. */
    fun shouldOpenOnLaunch(seen: Boolean, phoneChosen: Boolean): Boolean = !seen && !phoneChosen
}
