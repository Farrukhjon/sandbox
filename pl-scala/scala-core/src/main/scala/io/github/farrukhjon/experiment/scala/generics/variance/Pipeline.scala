package io.github.farrukhjon.experiment.scala.generics.variance

trait Pipeline[T] {

  def process(t: T): T

}

