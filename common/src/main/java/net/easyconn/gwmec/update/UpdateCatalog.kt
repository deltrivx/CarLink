package net.easyconn.gwmec.update

import net.easyconn.gwmec.host.BuildConfig
import org.json.JSONArray

/** The published release that a newer build can be downloaded from. */
internal data class UpdateRelease(
    val tagName: String,
    val apkName: String,
    val apkUrl: String,
    val checksumsUrl: String,
    /** What the release says about itself, so the driver can read it before installing. */
    val notes: String = "",
)

internal object UpdateCatalog {
        /**
     * Each line has its own home: the custom build's releases live in the
     * private repository, the generic build's in the public one. A generic
     * install cannot reach the private repository, and must not be told to
     * try — it would only ever be refused, and the two lines carry different
     * accessory identities.
     */
    /**
     * This build's own repository, injected at build time. The source names
     * neither: a public tree must not reveal that a private one exists.
     */
    private val REPO: String
        get() = "${BuildConfig.UPDATE_REPO_OWNER}/${BuildConfig.UPDATE_REPO_NAME}"
    internal const val CHECKSUMS_FILE = "SHA256SUMS.txt"
    internal const val CUSTOM_CHECKSUMS_FILE = "SHA256SUMS-custom.txt"
    internal const val GENERIC_CHECKSUMS_FILE = "SHA256SUMS.txt"
    internal const val CARLINK_CHECKSUMS_FILE = "SHA256SUMS-CarLink.txt"
    // 通用版资产即 CarLink.apk（2026.10.31.06 起，与定制版 EasyConnect.apk 对称命名）。
    internal const val GENERIC_APK_SUFFIX = "CarLink.apk"

    /**
     * Returns the first published release that carries this build's own APK
     * and its checksums, or null.
     *
     * @param generic true on a generic install (no system uid): it updates
     * only from the generic APK, because the custom APK carries a shared uid
     * it cannot upgrade over. False on the head unit's custom install.
     */
    internal fun parse(json: String, generic: Boolean): UpdateRelease? {
        val releases = JSONArray(json)
        for (index in 0 until releases.length()) {
            val release = releases.optJSONObject(index) ?: continue
            if (release.optBoolean("draft")) continue
            val assets = release.optJSONArray("assets") ?: continue
            var apkName = ""
            var apkUrl = ""
            var checksumsUrl = ""
            var genericName = ""
            var genericUrl = ""
            var genericChecksumsUrl = ""
            var customChecksumsUrl = ""
            for (assetIndex in 0 until assets.length()) {
                val asset = assets.optJSONObject(assetIndex) ?: continue
                val name = asset.optString("name")
                // Private releases only answer to the API asset URL with the
                // octet-stream accept header; browser_download_url is a 404.
                val apiId = asset.optLong("id")
                val url = if (apiId > 0)
                    "https://api.github.com/repos/$REPO/releases/assets/$apiId"
                else asset.optString("browser_download_url")
                if (name.endsWith(".apk")) {
                    // One release carries both lines. Each install follows its
                    // own: the custom APK carries a system shared uid the
                    // generic install cannot upgrade over, and vice versa.
                    if (name.endsWith(GENERIC_APK_SUFFIX)) {
                        genericName = name
                        genericUrl = url
                    } else {
                        apkName = name
                        apkUrl = url
                    }
                }
                if (name.equals(GENERIC_CHECKSUMS_FILE, ignoreCase = true)) genericChecksumsUrl = url
                if (name.equals(CUSTOM_CHECKSUMS_FILE, ignoreCase = true)) customChecksumsUrl = url
                if (name.equals(CARLINK_CHECKSUMS_FILE, ignoreCase = true)) checksumsUrl = url
                if (name.equals(CHECKSUMS_FILE, ignoreCase = true)) checksumsUrl = url
            }
            if (generic) {
                apkName = genericName
                apkUrl = genericUrl
                // The generic line prefers its own checksums file; the shared
                // one names only the custom APK.
                if (genericChecksumsUrl.isNotEmpty()) checksumsUrl = genericChecksumsUrl
            } else if (customChecksumsUrl.isNotEmpty()) {
                checksumsUrl = customChecksumsUrl
            }
            if (apkUrl.isEmpty() || checksumsUrl.isEmpty()) return null
            val notes = release.optString("body").orEmpty().trim()
            return UpdateRelease(release.optString("tag_name"), apkName, apkUrl, checksumsUrl, notes)
        }
        return null
    }
}
