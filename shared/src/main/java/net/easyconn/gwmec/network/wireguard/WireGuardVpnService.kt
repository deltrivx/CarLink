package net.easyconn.gwmec.network.wireguard

import android.content.Intent
import android.net.VpnService
import android.os.Build
import android.os.ParcelFileDescriptor
import android.util.Log

/**
 * The tunnel itself. A VpnService is the only way an app gets a TUN device, and the
 * system asks the driver for consent once, before this is ever started.
 *
 * It carries only what the imported configuration asks for, and — unless the
 * configuration deliberately captures it — leaves this app's own traffic outside
 * itself: CarPlay and the update check keep their own path, because a remote helper
 * that takes the car's link down with it is worse than no remote helper.
 */
class WireGuardVpnService : VpnService() {
    private var tunnel: ParcelFileDescriptor? = null
    private var runner: WireGuardTunnelRunner? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent?.action == ACTION_DISCONNECT) {
            // An explicit stop: the switch asked for down, so take the tunnel with it.
            // stopService alone must also do this via onDestroy; handling it here makes
            // the teardown synchronous even if the stop call never reaches the service.
            teardown()
            stopSelf()
            return START_NOT_STICKY
        }
        if (intent?.action != ACTION_CONNECT) {
            stopSelf()
            return START_NOT_STICKY
        }
        val config = WireGuardRemoteAssistant.config(this)
        if (config == null || !config.usable) {
            Log.w(TAG, "started without a usable configuration")
            stopSelf()
            return START_NOT_STICKY
        }
        // A previous tunnel must never survive a new one: an fd or a socket left
        // open keeps the VPN session "connected" after the switch says "off", and
        // every restart leaks another tun. Tear down before establishing.
        teardown()
        val log: (String) -> Unit = { message -> WireGuardRemoteAssistant.logLine(message) }
        val descriptor = establish(config, log)
        if (descriptor == null) {
            // An abnormal end turns the switch off — the state the next start begins
            // from — and says why. A switch that stays "on" over a dead tunnel lies.
            WireGuardRemoteAssistant.reportAbnormal("系统拒绝创建 VPN 隧道（请确认系统 VPN 权限）")
            stopSelf()
            return START_NOT_STICKY
        }
        tunnel = descriptor
        val runnerLog: (String) -> Unit = { message ->
            Log.i(TAG, message)
            WireGuardRemoteAssistant.logLine(message)
        }
        runner = WireGuardTunnelRunner(
            tunnel = descriptor,
            config = config,
            vpnService = this,
            log = runnerLog,
        ).also { it.start() }
        return START_STICKY
    }

    override fun onDestroy() {
        teardown()
        WireGuardRemoteAssistant.reportStopped("stopped")
        super.onDestroy()
    }

    /** Stops the runner and closes the tunnel, so nothing outlives this service.
     *  Sweeps the fd list as well: a runner replaced mid-handshake used to leave
     *  its tun fd behind (session 9), and the service's own references are not
     *  the whole truth about what this process still holds. */
    private fun teardown() {
        runner?.stop()
        runner = null
        runCatching { tunnel?.close() }
        tunnel = null
        // Sweep: any /dev/tun fd this process still holds after the references are
        // cleared belongs to an orphaned runner — close it so the interface dies
        // with the switch instead of surviving until force-stop.
        runCatching {
            val self = java.io.File("/proc/self/fd")
            self.listFiles()?.forEach { link ->
                val target = runCatching { android.system.Os.readlink(link.absolutePath) }.getOrNull()
                val isTun = target == "/dev/tun" || target == "/dev/net/tun" ||
                    target?.startsWith("/dev/tun") == true || target?.startsWith("/dev/net/tun") == true ||
                    target?.endsWith("/tun") == true
                if (isTun) {
                    val fd = link.name.toIntOrNull() ?: return@forEach
                    // adoptFd takes ownership; close releases it and the interface dies.
                    runCatching { ParcelFileDescriptor.adoptFd(fd).close() }
                    Log.i(TAG, "teardown swept orphaned tun fd $fd (target=$target)")
                }
            }
        }
    }

    override fun onRevoke() {
        // The driver, or the system, took the tunnel away — another VPN took over.
        // Say so rather than leaving a stale "connected": the settings page and the
        // home chip read this state, and a silent death is a chip that lies.
        Log.i(TAG, "revoked")
        // Abnormal: the system took the tunnel. Off, with the reason, per the state
        // rules — abnormal states default to off and say why.
        WireGuardRemoteAssistant.reportAbnormal("隧道被系统收回（可能有其他 VPN 接管）")
        stopSelf()
        super.onRevoke()
    }

    private fun establish(config: WireGuardConfig, log: (String) -> Unit): ParcelFileDescriptor? =
        runCatching {
            Builder().apply {
                config.addresses.forEach { address ->
                    val value = address.substringBefore('/')
                    val prefix = address.substringAfter('/', "").toIntOrNull() ?: 24
                    addAddress(value, prefix)
                }
                // Only what the configuration names. A configuration that wants
                // everything says 0.0.0.0/0; one that wants the car's own subnet
                // reachable says just that, and the rest keeps its own path.
                config.allowedIps.forEach { allowed ->
                    val value = allowed.substringBefore('/')
                    val prefix = allowed.substringAfter('/', "").toIntOrNull() ?: 32
                    runCatching { addRoute(value, prefix) }
                        .onFailure { log("route $allowed skipped: ${it.message}") }
                }
                config.dnsServers.forEach { dns ->
                    runCatching { addDnsServer(dns) }.onFailure { log("dns $dns skipped: ${it.message}") }
                }
                setMtu(config.mtu)
                setSession("车机互联远程助手")
                // The car's own traffic is not the remote helper's to reroute. Without
                // this, a configuration that captures everything would take CarPlay and
                // the update check down with it.
                runCatching { addDisallowedApplication(packageName) }
                    .onFailure { log("could not keep this app outside the tunnel: ${it.message}") }
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    runCatching { setMetered(false) }
                }
            }.establish()
        }.onFailure { error ->
            Log.e(TAG, "establish failed with exception", error)
            log("tunnel refused: ${error.message ?: error.javaClass.simpleName}")
        }.getOrNull()

    companion object {
        const val ACTION_CONNECT = "net.easyconn.gwmec.wireguard.CONNECT"
        const val ACTION_DISCONNECT = "net.easyconn.gwmec.wireguard.DISCONNECT"
        private const val TAG = "CarLink-WireGuard"
    }
}
