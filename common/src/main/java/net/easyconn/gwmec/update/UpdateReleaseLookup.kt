package net.easyconn.gwmec.update

import android.util.Log
import java.io.IOException
import java.net.HttpURLConnection
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

    /**
     * API 之外的兜底检查。`releases/latest/download/<校验和文件>` 是一个 302，
     * Location 与跟随后的最终 URL 都带着最新 tag：直连不跟随重定向读 Location；
     * 直连不可达（车机常态）时经 ghfast 镜像跟随，最终 URL 同样携带 tag。
     * 一个请求同时得到"是否有新版"与可直接走镜像的下载地址。
     */
    fun latestViaRedirect(
        installedVersion: String,
        userAgent: String,
        generic: Boolean,
        openConnection: (URL) -> URLConnection = { it.openConnection() },
    ): UpdateRelease? {
        val latest = UpdateClient.REPO_BASE + "/releases/latest/download/" + UpdateCatalog.CHECKSUMS_FILE
        val directTag = runCatching {
            val connection = openConnection(URL(latest)) as? HttpURLConnection
                ?: throw IOException("Request to $latest did not open an HTTP connection")
            try {
                connection.instanceFollowRedirects = false
                connection.connectTimeout = 10_000
                connection.readTimeout = 10_000
                connection.setRequestProperty("User-Agent", userAgent)
                val code = connection.responseCode
                if (code in 301..308) tagFromUrl(connection.getHeaderField("Location")) else null
            } finally {
                connection.disconnect()
            }
        }.getOrNull()
        val tag = directTag ?: UpdateMirror.CHECK_MIRRORS.firstNotNullOfOrNull { prefix ->
            runCatching {
                val connection = openConnection(URL(prefix + latest)) as? HttpURLConnection
                    ?: throw IOException("Mirror request to $latest did not open an HTTP connection")
                try {
                    connection.connectTimeout = 10_000
                    connection.readTimeout = 15_000
                    connection.setRequestProperty("User-Agent", userAgent)
                    if (connection.responseCode !in 200..299) {
                        throw IOException("Mirror check request failed: ${connection.responseCode}")
                    }
                    tagFromUrl(connection.url.toString())
                } finally {
                    connection.disconnect()
                }
            }.onFailure { Log.i("UpdateReleaseLookup", "check via $prefix failed", it) }.getOrNull()
        } ?: throw IOException("Could not read the latest tag from $latest")
        // 资产名与 build-release.yml 实际上传的两个包一致；泛型构建取通用包。
        // 与 UpdateCatalog 的通用分支一致：通用构建取 *-generic.apk 资产。
        val apkName = if (generic) "CarLink-generic.apk" else "EasyConnect.apk"
        val base = UpdateClient.REPO_BASE + "/releases/download/$tag"
        return UpdateRelease(tag, apkName, "$base/$apkName", "$base/${UpdateCatalog.CHECKSUMS_FILE}", "")
            .takeIf { UpdateVersion.isNewer(it.tagName, installedVersion) }
    }

    private fun tagFromUrl(url: String?): String? {
        if (url == null) return null
        val marker = "/releases/download/"
        val index = url.indexOf(marker)
        if (index < 0) return null
        return url.substring(index + marker.length).substringBefore('/')
    }
}
