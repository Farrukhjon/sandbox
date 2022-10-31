package io.github.farrukhjon.experiment.scala.generics.variance

trait Consumer[-T] {

  def take(t: T): Unit

}
