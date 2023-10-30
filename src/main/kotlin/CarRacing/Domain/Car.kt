package CarRacing.Domain

import CarRacing.Service.MovementController

class Car(private val movementController: MovementController, position: Int = 0) {
    private var position: Int = position

    fun move() {
        if (movementController.isMove()) {
            position++
        }
    }
}
