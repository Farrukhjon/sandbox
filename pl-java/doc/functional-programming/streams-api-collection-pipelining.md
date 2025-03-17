# Streams API and Collection Pipelining

<!-- TOC -->
* [Streams API and Collection Pipelining](#streams-api-and-collection-pipelining)
  * [Literature and Resources](#literature-and-resources)
  * [What Streams are](#what-streams-are)
  * [Stream pipeline](#stream-pipeline)
  * [Stream operations types](#stream-operations-types)
  * [Stream API semantic flow](#stream-api-semantic-flow)
  * [Sourcing operations](#sourcing-operations)
    * [Spliterator interface](#spliterator-interface)
    * [Operations of stream sources](#operations-of-stream-sources)
    * [Spliterators class (static methods for operating on or creating Spliterator)](#spliterators-class-static-methods-for-operating-on-or-creating-spliterator)
  * [Intermediate operations](#intermediate-operations)
    * [Filtering](#filtering)
    * [Mapping](#mapping)
    * [Sizing](#sizing)
    * [Sorting](#sorting)
    * [Debugging](#debugging)
  * [Terminal operations](#terminal-operations)
    * [Aggregate/Collect to resulting collection](#aggregatecollect-to-resulting-collection)
    * [Reduce to a single value](#reduce-to-a-single-value)
    * [Calculations](#calculations)
    * [Matching](#matching)
    * [Finding](#finding)
    * [Consuming](#consuming)
  * [Reduction operations](#reduction-operations)
  * [Static factory methods in the Collectors class](#static-factory-methods-in-the-collectors-class)
    * [The Collectors class methods vs the Stream interfaces](#the-collectors-class-methods-vs-the-stream-interfaces)
  * [Parallel streams](#parallel-streams)
  * [Constraints to use parallel streams](#constraints-to-use-parallel-streams)
<!-- TOC -->

## Literature and Resources

- [Mastering Lambdas, by M. Naftalin](https://www.safaribooksonline.com/library/view/mastering-lambdas/9780071829625/)
- [Modern Java Recipes, by K. Kousen](https://www.safaribooksonline.com/library/view/modern-java-recipes/9781491973165/)
- [Java 8 Idioms](https://developer.ibm.com/author/venkats/)
- [When to use parallel streams, by D. Lea, B. Goetz](http://gee.cs.oswego.edu/dl/html/StreamParallelGuidance.html)
- [Functional Programming with Java Streams](https://medium.com/better-programming/functional-programming-with-java-streams-f930e0e4d184)
- [An introduction to the java.util.stream library](https://developer.ibm.com/articles/j-java-streams-1-brian-goetz/)
- [Aggregating with Streams](https://developer.ibm.com/articles/j-java-streams-2-brian-goetz/)
- [Streams under the hood by B. Goez](https://developer.ibm.com/articles/j-java-streams-3-brian-goetz/)
- [From concurrent to parallel](https://developer.ibm.com/articles/j-java-streams-4-brian-goetz/)
- [Optimize stream pipelines for parallel processing](https://developer.ibm.com/articles/j-java-streams-5-brian-goetz/)

- External (for-loop) vs Internal(Streams.ForEach()) iterations of Collections
- What Streams are?
- Stream Sources - starting stream pipelines
    - Spliterators
- Aggregating and Summarizing data - ending stream pipelines
    - Reductors (folding, reduce operations)
    - Collectors (collect operations)

## What Streams are

    are functional-style queries over
      - collections
      - arrays
      - other data set and sources
    are used to create pipeline over collections

## Stream pipeline

    is composed of stream sourcing > intermediate operations > terminal operations
    declarative operations over many data sources/collections
    is a library (not a language feature)  but designed and integrated into JDK
    easy to parallelize operations over data sources/collections
    exploit composition of method chain or the pipe-and-filter principle: filter->map->sorting->aggregation
    code is read like problem statement

## Stream operations types

- Source operations
- Intermediate operations (this kind of is lazy operations), can be
    - stateless operations - does not retain knowledge about previous elements
      ```filter(); map(); flatMap()```
    - stateful operations - retains knowledge about previous elements
      ```sort(); limit(); distinct()```
- Terminal operations
    - short-circuiting - data is processed one element at a time (using Spliterator.tryAdvance() method)
      ```allMatch(); findFirst()```
    - non short-circuiting - data is processed in bulk (using Spliterator.forEachRemaining() method)
      ```reduce(); collect(); forEach()```

## Stream API semantic flow

    Source Data -> Stream -> Intermediate operations -> Terminal operations (Aggregate/Collect)

Collection/Reduce > Single value

## Sourcing operations

### Spliterator interface

- ```tryAdvance(Consumer<? super T> action)```
- ```forEachRemaining(Consumer<? super T> action)```
- ```trySplit()```

### Operations of stream sources

- ```java.util.Collection.stream()```
- ```java.util.Arrays.stream(T[] array)```
- ```java.nio.file.Files.list(Path dir)```
- ```java.nio.file.Files.lines(Path path)```

### Spliterators class (static methods for operating on or creating Spliterator)

## Intermediate operations

### Filtering

- ```filter(Predicate<? super T> predicate)```
- ```distinct()```

### Mapping

- ```map(Function<? super T, ? extends R> mapper)```
- ```mapToInt(ToIntFunction<? super T> mapper)```
- ```mapToLong(ToLongFunction<? super T> mapper)```
- ```mapToDouble(ToDoubleFunction<? super T> mapper)```
- ```flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)```
- ```flatMapToInt(Function<? super T, ? extends IntStream> mapper)```
- ```flatMapToLong(Function<? super T, ? extends LongStream> mapper)```
- ```flatMapToDouble(Function<? super T, ? extends DOubleStream> mapper)```

### Sizing

- ```skip(long n)```
- ```limit(long maxSize)```

### Sorting

- ```sorted()```
- ```sorted(Comparator<? super T> comparator)```

### Debugging

- ```peek(Consumer<? super T> action)```

## Terminal operations

### Aggregate/Collect to resulting collection

- ```collect(Collector<? super T, A, R> collector)```
- ```collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)```
- ```toArray()```
- ```toArray(IntFunction<A[]> generator)```

### Reduce to a single value

- ```reduce(T identity, BinaryOperator<T> accumulator)```
- ```reduce(BinaryOperator<T> accumulator)```
- ```reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)```

### Calculations

- ```min(Comparator<? super T> comparator)```
- ```max(Comparator<? super T> comparator)```
- ```count()```

### Matching

- ```allMatch(Predicate<? super T> predicate)```
- ```anyMatch(Predicate<? super T> predicate)```
- ```noneMatch(Predicate<? super T> predicate)```

### Finding

- ```findAny()```
- ```findFirst()```

### Consuming

- ```forEach(Consumer<? super T> action)```
- ```forEachOrdered(Consumer<? super T> action)```

## Reduction operations

- supplier
- accumulator
- combiner
- finisher

## Static factory methods in the Collectors class

The `Collectors` class is implementations of the `Collector` interface that implements various `reduction operations`.
For example, accumulating elements into collections, summarizing elements according to various criteria, etc.

### The Collectors class methods vs the Stream interfaces

| Method names in the `Stream` interfaces | Static factory method names in the `Collectors` class |
|-----------------------------------------|-------------------------------------------------------|
| collect                                 | collectingAndThen                                     |
| count                                   | counting                                              |
| filter                                  | filtering                                             |
| flatMap                                 | flatMapping                                           |
| map                                     | mapping                                               |
| max                                     | maxBy                                                 |
| min                                     | minBy                                                 |
| reduce                                  | reducing                                              |
| toList                                  | toList                                                |
| average                                 | averagingInt, averagingLong, averagingDouble          |
| sum                                     | summingInt, summingLong, summingDouble                |
| summaryStatistics                       | summarizingInt, summarizingLong, summarizingDouble    |

## Parallel streams

## Constraints to use parallel streams

- source of stream should be immutable (or remain unmodifiable during course of stream processing)
- lambda passed should not mutate source of stream (non-inferable lambda)
- lambda passed to the pipeline should be stateless (stateless - not read/write to a state - might change during stream
  processing)