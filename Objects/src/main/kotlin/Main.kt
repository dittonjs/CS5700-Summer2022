import tollbooth.Car
import tollbooth.Lane

fun main(args: Array<String>) {
    val booth = Lane()
    booth.enqueueCar(Car())
    booth.chargeAndDequeue()
    booth.chargeAndDequeue()
}
