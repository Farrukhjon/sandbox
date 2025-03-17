Ken Kousen

[<u>ken.kousen@kousenit.com</u>](mailto:ken.kousen@kousenit.com)

[<u>http://www.kousenit.com</u>](http://www.kousenit.com)

[<u>http://kousenit.org</u>](http://kousenit.org) (blog)

[<u>@kenkousen</u>](http://twitter.com/kenkousen)

This document: [<u>http://bit.ly/2los3Lp</u>](http://bit.ly/2los3Lp)

Course materials:
[<u>http://www.kousenit.com/java8</u>](http://www.kousenit.com/java8)

Source code (labs):
[<u>https://github.com/kousen/java_upgrade</u>](https://github.com/kousen/java_upgrade)

Source code (examples):
[<u>https://github.com/kousen/java_8_recipes</u>](https://github.com/kousen/java_8_recipes)

Source code (Java 9):
[<u>https://github.com/kousen/java_9_recipes</u>](https://github.com/kousen/java_9_recipes)

Baseball example:
[<u>https://github.com/kousen/cfboxscores</u>](https://github.com/kousen/cfboxscores)

(uses parallel streams and CompletableFuture)

Also has pdf of slides in the root of the repo

You only need Java 8 for this class, though some examples will use 11

I expect that you'll have Java 8 or 11 SDK installed.

The github repositories have a gradle build file included,

use the "gradle wrapper" (gradlew)

Java Is Still Free

[<u>https://itnext.io/java-is-still-free-c02aef8c9e04</u>](https://itnext.io/java-is-still-free-c02aef8c9e04)

For IntelliJ:

- clone repo or download zip and extract

- Use File → Open or if no project is open, Import

- Navigate to the ***build.gradle*** file inside the project

- Click enter and accept all the defaults

For Eclipse (and Eclipse-based tools, like STS):

- Open a command prompt in the root of the unzipped project

- Type "gradlew cleanEclipse eclipse" (Note: if you're on a Unix-based
  system, including Macs, you need to use "./gradlew …")

  - Will install Gradle inside your home directory, under
    ~/.gradle/wrapper/dists folder

- Wait for the dependencies to be downloaded

  - Those will be stored in a cache under ~/.gradle

- Go to Eclipse, Choose File →

  - Import… →

  - General →

  - Existing Projects into Workspace

- Navigate to the root of the project and select it

[<u>https://docs.oracle.com/en/java/javase/11/</u>](https://docs.oracle.com/en/java/javase/11/)

Java 9:

Java Package Module System (JPMS) → Jigsaw

Relatively straightforward if you own all the code

There are many other additions, but they are generally small variations
on existing behavior

The wrapper class constructors for Integer, Long, and Double are all
deprecated in favor of the static valueOf(...) methods (which access
cached values)

Java 10:

Local Variable Type Inference (LVTI) → "var" reserved type name

[<u>http://openjdk.java.net/projects/amber/LVTIstyle.html</u>](http://openjdk.java.net/projects/amber/LVTIstyle.html)

- No fields

- No method parameters

- No method return types

- Yes local variables

- Yes for loops

- Yes in try-with-resources blocks

Method reference syntax:

- object::instanceMethod → context is the argument to the method

  - System.out::println → println(arg)

- Class::staticMethod

  - Math::max → static method max in the Math class

- Class::instanceMethod → context is the target of the method

  - File::isDirectory → invoke isDirectory on the current File,

> f.isDirectory()

Streams

- intermediate operation → method on Stream that returns a new Stream
  (map, filter, …)

- terminal operation → method on Stream that returns something other
  than a Stream (sum, average, reduce, collect, …)

1 .. 25 \| 26 .. 50 \| 51 .. 75 \| 76 .. 100

sort sort sort sort

sort??

Encounter order

If the source of a stream has a defined encounter order,

then the result of collect will also be in the same encounter order

Deferred execution:

Only assemble a method argument if it is going to be needed

log.info(String) → eager; assembles string arg

log.info(Supplier\<String\>) → only calls get() if message will be seen

A "pure" function always produces the same result given the same inputs

→ can not be dependent on variables in scope

Short-circuiting operations on Stream:

limit(num)

findFirst()

findAny()

Java 9 adds:

dropWhile(Predicate) → skip until predicate is false

takeWhile(Predicate) → use values until predicate is false

iterate(seed, Predicate, UnaryOperator) → apply function while pred

flatMap with an Optional\<T\>

map takes a function from T → R, returns Optional\<R\>

flatMap takes a function from T → Optional\<R\> and returns it

flatMap with a Stream\<T\>

map takes a function from T → R, returns Stream\<R\>

flatMap takes a function from T → Stream\<R\> and returns it

All repositories have a Gradle wrapper script:

gradlew for Un\*x, Linux flavor, …

gradlew.bat for Windows

To build to code (compile, run all tests)

\> gradlew build

This will install Gradle in your ~/.gradle/wrapper/dists directory

EE4J → Eclipse Enterprise for Java

A "pure" function always returns the same value given the same inputs

No dependencies on anything other than the arguments

A function also can have side-effects → printing to the console

The goal in functional programming is to use pure, side-effect-free
functions that work with immutable objects

This helps concurrency and parallelism

Once your Stream processing code is working,

you can change to a parallel stream in one step

**Method references:**

Three forms

object::instanceMethod

> System.out::println

x → System.out.println(x) // x is the arg to println

Class::staticMethod

> Math::random

() → Math.random() // returns a double

> Math::max
>
> (x,y) → Math.max(x,y) // context vars are args

Class::instanceMethod

> String::length

s → s.length() // context is the **target** of the method

String::length is an ToIntFunction

> (transforms a string to an int)

String::compareToIgnoreCase

(x,y) → x.compareToIgnoreCase(y) // BiPredicate

Runnable r = () → System.out.println("Hello");

1.  Compiler checks to see if Runnable is a functional interface

2.  What is the single abstract method?

3.  Is the lambda compatible with that method?

4.  Can image the compiler generates the anonymous inner class that
    implements the interface and uses the lambda as the implementation
    of the single abstract method

The job of collect is to gather all the stream elements into a
collection

We start with a Stream\<T\> and want an R

R collect(Supplier\<R\> supplier,

> BiConsumer\<R,? super T\> accumulator,
>
> BiConsumer\<R,R\> combiner)

Supplier → how to create an R

Accumulator → how to add a single T to the R

Combiner → how to put two R's together

1..25 \| 26..50 \| 51..75 \| 76..100

R1 R2 R3 R4

combiner → combines all the lists into a single output list

*only gets called if we are processing in parallel*

For Streams

Executes through a "pipeline"

one or more intermediate operations

followed by a terminal operation

An intermediate op is a method on Stream that returns a new Stream

filter

map

distinct

limit

A terminal op is a method on Stream that returns anything else

collect

max(Comparator), min(Comparator)

count()

Book 1..10 \| Book 11..20 \| Book 21..30

Map1 Map2 Map3

For reduce(identity, BiFunction, BinaryOperator)

identity → the identity value for the binary operator

BiFunction → add a single element to the output

BinaryOperator → combine multiple output values

The combiner is used to put the maps together into a single output Map

only comes up if you're operating in parallel

Exception handling in streams (in lambda expressions)

- Any lambda (like any method) can throw unchecked exceptions

- For checked exceptions, we have three options:

  - Add a try/catch block to the lambda

  - Extract the lambda to a method, add try/catch, and use a method
    reference in the stream pipeline

  - Add a wrapper method that catches all checked exceptions and
    re-throws them as unchecked

A → B → C → D throws exception

If I want to handle it in A, then B, C, and D all need throws clauses

If the exception is a RuntimeException, then I don't need to add
anything

Template Method design pattern

class Thread() {

final start(...) {

do infrastructure …

run();

do other stuff...

}

void run() {}

}

The Stream interface has methods "parallel" and "sequential"

Each stream starts as sequential by default

The parallel method sets a flag to indicate we want parallel

sequential unsets that flag

Whichever one is active at the terminal method controls processing

Stream:

anyMatch(Predicate) → returns true if any element satisfies lambda

allMatch(Predicate) → returns true only if all elements satisfy lambda

noneMatch(Predicate) → returns true only if no elements satisfy lambda

The collect method is stateful (because it's populating a collection),
but it is also ordered if the original source is ordered

Additional topics:

- Optional x

- file I/O x

- lazy streams x

- deferred execution x

- peek method for debugging x

- boxed streams x

- flatMap x

- closure composition x

- reduce method x

- exception handling x

- partitioning and grouping

- downstream collectors x

- parallel streams x

- java.time package

## Concurrency vs Parallel

We design for concurrency

We implement in parallel → run on multiple processors

For parallelization to be beneficial:

1.  The operation must be stateless and associative

2.  You need either:

    1.  A LOT of elements, or

    2.  Each element requires a LOT of time to process

3.  The data must be easy to partition

Say we have a Person class with firstName, middleName, lastName

And in the PERSON table, first_name and last_name are NOT NULL

but middle_name is nullable

Then we would probably write

Optional\<String\> getMiddleName() → null middle name is valid

String getFirst(), String getLast()

The purpose of Optional is to indicate to the client that a null value
is valid

try-with-resources:

Instead of requiring a finally block in order to close resources, we use
parentheses after the word try before the braces {}

If the element in parens implements AutoCloseable interface (which has a
close() method), then the JVM will automatically call close() after the
try block executes

.peek(e -\> System.out.println("Filtered value: " + e))

is equivalent to:

.map(e -\> {

System.out.println("Filtered inside map: " + e);

return e;

}

)

The peek method takes a Consumer, but the map method takes a Function

An *intermediate* operation is a method on Stream that returns a new
Stream

- map

- filter

- distinct (stateful)

- sorted (stateful)

- flatMap

- limit (short-circuiting, stateful)

A *terminal* operation is a method on Stream that returns something
other than a Stream

- findFirst

- findAny

- collect

- sum, average (on primitive streams)

- count

- reduce

A "pure" function returns the same value for the same arguments every
time

Functions that don't do this have "side-effects"

System.out::println → a Consumer, operates via side-effects

A closure is a function + the execution environment (i.e., the variables
in scope)

The rule in Java is: you can access local variables but cannot change
them

Local variables must be final or effectively final

A parallel stream, by default, distributes the work into a "common"
ForkJoinPool with the size equal to the number of processors

Runtime.getRuntime().availableProcessors() → 7 + main

Conditions for parallel to help:

- operations must be stateless and associative

  - groupings don't matter, as in (a + b) + c == a + (b + c)

- either a lot of data, or a long time to process each element

  - N \* Q \> 10,000; N is number of elements and Q is time to process
    each one, but they rarely put dimensions on Q

  - Remember that going parallel introduces overhead

- the data must be easy to partition

Java Microbenchmark Harness

[<u>http://openjdk.java.net/projects/code-tools/jmh/</u>](http://openjdk.java.net/projects/code-tools/jmh/)

Default methods in interfaces:

- use the keyword default

- provide an implementation

- if you inherit a conflict, implement the method in a class

Benefit: you don't need to create utility classes (like Collections)

Whenever there is a conflict between a method in a class and a default
method in an interface, *class always wins*

Static methods in interfaces:

- use the keyword static

- provide an implementation

- call the method *from the interface name*

- you do **not** need to implement the interface to use the static
  methods

- you can't override a static method (true also for classes)

Abstract classes can have fields (attributes, data, …)

Interfaces can't.

(In Java 9, interfaces can also have *private* methods)

In a Stream, any method that returns a stream is an intermediate
operation

Any method that returns other than a stream is a terminal operation

widgets.stream() // Stream\<Widget\>

.filter(w -\> w.getColor() == RED) // Stream\<Widget\>, but only RED

.mapToInt(Widget::getWeight) // IntStream

.sum()

filter and mapToInt are **intermediate** operations

sum is a **terminal** operation

→ No elements are processed until you have a terminal operation

→ Each element passes through the pipeline one at a time

Day 1 exercises available:

StringExercises.java

FunctionInterfacesTest.java

both under src/test/java/...

In Java 9, interfaces can also have private methods

The method parallel() tells the stream to form a (common) ForkJoinPool
for the processing

The method sequential() processes in order with a single thread

But:

- either of them just turns a parallel flag on or off

- nothing happens until you hit the terminal expression

- then flag is checked and processing begins

Stream.of(.....)

.parallel() // turns on parallel flag

.map(...)

.sequential()

.sorted() // turns it back off

.collect(...) // here, the flag is off, so → sequential

Find time to discuss findFirst() vs findAny() in parallel vs sequential

The original collection has an *encounter order*, so findFirst() always
returns the same value *even in parallel*

Local variables (variables declared inside a method) must be *final* or
*effectively final* if they are used inside a lambda expression.

Brian Goetz → author of "[<u>Java Concurrency in
Practice</u>](http://jcip.net/)"

"Concurrency is an optimization"

long startDate = System.currentTimeMillis();

System.out.println(new Date(startDate));

long count = Stream.generate(() -\> new Random().nextInt(10))

.limit(Integer.MAX_VALUE)

.parallel()

.filter(x -\> x%2 == 0)

.count();

long endDate = System.currentTimeMillis();

System.out.println(new Date(endDate));

System.out.println("generated " + count);

System.out.println(endDate - startDate);

IntStream.rangeClosed(1, Integer.MAX_VALUE)

.filter(x -\> x % 2 == 0)

.count();

Parallel streams by default use the "common" ForkJoinPool whose size is
equal to the number of processors on your machine

Runtime.getRuntime().availableProcessors() -1 // 7 on my machine

- 1 for main → still have 8 total segments

Conditions for parallel to help:

- the operation should be independent and associative

  - grouping doesn't matter, i.e., a op (b op c) === (a op b) op c

- There should either be a lot of data, or an expensive calculation per
  element

  - N \* Q \> 10000 (above some threshold)

- the data should be easy to partition

  - arrays are good, linked lists are bad

A generated or iterated Stream with a limit is not good

Best is if you have a well-defined collection (like a list or an array)

especially if it backed by an array in memory

If you are just working with primitives like int or long, then
sequential operations are very, very fast

Data suggests an IntStream can be as much as 100X faster than a
Stream\<Integer\>

LongStream sequential vs LongStream parallel → for about 10 million
elements or less, sequential is going to be as fast or faster than
parallel

Stream\<Long\> seq vs Stream\<Long\> parallel

neither will be very fast

Stream\<Long\> will probably be roughly 20 - 30 times slower than
LongStream

IntelliJ Stream Debugger:

[<u>https://plugins.jetbrains.com/plugin/9696-java-stream-debugger</u>](https://plugins.jetbrains.com/plugin/9696-java-stream-debugger)

Keynote address by Rich Hickey (creator of the Clojure language)

"Simple Made Easy"

[<u>https://www.infoq.com/presentations/Simple-Made-Easy</u>](https://www.infoq.com/presentations/Simple-Made-Easy)

simple → conceptually trivial

easy → can call it without trouble (like an API call)

may be hiding massive complexity under the hood

Deferred execution:

Whenever you have an argument that is only needed under certain
circumstances, consider added an overloaded method that takes a
java.util.function.Supplier\<\>

Then, in your implementation, check to see if the argument is needed. If
not, return. If so, call get() on the Supplier.

The client just replaces their normal call with one that adds () → in
front of the argument

myMethod(arg)

myMethod(() → arg) // deferred execution using a Supplier

On our streams, the call to "parallel()" is easy, but not necessarily
simple

Keep in mind that sequential processing of primitive streams is very
fast

The purpose of Optional is to identify when a method might return a null
value correctly

Optional in a DAO layer

Product class, PRODUCTS table in DB

name

description

price

All of those attributes naturally map to columns in the table

description may be nullable

1.  Do not use Optional\<..\> on an attribute/field. Optional is
    deliberately made non-serializable

    1.  Optional does NOT implement Serializable

2.  Do not need Optional on properties that are NOT NULL

3.  For nullable values, use Optional on the getter, but not setter

class Product implements Serializable {

private String name;

private String description;

private BigDecimal price;

public String getName() { return name; }

public void setName(String name) { this.name = name; }

public BigDecimal getPrice() { return price; }

public void setPrice(BigDecimal dec) { this.price = dec; }

public Optional\<String\> getDescription() {

> return Optional.ofNullable(description);
>
> }

public void setDescription(String desc) { description = desc; }

…

}

try-with-resources

Any variable opened in parens in try(...) is closed automatically if the
class implements AutoCloseable

Most developers use Log4J or SLF4J or logback, …

The Java API includes Java Commons Logging

java.util.logging.Logger

Any arguments to Java methods are evaluated before the body of the
method is executed

log.info(message) → message is evaluated whether we need it or not

In a supplier, we can control when the get() method is invoked

log.info(() → message) → message is only evaluated if we are logged

Deferred execution → only execute when necessary

done by putting our evaluation inside a Supplier

Optional means we are returning a value that may legitimately be null

Never return a null if the return type is Optional!

Returning an empty Optional is fine

The goal of Optional is NOT to remove all NPE from your code

In other words, don't replace every reference with an Optional

Say you have a domain class called Person

public class Person {

private String first; // Never make an attribute of type Optional

private String middle;

private String last;

// ctors, getters and setters, equals, hashCode, toString…

public void setMiddle(String middle) { this.middle = middle; }

public Optional\<String\> getMiddle() {

return Optional.ofNullable(middle);

}

}

Optional does NOT implement Serializable on purpose

for exact that reason (to discourage its use as a field)

Instead of getMiddle() returning String, you can return
Optional\<String\>

How do you get a value out of an Optional?

There is a get() method

Never call get() unless you're sure the Optional contains a value

Otherwise get() throws an exception

Does that mean instead of checking for null, we have to

call isPresent()?

That would work, but not necessary.

Can call orElse() instead

1.  Any finder-type on a stream that might possibly be empty should
    return an Optional

2.  If you use Optional in a DAO layer (discouraged anyway, but so be
    it), then use it as the return type for getters on nullable columns

3.  Create optionals using ofNullable if there's any chance at all that
    the contained value is null

4.  If the default object is simple, use orElse. If it is complex or
    expensive to create, use orElseGet(Supplier)

For flatMap

comes up when you have 1-Many relationship

or when the function produces a wrapped object, as in Optional

Stream

map → 1 to 1; Function from T to R

returns a Stream\<R\>

flatMap → 1 to Many; Function from T to Stream\<R\>:

returns a Stream\<R\>

Optional

map → Function from T to R

returns Optional\<R\>

flatMap → Function from T to Optional\<R\>

return Optional\<R\>

References:

[<u>Java 8 for the Really
Impatient</u>](http://horstmann.com/java8/index.html), Horstmann

Java 8 and 9 in Action → renamed to "[<u>Modern Java in
Action</u>](https://www.manning.com/books/modern-java-in-action)"
(Manning)

Core Java 8 (assumes you don't know any Java); currently working on Core
Java 9/10

[<u>Modern Java
Recipes</u>](https://www.amazon.com/Modern-Java-Recipes-Solutions-Difficult/dp/149197317X),
O'Reilly, me

See also on Safari:

[<u>https://www.safaribooksonline.com/library/view/modern-java-recipes/9781491973165/titlepage01.html</u>](https://www.safaribooksonline.com/library/view/modern-java-recipes/9781491973165/titlepage01.html)

[<u>Functional Programming in
Java</u>](https://pragprog.com/book/vsjava8/functional-programming-in-java),
Venkat Subramaniam
