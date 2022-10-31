package io.github.farrukhjon.experiment.scala.generics.variance

trait Producer[+T] {

  def make: T

}
