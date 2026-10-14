package net.easyconn.gwmec.network.wireguard

/**
 * One imported WireGuard configuration, kept as the text it came in as.
 *
 * A configuration is a private key and a peer's public key. It is never written
 * anywhere the driver did not put it: it lives in the app's private preferences,
 * is never logged, and never leaves the device.
 */
data class WireGuardConfig(
    val name: String,
    /** The interface's private key, base64. */
    val privateKey: String,
    /** Addresses this interface owns, e.g. 10.66.0.3/24. */
    val addresses: List<String>,
    val dnsServers: List<String> = emptyList(),
    val mtu: Int = 1420,
    /** The one peer this configuration reaches. */
    val peerPublicKey: String,
    val peerEndpoint: String?,
    val allowedIps: List<String> = emptyList(),
    val persistentKeepalive: Int? = null,
) {
    /** True when this configuration can be brought up at all. */
    val usable: Boolean
        get() = privateKey.isNotBlank() && peerPublicKey.isNotBlank() && addresses.isNotEmpty()
}

/** Parses the INI-like text a WireGuard configuration is written in. */
internal object WireGuardConfigParser {
    fun parse(name: String, text: String): WireGuardConfig? {
        var section = ""
        var privateKey = ""
        var peerPublicKey = ""
        var endpoint: String? = null
        var keepalive: Int? = null
        val addresses = mutableListOf<String>()
        val dns = mutableListOf<String>()
        val allowed = mutableListOf<String>()
        var mtu = 1420

        text.lineSequence().forEach { raw ->
            val line = raw.substringBefore('#').trim()
            if (line.isEmpty()) return@forEach
            if (line.startsWith("[") && line.endsWith("]")) {
                section = line.removeSurrounding("[", "]").lowercase()
                return@forEach
            }
            val key = line.substringBefore('=', "").trim().lowercase()
            if (key.isEmpty()) return@forEach
            val value = line.substringAfter('=', "").trim()
            when (section) {
                "interface" -> when (key) {
                    "privatekey" -> privateKey = value
                    "address" -> addresses += value.split(',').map(String::trim).filter(String::isNotEmpty)
                    "dns" -> dns += value.split(',').map(String::trim).filter(String::isNotEmpty)
                    "mtu" -> mtu = value.toIntOrNull() ?: mtu
                }
                "peer" -> when (key) {
                    "publickey" -> peerPublicKey = value
                    "endpoint" -> endpoint = value.takeIf(String::isNotEmpty)
                    "allowedips" -> allowed += value.split(',').map(String::trim).filter(String::isNotEmpty)
                    "persistentkeepalive" -> keepalive = value.toIntOrNull()
                }
            }
        }
        val config = WireGuardConfig(
            name = name,
            privateKey = privateKey,
            addresses = addresses,
            dnsServers = dns,
            mtu = mtu,
            peerPublicKey = peerPublicKey,
            peerEndpoint = endpoint,
            allowedIps = allowed,
            persistentKeepalive = keepalive,
        )
        return config.takeIf { it.usable }
    }
}
