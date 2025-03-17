package org.farrukh.experiment.kotlin.metaprogramming

import java.lang.reflect.Type

class MetaDemoByJavaReflection(
        var id: Int,
        var name: String,
        var salary: Double
) {
   fun doSomething() {
       print("doing something with org.farrukh.experiment.kotlin.metaprogramming.MetaDemo.doSomething()")
   }


}

fun introspectInstance(obj: Any) {
    val javaClassOfObj = obj.javaClass
    println("Class name: ${javaClassOfObj.name}")
    println("Properties:")
    javaClassOfObj.declaredFields.forEach {
        println("filed name: ${it.name} of type: ${it.type}")
    }
    println("Functions:")
    javaClassOfObj.declaredMethods.forEach {
        println("function name: ${it.name} ")
    }
}

fun printType(type: Type) {
    println("java type name: ${type.typeName}")
}


fun main() {
    val obj = MetaDemoByKotlinReflection(1, "Test", 100.0)
    introspectInstance(obj)
    val javaType = obj::class.java
    printType(javaType)

}