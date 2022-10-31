
// define a function `addOne` which adds 1 into given argument `m`
def addOne(m: Int): Int = m + 1

val two = addOne(1) // output: 2
val three = addOne(2) // output: 3
val four = addOne(3) // output: 4
// ---

// Leave off parentheses on functions with `no arguments`
def parnesOptional(): Unit =  println("Hello!")

parnesOptional()
//noinspection EmptyParenMethodAccessedAsParameterless
parnesOptional // leave off parens
// ---

// Anonymous function definition
(x: Int) => x + 1 // val res2: Int => Int = <function>

//noinspection ZeppelinScalaResUsageFilter
val rf = res2(1) // 2

val multiTwo = (x: Int) => x * 2 //save anonymous functions into val
multiTwo(2) // 4
// ---

