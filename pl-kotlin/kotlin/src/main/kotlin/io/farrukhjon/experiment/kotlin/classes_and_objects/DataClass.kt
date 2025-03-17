package org.farrukh.experiment.kotlin.classes_and_objects

data class Employee(val name: String, val age: Int)

fun main() {
    val ali = Employee("Ali", 30)

    println(ali) // Prints Employee(name=Ali, age=30)

    println("Cash code: ${ali.hashCode()}") //Prints in-box implemented hashCode

}

