package org.farrukh.experiment.kotlin.metaprogramming

import kotlin.reflect.full.functions
import kotlin.reflect.full.memberProperties

class MetaDemoByKotlinReflection(
        var id: Int,
        var name: String,
        var salary: Double
) {
   fun doSomething() {
       print("doing something with org.farrukh.experiment.kotlin.metaprogramming.MetaDemo.doSomething()")
   }

}

fun main() {
    val obj = MetaDemoByKotlinReflection(1, "Test", 100.0)
    val kotlinClass = MetaDemoByKotlinReflection::class
    println("Class name: $kotlinClass")
    println("Properties:")
    kotlinClass.memberProperties.forEach {
        println("property name: ${it.name} of type: ${it.returnType}")
    }

    kotlinClass.constructors.forEach {
        println("constructor name: ${it.name} and parameters: ${it.parameters}")
    }

    println("Functions:")
    kotlinClass.functions.forEach {
        println("function name: ${it.name} ")
    }
    val kotlinType = obj::class
    println("kotlin type name: $kotlinType")

    var constructor = ::MetaDemoByKotlinReflection
    println(constructor)
    val instance = constructor.call(1, "Hello", 1000.0)
    print(instance.name)

}