package org.farrukh.experiment.kotlin.collections

fun main(args: Array<String>) {

    iterateOverArray(args)

}

fun iterateOverArray(args: Array<String>) {
    for (arg in args) {
        println(arg)
    }
}
