package org.farrukh.experiment.kotlin.types

/**
 * Arrays in Kotlin are Objects and represented By the Array class "kotlin.Array"
  */


fun main() {

    var a = initializeArrayByFunction()
    println(a)
    var b = initializeByConstructor()
    println(b)

}

fun initializeByConstructor(): Array<Int> {

    val letters = Array(7, {i -> i})
    return letters

}

fun initializeArrayByFunction(): Array<String> {
    val months = arrayOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
    return months
}
