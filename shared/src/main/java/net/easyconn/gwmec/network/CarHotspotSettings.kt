package net.easyconn.gwmec.network

import android.content.Context
import net.easyconn.gwmec.adb.LocalAdb
import net.easyconn.gwmec.orchestration.WirelessHotspotMode

object CarHotspotSettings {
    private const val KEY_OFF_REPORT_IGNORED = "off_report_ignored"
    private fun prefs(context: Context) = context.getSharedPreferences("diplay_car_hotspot", Context.MODE_PRIVATE)

    fun enabled(context: Context): Boolean = prefs(context).getBoolean("auto_enable", false)

    /**
     * Whether Android's report of the car hotspot should be taken at face value.
     *
     * Some firmware reports it off while it is on. Once the driver has said otherwise by
     * pressing Connect in the "Car hotspot is off" dialog, that report is not treated as
     * final until the head unit reports the hotspot on once - otherwise every tap of
     * Connect opens the same dialog again, and the driver can never connect.
     */
    fun reportedOff(context: Context, androidReportsOff: Boolean?): Boolean {
        if (androidReportsOff != false) return true
        return !prefs(context).getBoolean(KEY_OFF_REPORT_IGNORED, false)
    }

    fun setOffReportIgnored(context: Context, ignored: Boolean) {
        prefs(context).edit().putBoolean(KEY_OFF_REPORT_IGNORED, ignored).apply()
    }

    fun setEnabled(context: Context, enabled: Boolean) =
        prefs(context).edit().putBoolean("auto_enable", enabled).apply()

    // Visibility is independent of the saved choice: ADB is only needed to grant permission.
    fun visible(bydAvailable: Boolean, access: LocalAdb.Access): Boolean =
        bydAvailable && (access == LocalAdb.Access.READY || access == LocalAdb.Access.NOT_APPROVED)

    fun shouldEnable(context: Context, wireless: Boolean, mode: WirelessHotspotMode): Boolean =
        enabled(context) && wireless && mode == WirelessHotspotMode.MANUAL
}
