package org.farrukh.experiment.kotlin.functions

fun main() {

    val a = 10
    val b = 20

    val result = add(a, b)

    println(result)

}

fun add(a: Int, b: Int): Int {
    return a + b
}
