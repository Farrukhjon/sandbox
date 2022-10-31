package io.github.farrukhjon.experiment.scala.oop

class CompanionObject { //class of the Companion object

  private val id = CompanionObject.genId()

  def printNextId(): Unit = {
    println(id)
  }

}

object CompanionObject { // Companion object

  private var id = 0

  private def genId() = {
    id += 1
    id
  }
}

