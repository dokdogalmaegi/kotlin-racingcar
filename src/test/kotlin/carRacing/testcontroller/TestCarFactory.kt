package carRacing.testcontroller

import carRacing.domain.Car
import carRacing.service.CarFactory
import carRacing.service.MovementController

class TestCarFactory : CarFactory {
    override fun createCars(carCount: Int): List<Car> {
        TODO("Not yet implemented")
    }

    override fun createCars(carInfoList: List<Map<String, Any>>): List<Car> {
        val carList = mutableListOf<Car>()
        for (carInfo in carInfoList) {
            carList.add(Car(carInfo["movementController"] as MovementController))
        }

        return carList
    }

    fun createCar(name: String, movementController: MovementController) = Car(movementController)
}