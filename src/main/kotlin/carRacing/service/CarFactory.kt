package carRacing.service

import carRacing.domain.Car

interface CarFactory {
    fun createCars(carCount: Int): List<Car>

    fun createCars(carInfoList: List<Map<String, Any>>): List<Car>
}