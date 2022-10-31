package io.github.farrukhjon.experiment.scala.fp

object PassFunToOtherFun {

  def innerFun(): Unit = {
    println("Calling innerFun")
  }

  // Higher order functions take other functions as parameters or return a function as a result
  def upperFun(f: () => Unit): Unit = { // f: () => Unit is function literal
    while (true) {
      f()
    }
  }

  def main(args: Array[String]): Unit = {
    println("Test")
    upperFun(innerFun)
  }

}
