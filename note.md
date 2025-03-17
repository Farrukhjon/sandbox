# Note

<!-- TOC -->
* [Note](#note)
* [Problem-Solving](#problem-solving)
  * [Steps in problem-solving](#steps-in-problem-solving)
  * [How to Solve It (George Polya's method)](#how-to-solve-it-george-polyas-method)
  * [Strategy and Tactical Questions Example](#strategy-and-tactical-questions-example)
  * [Steps in algorithm development](#steps-in-algorithm-development)
  * [Flow-Chart](#flow-chart)
  * [Pseudocode](#pseudocode)
* [Algorithm Design Strategies & Techniques](#algorithm-design-strategies--techniques)
  * [Helping Questions to thing in right way in design of algorithms](#helping-questions-to-thing-in-right-way-in-design-of-algorithms)
  * [Brute-Force](#brute-force)
  * [Divide-and-Conquer](#divide-and-conquer)
  * [Decrease-and-Conquer](#decrease-and-conquer)
  * [Transform-and-Conquer](#transform-and-conquer)
  * [Dynamic Programming](#dynamic-programming)
  * [Greedy Algorithms](#greedy-algorithms)
  * [Backtracking](#backtracking)
  * [Branch and Bound](#branch-and-bound)
* [Data Structure & Algorithms](#data-structure--algorithms)
  * [Liner data structure](#liner-data-structure)
    * [Array and LinkedList](#array-and-linkedlist)
  * [Map data structure](#map-data-structure)
  * [Trees](#trees)
  * [Hash-function](#hash-function)
  * [Sorting](#sorting)
  * [Searching](#searching)
  * [Graphs](#graphs)
    * [Breadth First Search](#breadth-first-search)
    * [Depth First Search](#depth-first-search)
      * [Topological Sorting](#topological-sorting)
      * [Strongly Connected Components](#strongly-connected-components)
      * [Cut Point](#cut-point)
    * [Shortest Paths](#shortest-paths)
      * [Bellman-Ford](#bellman-ford)
      * [Floyd-Warshall](#floyd-warshall)
      * [Dijkstra](#dijkstra)
      * [The Shortest Path DAG](#the-shortest-path-dag)
    * [Counting the Paths](#counting-the-paths)
    * [The Minimum Average Cycle](#the-minimum-average-cycle)
    * [The Minimum Spanning Tree](#the-minimum-spanning-tree)
    * [BipartiteMatching](#bipartitematching)
    * [Maximum Flows](#maximum-flows)
    * [Minimum (Maximum) Cost BipartiteMatching](#minimum-maximum-cost-bipartitematching)
    * [Minimum Cost (Maximum Profit) Flow](#minimum-cost-maximum-profit-flow)
* [Analysis of Algorithms & Big-O Notation](#analysis-of-algorithms--big-o-notation)
  * [Number of Operations vs Size of data/elements](#number-of-operations-vs-size-of-dataelements)
  * [Algorithmic Time Complexities](#algorithmic-time-complexities)
    * [Constant time/space O(1)](#constant-timespace-o1)
    * [Logarithmic time O(LogN)](#logarithmic-time-ologn)
    * [Linear time/space O(n)](#linear-timespace-on)
    * [Quadratic time/space complexity O(n^2)](#quadratic-timespace-complexity-on2)
* [Object-Oriented Design & Patterns](#object-oriented-design--patterns)
  * [Encapsulation](#encapsulation)
  * [Polymorphism](#polymorphism)
    * [Static Binding & Dynamic Binding](#static-binding--dynamic-binding)
    * [Compile-time vs Run-time](#compile-time-vs-run-time)
    * [Overloading vs Overriding](#overloading-vs-overriding)
    * [Early Binding vs Late Binding](#early-binding-vs-late-binding)
  * [Inheritance](#inheritance)
  * [Abstraction](#abstraction)
  * [SOLID](#solid)
    * [Single Responsibility](#single-responsibility)
    * [Open/Close principle](#openclose-principle)
    * [Liskov's Substitution](#liskovs-substitution)
    * [Dependency Inversion](#dependency-inversion)
* [Java](#java)
  * [Primitive Data Types](#primitive-data-types)
  * [Classes & Interfaces](#classes--interfaces)
  * [Objects, Constructors & Methods](#objects-constructors--methods)
    * [Object's common methods: equals, hashCode toString, clone](#objects-common-methods-equals-hashcode-tostring-clone)
  * [String](#string)
  * [StringBuilder & StringBuffer](#stringbuilder--stringbuffer)
  * [Errors and Exceptions](#errors-and-exceptions)
    * [Parent of all exceptions (java.lang.Throwable)](#parent-of-all-exceptions-javalangthrowable)
    * [Checked/Compile-time (java.lang.Exception)](#checkedcompile-time-javalangexception)
    * [Unchecked/Runtime (java.lang.RuntimeException)](#uncheckedruntime-javalangruntimeexception)
    * [try-catch-final](#try-catch-final)
  * [Collection Framework](#collection-framework)
    * [Collection Interfaces](#collection-interfaces)
      * [Iterable and Collection interfaces](#iterable-and-collection-interfaces)
      * [List (aka Sequence, Ordered items)](#list-aka-sequence-ordered-items)
      * [Queue](#queue)
      * [Set](#set)
      * [Map](#map)
    * [Iterator and Spliterator](#iterator-and-spliterator)
      * [Failfast and Failsafe iterators](#failfast-and-failsafe-iterators)
    * [Comparable & Comparator](#comparable--comparator)
    * [List (ArrayList & LinkedList)](#list-arraylist--linkedlist)
    * [Queue & Deque](#queue--deque)
    * [PriorityQueue](#priorityqueue)
    * [Set (HashSet & TreeSet)](#set-hashset--treeset)
    * [Map](#map-1)
    * [hashCode() and equals()](#hashcode-and-equals)
    * [Hashing](#hashing)
    * [Hashtable](#hashtable)
    * [HashMap](#hashmap)
    * [IdentityHashMap](#identityhashmap)
    * [TreeMap](#treemap)
  * [Generics](#generics)
  * [Stream I/O and File I/O](#stream-io-and-file-io)
  * [JVM](#jvm)
  * [GC](#gc)
* [Functional Programming](#functional-programming)
  * [Principles](#principles)
    * [Immutability](#immutability)
    * [Recursion](#recursion)
    * [Function composition](#function-composition)
    * [Pure functions and Side effects-free](#pure-functions-and-side-effects-free)
    * [Lambda expression and Closures](#lambda-expression-and-closures)
    * [First-class and High-order functions](#first-class-and-high-order-functions)
  * [Evaluations (Lazy & Eager)](#evaluations-lazy--eager)
  * [Optimization and Caching](#optimization-and-caching)
    * [Memoization](#memoization)
  * [Declarative programming](#declarative-programming)
  * [Building blocks](#building-blocks)
    * [Filter/Map/Reduce(Fold)](#filtermapreducefold)
  * [Lambda Expressions and Streams data processing](#lambda-expressions-and-streams-data-processing)
    * [Functional Interfaces](#functional-interfaces)
    * [Command pattern and Anonymous Inner Class](#command-pattern-and-anonymous-inner-class)
    * [Method reference](#method-reference)
    * [Default methods](#default-methods)
    * [External vs Internal Iteration](#external-vs-internal-iteration)
    * [Stream Creation ways](#stream-creation-ways)
    * [Predefined Collectors](#predefined-collectors)
    * [Grouping](#grouping)
* [Concurrency](#concurrency)
  * [Shared State Concurrency Model](#shared-state-concurrency-model)
    * [Threads & Locks](#threads--locks)
    * [Multithreading Issues](#multithreading-issues)
    * [Synchronization](#synchronization)
      * [Mutual exclusion (mutex) & Monitors](#mutual-exclusion-mutex--monitors)
    * [Volatile keyword](#volatile-keyword)
    * [Memory Model and Data Consistency (happens-before principle)](#memory-model-and-data-consistency-happens-before-principle)
    * [Consumer/Producer problem](#consumerproducer-problem)
    * [Thread states (life-cycle)](#thread-states-life-cycle)
    * [Daemon threads](#daemon-threads)
    * [Interrupting Threads](#interrupting-threads)
    * [ThreadLocal object](#threadlocal-object)
    * [Callable](#callable)
    * [Future](#future)
    * [CompletableFuture](#completablefuture)
    * [Atomic: lock-free, thread-safe objects](#atomic-lock-free-thread-safe-objects)
    * [Thread Pools and Executors](#thread-pools-and-executors)
    * [Synchronizers](#synchronizers)
    * [Locks](#locks)
  * [Concurrent & Thread-Safe Collections](#concurrent--thread-safe-collections)
    * [CopyOnWriteArrayList](#copyonwritearraylist)
    * [ConcurrentHashMap](#concurrenthashmap)
    * [Concurrent Queues](#concurrent-queues)
  * [Parallel Stream Data Processing](#parallel-stream-data-processing)
    * [Concurrent Collectors](#concurrent-collectors)
  * [Message Passing Concurrency Model](#message-passing-concurrency-model)
* [Database & SQL](#database--sql)
* [Data Access. Pattens and Frameworks](#data-access-pattens-and-frameworks)
  * [Data Access Pattens (Data Source Architectural Patterns)](#data-access-pattens-data-source-architectural-patterns)
  * [Data Access Frameworks](#data-access-frameworks)
    * [Data Mapper](#data-mapper)
* [System Design & Scalability](#system-design--scalability)
  * [Network, TCP/IP, DNC](#network-tcpip-dnc)
  * [Load Balancing](#load-balancing)
    * [Active-passive](#active-passive)
    * [Active-active](#active-active)
    * [Layer 4 load balancing](#layer-4-load-balancing)
    * [Layer 7 load balancing](#layer-7-load-balancing)
    * [Horizontal scaling](#horizontal-scaling)
  * [Caching](#caching)
  * [Transaction](#transaction)
  * [Web API](#web-api)
    * [HTTP & REST](#http--rest)
    * [gRPC](#grpc)
  * [Event-Streaming and Kafka](#event-streaming-and-kafka)
    * [Pub/Sub Data Processing](#pubsub-data-processing)
    * [Stream Processing](#stream-processing)
    * [APIs](#apis)
      * [Producer API](#producer-api)
      * [Consumer API](#consumer-api)
      * [Streams API](#streams-api)
      * [Connect API](#connect-api)
  * [Terminology](#terminology)
    * [asynchronous](#asynchronous)
    * [atomic (concurrent operations)](#atomic-concurrent-operations)
    * [atomic (transactions)](#atomic-transactions)
    * [backpressure](#backpressure)
    * [batch process](#batch-process)
    * [bounded](#bounded)
    * [Byzantine fault](#byzantine-fault)
    * [cache](#cache)
    * [CAP theorem](#cap-theorem)
    * [causality](#causality)
    * [consensus](#consensus)
    * [data warehouse](#data-warehouse)
    * [declarative](#declarative)
    * [denormalize](#denormalize)
    * [derived data](#derived-data)
    * [deterministic](#deterministic)
    * [distributed](#distributed)
    * [durable](#durable)
    * [ETL](#etl)
    * [failover](#failover)
    * [fault-tolerant](#fault-tolerant)
    * [follower](#follower)
    * [full-text search](#full-text-search)
    * [graph](#graph)
    * [hash](#hash)
    * [idempotent](#idempotent)
    * [index](#index)
    * [isolation](#isolation)
    * [join](#join)
    * [leader](#leader)
    * [linearizable](#linearizable)
    * [locality](#locality)
    * [locality](#locality-1)
    * [lock](#lock)
    * [log](#log)
    * [materialize](#materialize)
    * [node](#node)
    * [normalized](#normalized)
    * [OLAP](#olap)
    * [OLTP](#oltp)
    * [partitioning](#partitioning)
    * [percentile](#percentile)
    * [primary key](#primary-key)
    * [quorum](#quorum)
    * [rebalance](#rebalance)
    * [replication](#replication)
    * [schema](#schema)
    * [secondary index](#secondary-index)
    * [serializable](#serializable)
    * [shared-nothing](#shared-nothing)
    * [skew (1)](#skew-1)
    * [skew (2)](#skew-2)
    * [split brain](#split-brain)
    * [stored procedure](#stored-procedure)
    * [stream process](#stream-process)
    * [synchronous](#synchronous)
    * [system of record](#system-of-record)
    * [timeout](#timeout)
    * [total order](#total-order)
    * [transaction](#transaction-1)
    * [two-phase commit (2PC)](#two-phase-commit-2pc)
    * [two-phase locking (2PL)](#two-phase-locking-2pl)
    * [unbounded](#unbounded)
<!-- TOC -->

# Problem-Solving

    Problem-solving is not a science, but part art and part skill.
    Central point for problem-solving is to constantly ask yourself questions to guide your thought process.
    - What if we do this?
    - What if we do that?
    - What is an alternative step?
    - What if we do this?
    - Why can't we do it this way?

In problem-solving, it is important to repeatedly check whether you are thinking on the right level.

## Steps in problem-solving

    1: Understanding the problem
    2: Analyzing the problem
    3: Developing the solution
    4: Implementation in code

## How to Solve It (George Polya's method)

<table>
<tr>
    <th>What</th>
    <th>Description</th>
</tr>
<tr>
    <td>Understand/See</td>
    <td>
        <li>Understand the given problem</li>
        <li>Identify essential parts of the problem</li>
        <li>Consider the terminology and notation used in the problem</li>
        <li>What sort of problem is it?</li>
        <li>What is being asked?</li>
        <li>What do the terms mean?</li>
        <li>Is there enough information or is more information needed?</li>
        <li>What is known or unknown? Rephrase the problem in your own words.</li>
        <li>Write down specific examples of the conditions given in the problem.</li>
    </td>
</tr>
<tr>
    <td>Plan/Setup</td>
    <td>
        <li>Devise a plan of actions</li>
        <li>Model a simple case</li>
        <li>Make a listing or a table</li>
        <li>Draw a sketch or diagram</li>
        <li>Find a pattern or rule</li>
        <li>Guess</li>
    </td>
</tr>
<tr>
    <td>Do/Carry Out</td>
    <td>
        <li>Carry out/Implement the plan</li>
        <li>Stepwise solve each plan's items</li>
        <li>Keep trying until something works</li>
    </td>
</tr>
<tr>
    <td>Check/Verification</td>
    <td>
        <li>Look back</li>
        <li>Check the solution</li>
    </td>
</tr>
</table>

## Strategy and Tactical Questions Example

| Strategical question                                     | Tactical question                                                                      |
|----------------------------------------------------------|----------------------------------------------------------------------------------------|
| Can I model my application as a graph algorithm problem? | Should I use an Adjacency List or Adjacency Matrix data structure to represent graphs? |

## Steps in algorithm development

## Flow-Chart

## Pseudocode

# Algorithm Design Strategies & Techniques

    Algorithm Design is a process of writing a finite set of steps.
    A step from the steps may require one or more operations.

## Helping Questions to thing in right way in design of algorithms

1. Do I really understand the problem?
2. Can I find a simple algorithm or heuristic for my problem?
3. Is my problem a known problem, listed in some catalog of algorithmic problems?
4. Are there special cases of the problem that I know how to solve?

## Brute-Force

    A strategy of solving a problem by trying every possible solutions from a wide range.
    Often is considered as an inefficient design strategy.
    Algorithm simply tries all possibilities until a satisfactory solution is found.
    To find the best solution it tries finding all solutions.

## Divide-and-Conquer

## Decrease-and-Conquer

## Transform-and-Conquer

## Dynamic Programming

## Greedy Algorithms

## Backtracking

## Branch and Bound

# Data Structure & Algorithms

## Liner data structure

### Array and LinkedList

## Map data structure

## Trees

## Hash-function

## Sorting

## Searching

## Graphs

### Breadth First Search

### Depth First Search

#### Topological Sorting

#### Strongly Connected Components

#### Cut Point

### Shortest Paths

#### Bellman-Ford

#### Floyd-Warshall

#### Dijkstra

#### The Shortest Path DAG

### Counting the Paths

### The Minimum Average Cycle

### The Minimum Spanning Tree

### BipartiteMatching

### Maximum Flows

### Minimum (Maximum) Cost BipartiteMatching

### Minimum Cost (Maximum Profit) Flow

# Analysis of Algorithms & Big-O Notation

## Number of Operations vs Size of data/elements

## Algorithmic Time Complexities

### Constant time/space O(1)

### Logarithmic time O(LogN)

### Linear time/space O(n)

### Quadratic time/space complexity O(n^2)

# Object-Oriented Design & Patterns

## Encapsulation

## Polymorphism

### Static Binding & Dynamic Binding

### Compile-time vs Run-time

### Overloading vs Overriding

### Early Binding vs Late Binding

## Inheritance

## Abstraction

## SOLID

### Single Responsibility

### Open/Close principle

### Liskov's Substitution

### Dependency Inversion

# Java

## Primitive Data Types

## Classes & Interfaces

## Objects, Constructors & Methods

### Object's common methods: equals, hashCode toString, clone

## String

## StringBuilder & StringBuffer

## Errors and Exceptions

### Parent of all exceptions (java.lang.Throwable)

### Checked/Compile-time (java.lang.Exception)

### Unchecked/Runtime (java.lang.RuntimeException)

### try-catch-final

## Collection Framework

### Collection Interfaces

#### Iterable and Collection interfaces

#### List (aka Sequence, Ordered items)

    - ArrayList
      - LinkedList (List + Queue)
      - Vector
          - Stack

#### Queue

    - PriorityQueue
    - LinkedList (List + Queue)
    - Dequeue
      - ArrayDuque

#### Set

    - HashSet
    - LinkedHashSet
    - SortedSet
        - TreeSet
    - EnumSet

#### Map

    - SortedMap
        - NavigableMap
            - TreeMap
      - Hashtable
      - HashMap
          - LinkedHashMap

### Iterator and Spliterator

#### Failfast and Failsafe iterators

### Comparable & Comparator

### List (ArrayList & LinkedList)

### Queue & Deque

### PriorityQueue

### Set (HashSet & TreeSet)

### Map

### hashCode() and equals()

### Hashing

### Hashtable

### HashMap

### IdentityHashMap

### TreeMap

## Generics

## Stream I/O and File I/O

## JVM

## GC

# Functional Programming

## Principles

### Immutability

### Recursion

### Function composition

### Pure functions and Side effects-free

### Lambda expression and Closures

### First-class and High-order functions

## Evaluations (Lazy & Eager)

## Optimization and Caching

### Memoization

## Declarative programming

## Building blocks

### Filter/Map/Reduce(Fold)

## Lambda Expressions and Streams data processing

### Functional Interfaces

    - Predicate
    - Function
    - Supplier
    - Consumer

### Command pattern and Anonymous Inner Class

### Method reference

    - Static method
    - Instance method
    - Constructor

### Default methods

### External vs Internal Iteration

### Stream Creation ways

    - Empty stream
    - Of Collection
    - From sequences
    - From array
    - From File
    - Generating and Iterating

### Predefined Collectors

    - Collectors.toList()
    - Collectors.toSet()
    - Collectors.toMap()
    - Collectors.toCollection
    - Collectors.collectingAndThen()
    - Collectors.joining()
    - Collectors.counting()
    - Collectors.summingDouble()
    - Collectors.averageDouble()
    - Collectors.maxBy() & Collectors.minBy()

### Grouping

    - Collectors.groupBy()

# Concurrency

## Shared State Concurrency Model

### Threads & Locks

    - Thread-safety
    - Immutable object
    - Creation from Thread class
    - Creation from implementing Runnable interface

### Multithreading Issues

    - Deadlock
    - Data race (Race Condition)

### Synchronization

#### Mutual exclusion (mutex) & Monitors

    - is a building with special room
    - the room contains data and code in the special room
    - the room can be occupied by a thread!
    - entry set room
    - wait room wait(), notify(), sleep()
    - IllegalMonitorStateException

### Volatile keyword

### Memory Model and Data Consistency (happens-before principle)

       - Read/Write guaranteed orders/relations on shared object by
           - synchronized, volatile, Thread.start(), Thread.join()

### Consumer/Producer problem

### Thread states (life-cycle)

    - NEW
    - RUNNABLE
    - RUNNING
    - WAITING/BLOCKED/SLEEP
    - TERMINATED/DEAD

### Daemon threads

### Interrupting Threads

    - Thread.interrupt()
    - Thread.interrupted()
    - Thread.isInterrupted()
    - InterruptedException

### ThreadLocal object

### Callable

### Future

### CompletableFuture

### Atomic: lock-free, thread-safe objects

     - Compare and Swap (CAS) atomic instructions
     - AtomicInteger
     - AtomicReference

### Thread Pools and Executors

     - ThreadPoolExecutor
     - ScheduledThreadPoolExecutor
     - ForkJoinPool

### Synchronizers

     - Semaphore
     - CountDownLatch

### Locks

     - ReentrantLock
     - Condition variable
         - Suspend/Wake up mechanism of thread execution.
         - await()/signal()
     - ReadWriteLock
     - StampedLock
       TimeUnit

## Concurrent & Thread-Safe Collections

### CopyOnWriteArrayList

### ConcurrentHashMap

### Concurrent Queues

## Parallel Stream Data Processing

    - Spliterator
    - Fork/Join

### Concurrent Collectors

    - Collectors.toConcurrentMap()
    - Collectors.groupByConcurrent()

## Message Passing Concurrency Model

# Database & SQL

# Data Access. Pattens and Frameworks

## Data Access Pattens (Data Source Architectural Patterns)

    - Table Data Gateway
    - Row Data Gateway
    - Active Record

## Data Access Frameworks

    - Spring JdbTemplate
    - Hibernate
    - Spring + Hibernate
    - Spring Data (JDBC, JPA)

### Data Mapper

# System Design & Scalability

## Network, TCP/IP, DNC

## Load Balancing

### Active-passive

### Active-active

### Layer 4 load balancing

### Layer 7 load balancing

### Horizontal scaling

## Caching

## Transaction

## Web API

### HTTP & REST

### gRPC

## Event-Streaming and Kafka

### Pub/Sub Data Processing

### Stream Processing

### APIs

#### Producer API

    The Producer API in Kafka allows an application to publish a stream of records to one or more Kafka topics.

#### Consumer API

    An aplication can subscribe to one or more Kafka topics using the Kafka Consumer API.
    It also enables the application to process streams of records generated in relation to such topics.

#### Streams API

    The Kafka Streams API allows an application to use a stream processing architecture to process data in Kafka.
    An application can use this API to take input streams from one or more topics, process them using streams operations, and generate output streams to transmit to one or more topics.
    The Streams API allows you to convert input streams into output streams in this manner.

#### Connect API

    The Kafka Connector API connects Kafka topics to applications.
    This opens up possibilities for constructing and managing the operations of producers and consumers, as well as establishing reusable links between these solutions.
    A connector, for example, may capture all database updates and ensure that they are made available in a Kafka topic.

## Terminology

### asynchronous

    Not waiting for something to complete (e.g., sending data over the network to another node), and not making any assumptions about how long it is going to take.

### atomic (concurrent operations)

    Describing an operation that appears to take effect at a single point in time, so another concurrent process can never encounter the operation in a “halffinished” state.

### atomic (transactions)

    Grouping together a set of writes that must either all be committed or all be rolled back, even if faults occur. See “Atomicity” on page 223 and “Atomic Commit and Two-Phase Commit (2PC)” on page 354.

### backpressure

    Forcing the sender of some data to slow down because the recipient cannot keep up with it. Also known as flow control. See “Messaging Systems” on page 441.

### batch process

    A computation that takes some fixed (and usually large) set of data as input and produces some other data as output, without modifying the input. See Chapter 10.

### bounded

    Having some known upper limit or size. Used for example in the context of network delay.

### Byzantine fault

    A node that behaves incorrectly in some arbitrary way, for example by sending contradictory or malicious messages to other nodes.

### cache

    A component that remembers recently used data in order to speed up future reads of the same data.
    It is generally not complete: thus, if some data is missing from the cache, it has to be fetched from some underlying, slower data storage system that has a complete copy of the data.

### CAP theorem

    A widely misunderstood theoretical result that is not useful in practice.

### causality

    The dependency between events that arises when one thing “happens before” another thing in a system.
    For example, a later event that is in response to an earlier event, or builds upon an earlier event, or should be understood in the light of an earlier event.

### consensus

    A fundamental problem in distributed computing, concerning getting several nodes to agree on something (for example, which node should be the leader for a database cluster).
    The problem is much harder than it seems at first glance.  

### data warehouse

    A database in which data from several different OLTP systems has been combined and prepared to be used for analytics purposes.

### declarative

    Describing the properties that something should have, but not the exact steps for how to achieve it.
    In the context of queries, a query optimizer takes a declarative query and decides how it should best be executed.

### denormalize

    To introduce some amount of redundancy or duplication in a normalized dataset, typically in the form of a cache or index, in order to speed up reads.
    A denormalized value is a kind of precomputed query result, similar to a materialized view.

### derived data

    A dataset that is created from some other data through a repeatable process, which you could run again if necessary.
    Usually, derived data is needed to speed up a particular kind of read access to the data.
    Indexes, caches, and materialized views are examples of derived data.

### deterministic

    Describing a function that always produces the same output if you give it the same input.
    This means it cannot depend on random numbers, the time of day, network communication, or other unpredictable things.

### distributed

    Running on several nodes connected by a network.
    Characterized by partial failures: some part of the system may be broken while other parts are still working, and it is often impossible for the software to know what exactly is broken.

### durable

    Storing data in a way such that you believe it will not be lost, even if various faults occur.

### ETL

    Extract–Transform–Load.
    The process of extracting data from a source database, transforming it into a form that is more suitable for analytic queries, and loading it into a data warehouse or batch processing system.

### failover

    In systems that have a single leader, failover is the process of moving the leadership role from one node to another.

### fault-tolerant

    Able to recover automatically if something goes wrong (e.g., if a machine crashes or a network link fails).

### follower

    A replica that does not directly accept any writes from clients, but only processes data changes that it receives from a leader.
    Also known as a secondary, slave, read replica, or hot standby.

### full-text search

    Searching text by arbitrary keywords, often with additional features such as matching similarly spelled words or synonyms.
    A full-text index is a kind of secondary index that supports such queries.

### graph

    A data structure consisting of vertices(things that you can refer to, also knownas nodes or entities) and edges (connectionsfrom one vertex to another, alsoknown as relationships or arcs).

### hash

    A function that turns an input into a random-looking number.
    The same input always returns the same number as output.
    Two different inputs are very likely to have two different numbers as output, although it is possible that two different inputs produce the same output (this is called a collision).

### idempotent

    Describing an operation that can be safely retried; if it is executed more than once, it has the same effect as if it was only executed once.

### index

    A data structure that lets you efficiently search for all records that have a particularvalue in a particular field.

### isolation

    In the context of transactions, describing the degree to which concurrently executing transactions can interfere with each other.
    Serializable isolation provides the strongest guarantees, but weaker isolation levels are also used.

### join

    To bring together records that have something in common.
    Most commonly used in the case where one record has a reference to another (a foreign key, a document reference, an edge in a graph) and a query needs to get the record that the reference points to.

### leader

    When data or a service is replicated across several nodes, the leader is the designated replica that is allowed to make changes.
    A leader may be elected through some protocol, or manually chosen by an administrator.
    Also known as the primary or master.

### linearizable

    Behaving as if there was only a single copy of data in the system, which is updated by atomic operations.

### locality

    A performance optimization: putting several pieces of data in the same place if they are frequently needed at the same time.

### locality

### lock

    A mechanism to ensure that only one thread, node, or transaction can access something, and anyone else who wants to access the same thing must wait until the lock is released.

### log

    An append-only file for storing data.
    A write-ahead log is used to make a storage engine resilient against crashes. 
    A log structured storage engine uses logs as its primary storage format. 
    A replication log is used to copy writes from a leader to followers.
    An event log can represent a data stream.

### materialize

    To perform a computation eagerly and write out its result, as opposed to calculating it on demand when requested.

### node

    An instance of some software running on a computer, which communicates with other nodes via a network in order to accomplish some task.

### normalized

    Structured in such a way that there is no redundancy or duplication.
    In a normalized database, when some piece of data changes, you only need to change it in one place, not many copies in many different places.

### OLAP

    Online analytic processing.
    Access pattern characterized by aggregating (e.g., count, sum, average) over a large number of records.

### OLTP

    Online transaction processing.
    Access pattern characterized by fast queries that read or write a small number of records, usually indexed by key.

### partitioning

    Splitting up a large dataset or computation that is too big for a single machine into smaller parts and spreading them across several machines. Also known as sharding.

### percentile

    A way of measuring the distribution of values by counting how many values are above or below some threshold.
    For example, the 95th percentile response time during some period is the time t such that 95% of requests in that period complete in less than t, and 5% take longer than t.

### primary key

    A value (typically a number or a string) that uniquely identifies a record.
    In many applications, primary keys are generated by the system when a record is created (e.g., sequentially or randomly); they are not usually set by users. See also secondary index.

### quorum

    The minimum number of nodes that need to vote on an operation before it can be considered successful.

### rebalance

    To move data or services from one node to another in order to spread the load fairly.

### replication

    Keeping a copy of the same data on several  nodes (replicas) so that it remains lock accessible if a node becomes unreachable.

### schema

    A description of the structure of some data, including its fields and datatypes.
    Whether some data conforms to a schema can be checked at various points in the data’s lifetime.

### secondary index

    An additional data structure that is maintained alongside the primary data storage and which allows you to efficiently search for records that match a certain kind of condition.

### serializable

    A guarantee that if several transactions execute concurrently, they behave the same as if they had executed one at a time, in some serial order.

### shared-nothing

    An architecture in which independent nodes—each with their own CPUs, memory, and disks—are connected via a conventional network, in contrast to sharedmemory or shared-disk architectures.

### skew (1)

    Imbalanced load across partitions, such that some partitions have lots of requests or data, and others have much less. 
    Also known as hot spots.

### skew (2)

    A timing anomaly that causes events to appear in an unexpected, nonsequential order.

### split brain

    A scenario in which two nodes simultaneously believe themselves to be the leader, and which may cause system guarantees to be violated.

### stored procedure

    A way of encoding the logic of a transaction such that it can be entirely executed on a database server, without communicating back and forth with a client during the transaction.

### stream process

    A continually running computation that consumes a never-ending stream of events as input, and derives some output from it.

### synchronous

    The opposite of asynchronous.

### system of record

    A system that holds the primary, authoritative version of some data, also known as the source of truth.
    Changes are first written here, and other datasets may be derived from the system of record.

### timeout

    One of the simplest ways of detecting a fault, namely by observing the lack of a response within some amount of time.
    However, it is impossible to know whether a timeout is due to a problem with the remote node, or an issue in the network.

### total order

    A way of comparing things (e.g., timestamps) that allows you to always say which one of two things is greater and which one is lesser.
    An ordering in which total order some things are incomparable (you cannot say which is greater or smaller) is called a partial order.

### transaction

    Grouping together several reads and writes into a logical unit, in order to simplify error handling and concurrency issues.

### two-phase commit (2PC)

    An algorithm to ensure that several database nodes either all commit or all abort a transaction.

### two-phase locking (2PL)

    An algorithm for achieving serializable isolation that works by a transaction acquiring a lock on all data it reads or writes, and holding the lock until the end of the transaction.

### unbounded

    Not having any known upper limit or size. The opposite of bounded.