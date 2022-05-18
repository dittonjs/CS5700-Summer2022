package tollbooth

import kotlin.math.max

class Lane(private var maxCars: Int = 5) {


    private val cars = mutableListOf<Car>()

    fun enqueueCar(car: Car) {
        if (cars.size + 1 > maxCars) {
            throw RuntimeException("Your lane is full")
        }
        cars.add(car)
    }
//
    fun chargeAndDequeue(): Car? {
        // charge them
        return cars.removeAt(0)
    }

}