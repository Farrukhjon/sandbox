package io.github.farrukhjon.experiment.scala.oop

object SingleInstanceObject {

  def main(args: Array[String]): Unit = {
    val singleton1 = SingleInstanceObject
    println("Instance of SingleInstanceObject is: " + singleton1)

    val singleton2 = SingleInstanceObject
    println("Instance of SingleInstanceObject is: " + singleton2)

    println("singleton1.equals(singleton2):" + singleton1.equals(singleton2))
  }

}
