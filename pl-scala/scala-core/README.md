# Scala

## Books

 - Essential Scala by Noel Welsh and Dave Gurnell - Essential Scala is aimed at experienced developers who are encountering Scala for the first time.
 - Functional and Reactive Domain Modeling by Debasish Ghosh
 - Functional Programming for Mortals by Sam Halliday
 - Functional Programming in Scala by Paul Chiusano and Runar Bjarnason
 - Functional Programming, Simplified (Scala edition) by Alvin Alexander
 - Get Programming with Scala by Daniela Sfregola - Tutorial-driven introduction to Scala
 - Practical FP in Scala: A hands-on approach by Gabriel Volpe
 - Programming in Scala by Martin Odersky, Lex Spoon, and Bill Venners
 - Pure functional HTTP APIs in Scala by Jens Grassel
 - Reactive Programming with Scala and Akka - Use the concepts of reactive programming to build distributed systems running on multiple nodes
 - Scala Cookbook by Alvin Alexander
 - Scala for the Impatient by Cay Horstmann - Covers most Scala features with short and easy to understand explanations.
 - Scala With Cats by Noel Welsh and Dave Gurnell - Learn system architecture and design using the techniques of modern functional programming with Cats
 - The Type Astronaut's Guide to Shapeless by Dave Gurnell
 - Zionomicon by John A. De Goes, Adam Fraser - Master the dark art of creating scalable, type-safe, concurrent apps with ZIO

## Scala in Github

- [Awesome Scala](https://github.com/lauris/awesome-scala)

## Types

 - hierarchy
 - explicit and implicit type declarations

## Paradigms

 - OOP
   - class
   - object
     - scala has no static methods or fields 
     - use it when need singleton object instance (like singleton object in Java or C++)
     - as a home for utility functions or constants 
     - when a single immutable instance can be shared efficiently
     - when a single instance is required to coordinate some service (the singleton design pattern)
   - companion object
     - In Java or C++, you often have a class with both instance methods and static methods
     - In Scala, it's achieved this by having a class and a “companion” object of the same name
     - The class and its companion object can access each other’s private features
     - They must be located in the same source file
  - case object
  - case class
    - is good for modeling immutable data
    - no `new` keyword to instantiate object of such class
    - `apply` method takes care of object construction (by default)
    - class parameters are public `val`s (immutable): `case class Message(sender: String, recipient: String, body: String)`
    - using `var`s in case classes is discouraged
    - Instances of case classes are `compared by structure` and not by reference
  - implicit class
  - abstract class
  - anonymous class
  - trait
  - the apply method
  - constructors
    - default arguments
    - auxiliary constructors
 - methods
   - declared/defined inside classes
   - return type: explicit and implicit
   - one-line and multi-line methods
   - invocation
     - java convention: `foo(42, bar)` or `target.foo(42, bar)`
     - named parameters: `foo(x = 42, str = "bar")`
     - arity-0
       - for no args methods
       - is used when no side effect (pure functional methods)
       - example: `queue.size()`-> `queue.size`
     - arity-1
       - one arg (infix notation)
       - is used for methods with no side effect (pure functional methods)
       - example: `names.mkString(",")` or `names mkString ","`; `javaList add item` - a wrong!, due to side effect
     - higher-order functions
       - mat use parens or braces, but either case
       - example: `names.map(_.toUpperCase)`; not recommend: `names map (_.toUpperCase)` or `names.map (_.toUpperCase)`
 - control structure
   - if/else
   - for loop
   - expressions
     - for expression (for comprehension): `for (enumerators) yield e`
       - general form: `for ( seq ) yield expr`
       - `seq` may contain the following three expressions in itself: `for ( generator; definition; filter )`
         - `generators`: `pattern <- expression`
           - expression is normally returns a `list`
           - pattern
             - is marched one-by-one against all elements of the list
             - is just a variable (in most cases)
         - `definitions`: `pattern = expression`
           - binds rge pattern to the value of expression: `pattern = expression`
         - `filters`: `if (expression)`
           - expression is type of boolean
           - drops from the iteration all elements for which expression is false 
       - rules
         - A simple for loop that iterates over a collection is translated to a foreach method call on the collection. 
         - A for loop with a guard (see Recipe 3.3) is translated to a sequence of a withFilter method call on the collection followed by a foreach call. 
         - A for loop with a yield expression is translated to a map method call on the collection. 
         - A for loop with a yield expression and a guard is translated to a withFilter method call on the collection, followed by a map method call.
     - foreach expression
     - match expression
   - try/catch/finally
- fp
 - generics
 - maps
 - tuples
 - partial functions