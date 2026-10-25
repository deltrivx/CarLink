package net.easyconn.gwmec.update

import android.content.Context

/**
 * GitHub 文件下载的镜像路由。
 *
 * 2026-10 的实测：release 资产直连时快时慢甚至完全超时；gh-proxy.com 与
 * ghfast.top 两个公共镜像对 releases/download 的两个包（CarLink.apk、
 * EasyConnect.apk）都稳定且更快。更新检查用的 api.github.com 没有可用镜像
 * （公共镜像一律 403），因此路由只作用于 github.com 的文件 URL，检查保持直连。
 *
 * 路线顺序：开启加速时，上次成功的镜像优先（记住哪条路走得通），其余镜像随后，
 * 直连垫底；关闭加速时只走直连。
 */
internal object UpdateMirror {
    private const val PREFERENCES = "diplay_update_mirror"
    private const val ENABLED = "enabled"
    private const val LAST_WORKING = "last_working"

    /** 顺序即回退顺序，来自 2026-10-24 的实测下载测速。 */
    private val CANDIDATES = listOf("https://gh-proxy.com/", "https://ghfast.top/")

    /** 检查兜底专用：会跟随重定向并在最终 URL 里回显 tag 的镜像，按序尝试。 */
    internal val CHECK_MIRRORS = listOf("https://ghfast.top/", "https://ghproxy.net/")

    private fun preferences(context: Context) =
        context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE)

    fun enabled(context: Context): Boolean =
        preferences(context).getBoolean(ENABLED, true)

    fun saveEnabled(context: Context, value: Boolean) {
        preferences(context).edit().putBoolean(ENABLED, value).apply()
    }

    internal fun rememberWorking(context: Context, route: String) {
        val prefix = CANDIDATES.firstOrNull { route.startsWith(it) } ?: return
        preferences(context).edit().putString(LAST_WORKING, prefix).apply()
    }

    internal fun lastWorking(context: Context): String? =
        preferences(context).getString(LAST_WORKING, null)?.takeIf { it in CANDIDATES }

    /** 只有 github.com 的文件 URL 可以走镜像；api.github.com 不在此列。 */
    internal fun mirrorable(url: String): Boolean = url.startsWith("https://github.com/")

    /** 依次尝试的下载路线：镜像（上次成功的优先）在前，直连垫底。 */
    fun routes(context: Context, url: String): List<String> {
        if (!mirrorable(url)) return listOf(url)
        if (!enabled(context)) return listOf(url)
        val preferred = lastWorking(context)
        val order = if (preferred != null) {
            listOf(preferred) + (CANDIDATES - preferred)
        } else CANDIDATES
        return order.map { it + url } + url
    }
}
