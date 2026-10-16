package net.easyconn.gwmec

import android.view.KeyEvent
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * What the wheel key service saw and did with it, for the diagnostic report.
 *
 * The service wrote only to logcat, so a head unit without adb could not show whether a
 * wheel key reaches Android at all. Kept in memory since the process started: storage on a
 * key press would delay the head unit's own key handling. A press is one entry; a held key's
 * repeats and its release add nothing.
 *
 * The service is handed every hardware key, a connected keyboard's too. A key that writes
 * text is counted and never listed, and no input device name is kept.
 */
internal object WheelKeyLog {
    private const val ENTRIES = 40

    private class Entry(val atMillis: Long, val text: String, var times: Int = 1, var lastMillis: Long = atMillis) {
        fun copy() = Entry(atMillis, text, times, lastMillis)
    }

    private val entries = ArrayDeque<Entry>()
    private var boundAtMillis: Long? = null
    private var presses = 0
    private var kept = 0
    private var textKeys = 0

    @Synchronized
    fun bound(nowMillis: Long = System.currentTimeMillis()) {
        boundAtMillis = nowMillis
    }

    /** A line the service also writes to logcat. */
    @Synchronized
    fun note(message: String, nowMillis: Long = System.currentTimeMillis()) = add(message, nowMillis)

    /** A key the service was given, before anything decided what it does. */
    @Synchronized
    fun key(event: KeyEvent, nowMillis: Long = System.currentTimeMillis()) {
        presses++
        // A key that types is not a wheel key, and listing it would fill the report with typing.
        if (event.unicodeChar != 0 || event.keyCode in KeyEvent.KEYCODE_A..KeyEvent.KEYCODE_Z ||
            event.keyCode in KeyEvent.KEYCODE_0..KeyEvent.KEYCODE_9
        ) {
            textKeys++
            return
        }
        val name = runCatching { KeyEvent.keyCodeToString(event.keyCode) }.getOrNull() ?: "key${event.keyCode}"
        add("key=$name down=${event.action == KeyEvent.ACTION_DOWN}", nowMillis)
    }

    private fun add(text: String, nowMillis: Long) {
        val bound = boundAtMillis
        if (bound != null && nowMillis < bound) return
        val last = entries.lastOrNull()
        if (last != null && last.text == text && nowMillis - last.lastMillis < REPEAT_WINDOW_MILLIS) {
            last.times++
            last.lastMillis = nowMillis
            return
        }
        while (entries.size >= ENTRIES) entries.removeFirst()
        entries.addLast(Entry(nowMillis, text))
        kept++
    }

    /** The report's section: how many keys arrived, and the last ones in order. */
    @Synchronized
    fun report(nowMillis: Long = System.currentTimeMillis()): String {
        if (presses == 0) return "Wheel and hardware keys: none since the app started"
        val stamp = SimpleDateFormat("HH:mm:ss.SSS", Locale.US)
        val lines = mutableListOf("Wheel and hardware keys: presses=$presses listed=$kept textKeys=$textKeys")
        entries.forEach { entry ->
            val at = stamp.format(Date(entry.atMillis))
            val times = if (entry.times > 1) " x${entry.times}" else ""
            lines += "  $at ${entry.text}$times"
        }
        return lines.joinToString("\n")
    }

    private const val REPEAT_WINDOW_MILLIS = 600L
}
