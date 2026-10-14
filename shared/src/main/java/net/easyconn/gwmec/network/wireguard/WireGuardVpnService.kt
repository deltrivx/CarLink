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
        val log: (String) -> Unit = { message -> Log.i(TAG, message) }
        val descriptor = establish(config, log)
        if (descriptor == null) {
            WireGuardRemoteAssistant.reportStopped("the system refused the tunnel")
            stopSelf()
            return START_NOT_STICKY
        }
        tunnel = descriptor
        WireGuardRemoteAssistant.reportTunnelUp()
        runner = WireGuardTunnelRunner(descriptor, config, log).also { it.start() }
        return START_STICKY
    }

    override fun onDestroy() {
        runner?.stop()
        runner = null
        runCatching { tunnel?.close() }
        tunnel = null
        WireGuardRemoteAssistant.reportStopped("stopped")
        super.onDestroy()
    }

    override fun onRevoke() {
        // The driver, or the system, took the tunnel away — another VPN took over.
        Log.i(TAG, "revoked")
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
            log("tunnel refused: ${error.message ?: error.javaClass.simpleName}")
        }.getOrNull()

    private companion object {
        const val TAG = "CarLink-WireGuard"
        const val ACTION_CONNECT = "net.easyconn.gwmec.wireguard.CONNECT"
    }
}
