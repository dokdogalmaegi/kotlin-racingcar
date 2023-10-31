package carRacing.Domain

import carRacing.ServiceImpl.SimpleCarController

class Racing {
    fun process(carCount: Int): List<Car> {
        val carList: List<Car> = SimpleCarController().createCars(carCount)

        for (car in carList) {
            car.move()
        }

        return carList
    }
}
