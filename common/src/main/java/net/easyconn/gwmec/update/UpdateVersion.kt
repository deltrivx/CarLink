package net.easyconn.gwmec.update

internal object UpdateVersion {
    // Dotted numeric versions: 1.3.50, 2026.10.20, 2026.10.20.12. Any number of
    // segments; missing segments count as zero. The date scheme's fourth segment
    // is the build of the day, so 2026.10.20.12 > 2026.10.20 > 2026.10.19.99.
    private val DOTTED = Regex("^\\d+(\\.\\d+)*$")

    internal fun parse(value: String): List<Int>? {
        val trimmed = value.trim().removePrefix("v").substringBefore('-')
        if (!DOTTED.matches(trimmed)) return null
        return trimmed.split('.').mapNotNull { it.toIntOrNull() }
    }

    /** Segment-by-segment comparison; missing segments are zero. */
    internal fun isNewer(remote: String, installed: String): Boolean {
        val target = parse(remote) ?: return false
        val current = parse(installed) ?: return true
        val size = maxOf(target.size, current.size)
        for (index in 0 until size) {
            val t = target.getOrElse(index) { 0 }
            val c = current.getOrElse(index) { 0 }
            if (t != c) return t > c
        }
        return false
    }
}
