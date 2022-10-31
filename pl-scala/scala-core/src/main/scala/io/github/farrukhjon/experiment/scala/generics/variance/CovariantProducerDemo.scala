package io.github.farrukhjon.experiment.scala.generics.variance

object CovariantProducerDemo {


  //noinspection NotImplementedCode
  def main(args: Array[String]): Unit = {

    val buyableProducer: Producer[Buyable] = ??? // a producer for Buyable
    val buyableNumbers: Int = makeTwo(buyableProducer) // valid to pass a producer for Buyable, as makeTwo expects Buyable

    val bookProducer: Producer[Book] = ??? // a producer for Books
    val bookNumbers: Int = makeTwo(bookProducer) // valid to pass a producer for Books,
    // as makeTwo expects Buyable and as Books is subtype of Buyable

  }

  def makeTwo(producer: Producer[Buyable]): Int = {
    producer.make.price + producer.make.price // producer.make can returns Buyable and all its subtypes
  }

}
