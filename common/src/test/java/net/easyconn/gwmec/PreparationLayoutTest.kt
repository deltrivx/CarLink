package net.easyconn.gwmec

import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

/**
 * The preparation panel is no longer what the driver waits on: the home owns that state, and
 * this screen stays out of the way until CarPlay is up. What still has to hold is the panel's
 * own layout, because it is measured even while hidden, and the handover of the picture.
 */
@RunWith(RobolectricTestRunner::class)
@Config(sdk = [33], manifest = Config.NONE)
class PreparationLayoutTest {
    @Test fun panelLayoutStillFitsShortAndRegularViewports() {
        // Attach without onCreate: avoid starting sensors, networking or CarPlay sessions.
        val activity = Robolectric.buildActivity(CarPlayHostActivity::class.java).get()
        val method = CarPlayHostActivity::class.java.getDeclaredMethod("buildContentView")
        method.isAccessible = true
        val root = method.invoke(activity) as FrameLayout
        // The viewport is named; a video-only overlay can be inserted before it.
        val viewport = CarPlayHostActivity::class.java.getDeclaredField("connectionPanel")
            .apply { isAccessible = true }.get(activity) as FrameLayout
        val panel = viewport.getChildAt(0) as LinearLayout
        val density = activity.resources.displayMetrics.density
        fun layout(heightDp: Int) {
            val width = (640 * density).toInt()
            val height = (heightDp * density).toInt()
            repeat(3) {
                // This detached view has no ViewRoot to schedule the next traversal.
                fun invalidateMeasurement(view: View) {
                    view.forceLayout()
                    if (view is android.view.ViewGroup) {
                        for (index in 0 until view.childCount) invalidateMeasurement(view.getChildAt(index))
                    }
                }
                invalidateMeasurement(root)
                root.measure(
                    View.MeasureSpec.makeMeasureSpec(width, View.MeasureSpec.EXACTLY),
                    View.MeasureSpec.makeMeasureSpec(height, View.MeasureSpec.EXACTLY),
                )
                root.layout(0, 0, width, height)
            }
            val last = panel.getChildAt(panel.childCount - 1)
            assertTrue(
                "height=$heightDp bottom=${last.bottom} padding=${panel.paddingBottom} panel=${panel.height}",
                last.bottom + panel.paddingBottom <= panel.height,
            )
            val top = panel.top + panel.height * (1f - panel.scaleY) / 2f
            assertTrue("top=$top height=$heightDp", top >= -1f)
            assertTrue("bottom height=$heightDp", top + panel.height * panel.scaleY <= viewport.height + 1f)
        }
        for (height in listOf(200, 240, 320, 400, 479, 480, 720)) layout(height)
    }

    @Test fun thePreparationPanelIsNeverShownWhateverStartsTheHost() {
        val activity = Robolectric.buildActivity(CarPlayHostActivity::class.java).get()
        val build = CarPlayHostActivity::class.java.getDeclaredMethod("buildContentView")
        build.isAccessible = true
        build.invoke(activity)
        val overlays = CarPlayHostActivity::class.java.getDeclaredMethod("updateDebugOverlays")
        overlays.isAccessible = true
        // A USB attachment starts this screen without the home's flag; the wait is still
        // the home's, so the panel stays hidden either way.
        val background = CarPlayHostActivity::class.java.getDeclaredField("connectingInBackground")
        background.isAccessible = true
        background.set(activity, false)
        overlays.invoke(activity)
        val panelField = CarPlayHostActivity::class.java.getDeclaredField("connectionPanel")
        panelField.isAccessible = true
        assertEquals(View.GONE, (panelField.get(activity) as View?)?.visibility)
    }

    @Test fun theHomeOwnsTheWaitWhenItConnectsInBackground() {
        val activity = Robolectric.buildActivity(CarPlayHostActivity::class.java).get()
        // Build the content so the preparation panel exists, then check the rule
        // itself: a host started by the home's background connect shows no panel,
        // because the wait — with its stop — lives on the home.
        val build = CarPlayHostActivity::class.java.getDeclaredMethod("buildContentView")
        build.isAccessible = true
        build.invoke(activity)
        val field = CarPlayHostActivity::class.java.getDeclaredField("connectingInBackground")
        field.isAccessible = true
        field.set(activity, true)
        val overlays = CarPlayHostActivity::class.java.getDeclaredMethod("updateDebugOverlays")
        overlays.isAccessible = true
        overlays.invoke(activity)
        val panelField = CarPlayHostActivity::class.java.getDeclaredField("connectionPanel")
        panelField.isAccessible = true
        val panel = panelField.get(activity) as View?
        assertEquals(View.GONE, panel?.visibility)
    }
}
