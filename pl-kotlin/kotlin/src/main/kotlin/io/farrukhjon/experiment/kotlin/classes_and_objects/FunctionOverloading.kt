package org.farrukh.experiment.kotlin.classes_and_objects

class SomeClass {

    fun doSomething(
            name: String,
            age: Int = 30,
            salary: Double = 100.123) {

        println("$name, $age, $salary")
    }

}

fun main() {

    val someObject = SomeClass()

    someObject.doSomething("Ali")
    someObject.doSomething("Ali", 30)
    someObject.doSomething("Ali", 30, 100.123)

    println("Calling with parameters names:")

    someObject.doSomething(name = "Ali")
    someObject.doSomething(name = "Ali", age = 30)
    someObject.doSomething(name ="Ali", age = 30, salary = 100.123)


}