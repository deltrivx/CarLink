package net.easyconn.gwmec.network

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.net.wifi.ScanResult
import android.net.wifi.WifiManager
import android.os.Build

/**
 * The networks around the car, so the driver can pick one instead of typing its name.
 *
 * Reading the networks the device has saved is a privileged call with no standard way in:
 * a normal app is told nothing on a current Android. Scanning what is in the air, though,
 * is a standard permission — location on older releases, nearby devices on newer ones —
 * and it is the better answer here anyway, since the network the car is joining is right
 * there. Every step is best effort: when the radio will not scan or the permission is
 * missing, the caller falls back to what 车机互联 remembered and to typing it in.
 */
object WifiNetworkPicker {
    /** A network seen in the air, strongest first. */
    data class Network(val ssid: String, val signal: Int)

    /** True when this build can be asked to scan at all. */
    fun canScan(context: Context): Boolean {
        val app = context.applicationContext
        val granted = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            app.checkSelfPermission(Manifest.permission.NEARBY_WIFI_DEVICES) ==
                PackageManager.PERMISSION_GRANTED
        } else {
            app.checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) ==
                PackageManager.PERMISSION_GRANTED ||
                app.checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) ==
                PackageManager.PERMISSION_GRANTED
        }
        val wifi = runCatching { app.getSystemService(WifiManager::class.java) }.getOrNull()
        return granted && wifi != null && (wifi.isWifiEnabled || Build.VERSION.SDK_INT < Build.VERSION_CODES.Q)
    }

    /**
     * Asks for a scan and returns what is in range, strongest first, or empty when it
     * cannot. Never throws; a picker that cannot answer stays out of the way.
     */
    fun around(context: Context): List<Network> {
        val app = context.applicationContext
        val wifi = runCatching { app.getSystemService(WifiManager::class.java) }.getOrNull()
            ?: return emptyList()
        if (!canScan(context)) return emptyList()
        runCatching { wifi.startScan() }
        val results: List<ScanResult> = runCatching { wifi.scanResults }.getOrNull() ?: emptyList()
        return results.mapNotNull { result ->
            val name = result.SSID?.removeSurrounding("\"")?.takeIf {
                it.isNotBlank() && it != "<unknown ssid>"
            }
            name?.let { Network(it, result.level) }
        }.distinctBy { it.ssid }.sortedByDescending { it.signal }
    }
}
