<!-- TOC -->
* [Filtering a Collection by a List](#filtering-a-collection-by-a-list)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues-1)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues-2)
* [Convert `List<V>` into `Map<K, List<V>>`](#convert-listv-into-mapk-listv)
* [Reversing an array](#reversing-an-array)
* [Merging two Maps](#merging-two-maps)
* [Replacing entries from a Map](#replacing-entries-from-a-map)
* [Trie](#trie)
* [Increasing array size](#increasing-array-size)
* [Removing from a Map](#removing-from-a-map)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues-3)
* [Minimum, maximum and average of an array](#minimum-maximum-and-average-of-an-array)
  * [](#)
* [Converting a collection into an array](#converting-a-collection-into-an-array)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues-4)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues-5)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues-6)
* [Filling and setting an array](#filling-and-setting-an-array)
* [Replacing elements of a List](#replacing-elements-of-a-list)
* [Bloom Filter](#bloom-filter)
* [Creating a Stream from an array](#creating-a-stream-from-an-array)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues-7)
* [Checking if two arrays are equals or mismatch](#checking-if-two-arrays-are-equals-or-mismatch)
* [Sorting an array](#sorting-an-array)
* [Converting `Iterable` to `List`](#converting-iterable-to-list)
* [Arrays, collections and data structures](#arrays-collections-and-data-structures)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues-8)
* [Fenwick Tree or Binary Indexed Tree](#fenwick-tree-or-binary-indexed-tree)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues-9)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues-10)
* [Removing all elements of a collection that match a predicate](#removing-all-elements-of-a-collection-that-match-a-predicate)
* [Computing if absent/present in a Map](#computing-if-absentpresent-in-a-map)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues-11)
* [Next Greater Element](#next-greater-element)
* [Union Find](#union-find)
* [Tuple](#tuple)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues-12)
* [Copying HashMap](#copying-hashmap)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues-13)
* [Comparing two arrays lexicographically](#comparing-two-arrays-lexicographically)
* [Mapping default value](#mapping-default-value)
* [Sorting a Map](#sorting-a-map)
* [Breadth First Search](#breadth-first-search)
* [Creating unmodifiable/immutable collections](#creating-unmodifiableimmutable-collections)
* [Comparing two Maps](#comparing-two-maps)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues-14)
* [Finding an element in an array](#finding-an-element-in-an-array)
* [Thread-safe collections, stacks and queues](#thread-safe-collections-stacks-and-queues-15)
* [Checking null references and throw customized NullPointerException](#checking-null-references-and-throw-customized-nullpointerexception)
* [Equals and hashCode](#equals-and-hashcode)
* [Multiple case labels](#multiple-case-labels)
* [Writing an immutable class via the Builder pattern](#writing-an-immutable-class-via-the-builder-pattern)
* [Objects, immutability and switch expressions](#objects-immutability-and-switch-expressions)
* [Cloning objects](#cloning-objects)
* [Checking null references and return non-null default references](#checking-null-references-and-return-non-null-default-references)
* [Checking index in the range from 0 to length](#checking-index-in-the-range-from-0-to-length)
* [Writing an immutable class](#writing-an-immutable-class)
* [Overriding toString()](#overriding-tostring)
* [Checking sub-range in the range from 0 to length](#checking-sub-range-in-the-range-from-0-to-length)
* [Bad data in immutable objects](#bad-data-in-immutable-objects)
* [Immutable String](#immutable-string)
* [Statement blocks](#statement-blocks)
* [Switch expressions](#switch-expressions)
* [Converting `Date` to `YearMonth`](#converting-date-to-yearmonth)
* [Get local date-time in all available time zones](#get-local-date-time-in-all-available-time-zones)
* [Convert String to date and time](#convert-string-to-date-and-time)
* [LocalDateTime from LocalDate and LocalTime](#localdatetime-from-localdate-and-localtime)
* [Defining/extracting zone offsets](#definingextracting-zone-offsets)
* [Define a period of time using date-based values (Period) and a duration of time using time-based values (Duration)](#define-a-period-of-time-using-date-based-values-period-and-a-duration-of-time-using-time-based-values-duration)
* [Machine time via Instant class](#machine-time-via-instant-class)
* [Adding and subtracting to/from date-time](#adding-and-subtracting-tofrom-date-time)
* [Start and end of a day](#start-and-end-of-a-day)
* [Convert between Date and Temporal](#convert-between-date-and-temporal)
* [Iterate a range of dates](#iterate-a-range-of-dates)
* [Define a period of time using date-based values (Period) and a duration of time using time-based values (Duration)](#define-a-period-of-time-using-date-based-values-period-and-a-duration-of-time-using-time-based-values-duration-1)
* [Display date-time information about a flight](#display-date-time-information-about-a-flight)
* [Working with date and time](#working-with-date-and-time)
* [Get the current date/time without time/date](#get-the-current-datetime-without-timedate)
* [Get date and time units](#get-date-and-time-units)
* [Find the first/last day of the month](#find-the-firstlast-day-of-the-month)
* [Implementing a chess Clock](#implementing-a-chess-clock)
* [Convert a UNIX timestamp to date-time](#convert-a-unix-timestamp-to-date-time)
* [Format date and time](#format-date-and-time)
* [Calculating age](#calculating-age)
* [Difference between two dates](#difference-between-two-dates)
* [Get all time zones with UTC and GMT](#get-all-time-zones-with-utc-and-gmt)
* [Using LVTI in compound declarations](#using-lvti-in-compound-declarations)
* [Assigning an array to var](#assigning-an-array-to-var)
* [Simple var example](#simple-var-example)
* [Using var with primitive types](#using-var-with-primitive-types)
* [LVTI and null initializers, instance variable and catch blocks variables](#lvti-and-null-initializers-instance-variable-and-catch-blocks-variables)
* [Avoid using var if the called names don't contain enough type information for humans](#avoid-using-var-if-the-called-names-dont-contain-enough-type-information-for-humans)
* [Explicit downcast or better avoid var](#explicit-downcast-or-better-avoid-var)
* [Combining LVTI and the diamond operator](#combining-lvti-and-the-diamond-operator)
* [Using LVTI to break up nested/large chains of expressions](#using-lvti-to-break-up-nestedlarge-chains-of-expressions)
* [LVTI and variables scope](#lvti-and-variables-scope)
* [LVTI and method return and arguments types](#lvti-and-method-return-and-arguments-types)
* [Combining LVTI and programming to the interface technique](#combining-lvti-and-programming-to-the-interface-technique)
* [LVTI can be final and effectively final](#lvti-can-be-final-and-effectively-final)
* [LVTI, wildcards, covariants and contravariants](#lvti-wildcards-covariants-and-contravariants)
* [LVTI and the ternary operator](#lvti-and-the-ternary-operator)
* [Type inference](#type-inference)
* [Using var and implicit type casting to sustain the code maintainability](#using-var-and-implicit-type-casting-to-sustain-the-code-maintainability)
* [LVTI and generic types, T](#lvti-and-generic-types-t)
* [LVTI and anonymous classes](#lvti-and-anonymous-classes)
* [LVTI and for loops](#lvti-and-for-loops)
* [LVTI and lambdas](#lvti-and-lambdas)
* [LVTI and Streams](#lvti-and-streams)
* [Thread pool with a fixed number of threads](#thread-pool-with-a-fixed-number-of-threads)
* [Thread lifecycle states](#thread-lifecycle-states)
* [Phasers](#phasers)
* [Thread pool with a fixed number of threads](#thread-pool-with-a-fixed-number-of-threads-1)
* [Latches](#latches)
* [Thread pools in Java](#thread-pools-in-java)
* [Work-stealing thread pool](#work-stealing-thread-pool)
* [Exchangers](#exchangers)
* [Invoke multiple Callable tasks](#invoke-multiple-callable-tasks)
* [Invoke multiple Callable tasks](#invoke-multiple-callable-tasks-1)
* [Object vs. class level locking](#object-vs-class-level-locking)
* [Cached and scheduled thread pools](#cached-and-scheduled-thread-pools)
* [Concurrency - Thread pools, Callables and Synchronizers](#concurrency---thread-pools-callables-and-synchronizers)
* [Thread pool with a single thread](#thread-pool-with-a-single-thread)
* [Semaphores](#semaphores)
* [Work-stealing thread pool](#work-stealing-thread-pool-1)
* [Barrier](#barrier)
* [Callable and Future](#callable-and-future)
* [Thread pools in Java](#thread-pools-in-java-1)
* [Thread pool with a single thread](#thread-pool-with-a-single-thread-1)
* [Optimizing busy waiting](#optimizing-busy-waiting)
* [ThreadLocal](#threadlocal)
* [ReentrantLock](#reentrantlock)
* [ReentrantReadWriteLock](#reentrantreadwritelock)
* [ReentrantLock](#reentrantlock-1)
* [CompletableFuture](#completablefuture)
* [ThreadLocal](#threadlocal-1)
* [Atomic variables](#atomic-variables)
* [Atomic variables](#atomic-variables-1)
* [StampedLock](#stampedlock)
* [StampedLock](#stampedlock-1)
* [Fork/join framework](#forkjoin-framework)
* [Fork/join framework and compareAndSetForkJoinTaskTag()](#forkjoin-framework-and-compareandsetforkjointasktag)
* [Task Cancellation](#task-cancellation)
* [Concurrency - Deep dive](#concurrency---deep-dive)
* [ReentrantLock](#reentrantlock-2)
* [Combining multiple CompletableFutures](#combining-multiple-completablefutures)
* [Interruptible methods](#interruptible-methods)
* [Deadlock (Dining Philosophers)](#deadlock-dining-philosophers)
* [Fork/join framework](#forkjoin-framework-1)
* [Atomic variables](#atomic-variables-2)
* [Fork/join framework](#forkjoin-framework-2)
* [ReentrantLock](#reentrantlock-3)
* [Implement Decorator pattern](#implement-decorator-pattern)
* [Implement Execute Around pattern](#implement-execute-around-pattern)
* [Implement Cascaded Builder pattern](#implement-cascaded-builder-pattern)
* [Implement Template Method pattern](#implement-template-method-pattern)
* [Writing functional interfaces](#writing-functional-interfaces)
* [Implement Factory pattern](#implement-factory-pattern)
* [Implement Loan pattern](#implement-loan-pattern)
* [Implement Observer pattern](#implement-observer-pattern)
* [Functional style programming - Fundamentals and design patterns](#functional-style-programming---fundamentals-and-design-patterns)
* [Implement Decorator pattern](#implement-decorator-pattern-1)
* [Implement Strategy pattern](#implement-strategy-pattern)
* [Implement Command pattern](#implement-command-pattern)
* [Java Coding Problems](#java-coding-problems)
  * [What is this book about?](#what-is-this-book-about)
  * [Instructions and Navigations](#instructions-and-navigations)
    * [Software and Hardware List](#software-and-hardware-list)
    * [Related products](#related-products)
  * [Get to Know the Author](#get-to-know-the-author)
    * [Suggestions and Feedback](#suggestions-and-feedback)
    * [Download a free PDF](#download-a-free-pdf)
* [Working with temporary files/folders](#working-with-temporary-filesfolders)
* [Tokenizing files](#tokenizing-files)
* [Working with temporary files/folders](#working-with-temporary-filesfolders-1)
* [Walking paths](#walking-paths)
* [Watching paths](#watching-paths)
* [Read a JSON/CSV file as Object](#read-a-jsoncsv-file-as-object)
* [Walking paths](#walking-paths-1)
* [Watching paths](#watching-paths-1)
* [Read a JSON/CSV file as Object](#read-a-jsoncsv-file-as-object-1)
* [Working with temporary files/folders](#working-with-temporary-filesfolders-2)
* [Working with temporary files/folders](#working-with-temporary-filesfolders-3)
* [Walking paths](#walking-paths-2)
* [Filtering files](#filtering-files)
* [Reading/writing binary files efficiently](#readingwriting-binary-files-efficiently)
* [Write formatted output directly to file](#write-formatted-output-directly-to-file)
* [Walking paths](#walking-paths-3)
* [Searching in big files](#searching-in-big-files)
* [Get public and private fields](#get-public-and-private-fields)
* [Nest-based access control via reflection](#nest-based-access-control-via-reflection)
* [Get annotation on receiver type](#get-annotation-on-receiver-type)
* [Invoke an instance method](#invoke-an-instance-method)
* [Instantiating via reflected constructor](#instantiating-via-reflected-constructor)
* [Reflection for getters and setters](#reflection-for-getters-and-setters)
* [Reflecting annotations](#reflecting-annotations)
* [Check variable number of arguments](#check-variable-number-of-arguments)
* [Inspecting packages](#inspecting-packages)
* [Get static methods](#get-static-methods)
* [Inspecting modules](#inspecting-modules)
* [Dynamic proxies](#dynamic-proxies)
* [Inspecting modules](#inspecting-modules-1)
* [Java Reflection Classes, interfaces, constructors, methods and fields](#java-reflection-classes-interfaces-constructors-methods-and-fields)
* [Inspecting classes and super-classes](#inspecting-classes-and-super-classes)
* [Working with arrays](#working-with-arrays)
* [Reflection for getters and setters](#reflection-for-getters-and-setters-1)
* [Check default methods](#check-default-methods)
* [Get synthetic and bridge constructs](#get-synthetic-and-bridge-constructs)
* [Nest-based access control via reflection](#nest-based-access-control-via-reflection-1)
* [Get generic types of method, fields and exceptions](#get-generic-types-of-method-fields-and-exceptions)
* [Partitioning](#partitioning)
* [Testing high-order functions](#testing-high-order-functions)
* [Map a stream](#map-a-stream)
* [Parallel processing of streams](#parallel-processing-of-streams)
* [Filtering, flatting and mapping collectors](#filtering-flatting-and-mapping-collectors)
* [Joining the results of a stream](#joining-the-results-of-a-stream)
* [Composing functions, predicates and comparators](#composing-functions-predicates-and-comparators)
* [Find in a stream](#find-in-a-stream)
* [Collect the results of a stream](#collect-the-results-of-a-stream)
* [Debugging lambdas](#debugging-lambdas)
* [Match in a stream](#match-in-a-stream)
* [Infinite streams, takeWhile() and dropWhile()](#infinite-streams-takewhile-and-dropwhile)
* [Functional style programming - Deep dive](#functional-style-programming---deep-dive)
* [Writing a custom collector](#writing-a-custom-collector)
* [Filtering non-zero elements of a stream](#filtering-non-zero-elements-of-a-stream)
* [Teeing](#teeing)
* [Default methods](#default-methods)
* [Summarization collectors](#summarization-collectors)
* [Null-safe streams](#null-safe-streams)
* [Map a stream](#map-a-stream-1)
* [Method reference](#method-reference)
* [Testing methods that uses lambdas](#testing-methods-that-uses-lambdas)
* [Parallel processing of streams](#parallel-processing-of-streams-1)
* [Map a stream](#map-a-stream-2)
* [Sum, max and min in a stream](#sum-max-and-min-in-a-stream)
* [Grouping](#grouping)
* [HTTP/2 server push](#http2-server-push)
* [Trigger a synchronous GET request](#trigger-a-synchronous-get-request)
* [Get, update and save JSON](#get-update-and-save-json)
* [Setting connection authentication](#setting-connection-authentication)
* [Download](#download)
* [Setting a proxy](#setting-a-proxy)
* [Upload with multipart](#upload-with-multipart)
* [Setting request body](#setting-request-body)
* [Specifying the HTTP Method](#specifying-the-http-method)
* [Get response information](#get-response-information)
* [Handling response body types](#handling-response-body-types)
* [The HTTP Client and WebSocket APIs](#the-http-client-and-websocket-apis)
* [HTTP/2 server push](#http2-server-push-1)
* [Setting the redirect policy](#setting-the-redirect-policy)
* [WebSocket](#websocket)
* [Setting/getting headers](#settinggetting-headers)
* [Handling form data](#handling-form-data)
* [Setting a timeout](#setting-a-timeout)
* [Sending sync and async requests](#sending-sync-and-async-requests)
* [Download](#download-1)
* [Compression](#compression)
* [HTTP/2 server push](#http2-server-push-2)
* [Handling cookies](#handling-cookies)
* [Trigger a synchronous GET request](#trigger-a-synchronous-get-request-1)
* [Do not use Optional for fields](#do-not-use-optional-for-fields)
* [Filter values via Optional.filter()](#filter-values-via-optionalfilter)
* [Do not use Optional in constructors args](#do-not-use-optional-in-constructors-args)
* [Chaining lambdas via orElseFoo()](#chaining-lambdas-via-orelsefoo)
* [Optional<T> vs OptionalInt](#optionalt-vs-optionalint)
* [Throwing NoSuchElementException](#throwing-nosuchelementexception)
* [Optional and null references](#optional-and-null-references)
* [Return a boolean if the Optional is empty](#return-a-boolean-if-the-optional-is-empty)
* [Initializing Optional](#initializing-optional)
* [Optional](#optional)
* [Optional and identity-sensitive operations](#optional-and-identity-sensitive-operations)
* [Consuming a present Optional](#consuming-a-present-optional)
* [Chaining the Optional and Stream APIs](#chaining-the-optional-and-stream-apis)
* [Transform values via Map() and flatMap()](#transform-values-via-map-and-flatmap)
* [Do not use Optional in setters args](#do-not-use-optional-in-setters-args)
* [Returning a present Optional or another one](#returning-a-present-optional-or-another-one)
* [Do not use Optional just for getting a value](#do-not-use-optional-just-for-getting-a-value)
* [Optional.get() and missing value](#optionalget-and-missing-value)
* [Confusing of() with ofNullable()](#confusing-of-with-ofnullable)
* [Avoiding Optional in collections](#avoiding-optional-in-collections)
* [Return a non-existent default value](#return-a-non-existent-default-value)
* [Return an already-constructed default value](#return-an-already-constructed-default-value)
* [Do not use Optional in methods args](#do-not-use-optional-in-methods-args)
* [Asserting equality of Optionals](#asserting-equality-of-optionals)
* [Do not use Optional to return empty or null collections or arrays](#do-not-use-optional-to-return-empty-or-null-collections-or-arrays)
<!-- TOC -->

# Filtering a Collection by a List

Write several solutions for filtering a **Collection** by a **List**. Reveal the best way to do it.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Convert `List<V>` into `Map<K, List<V>>`

Write a program that converts `List<V>` into `Map<K, List<V>>`.

# Reversing an array

Write a program that reverses the given array.

# Merging two Maps

Write a program that merges two given **Map**s.

# Replacing entries from a Map

Write a program that replaces the given entries from a **Map**.

# Trie

Write a program that implements a Trie data structure.

# Increasing array size

Write a program that adds an element into an array by increasing its size by 1. In addition, write a program that
increase the size of an array with the given length.

# Removing from a Map

Write a program that removes from a **Map** by the given key.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Minimum, maximum and average of an array

Write a program that computes the maximum, minimum and average of the given array.
**[How To Efficiently Chunk A Java List](https://github.com/AnghelLeonard/Hibernate-SpringBoot/tree/master/ChunkList)**

<b><a href="https://persistencelayer.wixsite.com/springboot-hibernate/post/how-to-efficiently-chunk-a-java-list">If you
prefer to read it as a blog-post containing the relevant snippets of code then check this post</a></b>

**Description:** Is a common scenario to have a big `List` and to need to chunk it in multiple smaller `List` of a given
size. For example, if we want to employ a concurrent batch implementation we need to give each thread a sublist of
items. Chunking a list can be done via Google
Guava, `Lists.partition(List list, int size)` [method](https://guava.dev/releases/22.0/api/docs/com/google/common/collect/Lists.html#partition-java.util.List-int-)
or Apache Commons
Collections, `ListUtils.partition(List list, int size)` [method](https://commons.apache.org/proper/commons-collections/apidocs/org/apache/commons/collections4/ListUtils.html#partition(java.util.List,%20int)).
But, it can be implemented in plain Java as well. This application exposes 6 ways to do it. The trade-off is between the
speed of implementation and speed of execution. For example, while the implementation relying on
io.github.farrukhjon.experiment.java.grouping collectors is not performing very well, it is quite simple and fast to
write it.

**Key points:**

- the fastest execution is provided by `Chunk.java` class which relies on the built-in `List.subList()` method

**Time-performance trend graphic for chunking 500, 1_000_000, 10_000_000 and 20_000_000 items in lists of 5 items:**\
![](https://github.com/AnghelLeonard/Hibernate-SpringBoot/blob/master/ChunkList/head-to-head.png)
     
-----------------------------------------------------------------------------------------------------------------------    
<table>
     <tr><td><b>If you need a deep dive into the performance recipes exposed in this repository then I am sure that you will love my book "Spring Boot Persistence Best Practices"</b></td><td><b>If you need a hand of tips and illustrations of 100+ Java persistence performance issues then "Java Persistence Performance Illustrated Guide" is for you.</b></td></tr>
     <tr><td>
<a href="https://www.apress.com/us/book/9781484256251"><p align="left"><img src="https://github.com/AnghelLeonard/Hibernate-SpringBoot/blob/master/Spring%20Boot%20Persistence%20Best%20Practices.jpg" height="500" width="450"/></p></a>
</td><td>
<a href="https://leanpub.com/java-persistence-performance-illustrated-guide"><p align="right"><img src="https://github.com/AnghelLeonard/Hibernate-SpringBoot/blob/master/Java%20Persistence%20Performance%20Illustrated%20Guide.jpg" height="500" width="450"/></p></a>
</td></tr></table>

-----------------------------------------------------------------------------------------------------------------------    

# Converting a collection into an array

Write a program that converts a collection into an array.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Filling and setting an array

Write several examples for fill up an array and set all elements based on a generator function to compute each element.

# Replacing elements of a List

Write a program that replaces each element of a **List** with the result of applying a given operator to it.

# Bloom Filter

Write a program that implements the Bloom Filter algorithm.

# Creating a Stream from an array

Write a program that creates a **Stream** from the given array.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Checking if two arrays are equals or mismatch

Write a program that checks if the two given arrays are equals or there is a mismatch.

# Sorting an array

Write several programs that exemplifies different sorting algorithms for arrays. Supplementary, write a program for
shuffling arrays.

# Converting `Iterable` to `List`

Write a program that converts an `Iterable` to `List`.

# Arrays, collections and data structures

This chapter includes 30 problems that involve arrays, collections, and several data structures. The aim is to provide
solutions to a category of problems encountered in a wide range of applications such as, sorting, finding, comparing,
ordering, reversing, filling, merging, copying, replacing and so on and forth. The provided solutions are implemented in
Java 8-12 and they can be used as the base for solving other related problems as well.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Fenwick Tree or Binary Indexed Tree

Write a program that implements the Fenwick Tree algorithm.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Removing all elements of a collection that match a predicate

Write a program that removes all element of a collection that match the given predicate.

# Computing if absent/present in a Map

Write a program that computes the value of an absent key or a new value of a present key.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Next Greater Element

Write a program that return the Next Greater Element (NGE) for each element of an array.

# Union Find

Write a program that implements the Union Find algorithm.

# Tuple

Write a program that implements a Tuple data structure.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Copying HashMap

Write a program that performs a shallow and deep copy of a **HashMap**.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Comparing two arrays lexicographically

Write a program that compares the given arrays lexicographically.

# Mapping default value

Write a program that get a value from a **Map** or a default value.

# Sorting a Map

Write a program that sorts a **Map**.

# Breadth First Search

Write a program that implements the Breadth First Search (BFS) algorithm.

# Creating unmodifiable/immutable collections

Write several examples that creates unmodifiable and immutable collections.

# Comparing two Maps

Write a program that compares two **Map**s.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Finding an element in an array

Write several programs that exemplifies how to find the given element (primitive and **Object**) into the given array.
Find the index and/or simply check if the value is in the array.

# Thread-safe collections, stacks and queues

Write several programs that exemplifies the usage of Java thread-safe collections.

# Checking null references and throw customized NullPointerException

Write a program that performs **null** checks on the given references and throw **NullPointerException** with custom
messages.

# Equals and hashCode

Explain and exemplify how **equals()** and **hashCode()** methods works in Java.

# Multiple case labels

Write a snippet of code for exemplifying the JDK 12 **switch** with multiple **case** labels.

# Writing an immutable class via the Builder pattern

Write a program that represents an implementation of the Builder pattern in an immutable class.

# Objects, immutability and switch expressions

This chapter includes 18 problems that involves objects, immutability and switch expressions. The chapter starts with
several problems about dealing with null references. It continues with problems regarding checking indexes, **equals()**
and **hashCode()**, and immutability (e.g., writing immutable classes, passing/returning mutable objects from immutable
classes). The last part of the chapter deals with cloning objects and JDK 12 switch expressions.

# Cloning objects

Write a program that exemplify shallow and deep cloning techniques.# Passing/returning mutable objects to/from immutable
class
Write a program that passes and returns a mutable object to/from an immutable class.# Checking null references in
functional-style and non-functional code
Write a program that performs **null** checks on the given references in a functional-style and non-functional code.

# Checking null references and return non-null default references

Write a program that performs **null** checks on the given reference and if it is non-**null** then return it, otherwise
return a non-**null** default reference.

# Checking index in the range from 0 to length

Write a program that checks if the given index is between 0 (inclusive) and the given length (exclusive). If the given
index is out of the [0, given length) range then throw an **IndexOutOfBoundsException**.

# Writing an immutable class

Write a program that represents an immutable class.# Violate equals() Symmetry Via Inheritance
Write a program that violates **equals()** symmetry via inheritance and fix the problem via composition.

# Overriding toString()

Explain and exemplify practices for overriding **toString()**.

# Checking sub-range in the range from 0 to length

Write a program that checks if the given sub-range [given start, given end) is within the bounds of the range from [0,
given length). If the given sub-range is not in the [0, given length) range then throw an **IndexOutOfBoundsException**.

# Bad data in immutable objects

Write a program that prevents bad data in immutable objects.# Checking null references and throw the specified
exception (e.g. IllegalArgumentException)
Write a program that performs **null** checks on the given references and throw the specified exception.

# Immutable String

Explain why the **String** class is immutable.

# Statement blocks

Write a snippet of code for exemplifying the JDK 12 **switch** with **case** labels that point to a curly-braced block.

# Switch expressions

Provide a brief overview of **switch** expressions in JDK 12.

# Converting `Date` to `YearMonth`

Write a program that converts an `Date` to `YearMonth` and vice-versa.

# Get local date-time in all available time zones

Write a program that displays the local time in all the available time zones.

# Convert String to date and time

Write a program that exemplifies conversions between **String** and date/time.

# LocalDateTime from LocalDate and LocalTime

Write a program that builds a **LocalDateTime** from **LocalDate** and **LocalTime**. Combine date and time in a single
**LocalDateTime** object.

# Defining/extracting zone offsets

Write a program that reveals different techniques for defining and extracting zone offsets.

# Define a period of time using date-based values (Period) and a duration of time using time-based values (Duration)

Explain and exemplify the usage of **Period** and **Duration** APIs.

# Machine time via Instant class

Explain and exemplify the **Instant** API.

# Adding and subtracting to/from date-time

Write a program that adds (and subtracts) an amount of time (e.g., years, days, minutes) to a date-time object (e.g.,
add an hour to a **Date**, subtract 2 days from a **LocalDateTime**, etc).

# Start and end of a day

Write a program that returns the start and end of a day.

# Convert between Date and Temporal

Write a program that converts between **Date** and **Instant**, **LocalDate**, **LocalDateTime**, etc.

# Iterate a range of dates

Write a program that iterates a range of given dates, day by day (with a step of a day).

# Define a period of time using date-based values (Period) and a duration of time using time-based values (Duration)

Explain and exemplify the usage of **Period** and **Duration** APIs.

# Display date-time information about a flight

Write a program that displays information about a scheduled flight time of 15 hours and 30 minutes. More exactly, a
flight from Australia, Perth to Europe, Bucharest.

# Working with date and time

This chapter includes 20 problems that involves date and time. These problems are meant to cover a wide range of
topics (e.g., converting, formatting, adding, subtracting, defining periods/durations, computing, etc) via **Date**, *
*Calendar**, **LocalDate**, **LocalTime**, **LocalDateTime**, **ZoneDateTime**, **OffsetDateTime**, **OffsetTime**, *
*Instant** and so on.

# Get the current date/time without time/date

Write a program that extracts the current date without time and the current time without date.

# Get date and time units

Write a program that extracts from an object representing a date-time the date and time units (e.g., extract from **Date
** the year, month, minute, etc).

# Find the first/last day of the month

Write program that finds the first/last day of the month via JDK 8, **TemporalAdjusters**.

# Implementing a chess Clock

Write a program that implement a chess **Clock**.

# Convert a UNIX timestamp to date-time

Write program that converts a UNIX timestamp to a **java.util.Date** and **java.time.LocalDateTime**.

# Format date and time

Explain the format pattern for date and time.

# Calculating age

Write a program that calculates the age of a person.

# Difference between two dates

Write a program that calculates the difference in days between two dates.

# Get all time zones with UTC and GMT

Write a program that displays all the available time zones with UTC and GMT.

# Using LVTI in compound declarations

Explain and exemplify the usage of LVTI with compound declarations.

# Assigning an array to var

Write a program that assigns an array to **var**.

# Simple var example

Write a program that exemplifies the correct usage of type inference (**var**) with respect to the code readability.

# Using var with primitive types

Write a program that exemplifies the usage of **var** with Java primitive types (**int**, **long**, **float** and *
*double**).

# LVTI and null initializers, instance variable and catch blocks variables

Explain by examples how LVTI can be used in combination with **null** initializers, instance variables and **catch**
blocks.

# Avoid using var if the called names don't contain enough type information for humans

Provide examples where **var** should be avoided because its combination with called names causes loss of information
for humans.

# Explicit downcast or better avoid var

Write a program that exemplifies the combination of **var** and explicit downcast. Explain why **var** should be
avoided.

# Combining LVTI and the diamond operator

Write a program that exemplify the usage of **var** with the *diamond* operator.

# Using LVTI to break up nested/large chains of expressions

Write a program that exemplifies the usage of LVTI for breaking up a nested/large expression.

# LVTI and variables scope

Explain and exemplify why LVTI should minimize the variables scope as much as possible.

# LVTI and method return and arguments types

Write several snippets of code that exemplifies the usage of LVTI and Java methods return and arguments types.

# Combining LVTI and programming to the interface technique

Write a program that exemplify the usage of **var** via *programming to the interface* technique.

# LVTI can be final and effectively final

Write several snippets of code that exemplifies how LVTI can be used for **final** and *effectively final* variables.

# LVTI, wildcards, covariants and contravariants

Write several snippets of code that exemplifies how LVTI can be used in combination with wildcards, covariants and
contravariants.

# LVTI and the ternary operator

Write several snippets of code that exemplifies the advantages of combining LVTI and the ternary operator.

# Type inference

This chapter includes 21 problems that involves JEP 286, Java Local Variable Type Inference (LVTI), or shortly, the *
*var** type.
These problems has been carefully crafted to reveal the best practices and common mistakes involved in using **var**.
At the end of this chapter, you will have under the tool belt everything you need to know about **var** to push it in
production.

# Using var and implicit type casting to sustain the code maintainability

Write a program that exemplifies how **var** and Implicit Type Casting can sustain the code maintainability.

# LVTI and generic types, T

Write several snippets of code that exemplifies how LVTI can be used in combination with generic types.

# LVTI and anonymous classes

Write several snippets of code that exemplifies the usage of LVTI in anonymous classes.

# LVTI and for loops

Write several examples that exemplifies the usage of LVTI in **for** loops.

# LVTI and lambdas

Explain by examples how LVTI can be used in combination with lambda expressions.

# LVTI and Streams

Write several snippets of code that exemplifies the usage of LVTI and Java Streams.

# Thread pool with a fixed number of threads

Write a program that simulates an assembly line for checking and packing up bulbs using multiple workers.

# Thread lifecycle states

Write several programs that capture each lifecycle state of a thread.

# Phasers

Write a program that relies on **Phaser** to simulate the start process of a server in 3 phases. The server is
considered started after its 5 internal services has started. At first phase, we need to concurrently start 3 services.
At second phase, we need to concurrently start two more 2 services (these can be started only if the first 3 are already
running). At phase 3 the server perform a final check in and is considered started.

# Thread pool with a fixed number of threads

Write a program that simulates an assembly line for checking and packing up bulbs using multiple workers.

# Latches

Write a program that relies on **CountDownLatch** to simulate the start process of a server. The server is considered
started after its internal services has started. Services can be started concurrently and are independent of each other.

# Thread pools in Java

Provide a brief overview of thread pools in Java.

# Work-stealing thread pool

Write a program that relies on a work-stealing thread pool. More precisely, write a program that simulates an assembly
line for checking and packing up bulbs as follows: checking takes place
during the day, while packing takes place at night. The checking process result in a queue of 15 millions bulbs every
day.

# Exchangers

Write a program that simulates via **Exchanger** an assembly line for checking and packing up bulbs using two workers. A
worker (the checker) is checking bulbs and add them in a basket. When the basket is full, the worker gives it to the
other worker (the packer) from which he receives an empty basket. The process repeats until the assembly line stops.

# Invoke multiple Callable tasks

Write a program that simulates an assembly line for checking and packing up bulbs as follows: checking takes place
during the day, while packing takes place at night. The checking process result in a queue of 100 bulbs every day. The
packing process should pack and return all the bulbs at once. In other words, we should submit all **Callable** tasks
and wait for all of them to complete.

# Invoke multiple Callable tasks

Write a program that simulates an assembly line for checking and packing up bulbs as follows: checking takes place
during the day, while packing takes place at night. The checking process result in a queue of 100 bulbs every day. The
packing process should pack and return all the bulbs at once. In other words, we should submit all **Callable** tasks
and wait for all of them to complete.

# Object vs. class level locking

Write several examples that exemplifies object vs. class level locking via thread synchronization.

# Cached and scheduled thread pools

Write a program that simulates an assembly line for checking and packing up bulbs using workers as needed (e.g., adapt
the number of packers (increase or decrease) to ingest the incoming flux produced by checker).

# Concurrency - Thread pools, Callables and Synchronizers

Chapters 10 and 11 includes 27 problems that involve Java concurrency. It starts with fundamental problems about threads
lifecycle and object/class
level locking. It continues with a bunch of problems about thread pools in Java including JDK 8 work-stealing thread
pool. Afterwards, we
have problems dedicated to **Callable**, **Future** and **CompletableFuture**. Next, we dedicate several problems to
Java synchronizers (e.g., barrier,
semaphore, exchanger, etc). Finally, we have problems for fork/join framework, **ReentrantLock**, *
*ReentrantReadWriteLock**, **StampedLock**, atomic
variables, tasks cancellation, interruptible methods, and deadlocks.

# Thread pool with a single thread

Write a program that simulates an assembly line for checking and packing up bulbs using two workers.

# Semaphores

Write a program that simulates via a **Semaphore** a day at the barbershop. Mainly, our barbershop can serve maximum
three persons at a time (has only three seats). When a person arrives at the barbershop, he tries to take a seat. After
it is served by a barber, the person releases the seat. If a person arrives at the barbershop when all three seats are
taken, he must wait for a certain amount of time. If this time elapses and no seats have been freed, he will leave the
barbershop.

# Work-stealing thread pool

Write a program that relies on a work-stealing thread pool. More precisely, write a program that simulates an assembly
line for checking and packing up bulbs as follows: checking takes place
during the day, while packing takes place at night. The checking process result in a queue of 15 millions bulbs every
day.

# Barrier

Write a program that relies on **CyclicBarrier** to simulate the start process of a server. The server is considered
started after its internal services has started. Services can be prepared for start concurrently (this is
time-consuming), but they run interdependent, therefore, once they are ready to start, they must be started all at once.

# Callable and Future

Write a program that simulates an assembly line for checking and packing up bulbs using **Callable** and **Future**.

# Thread pools in Java

Provide a brief overview of thread pools in Java.

# Thread pool with a single thread

Write a program that simulates an assembly line for checking and packing up bulbs using two workers.

# Optimizing busy waiting

Write a proof of concept for exemplifying the optimization of *busy waiting* technique via **onSpinWait()**.

# ThreadLocal

Write a proof of concept that exemplifies the usage of **ThreadLocal**.

# ReentrantLock

Write a program that exemplifies how **ReentrantLock.newCondition()** works.

# ReentrantReadWriteLock

Write a program that simulates the orchestration of a read-write process via **ReentrantReadWriteLock**.

# ReentrantLock

Write a program that exemplifies how **ReentrantLock.tryLock()** works.

# CompletableFuture

Write several snippets of code for exemplifies asynchronous code via **CompletableFuture**.

# ThreadLocal

Write a proof of concept that exemplifies the usage of **ThreadLocal**.

# Atomic variables

Write a program that increments the integers from 1 to 1000000 using a multithreaded application (**Runnable**).

# Atomic variables

Write a program that increments the integers from 1 to 1000000 using a multithreaded application (**Runnable**).

# StampedLock

Write a program that simulates the orchestration of a read-write process via **StampedLock**.

# StampedLock

Write a program that simulates the orchestration of a read-write process via **StampedLock**.

# Fork/join framework

Write a program that relies on fork/join framework to sum the elements of a list. Write a program that relies on
fork/join framework to compute the Fibonacci number at the given position (e.g. F12 = 144). In addition, write a program
that exemplifies the usage of **CountedCompleter**.

# Fork/join framework and compareAndSetForkJoinTaskTag()

Write a program that applies fork/join framework to a suite of interdependent tasks that should be executed only once (
e.g. task D depends on task C and B, but, task C depends on task B as well, therefore task B must be executed only once,
not twice).

# Task Cancellation

Write a proof of concept that exemplifies the usage of a **volatile** variable for holding the cancelation state of a
process.

# Concurrency - Deep dive

Chapters 10 and 11 includes 27 problems that involve Java concurrency. It starts with fundamental problems about threads
lifecycle and object/class
level locking. It continues with a bunch of problems about thread pools in Java including JDK 8 work-stealing thread
pool. Afterwards, we
have problems dedicated to **Callable**, **Future** and **CompletableFuture**. Next, we dedicate several problems to
Java synchronizers (e.g., barrier,
semaphore, exchanger, etc). Finally, we have problems for fork/join framework, **ReentrantLock**, *
*ReentrantReadWriteLock**, **StampedLock**, atomic
variables, tasks cancellation, interruptible methods, and deadlocks.

# ReentrantLock

Write a program that increments the integers from 1 to 1000000 using **ReentrantLock**.

# Combining multiple CompletableFutures

Write several snippets of code for exemplifies different solutions for combining multiple **CompletableFuture**s
togheter.

# Interruptible methods

Write a program that exemplifies the best approach for dealing with interruptible method.

# Deadlock (Dining Philosophers)

Write a program that reveals and solve the deadlock (*circular wait* or *deadly embrace*) that may occur in the famous
Dining Philosophers problem.

# Fork/join framework

Write a program that relies on fork/join framework to sum the elements of a list. Write a program that relies on
fork/join framework to compute the Fibonacci number at the given position (e.g. F12 = 144). In addition, write a program
that exemplifies the usage of **CountedCompleter**.

# Atomic variables

Write a program that increments the integers from 1 to 1000000 using a multithreaded application (**Runnable**).

# Fork/join framework

Write a program that relies on fork/join framework to sum the elements of a list. Write a program that relies on
fork/join framework to compute the Fibonacci number at the given position (e.g. F12 = 144). In addition, write a program
that exemplifies the usage of **CountedCompleter**.

# ReentrantLock

Write a program that exemplifies how **ReentrantLock.lockInterruptibly()** works.

# Implement Decorator pattern

Write a program that represents an implementation of the Decorator pattern based on lambdas.

# Implement Execute Around pattern

Write a program that represents an implementation of the Execute Around pattern based on lambdas.

# Implement Cascaded Builder pattern

Write a program that represents an implementation of the Cascaded Builder pattern based on lambdas.

# Implement Template Method pattern

Write a program that represents an implementation of the Template Method pattern based on lambdas.

# Writing functional interfaces

Define the road from 0 to a functional interface via a set of meaningful examples.

# Implement Factory pattern

Write a program that represents an implementation of the Factory pattern based on lambdas.

# Implement Loan pattern

Write a program that represents an implementation of the Loan pattern based on lambdas.

# Implement Observer pattern

Write a program that represents an implementation of the Observer pattern based on lambdas.

# Functional style programming - Fundamentals and design patterns

Chapter 8 and 9 includes 33 problems that involve Java functional style programming. The chapter starts with a problem
meant to provide a
complete journey from 0 to functional interfaces. It continues with a suite of design patterns from GoF interpreted in
Java functional
style. Next, we focus on several problems that involves classical operations encountered in streams (e.g., filter, map,
etc), we discuss
infinite streams, null-safe streams and default methods. A comprehensive list of problems covers
io.github.farrukhjon.experiment.java.grouping, io.github.farrukhjon.experiment.java.partitioning, and collectors,
including JDK 12 **io.github.farrukhjon.experiment.java.teeing()** collector and writing a custom collector. In
addition, **takeWhile()**, **dropWhile()**, composing functions, predicates  
and comparators, testing and debugging lambdas, and other cool topics are discussed as well.

# Implement Decorator pattern

Write a program that represents an implementation of the Decorator pattern based on lambdas.

# Implement Strategy pattern

Write a program that represents an implementation of the Strategy pattern based on lambdas.

# Implement Command pattern

Write a program that represents an implementation of the Command pattern based on lambdas.

# Java Coding Problems

<a href="https://www.packtpub.com/programming/java-coding-problems?utm_source=github&utm_medium=repository&utm_campaign="><img src="https://content.packt.com/B12731/cover_image_small.png" alt="Java Coding Problems " height="256px" align="right"></a>

This is the code repository
for [Java Coding Problems ](https://www.packtpub.com/programming/java-coding-problems?utm_source=github&utm_medium=repository&utm_campaign=),
published by Packt.

**Improve your Java Programming skills by solving real-world coding challenges**

## What is this book about?

* Adopt the latest JDK 8 - JDK 13 features in your applications
* Solve cutting-edge problems relating to collections and data structures
* Get to grips with functional-style programming using lambdas
* Perform asynchronous communication and parallel data processing
* Solve strings and number problems using the latest Java APIs
* Become familiar with different aspects of object immutability in Java
* Implement the correct practices and clean code techniques

This book covers the following exciting features:

If you feel this book is for you, get your [copy](https://www.amazon.com/dp/1789801419) today!

<a href="https://www.packtpub.com/?utm_source=github&utm_medium=banner&utm_campaign=GitHubBanner"><img
src="https://raw.githubusercontent.com/PacktPublishing/GitHub/master/GitHub.png"
alt="https://www.packtpub.com/" border="5" /></a>

## Instructions and Navigations

All of the code is organized into folders. For example, Chapter02.

The code will look like the following:

```
public Map<Character, Integer> countDuplicateCharacters(String str) {

   Map<Character, Integer> result = new HashMap<>();
 
   // or use for(char ch: str.toCharArray()) { ... }
   for (int i = 0; i<str.length(); i++) {
      char ch = str.charAt(i);
      result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
   }
   
   return result;
}
```

**Following is what you need for this book:**
If you are a Java developer who wants to level-up by solving real-world problems, then this book is for you. Working
knowledge of Java is required to get the most out of this book.

With the following software and hardware list you can run all code files present in the book (Chapter 1-13).

### Software and Hardware List

| Chapter | Software required | OS required                        |
|---------|-------------------|------------------------------------|
| 1-13    | JDK               | Windows, Mac OS X, and Linux (Any) |

We also provide a PDF file that has color images of the screenshots/diagrams used in this
book. [Click here to download it](https://static.packt-cdn.com/downloads/9781789801415_ColorImages.pdf).

### Related products

* Learn Java 12
  Programming  [[Packt]](https://www.packtpub.com/in/application-development/learn-java-12-programming?utm_source=github&utm_medium=repository&utm_campaign=) [[Amazon]](https://www.amazon.com/dp/1789957052)

* Java 11 and 12 - New
  Features  [[Packt]](https://www.packtpub.com/application-development/java-11-and-12-new-features?utm_source=github&utm_medium=repository&utm_campaign=) [[Amazon]](https://www.amazon.com/dp/1789133270)

## Get to Know the Author

**Anghel Leonard**
is a Chief Technology Strategist with more than 20 years of experience in the Java ecosystem. In his daily work, he is
focused on architecting and developing Java distributed applications that empower robust architectures, clean code, and
high performance. He is also passionate about coaching, mentoring, and technical leadership.

He is the author of several books, videos, and dozens of articles related to Java technologies.

### Suggestions and Feedback

[Click here](https://docs.google.com/forms/d/e/1FAIpQLSdy7dATC6QmEL81FIUuymZ0Wy9vH1jHkvpY57OiMeKGqib_Ow/viewform) if you
have any feedback or suggestions.

### Download a free PDF

<i>If you have already purchased a print or Kindle version of this book, you can get a DRM-free PDF version at no
cost.<br>Simply click on the link to claim your free PDF.</i>
<p align="center"> <a href="https://packt.link/free-ebook/9781789801415">https://packt.link/free-ebook/9781789801415 </a> </p>
# Division and modulo of unsigned values
Write a program that computes division and modulo of the given unsigned value.# Check if contains only digits
Write a program that checks if the given string contains only digits.# Count string in another string
Write a program that count the occurrences of a given string in another given string.# Compare two unsigned numbers
Write a program that compares the given two numbers as unsigned.# Convert String to int, long, float and double
Write a program that converts the given string (representing a number) to an **int**, **long**, **float** and **double**.# Compute min and max of two numbers
Write a program that returns the minimum and maximum of two numbers.# Apply logical And/Or/Xor to two booleans
Write a program that applies the logical **And**/**Or**/**Xor** to two boolean expressions.# Convert to a number by an unsigned conversion
Write a program that converts the given **int** to a **long** by an unsigned conversion.# Sum two large int/long and operation overflow
Write a program that sums two large **int**/**long** and throws an **ArithmeticException** in case of operation overflow.# Remove leading and trailing spaces
Write a program that removes leading and trailing spaces of the given string.# Reverse words
Write a program that reverses words of a given string.# Fused Multiply Add (FMA)
Write a program that takes three **float**/**double** **a**, **b** and **c** and computes the **a * b + c** on an efficient way.# Transform strings
Write several snippets of code for transforming a string in another string.# Generate all permutations
Write a program that generates all permutations of a given string.# Remove duplicate characters
Write a program that removes the duplicate characters from the given string.# Compact Number Formatting
Write a program that format the number 1000000 to 1M (US locale) and to 1 Mln (Italian locale). In addition, parser 1M and 1 Mln from **String** to **Number**.# Double/float is a finite floating-point value
Write a program that determines if the given **double**/**float** value is a finite floating-point value.# Sort array of strings by the length
Write a program that sorts by length the given array of strings.# Compute the floor of a division and modulus
Write a program that computes the floor division and the floor modulus of the given dividend (**x**) and divisor (**y**).# Multiply two large int/long and operation overflow
Write a program that multiplies two large **int**/**long** and throws an **ArithmeticException** in case of operation overflow.# Check if two strings are anagrams
Write a program that checks if two strings are anagrams. Consider that an anagram of a string is a permutation of this string ignoring capitalization and whitespaces.# Remove given characters
Write a program that removes the given character from the given string.# Strings, numbers & math problems
This chapter includes 39 problems that involves strings, numbers and mathematical operations. The chapter starts with a bunch of classical problems for strings such as counting duplicates, reversing a string, removing whitespaces and so on and forth. The chapter continue with problems dedicated to numbers and mathematical operations such as summing two large numbers and operation overflow, comparing two unsigned numbers, compute the floor of a division and modulus, etc. Each problem is passed through several solutions including Java 8 functional style. Moreover, the chapter covers through problems the futures added in JDK 9, 10, 11 and 12.  
# Find the first non-repeated character
Write a program that returns the first non-repeated character from a given string.# Count duplicate characters
Write a program that counts duplicate characters from a given string.# Check if a string is a palindrome
Write a program that determines if the given string is palindrome or not.# Apply indentation
Write several snippets of code for applying indentation to the given text.# BigInteger to a primitive type
Write a program that extracts the primitive type value from the given **BigInteger**.# Next floating-point value
Write a program that returns the next floating-point adjacent to the given **float**/**double** in the direction of positive/negative infinity.# Convert a long to an int
Write a program that converts a **long** to an **int**.# Check that string contains a substring
Write a program that checks if the given string contains the given substring.# Count vowels and consonants
Write a program that counts the number of vowels and consonants in a given string.# Find the longest common prefix
Write a program that finds the longest common prefix of given strings.# Find the character with the most appearances
Write a program that finds the character with the most appearances in the given string.# Join multiple strings with a delimiter
Write a program that joins the given strings by the given delimiter.# Count occurrences of a certain character
Write a program that counts occurrences of a certain character in a given string.# String as an unsigned number in the radix
Write a program that parses the given string to an unsigned number (**int** or **long**) in the given radix.# Remove whitespaces from string
Write a program that removes all whitespaces from the given string.# Declare multiline strings (text blocks)
Write a program that declares multiline strings or text blocks.
# Concatenate same string n times
Write a program that concatenates the same string of a given number of times.# Working with temporary files/folders
Write several programs for working with temporary files/folders.
# Constructing a path between two locations
Write several examples that constructs a relative path between two given paths (from one path to another).
# Comparing file paths
Write several examples for comparing the given file paths.
# Working with temporary files/folders
Write several programs for working with temporary files/folders.
# Discover mismatches between two files
Write a program that discovera the mismatches between two files at byte level.
# Walking paths
Write a program that visits all files within a directory including subdirectories. Moreover, write a program that searches a file by name, deletes a directory, moves a directory and copies a directory.
# Streaming a file content
Write a program that streams the content of the given file.
# Watching paths
Write several programs that watches changes that occur on a certain path (e.g., create, delete, modify).
# Converting file paths
Write several examples for converting file paths (e.g., convert file path to string, URI, file, etc).
# Read a JSON/CSV file as Object
Write a program that reads the given JSON/CSV file as **Object** (POJO)
# Joining file paths
Write several examples for joining (combining) file paths. Define a fix path and append to it different other paths (or replace a part of it with other paths).
# Working with temporary files/folders
Write several programs for working with temporary files/folders.
# Current directory
Write a program that return the current project root directory
# Walking paths
Write a program that visits all files within a directory including subdirectories. Moreover, write a program that searches a file by name, deletes a directory, moves a directory and copies a directory.
# Circular byte buffer
Write a program that represents an implementation of a circular byte buffer.
# Creating file paths
Write several examples for creating different kind of file paths (e.g., absolute paths, relative paths, etc).
# Searching for files/folders in a file tree
Write a program that searches for the given files/folders in the given file tree.
# Read a JSON/CSV file as Object
Write a program that reads the given JSON/CSV file as **Object** (POJO)
# Working with Scanner
Write several snippets of code to reveal **Scanner** capabilities.
# Reading/writing text files efficiently
Write several programs for exemplifying different approaches for reading and writing a text file in an efficient manner.
# Java I/O - Paths, files, buffers, scanning and formatting 
This chapter includes 20 problems that involve Java I/O for files. From manipulating, walking and watching paths to streaming files and efficient ways for reading/writing text and binary files, we will cover a hand of problems that are a must in the arsenal of any Java developer.

# Working with temporary files/folders

Write several programs for working with temporary files/folders.

# Tokenizing files

Write several snippets of code for exemplifying different techniques of tokenizing a file content.

# Working with temporary files/folders

Write several programs for working with temporary files/folders.

# Walking paths

Write a program that visits all files within a directory including subdirectories. Moreover, write a program that
searches a file by name, deletes a directory, moves a directory and copies a directory.

# Watching paths

Write several programs that watches changes that occur on a certain path (e.g., create, delete, modify).

# Read a JSON/CSV file as Object

Write a program that reads the given JSON/CSV file as **Object** (POJO)

# Walking paths

Write a program that visits all files within a directory including subdirectories. Moreover, write a program that
searches a file by name, deletes a directory, moves a directory and copies a directory.

# Watching paths

Write several programs that watches changes that occur on a certain path (e.g., create, delete, modify).

# Read a JSON/CSV file as Object

Write a program that reads the given JSON/CSV file as **Object** (POJO)

# Working with temporary files/folders

Write several programs for working with temporary files/folders.

# Working with temporary files/folders

Write several programs for working with temporary files/folders.

# Walking paths

Write a program that visits all files within a directory including subdirectories. Moreover, write a program that
searches a file by name, deletes a directory, moves a directory and copies a directory.

# Filtering files

Write several user-defined filters for files.

# Reading/writing binary files efficiently

Write several programs for exemplifying different approaches for reading and writing a binary file in an efficient
manner.

# Write formatted output directly to file

Write a program that format the given numbers (integers and doubles) and output them to a file.

# Walking paths

Write a program that visits all files within a directory including subdirectories. Moreover, write a program that
searches a file by name, deletes a directory, moves a directory and copies a directory.

# Searching in big files

Write a program that efficiently searches the given string in a big file.

# Get public and private fields

Write a program that fetches the **public** and **private** fields of the given class via reflection.

# Nest-based access control via reflection

Write a program that provides access to nest-based constructs via reflection.

# Get annotation on receiver type

Write a program that gets the annotation on a receiver type.

# Invoke an instance method

Write a program that invokes an instance method via reflection.

# Instantiating via reflected constructor

Write a program that create instances via reflection.

# Reflection for getters and setters

Write several examples that invokes getters and setters via reflection. Additionally, write a program that generates
getters and setters via reflection.

# Reflecting annotations

Write several examples for fetching different kind of annotations via reflection.

# Check variable number of arguments

Write a program that checks if a method gets a variable number of arguments.

# Inspecting packages

Write several examples for inspecting Java packages (e.g., names, list of classes, etc).

# Get static methods

Write a program that groups the **static** methods of the given class and invoke one of them via reflection.

# Inspecting modules

Write several examples for inspecting Java 9 modules via reflection.

# Dynamic proxies

Write a program that relies on *dynamic proxies* for counting the number of invocations of the methods of the given
interfaces.

# Inspecting modules

Write several examples for inspecting Java 9 modules via reflection.

# Java Reflection Classes, interfaces, constructors, methods and fields

This chapter includes 17 problems that involve the Java Reflection API. From classical topics, such as inspecting and
instantiating Java artifacts (e.g., modules, packages, classes, interfaces, super-classes, constructors, methods,
annotations, arrays, etc), to synthetic and bridge constructs or nest-based access control (JDK 11), this chapter
provides solid coverage of the Java Reflection API.

# Inspecting classes and super-classes

Write several examples for inspecting classes and super-classes (e.g., get **Class** via class name, modifiers,
implemented interfaces, constructors, methods and fields).

# Working with arrays

Write several examples for working with arrays via Java Reflection.

# Reflection for getters and setters

Write several examples that invokes getters and setters via reflection. Additionally, write a program that generates
getters and setters via reflection.

# Check default methods

Write a program that checks if a method is **default**.

# Get synthetic and bridge constructs

Write a program that gets *synthetic* and *bridge* constructs via reflection.

# Nest-based access control via reflection

Write a program that provides access to nest-based constructs via reflection.

# Get generic types of method, fields and exceptions

Write a program that fetches the generic types of the given methods, fields and exceptions via reflection.

# Partitioning

Write several snippets of code for working with **partitioningBy()** collectors.

# Testing high-order functions

Write several unit tests for testing the so-called high-order functions.

# Map a stream

Write a helper method that uses **Stream#map()** to convert **List< P >** in **List< Q >**. Write a heper method that
does the same thing for arrays.

# Parallel processing of streams

Provide a brief overview of parallel processing of streams. Provide at least one example for **parallelStream()**, *
*parallel()** and **io.github.farrukhjon.experiment.java.spliterator()**.

# Filtering, flatting and mapping collectors

Write several snippets of code for exemplifying the usage of filtering, flatting and mapping collectors.

# Joining the results of a stream

Write several snippets of code for joining the results of a stream into a **String**.

# Composing functions, predicates and comparators

Write several examples for composing functions, predicates and comparators.

# Find in a stream

Write a program for finding different elements in a stream.

# Collect the results of a stream

Write several snippets of code for collecting the results of a stream in a list, map and set.

# Debugging lambdas

Provide a technique for debugging lambdas.

# Match in a stream

Write a program for matching different elements in a stream.

# Infinite streams, takeWhile() and dropWhile()

Write several snippets of code that works with infinite streams. In addition, write several examples of working with *
*takeWhile()** and **dropWhile()** APIs.

# Functional style programming - Deep dive

Chapter 8 and 9 includes 33 problems that involve Java functional style programming. The chapter starts with a problem
meant to provide a
complete journey from 0 to functional interfaces. It continues with a suite of design patterns from GoF interpreted in
Java functional
style. Next, we focus on several problems that involves classical operations encountered in streams (e.g., filter, map,
etc), we discuss
infinite streams, null-safe streams and default methods. A comprehensive list of problems covers
io.github.farrukhjon.experiment.java.grouping, io.github.farrukhjon.experiment.java.partitioning, and collectors,
including JDK 12 **io.github.farrukhjon.experiment.java.teeing()** collector and writing a custom collector. In
addition, **takeWhile()**, **dropWhile()**, composing functions, predicates
and comparators, testing and debugging lambdas, and other cool topics are discussed as well.

# Writing a custom collector

Write a program that represents a custom collector.

# Filtering non-zero elements of a stream

Write a stream pipeline that filters non-zero elements of a stream.

# Teeing

Write several examples that merges the results of two collectors (JDK 12, *
*Collectors.io.github.farrukhjon.experiment.java.teeing()**).

# Default methods

Write an interface that contains a default method.

# Summarization collectors

Write several snippets of code for revealing the usage of summarization collectors.

# Null-safe streams

Write a program that return a **null**-safe stream from an element or a collection of elements.

# Map a stream

Write several examples of mapping a stream via **map()** and **flatMap()**.

# Method reference

Provide a method reference example.

# Testing methods that uses lambdas

Write several unit tests for testing methods that uses lambdas.

# Parallel processing of streams

Provide a brief overview of parallel processing of streams. Provide at least one example for **parallelStream()**, *
*parallel()** and **io.github.farrukhjon.experiment.java.spliterator()**.

# Map a stream

Write a helper method that uses **Stream#map()** to convert **List< P >** in **List< Q >**. Write a heper method that
does the same thing for arrays.

# Sum, max and min in a stream

Write a program for computing the sum, max and min of the given stream via primitive specializations of **Stream** and *
*Stream.reduce()**.

# Grouping

Write several snippets of code for working with **groupingBy()** collectors.

# HTTP/2 server push

Write a program that exemplifies the HTTP/2 server push feature via HTTP Client API.

# Trigger a synchronous GET request

Write a program that uses the HTTP Client API to trigger a synchronous **GET** request and display the response code and
body.

# Get, update and save JSON

Write a program that uses the HTTP Client API for getting, updating and saving a JSON.

# Setting connection authentication

Write a program that uses the HTTP Client API to set up a connection authentication via username and password.

# Download

Write a program that uses HTTP Client API to download a resource.

# Setting a proxy

Write a program that uses the HTTP Client API to set up a connection via a proxy.

# Upload with multipart

Write a program that uses HTTP Client API to upload a resource.

# Setting request body

Write a program that uses the HTTP Client API to add a body to a request.

# Specifying the HTTP Method

Write a program that specifies the HTTP method of a request (e.g., **GET**, **POST**, **PUT** and **DELETE**).

# Get response information

Write a program that uses the HTTP Client API to get information about the response (e.g., URI, version, headers, status
code, body, etc).

# Handling response body types

Write several snippets of code for exemplifying how to handle common response body types via **HttpResponse.BodyHandlers
**.

# The HTTP Client and WebSocket APIs

This chapter includes 20 problems that are meant to cover the HTTP Client and WebSocket APIs.

Do you remember `HttpUrlConnection`? Well, JDK 11 comes with the HTTP Client API as a reinvention
of `HttpUrlConnection`.
The HTTP Client API is easy to use and supports HTTP/2 (default) and HTTP/1.1. For backward compatibility, the HTTP
Client API
will automatically downgrade from HTTP/2 to HTTP 1.1 when the server doesn't support HTTP/2. Moreover, the HTTP Client
API
supports synchronous and asynchronous programming models and relies on streams to transfer data (reactive streams). It
also
supports the WebSocket protocol, which is used in real-time web applications to provide client-server communication with
low
message overhead.

# HTTP/2 server push

Write a program that exemplifies the HTTP/2 server push feature via HTTP Client API.

# Setting the redirect policy

Write a program that uses the HTTP Client API to automatically redirect if needed.

# WebSocket

Write a program that opens a connection to a WebSocket endpoint, collects data for 10 seconds and close the connection.

# Setting/getting headers

Write a program that adds additional headers to the request and gets the headers of the response.

# Handling form data

Write a program that uses HTTP Client API to submit a form data (**application/x-www-form-urlencoded**).

# Setting a timeout

Write a program that uses the HTTP Client API for setting the amount of time we want to wait for a response (timeout).

# Sending sync and async requests

Write a program that sends the same request in sync and async modes.

# Download

Write a program that uses HTTP Client API to download a resource.

# Compression

Write a program that handles compressed responses (e.g., **gzip**).

# HTTP/2 server push

Write a program that exemplifies the HTTP/2 server push feature via HTTP Client API.

# Handling cookies

Write a program that uses the HTTP Client API to set a cookie handler.

# Trigger a synchronous GET request

Write a program that uses the HTTP Client API to trigger a synchronous **GET** request and display the response code and
body.

# Do not use Optional for fields

Exemplify the bad practice of declaring fields of type **Optional**.

# Filter values via Optional.filter()

Exemplify the usage of **Optional.filter()** for rejecting wrapped values based on a predefined rule.

# Do not use Optional in constructors args

Exemplify the bad practice of using **Optional** in constructors arguments.

# Chaining lambdas via orElseFoo()

Write a program that exemplifies the usage of **orElse()** and **orElseFoo()** for avoiding disrupting lambda chains.

# Optional<T> vs OptionalInt

Exemplify the usage of non-generic **OptionalInt** instead of **Optional<T>**.

# Throwing NoSuchElementException

Write a program that, when no value is present, throws an exception of type **NoSuchElementException** or another
exception.

# Optional and null references

Write a program that exemplifies the correct usage of **Optional.orElse(null)**.

# Return a boolean if the Optional is empty

Write two snippets of code for exemplifying two solutions for returning a **boolean** if the given **Optional** is
empty.

# Initializing Optional

Write a program that exemplifies the correct and wrong approaches for initializing an **Optional**.

# Optional

This chapter includes 24 problems meant to draw several rules for working with **Optional**. The problems and solutions
presented in this section
are based on the Brian Goetz (Java’s language architect) definition: *Optional is intended to provide a limited
mechanism for library method
return types where there needed to be a clear way to represent “no result," and using null for such was overwhelmingly
likely to cause errors.*
But, where there are rules there are exceptions as well. Therefore, do not conclude that the rules (or practices)
presented here should be
followed (or avoided) at all costs. Like always, it’s an it depends problem that requires to evaluate the situation and
weight pros and cons.

# Optional and identity-sensitive operations

Write a snippet of code that sustains the fact that identity-sensitive operations should be avoided in case of *
*Optional**.

# Consuming a present Optional

Write a program that consumes a present **Optional** via **ifPresent()** and via **ifPresentElse()**.

# Chaining the Optional and Stream APIs

Exemplify the usage of **Optional.stream()** for chaining the Optional API with Stream API.

# Transform values via Map() and flatMap()

Write several snippets of code for exemplifying the usage of **Optional.map()** and **flatMap()**.

# Do not use Optional in setters args

Exemplify the bad practice of using **Optional** in setters arguments.

# Returning a present Optional or another one

Let's assume that we have an **Optional**. Write a program that relies on **Optional.or()** for returning this *
*Optional** (if its value is present) or another **Optional** (if its value is not present).

# Do not use Optional just for getting a value

Exemplify the bad practice of chaining **Optional**'s methods with the single purpose of getting a value.

# Optional.get() and missing value

Write a program that exemplifies the correct and wrong usage of **Optional.get()**.

# Confusing of() with ofNullable()

Exemplify the potential consequences of confusing **Optional.of()** with **ofNullable()**.

# Avoiding Optional in collections

Using **Optional** in collections can be a design smell. Exemplify a typical use case and possible alternatives for
avoding **Optional** in collections.

# Return a non-existent default value

Write a program that, when no value is present, sets (or returns) an non-existent default value via the *
*Optional.orElseGet()** method.

# Return an already-constructed default value

Write a program that, when no value is present, sets (or returns) an already-constructed default value via the *
*Optional.orElse()** method.

# Do not use Optional in methods args

Exemplify the bad practice of using **Optional** in methods arguments.

# Asserting equality of Optionals

Exemplify asserting equality of **Optional**s.

# Do not use Optional to return empty or null collections or arrays

Exemplify the bad practice of using **Optional** for returning empty/**null** collections or arrays.
