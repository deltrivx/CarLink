package net.easyconn.gwmec

import net.easyconn.gwmec.hud.BydCarPlayCall
import net.easyconn.gwmec.hud.BydOutputSettings
import net.easyconn.gwmec.hud.CarPlayCallState
import net.easyconn.gwmec.iap2.message.Iap2Messages
import net.easyconn.gwmec.orchestration.CarPlayController
import org.junit.After
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.*
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [29], manifest = Config.NONE)
class CarPlayCallControlsOptInTest {
    private val app get() = RuntimeEnvironment.getApplication()

    @After fun cleanup() {
        BydOutputSettings.setCarPlayCallControls(app, false)
        BydCarPlayCall.end()
    }

    @Test fun newCallKeysCannotConsumeOrSendAnythingWithoutOptIn() {
        val controller = mock(CarPlayController::class.java)
        for (code in listOf(313, 314, 309)) {
            assertFalse(CarPlayCallKeys.onKey(app, code, true, controller))
            assertFalse(CarPlayCallKeys.onKey(app, code, false, controller))
        }
        verifyNoInteractions(controller)
    }

    @Test fun explicitOptInEnablesAnswerAndDisableRestoresPassThrough() {
        val controller = mock(CarPlayController::class.java)
        `when`(controller.activeAirPlaySessionToken()).thenReturn(Any())
        BydCarPlayCall.onFrame(Iap2Messages.buildRaw(CarPlayCallState.CALL_STATE_UPDATE) {
            u8(2, 2); string(4, "incoming-call")
        })
        BydOutputSettings.setCarPlayCallControls(app, true)
        assertTrue(CarPlayCallKeys.onKey(app, 313, true, controller))
        assertTrue(CarPlayCallKeys.onKey(app, 313, false, controller))
        verify(controller).answerCall()
        BydOutputSettings.setCarPlayCallControls(app, false)
        assertFalse(CarPlayCallKeys.onKey(app, 314, false, controller))
        verify(controller, never()).endCall()
    }
}
