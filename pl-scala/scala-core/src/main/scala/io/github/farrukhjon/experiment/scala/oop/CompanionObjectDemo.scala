package io.github.farrukhjon.experiment.scala.oop

object CompanionObjectDemo {
  def main(args: Array[String]): Unit = {

    for (_ <- 1 to 3) {
      val companionObject = new CompanionObject()
      companionObject.printNextId()
    }

  }
}
