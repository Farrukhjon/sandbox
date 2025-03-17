package org.farrukh.experiment.kotlin.classes_and_objects.delegation

class DelegationSolutionTwo {

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

    class Animal(movable: Movable, flyable: Flyable) :
            Movable by movable,
            Flyable by flyable


}

fun main() {
    val movable = DelegationSolutionTwo.DefaultMove(2)
    val flyable = DelegationSolutionTwo.DefaultFly(1)
    val anAnimal = DelegationSolutionTwo.Animal(movable, flyable)
    anAnimal.move()
    anAnimal.fly()
}