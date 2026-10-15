package net.easyconn.gwmec.orchestration

import net.easyconn.gwmec.airplay.VideoInCar
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class VideoInCarGateTest {
    @After
    fun reset() {
        VideoInCar.allowed = false
    }

    @Test
    fun videoFollowsTheGearButAnUnreadableGearIsNotAProhibition() {
        val changes = mutableListOf<Boolean>()
        val gate = VideoInCarGate({ null }, onChanged = { changes += it })

        gate.update(true) // parked
        gate.update(false) // moving: the one thing that stops video
        gate.update(true) // parked again
        gate.update(true) // unchanged
        gate.update(null) // gear went unreadable while parked: keeps playing
        gate.update(false) // moving again: stops

        assertEquals(listOf(true, false, true, false), changes)
        assertFalse(VideoInCar.allowed)
    }

    @Test
    fun aCarWithNoGearFeedAtAllStillPlaysVideo() {
        val changes = mutableListOf<Boolean>()
        val gate = VideoInCarGate({ null }, onChanged = { changes += it })

        gate.update(null) // no ADB: nothing says the car is moving

        assertEquals(listOf(true), changes)
        assertTrue(VideoInCar.allowed)
    }

    @Test
    fun closingTheGateTurnsVideoOff() {
        val gate = VideoInCarGate({ true }, onChanged = {})
        gate.update(true)
        gate.close()
        gate.update(true)

        assertFalse(VideoInCar.allowed)
    }

    @Test
    fun observationsDistinguishUnknownParkAndNotPark() {
        val observations = mutableListOf<Boolean?>()
        val gate = VideoInCarGate({ null }, {}, observations::add)

        gate.update(null)
        gate.update(null)
        gate.update(false)
        gate.update(true)

        assertEquals(listOf(null, false, true), observations)
    }
}
