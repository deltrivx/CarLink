package net.easyconn.gwmec

import android.app.Activity
import android.content.Intent
import android.util.Log

/**
 * Opens one of 车机互联's own screens from [Activity.startActivity] without letting a refusal close 车机互联.
 *
 * Inside BYD's DiYou launcher card (DiLink 5, #463) Android refused such a start with IllegalArgumentException
 * "There is no running activity in rootTask" for the CarPlay screen's own task (taskAffinity `.carplay`, since
 * 0.2.12), and the uncaught exception closed 车机互联 every time it opened in the card. The start is retried once
 * from the application context in a task of its own; a second refusal is logged and 车机互联 stays open.
 */
internal object OwnScreenStart {
    private const val TAG = "CarLink"

    fun start(activity: Activity, intent: Intent, log: (String) -> Unit = { Log.w(TAG, it) }): Boolean {
        val screen = intent.component?.className?.substringAfterLast('.') ?: "screen"
        try {
            activity.startActivity(intent)
            return true
        } catch (refused: IllegalArgumentException) {
            log("Opening $screen refused: ${refused.message?.lineSequence()?.firstOrNull()?.take(MAX_MESSAGE)}; " +
                "retrying in a new task")
        }
        return try {
            activity.applicationContext.startActivity(Intent(intent).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
            true
        } catch (again: RuntimeException) {
            log("Opening $screen in a new task failed: ${again.javaClass.simpleName}")
            false
        }
    }

    private const val MAX_MESSAGE = 120
}
