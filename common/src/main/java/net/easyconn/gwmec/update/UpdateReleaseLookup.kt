package net.easyconn.gwmec.update

import java.net.URL
import java.net.URLConnection

internal object UpdateReleaseLookup {
    fun latest(
        installedVersion: String,
        userAgent: String,
        token: String? = null,
        generic: Boolean = false,
        openConnection: (URL) -> URLConnection = { it.openConnection() },
    ): UpdateRelease? {
        val json = UpdateClient.fetchText(
            UpdateClient.RELEASES_URL,
            "application/vnd.github+json",
            userAgent,
            token,
            openConnection,
        )
        val release = UpdateCatalog.parse(json, generic) ?: return null
        return release.takeIf { UpdateVersion.isNewer(it.tagName, installedVersion) }
    }
}
