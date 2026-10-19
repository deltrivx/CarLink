package net.easyconn.gwmec.network.wireguard

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.util.Log

/**
 * The remote assistant: a WireGuard tunnel from an imported configuration, so a
 * developer can reach the car from elsewhere to debug it.
 *
 * It is off until a configuration is imported, and on as soon as one is — whoever
 * went to the trouble of importing one wants it up, not a second switch to find.
 * Bringing it down is a choice; bringing it up is the default.
 *
 * What it must never do is take the car's own link down with it. The tunnel carries
 * only what the configuration asks for, and keeps this app's own traffic — CarPlay,
 * and the update check — outside itself.
 */
object WireGuardRemoteAssistant {
    private const val TAG = "CarLink-WireGuard"
    private const val PREFS = "diplay_wireguard"
    private const val KEY_CONFIG = "config"
    private const val KEY_ENABLED = "enabled"

    /** The last thing the tunnel said, for the settings page to show. */
    @Volatile var lastMessage: String = "未配置"
        private set

    private val listeners = mutableListOf<(String) -> Unit>()

    /** True when a configuration has been imported. */
    fun hasConfig(context: Context): Boolean = prefs(context).contains(KEY_CONFIG)

    /** The imported configuration, or null. Never logged. */
    fun config(context: Context): WireGuardConfig? =
        prefs(context).getString(KEY_CONFIG, null)?.let { WireGuardConfigParser.parse("imported", it) }

    /** Whether the tunnel is wanted on: on by default once a configuration exists. */
    fun isEnabled(context: Context): Boolean =
        hasConfig(context) && prefs(context).getBoolean(KEY_ENABLED, true)

    fun setEnabled(context: Context, enabled: Boolean) {
        prefs(context).edit().putBoolean(KEY_ENABLED, enabled).apply()
        if (enabled) start(context) else stop(context)
    }

    /** Saves an imported configuration and brings the tunnel up. */
    fun import(context: Context, text: String): Result<WireGuardConfig> {
        val parsed = WireGuardConfigParser.parse("imported", text)
            ?: return Result.failure(IllegalArgumentException("该文件中没有私钥、对端或地址"))
        prefs(context).edit()
            .putString(KEY_CONFIG, text)
            .putBoolean(KEY_ENABLED, true)
            .apply()
        start(context)
        return Result.success(parsed)
    }

    /** Forgets the configuration and brings the tunnel down. */
    fun forget(context: Context) {
        prefs(context).edit().remove(KEY_CONFIG).putBoolean(KEY_ENABLED, false).apply()
        stop(context)
    }

    /** Brings the tunnel up if a configuration wants it up. Safe to call repeatedly. */
    fun start(context: Context) {
        if (!isEnabled(context)) {
            report("未配置，或已关闭")
            return
        }
        val config = config(context)
        if (config == null || !config.usable) {
            report("配置无法读取")
            return
        }
        report("正在连接…")
        runCatching {
            context.startService(Intent(context, WireGuardVpnService::class.java).setAction("net.easyconn.gwmec.wireguard.CONNECT"))
        }.onFailure { error ->
            report("无法启动隧道：${error.message ?: error.javaClass.simpleName}")
        }
    }

    fun stop(context: Context) {
        runCatching { context.stopService(Intent(context, WireGuardVpnService::class.java)) }
        report("已关闭")
    }

    /** Brings the tunnel up on boot and on every app start, if it is wanted. */
    fun startIfWanted(context: Context) {
        if (isEnabled(context)) start(context)
    }

    // --- what the settings page shows ---

    fun observe(observer: (String) -> Unit) {
        listeners.add(observer)
        observer(lastMessage)
    }

    fun forget(observer: (String) -> Unit) {
        listeners.remove(observer)
    }

    fun report(message: String) {
        Log.i(TAG, message)
        lastMessage = message
        listeners.toList().forEach { listener -> runCatching { listener(message) } }
    }

    internal fun reportTunnelUp() {
        report("已连接")
    }

    internal fun reportStopped(reason: String) {
        report(reason)
    }

    private fun prefs(context: Context): SharedPreferences =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
}
