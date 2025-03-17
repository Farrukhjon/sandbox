package org.farrukh.experiment.kotlin.classes_and_objects.delegation

class DelegationSolutionOne {
    interface Movable {
        fun move()
    }

    interface Flyable {
        fun fly()
    }

    class DefaultMove(var speed: Int) : Movable {
        override fun move() {
            println("Default moving by speed: $speed")
        }
    }

    class DefaultFly(var speed: Int) : Flyable {
        override fun fly() {
            println("Default flying by speed: $speed")
        }
    }

    class Animal(moveSpeed: Int, flySpeed: Int) :
            Movable by DefaultMove(moveSpeed),
            Flyable by DefaultFly(flySpeed)

}

fun main() {
    val anAnimal = DelegationSolutionOne.Animal(2, 1)
    anAnimal.move()
    anAnimal.fly()
}

