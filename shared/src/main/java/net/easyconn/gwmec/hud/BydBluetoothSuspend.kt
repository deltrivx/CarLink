package net.easyconn.gwmec.hud

import android.bluetooth.BluetoothAdapter
import android.content.Context

/**
 * Suspending the Bluetooth radio during a session was optional and went
 * with the vendor HUD; it drove the radio over local ADB, which is not
 * available here.
 *
 * The radio is therefore left alone. Recovery reports success so the
 * caller proceeds without a pause step.
 */
object BydBluetoothSuspend {
    private const val PREFS = "diplay_bt_suspend"
    private const val KEY_RESTORE_ENABLED = "restore_initially_enabled"

    @JvmStatic
    fun suspend(
        context: Context,
        owner: Any,
        delayMillis: Long,
        stillNeeded: () -> Boolean,
    ) = Unit

    @JvmStatic
    fun resume(context: Context, owner: Any) = Unit

    @JvmStatic
    fun resumeAndWait(context: Context, adapter: BluetoothAdapter?): Boolean = true

    /**
     * True when the radio is off with our own restore marker journalled: a call that
     * starts then runs on the cabin microphone, so the telephony sink must not claim
     * the voice path. This reads only the journal and the radio state; it needs no ADB.
     */
    @JvmStatic
    fun isSuspendedByUs(context: Context): Boolean {
        val app = context.applicationContext
        val marked = app.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .getBoolean(KEY_RESTORE_ENABLED, false)
        val adapter = runCatching {
            app.getSystemService(android.bluetooth.BluetoothManager::class.java)?.adapter
        }.getOrNull()
        return marked && adapter?.isEnabled == false
    }
}
