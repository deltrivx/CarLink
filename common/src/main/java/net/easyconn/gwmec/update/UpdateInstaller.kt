package net.easyconn.gwmec.update

import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageInstaller
import android.os.Build
import android.util.Log
import java.io.File

/**
 * Unattended update installer for platform-signed builds.
 *
 * An ordinary app can only ask the package installer to show a confirmation
 * dialogue. A build signed with the unit's own platform key is allowed to
 * commit the session without asking, which is what makes an over-the-air
 * update feel like one: the driver taps Install once and the unit comes back
 * on the new version.
 *
 * The fallback matters as much as the fast path. Where the silent session is
 * refused — a unit signed differently, a restricted build, or a package that
 * asks for USER_ACTION anyway — the caller must still get the APK installed,
 * by whatever route that build permits. So failures are reported as failures
 * rather than swallowed, and the caller decides what to show.
 */
internal object UpdateInstaller {
    private const val TAG = "CarLink-Update"
    private const val SESSION_ACTION = "net.easyconn.gwmec.update.INSTALL_RESULT"
    // Matches PackageInstaller.SessionParams hidden value: do not ask the user.
    private const val USER_ACTION_NOT_REQUIRED = 0

    /** Commits [apk] and reports (success, message) exactly once. */
    fun install(context: Context, apk: File, onResult: (Boolean, String) -> Unit) {
        val installer = context.packageManager.packageInstaller
        val params = PackageInstaller.SessionParams(
            PackageInstaller.SessionParams.MODE_FULL_INSTALL,
        ).apply {
            setSize(apk.length())
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                setInstallReason(android.content.pm.PackageManager.INSTALL_REASON_UNKNOWN)
            }
            // Only platform-signed builds may skip the confirmation (API 31+).
            // Reflection rather than a direct call: the constant only exists on
            // recent SDKs, and a unit that refuses must still install by hand.
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                runCatching {
                    val method = PackageInstaller.SessionParams::class.java
                        .getMethod("setRequireUserAction", Int::class.javaPrimitiveType)
                    method.invoke(this, USER_ACTION_NOT_REQUIRED)
                    Log.i(TAG, "unattended install requested")
                }.onFailure { Log.i(TAG, "unattended install unavailable: $it") }
            }
        }

        val receiver = object : BroadcastReceiver() {
            override fun onReceive(receiverContext: Context, intent: Intent) {
                runCatching { receiverContext.unregisterReceiver(this) }
                val status = intent.getIntExtra(
                    PackageInstaller.EXTRA_STATUS,
                    PackageInstaller.STATUS_FAILURE,
                )
                val message = intent.getStringExtra(PackageInstaller.EXTRA_STATUS_MESSAGE).orEmpty()
                if (status == PackageInstaller.STATUS_SUCCESS) {
                    onResult(true, "installed")
                } else {
                    onResult(false, "status=$status $message")
                }
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            context.registerReceiver(receiver, IntentFilter(SESSION_ACTION), Context.RECEIVER_NOT_EXPORTED)
        } else {
            @Suppress("UnspecifiedRegisterReceiverFlag")
            context.registerReceiver(receiver, IntentFilter(SESSION_ACTION))
        }

        try {
            val sessionId = installer.createSession(params)
            installer.openSession(sessionId).use { session ->
                apk.inputStream().use { input ->
                    session.openWrite("diplay-update", 0, apk.length()).use { output ->
                        input.copyTo(output)
                        session.fsync(output)
                    }
                }
                val pending = PendingIntent.getBroadcast(
                    context,
                    sessionId,
                    Intent(SESSION_ACTION).setPackage(context.packageName),
                    PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_MUTABLE,
                )
                session.commit(pending.intentSender)
            }
        } catch (error: Exception) {
            runCatching { context.unregisterReceiver(receiver) }
            Log.w(TAG, "install failed", error)
            onResult(false, error.message ?: error.javaClass.simpleName)
        }
    }
}
