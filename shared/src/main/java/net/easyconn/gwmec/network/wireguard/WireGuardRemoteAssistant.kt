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

    /**
     * How many tunnel log lines are kept. The official WireGuard Android app keeps a
     * ring of log lines the driver can scroll; this keeps the last [LOG_CAPACITY]
     * entries, which is the whole of what fits in one settings card anyway.
     */
    private const val LOG_CAPACITY = 200

    /** Window within which a second start() is a duplicate of the first — the chip
     *  and the settings toggle both ask on one tap. */
    private const val CONNECT_DEDUPE_MILLIS = 1_500L
    @Volatile private var connectRequestedAt: Long = 0L

    /** Connects the service is currently working on. A connect that ends abnormally
     *  (handshake failure, revoke, refusal) may turn the switch off; a report from
     *  a connect nobody is waiting for (stopped or replaced) may not. */
    @Volatile private var connectsOutstanding: Int = 0

    /** True while an abnormal reason must survive the teardown's "stopped" report. */
    @Volatile private var holdReason: Boolean = false

    /** The tunnel's state in one line, for the home and the settings page. */
    @Volatile var status: String = "未配置"
        private set

    /** The tunnel's log, newest last, for the settings page's log area. */
    @Volatile var log: String = ""
        private set

    private val logLines = ArrayDeque<String>(LOG_CAPACITY)

    /** The last context that touched the assistant, for state writes from the service. */
    @Volatile private var appContext: Context? = null
    private fun remember(context: Context) { appContext = context.applicationContext }

    private val listeners = mutableListOf<(String) -> Unit>()

    /** True while the tunnel is up (handshake completed). */
    @Volatile private var tunnelUp: Boolean = false

    /** True when the tunnel is up. The home's assistant switch shows errors when it
     *  is wanted on but this is false. */
    fun isTunnelUp(): Boolean = tunnelUp

    /** True when a configuration has been imported. */
    fun hasConfig(context: Context): Boolean = prefs(context).contains(KEY_CONFIG)

    /** The imported configuration, or null. Never logged. */
    fun config(context: Context): WireGuardConfig? =
        prefs(context).getString(KEY_CONFIG, null)?.let { WireGuardConfigParser.parse("imported", it) }

    /** Whether the tunnel is wanted on: on by default once a configuration exists. */
    fun isEnabled(context: Context): Boolean {
        remember(context)
        return hasConfig(context) && prefs(context).getBoolean(KEY_ENABLED, true)
    }

    fun setEnabled(context: Context, enabled: Boolean) {
        remember(context)
        // commit(): a crash right after a toggle must not eat the setting.
        prefs(context).edit().putBoolean(KEY_ENABLED, enabled).commit()
        if (enabled) start(context) else stop(context)
    }

    /** Saves an imported configuration and brings the tunnel up. */
    fun import(context: Context, text: String): Result<WireGuardConfig> {
        val parsed = WireGuardConfigParser.parse("imported", text)
            ?: return Result.failure(IllegalArgumentException("该文件中没有私钥、对端或地址"))
        // commit(): an imported config is data the driver should never have to retype.
        prefs(context).edit()
            .putString(KEY_CONFIG, text)
            .putBoolean(KEY_ENABLED, true)
            .commit()
        start(context)
        return Result.success(parsed)
    }

    /** Forgets the configuration and brings the tunnel down. */
    fun forget(context: Context) {
        // commit(): forgetting must survive a crash, or a "forgotten" config returns.
        prefs(context).edit().remove(KEY_CONFIG).putBoolean(KEY_ENABLED, false).commit()
        stop(context)
    }

    /** Brings the tunnel up if a configuration wants it up. Safe to call repeatedly. */
    fun start(context: Context) {
        remember(context)
        holdReason = false
        if (!isEnabled(context)) {
            report("未配置，或已关闭")
            return
        }
        val config = config(context)
        if (config == null || !config.usable) {
            report("配置无法读取")
            return
        }
        // One connect per driver action. The chip's ON path and the settings toggle
        // both ask twice (setEnabled already starts, then the VPN-permission helper
        // starts again); two CONNECT intents make the service tear down the first
        // runner mid-handshake and spawn an orphan whose failure report then forced
        // the switch off while the second tunnel ran (2026-10-20, the "tun never
        // comes down" bug). A connect asked for inside this window is a duplicate.
        val now = android.os.SystemClock.elapsedRealtime()
        if (now - connectRequestedAt < CONNECT_DEDUPE_MILLIS) return
        connectRequestedAt = now
        connectsOutstanding++
        report("正在连接…")
        runCatching {
            context.startService(Intent(context, WireGuardVpnService::class.java).setAction("net.easyconn.gwmec.wireguard.CONNECT"))
        }.onFailure { error ->
            report("无法启动隧道：${error.message ?: error.javaClass.simpleName}")
        }
        // An abnormal end tears the tunnel down synchronously (see reportAbnormal);
        // stop() here would race the report and eat its reason with "已关闭".
    }

    fun stop(context: Context) {
        // Two ways down, because one is not enough: a startService with a stop action
        // tears the tunnel down synchronously (and works even if a previous start
        // left the service in a state stopService cannot reach), and stopService
        // makes sure nothing restarts it. Neither may throw into the switch handler.
        connectsOutstanding = 0
        runCatching {
            context.startService(
                Intent(context, WireGuardVpnService::class.java)
                    .setAction(WireGuardVpnService.ACTION_DISCONNECT),
            )
        }
        runCatching { context.stopService(Intent(context, WireGuardVpnService::class.java)) }
        // "已关闭" after an abnormal reason would erase what the driver turned the
        // switch on to see: a timeout that vanished under "已关闭" reads as "it
        // worked, then it closed" (session 10). Keep the reason; it is the state
        // the next start answers from.
        if (holdReason) {
            Log.i(TAG, "closed; holding the abnormal reason \"$status\"")
        } else {
            report("已关闭")
        }
    }

    /** Brings the tunnel up on boot and on every app start, if it is wanted. */
    fun startIfWanted(context: Context) {
        if (isEnabled(context)) start(context)
    }

    // --- what the settings page shows ---

    fun observe(observer: (String) -> Unit) {
        listeners.add(observer)
        observer(status)
    }

    fun forget(observer: (String) -> Unit) {
        listeners.remove(observer)
    }

    /** A tunnel log line: appended to the log, leaving the state line alone. */
    fun logLine(message: String) {
        Log.d(TAG, message)
        appendLog(message)
    }

    /** A state change: replaces the state line and lands in the log too, so the log
     *  alone tells the tunnel's whole story. */
    fun report(message: String) {
        Log.i(TAG, message)
        status = message
        notifyListeners()
        appendLog(message)
    }

    internal fun reportTunnelUp() {
        tunnelUp = true
        connectsOutstanding = 0
        holdReason = false
        status = "已连接"
        notifyListeners()
        appendLog("已连接")
    }

    internal fun reportStopped(reason: String) {
        tunnelUp = false
        // The service's onDestroy fires on every teardown — including the one an
        // abnormal reason just asked for, or after user turned it off. The held
        // error reason or "已关闭" outranks the internal "stopped" line.
        if (holdReason || status == "已关闭") {
            Log.i(TAG, "stopped; holding status \"$status\" (reason=$reason)")
            return
        }
        status = reason
        notifyListeners()
    }

    /**
     * An abnormal end: the tunnel cannot or no longer runs, and the switch goes off
     * — the state the next start begins from — with the reason kept where the home
     * chip and the settings page can show it.
     *
     * Guarded: a failure report from a runner the service already replaced or the
     * driver already stopped must not flip the switch — turning the tunnel "off"
     * while the driver just turned it on tears the state apart, and the tunnel can
     * then never be brought down (2026-10-20, session 9). Only the report for the
     * live connect — the one that began from "正在连接…" — owns the switch.
     */
    internal fun reportAbnormal(reason: String) {
        tunnelUp = false
        status = reason
        // Hold this reason: the synchronous teardown that follows (here, and again
        // in the service's onDestroy) reports "stopped", which must not overwrite
        // the timeout the driver has not even seen yet.
        holdReason = true
        if (connectsOutstanding > 0) {
            connectsOutstanding = 0
            appContext?.let { prefs(it).edit().putBoolean(KEY_ENABLED, false).commit() }
            // The switch and the tunnel must land together: writing enabled=false
            // alone used to leave the VpnService running with the tun fd open —
            // the display said "off" while the process still held the interface, and
            // a driver tapping the switch then read the (false) pref, walked the ON
            // path, and OFF could never run again (session 10, the bad-endpoint
            // deadlock; only force-stop recovered). An abnormal end tears the
            // tunnel down here and now, not just the state.
            appContext?.let { stop(it) }
        } else {
            // A late or orphaned report: log it in the state line for the settings
            // page, but the switch is the driver's and stays where they put it.
            Log.i(TAG, "abnormal report for a dead connect ignored for the switch: $reason")
        }
        notifyListeners()
    }

    /**
     * The handshake did not complete in time. The switch wanted on; the tunnel
     * could not — the driver sees the reason on the home chip, and the state
     * goes back to off so the next start does not pretend.
     */
    internal fun reportHandshakeFailed(reason: String) {
        reportAbnormal(reason)
    }

    /** The app context remembered from the last touch, for localized error text
     *  from threads that have no view of their own. */
    internal fun appContextForErrorText(): Context? = appContext

    private fun appendLog(message: String) {
        synchronized(logLines) {
            if (logLines.size >= LOG_CAPACITY) logLines.removeFirst()
            logLines.addLast(message)
            log = logLines.joinToString("\n")
        }
    }

    private fun notifyListeners() {
        listeners.toList().forEach { listener -> runCatching { listener(status) } }
    }

    private fun prefs(context: Context): SharedPreferences =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
}
