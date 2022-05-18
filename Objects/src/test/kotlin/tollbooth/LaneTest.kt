package tollbooth

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows

internal class LaneTest {

    @Test
    fun testEnqueueSingleCar() {
        val lane = Lane()
        val car = Car()
        lane.enqueueCar(car)
        assertEquals(car, lane.chargeAndDequeue())
    }

    @Test
    fun fullQueue() {
        val lane = Lane(2)
        assertThrows<RuntimeException> {
            lane.enqueueCar(Car())
            lane.enqueueCar(Car())
            lane.enqueueCar(Car())
        }

    }
}