package org.farrukh.experiment.kotlin.idioms

// POJO/DTO/POCO by data class
data class Employee(val firstName: String, val secondName: String, val thirdName: String, val age: Int)

fun main() {

    val employee = Employee("Ali", "Valieevich", "Samiev", 30)

    println(employee) // Prints: Employee(firstName=Ali, secondName=Valieevich, thirdName=Samiev, age=30)
}