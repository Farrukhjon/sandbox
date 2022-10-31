package io.github.farrukhjon.experiment.scala.fp

object PassFunAndApplyItInOtherFun {

  def main(args: Array[String]): Unit = {

    //call approach 1, outline with type
    val aFunValTyped: Int => String = (arg: Int) => arg.toString
    applyFunToTheParam(aFunValTyped, 1234)

    //call approach 2, outline without type
    val aFunValUnType = (arg: Int) => arg.toString
    applyFunToTheParam(aFunValUnType, 1234)

    //call approach 3, inline with type providing
    applyFunToTheParam((arg: Int) => arg.toString, 1234)

    //call approach 4, inline and type inference
    applyFunToTheParam(arg => arg.toString, 1234)

    // call approach 5, anonymous function:, it's like arg => arg + ""
    applyFunToTheParam(_ + "100", 1234) // outputs: "1234100"
  }

  // Definition of a Function by Passing a Function as a first Arg into this Function and calling apply() method of the passed Function
  def applyFunToTheParam(aFunArgOfOneParam: Int => String, aNumber: Int): Unit = {
    val r = aFunArgOfOneParam.apply(aNumber)
    println(r)
  }

}
