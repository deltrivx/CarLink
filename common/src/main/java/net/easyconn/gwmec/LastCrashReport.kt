package net.easyconn.gwmec

import android.content.Context

/**
 * The app's last crash, for the diagnostic report.
 *
 * A crash is the one thing a driver cannot describe from a car, and the report is the only
 * place it can be read without adb. The handler the platform installed is kept and still
 * called - this only writes down what happened before handing it on, so a crash still shows
 * the system's own dialog and still stops the process.
 */
internal object LastCrashReport {
    private const val PREFS = "diplay_last_crash"
    private const val KEY_AT = "at"
    private const val KEY_CLASS = "class"
    private const val KEY_MESSAGE = "message"
    private const val KEY_COUNT = "count"

    @Volatile private var installed = false

    /**
     * Records crashes from now on. Safe to call more than once: the handler installed first
     * is the platform's, and it is the one that must keep running.
     */
    fun install() {
        if (installed) return
        synchronized(this) {
            if (installed) return
            val platform = Thread.getDefaultUncaughtExceptionHandler()
            Thread.setDefaultUncaughtExceptionHandler { thread, error ->
                record(thread.name, error)
                platform?.uncaughtException(thread, error)
            }
            installed = true
        }
    }

    @Synchronized
    private fun record(thread: String, error: Throwable) {
        val context = context ?: return
        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val message = (error.message ?: "").take(400).replace(Regex("[\\r\\n]+"), " ")
        prefs.edit()
            .putLong(KEY_AT, System.currentTimeMillis())
            .putString(KEY_CLASS, "$thread/${error.javaClass.name}")
            .putString(KEY_MESSAGE, message)
            .putInt(KEY_COUNT, prefs.getInt(KEY_COUNT, 0) + 1)
            .apply()
    }

    private var context: Context? = null

    fun bind(context: Context) {
        this.context = context.applicationContext
    }

    /** One line for the report, or a line saying there has been no crash. */
    fun report(context: Context): String {
        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val at = prefs.getLong(KEY_AT, 0L)
        if (at == 0L) return "Last crash: none since the app was installed"
        val className = prefs.getString(KEY_CLASS, "unknown").orEmpty()
        val message = prefs.getString(KEY_MESSAGE, "").orEmpty()
        val count = prefs.getInt(KEY_COUNT, 0)
        val stamp = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.US)
            .format(java.util.Date(at))
        val safe = DiagnosticRedactor.redact("$className $message") ?: className
        return "Last crash: at=$stamp count=$count $safe"
    }
}
