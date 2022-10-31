// for-loop: for expression/for comprehension
// general form: for (generators; definitions; filters) yield expression

val fruits = Array("Apple", "Orange", "Banana")

// for-loop with one line
for (fruit <- fruits) println(fruit)


// for-loop with block for multiple line
for (fruit <- fruits) {
  val upperFruit = fruit.toUpperCase
  println(upperFruit)
}

// for-loop with return value - using `yield`
val newArrayFruits = for (fruit <- fruits) yield fruit.toUpperCase


// for-loop with return value - using `yield` with multiple line
val newArrayFruits = for (fruit <- fruits) yield {
  val upperCase = fruit.toUpperCase
  upperCase
}


// for-loop with indices
for (i <- fruits.indices) {
  println(s"index $i: ${fruits(i)}")
}

// for-loop with zipWithIndex
for ((fruit, count) <- fruits.zipWithIndex) {
  println(s"index $count: $fruit")
}

// for-loop with range
//noinspection RangeToIndices,ReplaceToWithUntil
for (i <- 0 to fruits.length - 1) {
  println(s"index $i: ${fruits(i)}")
}

// for-loop with range (0 to until length)
//noinspection RangeToIndices
for (i <- 0 until fruits.length) {
  println(s"index $i: ${fruits(i)}")
}

// for-loop with range and conditional contrasting
for (i <- 0 to 10 if i < fruits.length) {
  println(s"index $i: ${fruits(i)}")
}

// for-loop over Map
val namesMap = Map(
  "Ali" -> "Valiev",
  "Sami" -> "Ganiev"
)
for ((k, v) <- namesMap)
  println(s"key: $k, value: $v")

// for-loop with many generators:
val matrixResult = for (x <- List(1, 2, 3); y <- List("one", "two", "three")) yield (x, y)
