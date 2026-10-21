package net.easyconn.gwmec.update

import android.content.Context

/** Durable metadata only. APK downloads always remain an explicit foreground action. */
internal object UpdateAvailability {
    private const val PREFERENCES = "diplay_update_availability"
    private const val TAG = "tag"
    private const val APK_NAME = "apk_name"
    private const val APK_URL = "apk_url"
    private const val CHECKSUMS_URL = "checksums_url"
    private const val LAST_ATTEMPT_MILLIS = "last_attempt_millis"
    private const val BACKGROUND_CHECKS = "background_checks"
    private const val AUTO_DOWNLOAD = "auto_download"
    private const val LAST_RESULT = "last_result"
    private const val LAST_RESULT_MILLIS = "last_result_millis"

    internal const val CHECK_INTERVAL_MILLIS = 24L * 60 * 60 * 1000
    /**
     * A car is not switched on every day, so the periodic check alone can miss a release
     * for a week. Any time the app comes up — which is any time the car is being used —
     * it may look again after this much quiet, so the driver hears about a new build
     * while actually using the car rather than on some schedule the car never meets.
     */
    internal const val CHECK_INTERVAL_ON_OPEN_MILLIS = 30L * 60 * 1000

    private fun preferences(context: Context) =
        context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE)

    fun backgroundChecksEnabled(context: Context): Boolean =
        preferences(context).getBoolean(BACKGROUND_CHECKS, true)

    fun saveBackgroundChecksEnabled(context: Context, enabled: Boolean) {
        preferences(context).edit().putBoolean(BACKGROUND_CHECKS, enabled).apply()
        // Downloading without being asked only makes sense while looking for updates.
        if (!enabled) saveAutoDownload(context, false)
    }

    /** True when a new release should be fetched as soon as it is seen. */
    fun autoDownload(context: Context): Boolean =
        preferences(context).getBoolean(AUTO_DOWNLOAD, false)

    fun saveAutoDownload(context: Context, enabled: Boolean) {
        preferences(context).edit().putBoolean(AUTO_DOWNLOAD, enabled).apply()
    }

    fun available(context: Context, installedVersion: String): UpdateRelease? {
        val values = preferences(context)
        val release = UpdateRelease(
            tagName = values.getString(TAG, null) ?: return null,
            apkName = values.getString(APK_NAME, null) ?: return null,
            apkUrl = values.getString(APK_URL, null) ?: return null,
            checksumsUrl = values.getString(CHECKSUMS_URL, null) ?: return null,
        )
        if (UpdateVersion.isNewer(release.tagName, installedVersion)) return release
        clear(context)
        return null
    }

    fun save(context: Context, release: UpdateRelease) {
        preferences(context).edit()
            .putString(TAG, release.tagName)
            .putString(APK_NAME, release.apkName)
            .putString(APK_URL, release.apkUrl)
            .putString(CHECKSUMS_URL, release.checksumsUrl)
            .apply()
        notifyStatusChanged()
    }

    fun clear(context: Context) {
        preferences(context).edit()
            .remove(TAG)
            .remove(APK_NAME)
            .remove(APK_URL)
            .remove(CHECKSUMS_URL)
            .apply()
        notifyStatusChanged()
    }

    fun shouldCheck(context: Context, nowMillis: Long): Boolean =
        shouldCheck(context, nowMillis, CHECK_INTERVAL_MILLIS)

    /** Whether to look now, given the shortest gap that counts as a fresh look. */
    fun shouldCheck(context: Context, nowMillis: Long, intervalMillis: Long): Boolean {
        val lastAttempt = preferences(context).getLong(LAST_ATTEMPT_MILLIS, 0L)
        return lastAttempt <= 0L || nowMillis < lastAttempt || nowMillis - lastAttempt >= intervalMillis
    }

    fun recordAttempt(context: Context, nowMillis: Long) {
        preferences(context).edit().putLong(LAST_ATTEMPT_MILLIS, nowMillis).apply()
    }

    fun recordResult(context: Context, nowMillis: Long, result: String) {
        preferences(context).edit().putString(LAST_RESULT, result).putLong(LAST_RESULT_MILLIS, nowMillis).apply()
    }

    /** One diagnostic line. Ages are relative so the report needs no clock or locale. */
    fun report(context: Context, nowMillis: Long): String {
        val values = preferences(context)
        fun age(key: String) = values.getLong(key, 0L).takeIf { it > 0L }
            ?.let { "${(nowMillis - it).coerceAtLeast(0L) / 60_000} min ago" } ?: "never"
        return "Update check: background=${if (backgroundChecksEnabled(context)) "on" else "off"}; " +
            "lastSuccess=${age(LAST_ATTEMPT_MILLIS)}; cachedRelease=${values.getString(TAG, null) ?: "none"}; " +
            "lastResult=${values.getString(LAST_RESULT, null) ?: "none"} (${age(LAST_RESULT_MILLIS)})"
    }

    internal fun clearAllForTest(context: Context) {
        preferences(context).edit().clear().commit()
    }

    // --- status observers ------------------------------------------------------
    //
    // The home's corner label shows "there is a newer release" the moment a
    // background check finds one. A view built before the check finished has to be
    // repainted when the state changes, and only a change notification carries
    // that: re-attaching alone repaints a stale view with a stale state.

    private val statusListeners = mutableListOf<() -> Unit>()

    fun observeStatus(observer: () -> Unit) {
        synchronized(statusListeners) { statusListeners.add(observer) }
    }

    fun unobserveStatus(observer: () -> Unit) {
        synchronized(statusListeners) { statusListeners.remove(observer) }
    }

    /** Called after a check saved or cleared a cached release. */
    fun notifyStatusChanged() {
        synchronized(statusListeners) { statusListeners.toList() }.forEach {
            runCatching { it() }
        }
    }
}
