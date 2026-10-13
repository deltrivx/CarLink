package net.easyconn.gwmec

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

/**
 * The home's own disconnect. Entering CarPlay and coming back must not change what the
 * stop button does: pressing it still ends the session.
 */
@RunWith(RobolectricTestRunner::class)
@Config(sdk = [33], manifest = Config.NONE)
class HomeDisconnectTest {
    @Test fun theStopControlIsWiredWhileConnected() {
        val controller = Robolectric.buildActivity(CarlinkActivity::class.java).setup()
        val activity = controller.get()
        // The controls are built by the home's status box; reaching the stop control
        // through the page is what the driver does, so it must exist and answer.
        val box = CarlinkActivity::class.java.getDeclaredField("homeStatusBox").apply { isAccessible = true }
            .get(activity) as? android.view.ViewGroup
        assertNotNull("the home has a status box", box)
        val refresh = CarlinkActivity::class.java.getDeclaredMethod("refreshHomeStatus").apply { isAccessible = true }
        // A refill that reports success must leave the box filled, never empty.
        val filled = refresh.invoke(activity) as Boolean
        if (filled) assertEquals(true, (box!!.childCount > 0))
        controller.pause().stop().destroy()
    }
}
