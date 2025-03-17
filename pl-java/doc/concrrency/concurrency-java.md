# Concurrency in Java

<!-- TOC -->
* [Concurrency in Java](#concurrency-in-java)
  * [Literature and Resources](#literature-and-resources)
  * [Glossary](#glossary)
  * [Concepts of Concurrent Programming](#concepts-of-concurrent-programming)
  * [Multithreading](#multithreading)
  * [What Are Threads?](#what-are-threads)
  * [States Of A Thread](#states-of-a-thread)
  * [Properties of a Thread](#properties-of-a-thread)
  * [Methods of Thread](#methods-of-thread)
    * [Thread.start() vs Thread.run()](#threadstart-vs-threadrun)
  * [Object.wait(), Object.notify() and Object.notifyAll()](#objectwait-objectnotify-and-objectnotifyall)
  * [Object.wait() vs Thread.sleep()](#objectwait-vs-threadsleep)
  * [Interrupting Threads](#interrupting-threads)
  * [Task Types Executed By Threads](#task-types-executed-by-threads)
    * [Runnable](#runnable)
    * [Callable](#callable)
    * [Future](#future)
    * [FutureTask](#futuretask)
  * [The Shutdown Hook Thread](#the-shutdown-hook-thread)
  * [Synchronization](#synchronization)
    * [Synchronized method vs Synchronized block](#synchronized-method-vs-synchronized-block)
  * [Blocking Queues](#blocking-queues)
  * [Thread-Safe Collections](#thread-safe-collections)
  * [Callables and Futures](#callables-and-futures)
  * [Executors](#executors)
  * [Synchronizers](#synchronizers)
  * [Threads and Swing](#threads-and-swing)
  * [Dealing with InterruptedException](#dealing-with-interruptedexception)
  * [Dataflow Graph](#dataflow-graph)
  * [Throughput and Latency](#throughput-and-latency)
  * [Non-Blocking algorithms](#non-blocking-algorithms)
  * [Concurrency](#concurrency)
  * [Parallelism](#parallelism)
  * [Multiprocessor programming (data processing)](#multiprocessor-programming-data-processing)
  * [Process and Threads](#process-and-threads)
  * [Thread Safety](#thread-safety)
  * [Sharing Memory Between Threads](#sharing-memory-between-threads)
  * [Common Problems](#common-problems)
  * [Producers/Consumers](#producersconsumers)
  * [Readers/Writers](#readerswriters)
  * [Blocking Synchronization](#blocking-synchronization)
  * [Non-Blocking Synchronization](#non-blocking-synchronization)
  * [Visibility](#visibility)
  * [Customization of Thread Pool](#customization-of-thread-pool)
  * [Testing concurrent application](#testing-concurrent-application)
  * [Design of Concurrent programming](#design-of-concurrent-programming)
  * [Patterns Of Concurrent Programming](#patterns-of-concurrent-programming)
  * [Times](#times)
  * [Critical section](#critical-section)
  * [Firmness](#firmness)
  * [Multiple request (short-living) handling approaches](#multiple-request-short-living-handling-approaches)
  * [Sharing Data (Object)](#sharing-data-object)
  * [Programmatic locking](#programmatic-locking)
    * [Lock interface](#lock-interface)
    * [ReentrantLock](#reentrantlock)
    * [ReadWriteLock](#readwritelock)
    * [Benefits of ReentrantLock over synchronized](#benefits-of-reentrantlock-over-synchronized)
  * [Exceptions on multithreading processing](#exceptions-on-multithreading-processing)
  * [Immutability](#immutability)
  * [Synchronization](#synchronization-1)
  * [Confinement](#confinement)
  * [Issues of violating visibility](#issues-of-violating-visibility)
  * [Software Transactional Memory (STM)](#software-transactional-memory-stm)
  * [Fork/Join](#forkjoin)
  * [Classes and Interfaces](#classes-and-interfaces)
  * [Thread Pool Executor (Worker Model)](#thread-pool-executor-worker-model)
  * [Lifecycle of a Thread](#lifecycle-of-a-thread)
  * [Lifecycle of executors](#lifecycle-of-executors)
  * [Daemon Threads](#daemon-threads)
  * [Stopping a Thread](#stopping-a-thread)
  * [Inter-Thread Notifications](#inter-thread-notifications)
  * [Scheduling of Threads](#scheduling-of-threads)
    * [Thread Priority based scheduling](#thread-priority-based-scheduling)
  * [Scheduling of Tasks](#scheduling-of-tasks)
  * [Models of Concurrent Programming](#models-of-concurrent-programming)
  * [Classification of the Concurrency Models](#classification-of-the-concurrency-models)
  * [Thread Safety and Correctness](#thread-safety-and-correctness)
  * [Synchronized, Volatile and Atomicity](#synchronized-volatile-and-atomicity)
  * [Atomic variables from java.util.concurrency.atomic package](#atomic-variables-from-javautilconcurrencyatomic-package)
  * [Liveness and Performance](#liveness-and-performance)
  * [Shared Memory or Heap Memory](#shared-memory-or-heap-memory)
  * [Programs and Program Order](#programs-and-program-order)
      * [Reentrancy nature of lock](#reentrancy-nature-of-lock)
  * [Problems in Concurrent and Multithreading program](#problems-in-concurrent-and-multithreading-program)
      * [Race Condition](#race-condition)
      * [Data Race](#data-race)
      * [Stale data](#stale-data)
      * [Reordering issue](#reordering-issue)
      * [DeadLock](#deadlock)
      * [LiveLock](#livelock)
      * [Resource Starvation](#resource-starvation)
      * [Priority Inversion](#priority-inversion)
  * [The Mechanisms for communicating between threads](#the-mechanisms-for-communicating-between-threads)
      * [On shared resources](#on-shared-resources)
    * [Wait Set and Notification](#wait-set-and-notification)
  * [Thread execution Interruptions](#thread-execution-interruptions)
    * [Interactions of Waits, Notification, and Interruption](#interactions-of-waits-notification-and-interruption)
  * [Sleep and Yield](#sleep-and-yield)
  * [Waiting for threads to finish their execution](#waiting-for-threads-to-finish-their-execution)
  * [Atomic and Non-Atomic Read/Write operations](#atomic-and-non-atomic-readwrite-operations)
    * [Non-Atomic Treatment of double and long](#non-atomic-treatment-of-double-and-long)
  * [Safe Publication](#safe-publication)
    * [Publication and Escape](#publication-and-escape)
  * [Java Memory Model (JMM)](#java-memory-model-jmm)
    * [Happens-before orderings guaranteed operations](#happens-before-orderings-guaranteed-operations)
    * [Happens-before orderings guaranteed operations by the class library](#happens-before-orderings-guaranteed-operations-by-the-class-library)
    * [Ordering instruction (happens-before)](#ordering-instruction-happens-before)
    * [How to prevent Reordering? via Synchronization actions](#how-to-prevent-reordering-via-synchronization-actions)
    * [Problems](#problems)
    * [Solution](#solution)
    * [Model](#model)
    * [Reordering](#reordering)
    * [Weak and strong memory models](#weak-and-strong-memory-models)
    * [Happens before](#happens-before)
  * [Volatile (field modifier)](#volatile-field-modifier)
  * [Concurrent Collection Interfaces](#concurrent-collection-interfaces)
    * [BlockingQueue<E>](#blockingqueuee)
    * [BlockingDeque<E>](#blockingdequee)
    * [ConcurrentMap<K,V>](#concurrentmapkv)
    * [ConcurrentNavigableMap<K,V>](#concurrentnavigablemapkv)
  * [Concurrent Collection Classes](#concurrent-collection-classes)
    * [Blocking Concurrent Collection Classes](#blocking-concurrent-collection-classes)
      * [LinkedBlockingQueue](#linkedblockingqueue)
      * [LinkedBlockingDeque](#linkedblockingdeque)
      * [ArrayBlockingQueue](#arrayblockingqueue)
      * [PriorityBlockingQueue](#priorityblockingqueue)
    * [Non-Blocking Concurrent Collection Classes](#non-blocking-concurrent-collection-classes)
      * [ConcurrentHashMap](#concurrenthashmap)
      * [ConcurrentLinkedQueue](#concurrentlinkedqueue)
      * [ConcurrentLinkedDeque](#concurrentlinkeddeque)
      * [ConcurrentSkipListMap](#concurrentskiplistmap)
      * [ConcurrentSkipListSet](#concurrentskiplistset)
      * [CopyOnWriteArrayList](#copyonwritearraylist)
      * [CopyOnWriteArraySet](#copyonwritearrayset)
  * [Blocking Concurrent Collection Classes](#blocking-concurrent-collection-classes-1)
    * [Blocking Queue (FIFO) and Deque (FIFO & LIFO)](#blocking-queue-fifo-and-deque-fifo--lifo)
    * [BlockingQueue methods](#blockingqueue-methods)
  * [Non-Blocking Concurrent Collection Classes](#non-blocking-concurrent-collection-classes-1)
    * [Concurrent List implementations](#concurrent-list-implementations)
    * [Concurrent Set implementations](#concurrent-set-implementations)
    * [Concurrent Map implementations](#concurrent-map-implementations)
    * [Concurrent (Non-Blocking) Queue (FIFO) & Deque (FIFO & LIFO) implementations](#concurrent-non-blocking-queue-fifo--deque-fifo--lifo-implementations)
  * [java.util.concurrent package (The Concurrency API)](#javautilconcurrent-package-the-concurrency-api)
  * [Happens-Before relation](#happens-before-relation)
    * [The methods of all classes in java.util.concurrent and its subpackages extend these guarantees to higher-level synchronization](#the-methods-of-all-classes-in-javautilconcurrent-and-its-subpackages-extend-these-guarantees-to-higher-level-synchronization)
  * [Thread Pools and Work Stealing](#thread-pools-and-work-stealing)
  * [ThreadPoolExecutor](#threadpoolexecutor)
    * [Usage and Advantages](#usage-and-advantages)
  * [ExecutorService Interface](#executorservice-interface)
  * [Implementations of ExecutorService Interface](#implementations-of-executorservice-interface)
    * [ThreadPoolExecutor](#threadpoolexecutor-1)
    * [ScheduledThreadPoolExecutor](#scheduledthreadpoolexecutor)
    * [ForkJoinPool](#forkjoinpool)
  * [Intrinsic Lock (or Monitor Lock)](#intrinsic-lock-or-monitor-lock)
  * [Synchronization-Based, Blocked Concurrency](#synchronization-based-blocked-concurrency)
    * [Approaches of the Monitor Lock](#approaches-of-the-monitor-lock)
  * [Problems in Concurrent and Multithreading Programming](#problems-in-concurrent-and-multithreading-programming)
  * [Race Condition](#race-condition-1)
  * [Data Race](#data-race-1)
  * [DeadLock](#deadlock-1)
  * [LiveLock](#livelock-1)
  * [Resource Starvation](#resource-starvation-1)
  * [Priority Inversion](#priority-inversion-1)
  * [Synchronizer Primitives](#synchronizer-primitives)
    * [The Synchronizer Primitives from java.util.concurrent package](#the-synchronizer-primitives-from-javautilconcurrent-package)
    * [Semaphore](#semaphore)
    * [Phaser](#phaser)
    * [CountDownLatch](#countdownlatch)
    * [Exchanger](#exchanger)
    * [CyclicBarrier](#cyclicbarrier)
  * [ReentrantLock](#reentrantlock-1)
  * [Mutex vs ReentrantLock](#mutex-vs-reentrantlock)
  * [ReadWriteLock](#readwritelock-1)
    * [Implementation](#implementation)
    * [Mechanism](#mechanism)
  * [RunnableFuture](#runnablefuture)
  * [Lock-free algorithms and Atomic Toolkit in Java**](#lock-free-algorithms-and-atomic-toolkit-in-java)
  * [Non-blocking Guarantees (Progress Conditions)](#non-blocking-guarantees-progress-conditions)
  * [Wait-freedom](#wait-freedom)
  * [Lock-freedom](#lock-freedom)
  * [Obstruction-freedom](#obstruction-freedom)
  * [Optimistic concurrency control (OCC)](#optimistic-concurrency-control-occ)
  * [CompletableFuture](#completablefuture)
  * [CompletionService and ExecutorCompletionService](#completionservice-and-executorcompletionservice)
  * [Atomicity (or Linearizability)](#atomicity-or-linearizability)
  * [Explicit Locks in Java](#explicit-locks-in-java)
  * [Lock](#lock)
    * [Lock Interface](#lock-interface-1)
    * [Monitor Mechanism and Lock](#monitor-mechanism-and-lock)
  * [Atomic](#atomic)
    * [CAS (Compare And Set or Compare and Swap)](#cas-compare-and-set-or-compare-and-swap)
    * [AtomicBoolean](#atomicboolean)
    * [AtomicInteger](#atomicinteger)
    * [AtomicIntegerArray](#atomicintegerarray)
    * [AtomicIntegerFieldUpdater](#atomicintegerfieldupdater)
    * [AtomicLong](#atomiclong)
    * [AtomicLongArray](#atomiclongarray)
    * [AtomicLongFieldUpdater](#atomiclongfieldupdater)
    * [AtomicMarkableReference](#atomicmarkablereference)
    * [AtomicReference](#atomicreference)
    * [AtomicReferenceArray](#atomicreferencearray)
    * [AtomicReferenceFieldUpdater](#atomicreferencefieldupdater)
    * [AtomicStampedReference](#atomicstampedreference)
    * [DoubleAccumulator](#doubleaccumulator)
    * [DoubleAdder](#doubleadder)
    * [LongAccumulator](#longaccumulator)
    * [LongAdder](#longadder)
  * [Non-Blocking](#non-blocking)
  * [Lock-Free](#lock-free)
  * [Wait-Free](#wait-free)
  * [Models of Non-Blocking algorithms](#models-of-non-blocking-algorithms)
<!-- TOC -->

## Literature and Resources

- [10 points about wait(), notify() and notifyAll()](https://www.java67.com/2016/04/10-points-about-wait-notify-and-notifyAll-in-java-multithreading.html)
- [Akka Current General Terminology](https://doc.akka.io/docs/akka/current/general/terminology.html)
- [Anatomy of a Synchronizer](http://tutorials.jenkov.com/java-concurrency/anatomy-of-a-synchronizer.html)
- [Asynchronous Computation in Java - CompletableFuture](https://www.baeldung.com/java-completablefuture)
- [Atomic variables](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/package-summary.html)
- [Class Flow](https://docs.oracle.com/javase/9/docs/api/java/util/concurrent/Flow.html)
- [CompletableFuture - javadoc (JDK8)]()
- [Concepts, Techniques, and Models of Computer Programming by Peter Van Roy]()
- [Concurrency Glossary](https://slikts.github.io/concurrency-glossary/)
- [Concurrency made simple by B. Goetz](https://www.ibm.com/developerworks/java/library/j-jtp1126/index.html)
- [Concurrency Models](http://tutorials.jenkov.com/java-concurrency/concurrency-models.html)
- [Concurrency talk given at Scaleconf](http://shairosenfeld.com/concurrency.html)
- [Concurrency: State Models and Java Programs](https://www.safaribooksonline.com/library/view/concurrency-state-models/9780470093559/)
- [Concurrent and Parallel Programming Concepts](https://www.safaribooksonline.com/library/view/concurrent-and-parallel/9781771375313/)
- [Concurrent Programming in Java: Design Principles and Patterns, 2/e](https://www.safaribooksonline.com/library/view/concurrent-programming-in/0201310090/)
- [Definitions of Non-blocking, Lock-free and Wait-free](https://www.justsoftwaresolutions.co.uk/threading/non_blocking_lock_free_and_wait_free.html)
- [Difference between CompletableFuture Future and RxJavas and Observable, from stackoverflow]()
- [Effective Java](https://www.safaribooksonline.com/library/view/effective-java-third/9780134686097/)
- [Enable initialization atomicity](https://www.ibm.com/developerworks/java/library/j-jtp04275/index.html)
- [Explicit Locks](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/package-summary.html)
- [Futures and Promises - wiki]()
- [Glossary - Concurrency Programming Guide](https://developer.apple.com/library/archive/documentation/General/Conceptual/ConcurrencyProgrammingGuide/Glossary/Glossary.html)
- [Going atomic](https://www.ibm.com/developerworks/java/library/j-jtp11234/index.html)
- [Guide To CompletableFuture by Baeldung]()
- [How CAS (Compare And Swap) in Java works](https://dzone.com/articles/how-cas-compare-and-swap-java)
- [How to implement Thread pool in Java](https://www.javacodegeeks.com/2016/12/implement-thread-pool-java.html)
- [https://dzone.com/refcardz/core-java-concurrency?chapter=1]
- [https://medium.com/coding-corpus/java-concurrency-notes-719592adba73]
- [https://slikts.github.io/concurrency-glossary/]
- [Inside the Java Virtual Machine](http://www.artima.com/insidejvm/ed2/index.html)
- [Intrinsic Locks and Synchronization](https://docs.oracle.com/javase/tutorial/essential/concurrency/locksync.html)
- [Java 7 Concurrency Cookbook](https://www.safaribooksonline.com/library/view/java-7-concurrency/9781849687881/)
- [Java 9 Concurrency - Basic Elements](https://www.safaribooksonline.com/library/view/java-9-concurrency/9781788478199/)
- [Java 9 Concurrency - High-Level Elements](https://www.safaribooksonline.com/library/view/java-9-concurrency/9781788479639/)
- [Java 9 Concurrency Cookbook, 2/e](https://www.safaribooksonline.com/library/view/java-9-concurrency/9781787124417/)
- [Java 9 Concurrency- Advanced Elements](https://www.safaribooksonline.com/library/view/java-9-concurrency-/9781788626187/)
- [Java Concurrency in Practice, B. Goetz, T. Peierls, J. Bloch, J. Bowbeer, D. Holmes and D. Lea]()
- [Java Concurrency in Practice](https://www.safaribooksonline.com/library/view/java-concurrency-in/0321349601/)
- [Java Concurrency LiveLessons](https://www.safaribooksonline.com/library/view/java-concurrency-livelessons/9780134070957/)
- [Java Concurrency Tutorial – Locking: Explicit locks](https://www.javacodegeeks.com/2015/02/java-concurrency-tutorial-locking-explicit-locks.html)
- [Java Concurrency tutorial](https://netjs.blogspot.ru/p/java-concurrency-tutorial.html)
- [Java Concurrency, 2/e](https://www.safaribooksonline.com/library/view/java-concurrency-2e/9780134510644/)
- [Java Theory and Practice](https://www.ibm.com/developerworks/views/java/libraryview.jsp?site_id=1&contentarea_by=Java&sort_by=Date&sort_order=2&start=1&end=58&topic_by=&product_by=&type_by=All%20Types&show_abstract=false&search_by=practice:&industry_by=&series_title_by=)
- [Java Threads, 3/e](https://www.safaribooksonline.com/library/view/java-threads-3rd/0596007825/)
- [java.util.concurrent API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/package-summary.html)
- [java.util.concurrent.atomic(JDK8)](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/package-summary.html)
- [java.util.concurrent.atomic](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/package-summary.html)
- [JLS. Chapter 17. Threads and Locks](https://docs.oracle.com/javase/specs/jls/se8/html/jls-17.html)
- [JSR 133 (Java Memory Model) FAQ by J. Manson and B. Goetz](http://www.cs.umd.edu/~pugh/java/memoryModel/jsr-133-faq.html)
- [JSR 133 (Java Memory Model)FAQ](https://www.cs.umd.edu/users/pugh/java/memoryModel/jsr-133-faq.html)
- [JSR 133](https://jcp.org/en/jsr/detail?id=133)
- [Learning Path: Java: Delve Deep into Concurrency with Java 9](https://www.safaribooksonline.com/learning-paths/learning-path-java/9781788832694/)
- [Linearizability (atomicity in concurrent programming)](https://en.wikipedia.org/wiki/Linearizability)
- [Lock-Free and Wait-Free, definition and examples](http://concurrencyfreaks.blogspot.ru/2013/05/lock-free-and-wait-free-definition-and.html)
- [Managing volatility](https://www.ibm.com/developerworks/java/library/j-jtp06197/index.html)
- [Mastering Concurrency Programming with Java 8](https://www.safaribooksonline.com/library/view/mastering-concurrency-programming/9781785886126/)
- [Mastering Concurrency Programming with Java 8, by Javier Fernández González](https://learning.oreilly.com/library/view/mastering-concurrency-programming/9781785886126/)
- [Mastering Concurrency Programming with Java 9, 2/e](https://www.safaribooksonline.com/library/view/mastering-concurrency-programming/9781785887949/)
- [Non-blocking algorithm - wiki](https://en.wikipedia.org/wiki/Non-blocking_algorithm)
- [Package java.util.concurrent](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/package-summary.html)
- [Pattern-Oriented Software Architecture, Vol. 2, Patterns for Concurrent and Networked Objects](https://www.safaribooksonline.com/library/view/pattern-oriented-software-architecture/9781118725177/)
- [Programming Concurrency on the JVM](https://www.safaribooksonline.com/library/view/programming-concurrency-on/9781941222973/)
- [Programming for the Java Virtual Machine](https://www.safaribooksonline.com/library/view/programming-for-the/0201309726/)
- [Programming Promises in Java 8](https://www.safaribooksonline.com/library/view/programming-promises-in/9781491990209/)
- [Reactive Streams and Flow API]((https://www.reactive-streams.org/))
- [Seven Concurrency Models in Seven Weeks](https://www.safaribooksonline.com/library/view/seven-concurrency-models/9781941222737/)
- [Software Transactional Memory - wiki](http://en.wikipedia.org/wiki/Software_transactional_memory)
- [Structured Parallel Programming](https://www.safaribooksonline.com/library/view/structured-parallel-programming/9780124159938/)
- [Such blocking very concurrency, wow](http://shairosenfeld.com/such_blocking_very_concurrency)
- [The Art of Multiprocessor Programming, M. Herlihy and N Shavit]()
- [The Art of Multiprocessor Programming, Revised Reprint](https://www.safaribooksonline.com/library/view/the-art-of/9780123973375/)
- [The Art of Multiprocessor Programming, Revised Reprint](https://www.safaribooksonline.com/library/view/the-art-of/9780123973375/)
- [The Java Language Specification, Java SE 8/e](https://www.safaribooksonline.com/library/view/the-java-language/9780133900767/)
- [The Java Language Specification. Java SE 8 Edition](https://docs.oracle.com/javase/specs/jls/se8/html/index.html)
- [The Java Tutorial. Lesson Concurrency](https://docs.oracle.com/javase/tutorial/essential/concurrency/index.html)
- [The Java Virtual Machine Specification, Java SE 8/e](https://www.safaribooksonline.com/library/view/the-java-virtual/9780133922745/)
- [The java.util.concurrent Synchronizer Framework, by D. Lea](http://gee.cs.oswego.edu/dl/papers/aqs.pdf)
- [Thread pool - wiki](https://en.wikipedia.org/wiki/Thread_pool)
- [Thread pool - wiki](https://en.wikipedia.org/wiki/Thread_pool)
- [Thread pools and work queues](https://www.ibm.com/developerworks/java/library/j-jtp0730/index.html)
- [Thread pools and work queues](https://www.ibm.com/developerworks/java/library/j-jtp0730/index.html)
- [Utility classes commonly useful in concurrent programming](https://docs.oracle.com/javase/8/docs/api/index.html?java/util/concurrent/package-summary.html)
- [Volatile: Atomicity, Visibility and Ordering](http://flex4java.blogspot.ru/2015/03/volatile-atomicity-visibility-and.html)
- [Writing your own Thread pool from scratch in Java](https://caffinc.github.io/2016/03/simple-threadpool/)

## Glossary

- Asynchronous
- Atomic
- Atomicity
- Barrier
- Blocking
- Clock speed
- Concurrency
- Concurrent Collections
- Condition variable
- Confinement
- Copy-on-Write
- Correctness
- Critical Section
- Data race
- Deadlock
- Deadlock
- Fairness
- Fork/Join
- Immutability
- Join
- Live-lock
- Liveness
- Lock
- Memory Management
- Memory Model
- Monitor
- Monitor
- Mutable Shared Data
- Mutex
- Mutual Exclusion
- Non-Blocking
- Parallelism
- Process
- Producer/Consumer
- Race condition
- Reentrancy
- Safety
- Scheduler
- Semaphore
- Shared Memory
- Shared Object
- Starvation
- Synchronization
- Synchronized
- Synchronizers
- Synchronous
- Thread
- Thread Pools
- Thread Safety
- Transactional Memory
- Visibility
- Volatile

## Concepts of Concurrent Programming

- Shared memory and Distributed memory
- Synchronization and Locks
    - Mutex
    - Semaphore
    - Countdown lock
- Processes and Threads
- Executors
- Mutability
- Mutual Exclusion (Mutex)
- Problems
    - Race condition and Data race
    - Deadlock and Livelock
- Lock-free
    - Compare-And-Swap (CAS)
- Transactional memories
- Monitor Mechanism and Lock
- Monitor lock is Reentrant lock
- Reentrancy - when a thread acquires a lock which is already held (own)
  by the same thread

## Multithreading

- Is about multitasking
- Multitasking is about executing multiple tasks at the same time
- A task from the multitasking is usually associated with a thread
- Multithreading is about when a programs can run more than one thread at once
- Communication between threads are conducted via shared variables

## What Are Threads?

- Threads share process wide resources, like memory and file handles
- Each thread has its own program counter, stack and local variables
- Threads may be supported by
    - Having many hardware processors;
    - By time slicing a single hardware processor;
    - By time slicing many hardware processors;

## States Of A Thread

- NEW
- RUNNABLE
- BLOCKED
- WAITING
    - Object.wait()
    - Thread.join()
- TIMED_WAITING
    - Object.wait()
    - Thread.join()
    - Thread.sleep()
- TERMINATED

| State         | Description                                          |
|---------------|------------------------------------------------------|
| NEW           | a thread is created, but not yet started             |
| RUNNABLE      | a thread is executing in JVM                         |
| BLOCKED       | a thread is blocked for waiting a monitor lock       |
| WAITING       | a thread is waiting indefinitely another thread      |
| TIMED_WAITING | a thread is waiting some curtian time another thread |
| TERMINATED    | a thread is exited                                   |

## Properties of a Thread

- An identifier long type (unique within jvm)
- A name
- A priority
- A state (type of java lang thread state)
- A thread group

## Methods of Thread

### Thread.start() vs Thread.run()

|                                  | Create a new thread                               | Twice call                         |
|----------------------------------|---------------------------------------------------|------------------------------------|
| Thread.start()                   | Yes                                               | throws IllegalThreadStateException |
| Thread.run()                     | No                                                |                                    |
| java.lang.Thread.currentThread() | Returns the current thread (from colling context) |                                    |

## Object.wait(), Object.notify() and Object.notifyAll()

- They are defined in the Object class
- In Producer-Consumer threads interactions
- Used inside while loop, instead if condition
- Must be called from synchronized context
- A thread must hold the lock on the object it's going to call wait() and notify() method
- If a thread call without holding the lock then they will throw IllegalMonitorStateException
- wait() methods change state of the colling thread to WAITING and releases a lock
- Common pattern to call wait() from while loop.

```
 synchronized (theSharedObject) { 
     while (condition) {
        theSharedObject.wait();
     } 
    // do something
 }
``` 

## Object.wait() vs Thread.sleep()

- Class belongs methods: the wait() method is an instance method, when sleep() is static and belongs to the current
  executing thread
- Context: the wait() method can be called only from synchronuzed context, the sleep() can be called from any context
- Locking: the wait() method release the lock on an object and gives others chance to execute, the sleep()
  does not release the lock of an object for specified time or until interrupt
- Wake up condition: a waiting thread can be awake by notify() or notifyAll() method. A sleeping can be awakened by
  interrupt or time expires.

| Concept           | Sleep                                                                      | Wait                                            |
|-------------------|----------------------------------------------------------------------------|-------------------------------------------------|
| Class belongs     | java.lang.Thread                                                           | java.lang.Object                                |
| Context           | Called from any context                                                    | Only synchronized context                       |
| Locking           | Does not release the lock for specified time  or until interrupt           | Releases the lock                               |
| Wake up Condition | When time expires or due to interruption                                   | Awake by call to notify() or notifyAll() method |
| Execution         | Will pause the current running thread not the object on which it is called | continues till a specific condition holds true  |

## Interrupting Threads

## Task Types Executed By Threads

- Runnable
- Callable
- Future
- FutureTask

### Runnable

### Callable

### Future

### FutureTask

## The Shutdown Hook Thread

- Is invoked implicitly when before a JVM shuts down
- Clean up action is an example of usage.
- Process Scheduling and Dispatching

## Synchronization

### Synchronized method vs Synchronized block

- Synchronized method:

```
synchronized void aMethod() {
    /* safe code */
}
``` 

- synchronized block:

```
aMethod() {
   synchronized(aLockObj) {
        /* safe code */
   }
}
```

- Synchronized method and synchronized block codes are equal
- Methods in interfaces can not be declared as synchronized
- Synchronized methods not automatically inherited by subclasses methods
- Constructors can not be marked synchronized
- Constructors may have inside synchronized blocks

## Blocking Queues

## Thread-Safe Collections

## Callables and Futures

## Executors

## Synchronizers

## Threads and Swing

## Dealing with InterruptedException

- Blocking Method and Ordinary Method execution
- Cancellation mechanism

## Dataflow Graph

## Throughput and Latency

## Non-Blocking algorithms

## Concurrency

## Parallelism

- Parallelizable and Non-parallelizable Problems
- Divide and Conquer, Recursive algorithms
- Parallel processing data

## Multiprocessor programming (data processing)

- Concurrent data processing
- Parallel data processing

## Process and Threads

## Thread Safety

- Atomicity
- Race condition and Data Race
- Compound operation/*read-modify-write*
- Locking
- Synchronization and Locking

## Sharing Memory Between Threads

- Mutable
- Immutable
- Critical section

## Common Problems

- Data race
- Deadlock
- Live-lock
- Resource starvation
- Priority inversion

## Producers/Consumers

## Readers/Writers

## Blocking Synchronization

## Non-Blocking Synchronization

## Visibility

## Customization of Thread Pool

## Testing concurrent application

## Design of Concurrent programming

## Patterns Of Concurrent Programming

- Signaling
- Guarded suspension (wait()/notify())
- Rendezvous
- Mutex
- Multiplex
- Barrier
- Double-checked locking
- Read-write lock
- Thread pool
- Thread local storage

## Times

## Critical section

## Firmness

## Multiple request (short-living) handling approaches

- Thread-Per-request
- Thread Pool (Work queue)
    - WorkQueue is a Queue of PoolWorker(s)
    - PoolWorker is a Thread
- Single-Background-Thread

**Concurrent Collections**

Map

- ConcurrentMap
    - ConcurrentHashMap
- Functionally like Hashtable
- Hash table based
- Retrieval/Update concurrent operations
- Thread-Safe for all operations
- ***Retrieval***(get) operation is ***Lock-free***
- ***Dynamically-expanded*** on too many Collision
- **Bulk** operations

## Sharing Data (Object)

- Shared Variables
    - Instance fields
    - Static fields
    - Elements of array
- Non-Shared variables
    - Local variables
    - Parameters of method
    - Exception handler parameters

- **Visibility**

**Synchronization by Primitives** (aka Synchronizers)

- Lock(s)
    - ReentrantLock
    - ReadWriteLock
    - Condition
- CountDownLatch
- CyclicBarrier
- Phaser

## Programmatic locking

- Lock interface
- ReentrantLock
- ReadWriteLock

### Lock interface

### ReentrantLock

Features

- Interruptibility (explicit)
- Fairness
- tryLock
- get list of all waiting threads

### ReadWriteLock

Features

- readLock
- writeLock

### Benefits of ReentrantLock over synchronized

- Ability the lock for interruptibility
- Ability to timeout while waiting for lock
- Power to create fair lock
- API to get list of waiting thread for lock
- Flexibility to try for lock without blocking


- Semaphore
- Latches (CountDownLatch, FutureTask)
- CyclicBarrier
- Phaser
- Confinement of data into a Thread

Implementation

> **ThreadLocal**
>
> currently executing thread

## Exceptions on multithreading processing

- IllegalMonitorStateException
- InterruptedException
- ConcurrentModificationException

## Immutability

- No need to exclusion/protection of object’s state

## Synchronization

- Dynamical exclusion/protection of object’s state

## Confinement

- Structural exclusion/protection of object’s state

## Issues of violating visibility

- Stale data
    - Wrong computation results
    - Unexpected exceptions
    - Corrupted data structure
    - Infinite loop
- Non-Atomic 64-bit read/write operations (unless volatile or locked)
    - Long and double for
    - Two separate 32-bit operations
- Locking for Visibility
- Volatile for Visibility
    - Reads returns always latest write
    - Uses cases
        - one writer thread and many reader threads

## Software Transactional Memory (STM)

- Confinements of thread
- Ad-hoc confinement:
    - implemented for a particular case by programmer
    - is fragile and less obvious but for some reason thread-safe
    - is not strong like Stack confinement or ThreadLocal confinement
- Stack confinement
    - Local variables of
        - Primitive types
        - Reference types (until published outside method)
- ThreadLocal confinement

## Fork/Join

- Divide-and-Conquer
- Work-stealing approach

## Classes and Interfaces

- ForkJoinPool
- PoolUtil
- ForkJoinTask
    - RecursiveAction
    - RecursiveTask
- General Methods of ForkJoinPool and ForkJoinTask
    - Pool generation methods
        - commonPool()
    - Task Execution methods
        - submit() and execute() return and void
        - fork() and join()
        - invoke() and invokeAll()
    - Computation of RecursiveAction and RecursiveTask
        - compute()

## Thread Pool Executor (Worker Model)

- Usage

    - Application servers: web servers, file servers, mail servers

    - Short-lived tasks

- Solutions

    - Threads per requests

    - Reusable of existing threads

- Pools of Worker Threads

- Queues of Tasks (Runnables)

    - ConcurrentLinkedQueue

    - LinkedBlockingQueue

- Pool size

- JDK API

    - Interfaces

        - Executor

        - ExecutorService

        - ScheduledExecutorService

        - ThreadFactory

    - Classes

        - AbstractExecutorService

        - Executors

        - ThreadPoolExecutor

        - ScheduledThreadPoolExecutor

***Why Thread Pools?***

- Effectively processing of arriving Tasks (short requests) from clients
  to Server (web, database etc.)

***How Thread Pools works?***

1. Submission of tasks

2. Execution of tasks
   **Processes**

Literature and Resources

Tag: process, tasks, multitasking, process API, inter-process
communication

A Process - is an instance of computer program/software that is being
executed

## Lifecycle of a Thread

- Create
- Start
- Stop/Suspend/Resume ← deprecated
- Terminate
- Cleanup

## Lifecycle of executors

- RUNNING
    - new tasks accepted
    - submitted tasks executing
- SHUTDOWN
    - new tasks rejected
    - tasks might be executing
- TERMINATED
    - new tasks rejected
    - no tasks executing

## Daemon Threads

## Stopping a Thread

- By Setting a Flag: boolean is done!
- By Interrupting: interrupt() and isInterrupted()

## Inter-Thread Notifications

## Scheduling of Threads

### Thread Priority based scheduling

## Scheduling of Tasks

- sleep()
- join()
- yield()
- wait()

## Models of Concurrent Programming

- Shared Memory model
    - Locks
    - Monitor
    - Transaction
- Transactional Memory (STM)
- Async Futures (Completable Futures/Promises/Dataflow)
- Scheduler/Dispatching model
- Message Passing model
    - Actor model
- Channel and CSP (Communicating Sequential Processes)
- Event-driven/Multiplexing/Event-Loop model
- Coroutines/Continuations (Lightweight threads)
- Petri nets

## Classification of the Concurrency Models

| Model                                    | OS Mechanism        | Scheduling  | Communication                         | Concurrent/Parallel | Example                     |
|------------------------------------------|---------------------|-------------|---------------------------------------|---------------------|-----------------------------|
| Threads & Mutexes                        | Threads             | Preemptive  | Shared Memory (locks)                 | C / P               | Mutex                       |
| Threads & Transactional Memory           | Threads             | Preemptive  | Shared Memory (commit/abort)          | C / P               | STM                         |
| Threads & Message Passing                | Threads             | Preemptive  | Message Passing                       | C / P               | ~Anonymous Actors           |
| Processes (OS) & IPC                     | Processes           | Preemptive  | Shared memory / Message Passing (IPC) | C / P               | Resque / Forking Webservers |
| CSP (communicating sequential processes) | Threads / Processes | Preemptive  | Message Passing (Channels)            | C / P               | Occam / Go channels         |
| Actors                                   | Threads             | Preemptive  | Message Passing (Mailbox)             | C / P               | Erlang / Celluloid          |
| Futures / Promises                       | Threads             | Cooperative | Message Passing (itself)              | C / P               | Oz / Dataflow variables     |
| Coroutines                               | One process/thread  | Cooperative | ? Message Passing                     | C (not parallel)    | Fibers                      |
| Evented                                  | One process/thread  | Cooperative | ? shared memory ?                     | C (not parallel)    | Event machine               |

- <sup>Models can be coerced into being used slightly differently (use
  message passing instead of channels / implement with processes vs
  threads / use evented + multiple threads / IPC with shared mem / futures
  and promises async single threaded / etc), this is a generic attempt
  to classify main models simply.</sup>

- <sup>Parallel means if only one instance of the model is running: can
  it work in "parallel"? Not "can you parallelize the model", nor "can
  you parallelize one component" (eg, thread/actor/etc).</sup>

- <sup>Processes are not "concurrent processes", but rather OS
  processes.</sup>

## Thread Safety and Correctness

    - A class/object is thread-safe if it behaves correctly when accessed from multiple threads,
      regardless of the scheduling or interleaving of the execution of those threads by the runtime environment,
      and with no additional synchronization or other coordination on the part of the calling code.
    - Thread-Safe classes encapsulate any needed synchronization so that client codes no need to provide their own synchronization.

- mechanisms or means of concurrent programming: threads and locks
- thread safety - managing access to state: shared mutable state (fields)
- object's state it's object's data, stored in state variables
    - these are state variables or shared variables or heap variables
        1. instance variable - filed of instance of class (object's field)
        2. static variable - variable of class
        3. array elements
- the three ways correctly to share shared mutable state variables between many threads
    1. don't share the state variable
    2. make the state variable immutable
    3. synchronize access to the state variable
- Stateless objects are always thread-safe. A stateless object is an object with no fields.
    - parameters and local variables in methods within the stateless object are thread-safe since are stored in a
      stack of calling threads
- To preserve state consistency, update related state variables in a single atomic operation.
- Intrinsic locks in Java act as mutexes (or mutual exclusion locks)
    - When thread A attempts to acquire a lock held by thread B, A must wait, or block, until B releases it.
      If B never releases the lock, A waits forever.
- Every shared, mutable variable should be guarded by exactly one lock.

## Synchronized, Volatile and Atomicity

- Synchronization is about:
    1. Safe-publication/correct of shared mutable state between treads
    2. Visibility of new state between threads
- Locking can guarantee both visibility and atomicity;
- volatile variables can only guarantee visibility.

## Atomic variables from java.util.concurrency.atomic package

## Liveness and Performance

- Avoid holding locks during long running computations
- Operations at risk of not completing quickly such as network or console I/O

## Shared Memory or Heap Memory

- All instance fields, static fields, and array elements are stored in heap memory;
- Local variables, formal method parameters, and exception handler parameters are never shared between threads (
  and are unaffected by the memory model);

## Programs and Program Order

- Synchronization Order
- Happens-before Order
- Executions
- Well-Formed Executions

#### Reentrancy nature of lock

## Problems in Concurrent and Multithreading program

#### Race Condition

    A race condition occurs when the correctness of a computation depends on the relative timing or interleaving of
    multiple threads by the runtime;
    in other words, when getting the right answer relies on lucky timing.
    The most common type of race condition is check-then-act, where a potentially stale observation is used to make a
    decision on what to do next.

#### Data Race

    when multiple threads access the same of shared non-final data and at least one of those threads writes a new value to
    the shared data and there is no synchronization between reading and writing threads, which eventually leads to
    unexpected results to reader threads.
    code with data races has no useful defined semantics under the Java Memory Model.

#### Stale data

#### Reordering issue

#### DeadLock

    When a thread holds a lock forever, other threads attempting to acquire that lock will block forever waiting.
    When thread A holds lock L and tries to acquire lock M, but at the same time thread B holds M and tries to acquire L,
    both threads will wait forever. This situation is the simplest case of deadlock (or deadly embrace), where
    multiple threads wait forever due to a cyclic locking dependency.

#### LiveLock

    LiveLock is a form of liveness failure in which a thread, while not blocked, still cannot make progress because it
    keeps retrying an operation that will always fail.

#### Resource Starvation

#### Priority Inversion

## The Mechanisms for communicating between threads

#### On shared resources

- via synchronized keyword (built-in implementation by monitor);
- via volatile keyword (access modifier);
- Synchronizer utility objects
    - Additional synchronization, high-level objects
    - java.util.concurrent package, provide alternative ways of synchronization

### Wait Set and Notification

## Thread execution Interruptions

### Interactions of Waits, Notification, and Interruption

## Sleep and Yield

## Waiting for threads to finish their execution

- Thread.join()
- ExecutorService.shutdown() with ExecutorService.awaitTermination()
- CountDownLatch
- ExecutorService.invokeAll(): List of Future objects
- ExceutorCompletionService

## Atomic and Non-Atomic Read/Write operations

- Read and write operations to
    - primitive variables (except long and double)
    - reference variables
    - variables declared as volatile

### Non-Atomic Treatment of double and long

- Writes and reads of non-volatile long and double values are not atomic.
- Writes to and reads of references are always atomic, regardless of whether they are implemented as 32-bit or 64-bit
  values.
    - But programmers are encouraged to declare shared 64-bit values as volatile or synchronize their programs
      correctly to avoid possible complications.

## Safe Publication

### Publication and Escape

    Do not allow the this reference to escape during construction.

- The most useful policies for using and sharing objects in a concurrent program are:
  1.Thread-confined. A thread-confined object is owned exclusively by and confined to one thread,
  and can be modified by its owning thread.
  2.Shared read-only. A shared read-only object can be accessed concurrently by multiple threads without additional
  synchronization,
  but cannot be modified by any thread. Shared read-only objects include immutable and effectively immutable objects.
  3.Shared thread-safe. A thread-safe object performs synchronization internally,
  so multiple threads can freely access it through its public interface without further synchronization.
  4.Guarded. A guarded object can be accessed only with a specific lock held.
  Guarded objects include those that are encapsulated within other thread-safe objects
  and published objects that are known to be guarded by a specific lock.# Java Memory Model (JMM)

## Java Memory Model (JMM)

    - Specifies when the actions of one thread on memory are guaranteed to be visible to another thread
    - Defines a partial ordering known as 'happens-before' on all actions within a program
    - The 'happens-before' relationship ensures that there is a consistent order among operations
    - This guarantees that if action A happens before action B, the results of A are visible to B, and vice versa
    - Note that, in the absence of synchronization, very strange things can happen when threads access shared data

### Happens-before orderings guaranteed operations

- An _Unlock_ on a Monitor Happens before _Lock_ on that Monitor
- A Write on a _Volatile_ field Happens before every subsequent Write on that field
- A call to _start()_ method on a thread happens-before any actions in the started thread
- All actions in a thread happen-before any other thread successfully returns from a _join()_ on that thread
- The default initialization of any object happens-before any other actions (other than default-writes) of a program
- Flushing to main memory is happening after releasing acquired monitor

### Happens-before orderings guaranteed operations by the class library

- _Placing an item_ in a thread-safe collection happens-before another thread retrieves that item from the collection;
- _Counting down_ on a CountDownLatch happens-before a thread returns from await on that latch;
- _Releasing a permit_ to a Semaphore happens-before acquiring a permit from that same Semaphore;
- Actions taken by the task represented by a Future happens-before another thread successfully returns from Future.get;
- _Submitting a Runnable or Callable to an Executor_ happens-before the task begins execution; and
- _A thread arriving at a CyclicBarrier or Exchanger_ happens-before the other threads are released from that same
  barrier or exchange point. If Cyclic-Barrier uses a barrier action, arriving at the barrier happens-before the barrier
  action, which in turn happens-before threads are released from the barrier.

### Ordering instruction (happens-before)

- Volatile read/write
- Lock/unlock
- Program order
- Execution order
- Compiler Reordering
    - for the sake of optimization
    - doing instructions simultaneously by CPU

### How to prevent Reordering? via Synchronization actions

- synchronized
- volatile
- final/immutability
- atomic

### Problems

    - the compiler may generate instruction code in differ in order than it's written in source code;
    - variables can be stored in registers instead of main memory
    - cashing may vary order of writing to the variable
    - since until re-ordering does not impact to final result if those were executed in that order which were written (
      in single threaded environment)

### Solution

    In order to provide unified memory model for Java developers by hiding those different OS or Hardware Memory

### Model

    JMM specifies when the actions of one thread on memory are guaranteed to be visible to another.

### Reordering

### Weak and strong memory models

### Happens before

- unlock before lock on the same monitor
- writes before reads on the same volatile
- start
- join

## Volatile (field modifier)

- Is a field modifier
- Solves the updated value visibility problem (but not Atomicity)
- Makes sure that other thread can see a change made by another thread
- Declaring a variable as volatile means that modifying its value immediately affects the actual memory storage for the
  variable
- Write/Read operation is synchronized but non-atomic operations is not synchronized.
- Compile-Time Error occurs when a volatile variable is declared also as final

## Concurrent Collection Interfaces

### BlockingQueue<E>

    A Queue that additionally supports operations that wait for the queue to become non-empty when retrieving an element, and wait for space to become available in the queue when storing an element.

### BlockingDeque<E>

    A Deque that additionally supports blocking operations that wait for the deque to become non-empty when retrieving an element, and wait for space to become available in the deque when storing an element.

### ConcurrentMap<K,V>

    A Map providing thread safety and atomicity guarantees.

### ConcurrentNavigableMap<K,V>

    A ConcurrentMap supporting NavigableMap operations, and recursively so for its navigable sub-maps.

## Concurrent Collection Classes

### Blocking Concurrent Collection Classes

#### LinkedBlockingQueue

#### LinkedBlockingDeque

#### ArrayBlockingQueue

#### PriorityBlockingQueue

### Non-Blocking Concurrent Collection Classes

#### ConcurrentHashMap

#### ConcurrentLinkedQueue

#### ConcurrentLinkedDeque

#### ConcurrentSkipListMap

#### ConcurrentSkipListSet

#### CopyOnWriteArrayList

#### CopyOnWriteArraySet

| Classes               | Interfaces                                                                               | Mechanism                                                                | Sorted? | Blocking? | Backed-on |
|-----------------------|------------------------------------------------------------------------------------------|--------------------------------------------------------------------------|---------|-----------|-----------|
| ConcurrentHashMap     | Map & ConcurrentMap                                                                      | Lock only on adding/updating segment, but don't for retrieval operations | No      | No        |           |
| ConcurrentLinkedQueue | Queue                                                                                    | compare-and-swap (CAS)                                                   | No      | No        |           |
| ConcurrentLinkedDeque | Deque                                                                                    | compare-and-swap (CAS)                                                   | No      | No        |           |
| ConcurrentSkipListMap | Map </br> SortedMap  </br> NavigableMap </br> ConcurrentMap </br> ConcurrentNavigableMap | compare-and-swap (CAS)                                                   | Yes     | No        |           |
| ConcurrentSkipListSet | Set </br> </br> SortedSet </br> NavigableSet                                             | compare-and-swap (CAS)                                                   | Yes     | No        |           |
| CopyOnWriteArrayList  | List                                                                                     | copy-on-write                                                            | No      | No        | array     |    
| CopyOnWriteArraySet   | Set                                                                                      | copy-on-write                                                            | No      | No        |           |
| LinkedBlockingQueue   | Queue </br> BlockingQueue                                                                | Lock                                                                     | No      | Yes       |           |
| LinkedBlockingDeque   | Deque </br> BlockingQueue                                                                | Lock                                                                     | No      | Yes       |           |

    The Concurrent collections are implemented on bocking and non-blocking thread-safe operations

## Blocking Concurrent Collection Classes

    This kind of collection includes operations to add and removedata.
    If the operation can't be made immediately, because the collection is full or empty, the thread that makes the
    call will be blocked until the operation can be made.

### Blocking Queue (FIFO) and Deque (FIFO & LIFO)

- BlockingQueue (interface)
    - ArrayBlockingQueue
    - LinkedBlockingQueue
    - PriorityBlockingQueue
    - BlockingDeque (interface)
        - LinkedBlockingDeque

### BlockingQueue methods

| Throws  | exception | Special value | Blocks	         | Times out            |
|---------|-----------|---------------|-----------------|----------------------|
| Insert  | add(e)	   | offer(e)      | put(e)	         | offer(e, time, unit) |
| Remove  | remove()  | poll()	       | take()	         | poll(time, unit)     |
| Examine | element() | peek()        | not applicable	 | not applicable       |

## Non-Blocking Concurrent Collection Classes

    This kind of collection also includes operations to add andremove data.
    If the operation can't be made immediately, the operation returns a null value or throws an exception, but the thread that makes the call won't be blocked.

### Concurrent List implementations

| List                 | Mechanism               | Based on |
|----------------------|-------------------------|----------|
| CopyOnWriteArrayList | ReentrantLock, blocking | array    |

### Concurrent Set implementations

| Set                   | Mechanism                     | Based on              |
|-----------------------|-------------------------------|-----------------------|
| CopyOnWriteArraySet   | ReentrantLock, blocking       | CopyOnWriteArrayList  |
| ConcurrentSkipListSet | AtomicReference, non-blocking | ConcurrentSkipListMap |

### Concurrent Map implementations

| ConcurrentMap & ConcurrentNavigableMap | Mechanism                     | Based on |
|----------------------------------------|-------------------------------|----------|
| ConcurrentHashMap                      | AtomicReference, non-blocking |          |
| ConcurrentSkipListMap                  | AtomicReference, non-blocking |          |

### Concurrent (Non-Blocking) Queue (FIFO) & Deque (FIFO & LIFO) implementations

| Implementations       | Mechanism              | Based on     | Atomic | happen-before                       |
|-----------------------|------------------------|--------------|--------|-------------------------------------|
| ConcurrentLinkedQueue | compare-and-swap (CAS) | linked nodes |        | write/add/update to read operations |
| ConcurrentLinkedDeque | compare-and-swap (CAS) | linked nodes |        | write/add/update to read operations |

**Synchronization mechanisms in Java**

Literature and resources

1. [***Mastering Concurrency Programming with Java
   8***](https://www.safaribooksonline.com/library/view/mastering-concurrency-programming/9781785886126/),
   by Javier Fernández González

2. [***Utility classes commonly useful in concurrent
   programming***](https://docs.oracle.com/javase/8/docs/api/index.html?java/util/concurrent/package-summary.html)

3. [***Explicit
   Locks***](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/package-summary.html)

4. [***Atomic
   variables***](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/package-summary.html)

<!-- -->

1. What is Synchronization?

2. What gives/does Synchronization?

    1. Mutual Exclusion (Mutex) between threads

    2. Write/Read Visibility of shared memory between threads

    3. Write/Ready Consistency of shared memory between threads

    4. Happens-Before (Write/Read) Actions/Memory Operations guarantee

<!-- -->

1. Synchronization mechanisms

    1. Monitor/Intrinsic lock

    2. Volatile variable

    3. Memory model

    4. Synchronization Primitives/Utilities (partially lock and
       synchronizer objects)

2. Monitor/Intrinsic lock

    1. synchronized block

    2. synchronized method

    3. *wait-and-notify*

3. Volatile variable

4. Memory model

    1. Memory inconsistency

    2. “*happens-before*” relationships

5. Synchronization Primitives (partially lock)

    1. Lock (explicit) objects

        1. ReentrantLock

        2. ReadWriteLock

        3. Lock objects vs Mutex (locking on Monitor)

        4. Condition variable

    2. Semaphore

    3. CountDownLatch

    4. BarrierCycle

    5. Phaser

    6. Exchanger

6. ReentrantLock

7. ReadWriteLock

8. Semaphore

9. CountDownLatch

10. BarrierCycle

11. Phaser

12. Exchanger

13. Notifications and interaction mechanisms

    1. *wait-and-notify of Object monitor*

    2. *await-and-signal of* *Condition*

> **ReentrantLock**

*Mechanisme*

- *Count* of holding lock (increase/disguise by 1)

-

> **Mutex vs ReentrantLock**

| **Mutex**                                                        | **Reentrant**                                                 |
|------------------------------------------------------------------|---------------------------------------------------------------|
| Lock on Monitor                                                  | Lock on Lock object                                           |
| *No way to interrupt* waiting Thread                             | *Interruptibility* of waiting Thread                          |
| *Deadlock* issue                                                 | *Livelock* issue                                              |
| No guarantee that *long waiting* thread can capture lock monitor | Long waiting thread can capture lock instance (*fair policy*) |
| Blocking nature                                                  | Unblocking nature by *tryLock()* method                       |

> **ReadWriteLock**

*Implementation*

- **ReentrantReadWriteLock**

*Mechanisme*

- readLock - may be hold by multiple read threads

- writeLock - exclusive lock, only one thread can hold the lock at the
  same time

## java.util.concurrent package (The Concurrency API)

- Atomic classes
- Locks
- Thread-pools and Executors
- Blocking Queues
- Latches
- Concurrent Data Structures

## Happens-Before relation

- reordering actions
- on memory operations
- (Reads/Writes of shared variables)
- results of a write by one thread are guaranteed to be visible to a read by another thread only
  Happens-before relationships:
- synchronized
- volatile constructs: writing happens before reading
- Thread.start()
- Thread.join()
- Single thread rule: Each action in a thread happens-before every action in that thread that comes later in the
  program's order.
- An unlock (synchronized block or method exit) of a monitor happens-before every subsequent lock (synchronized block or
  method entry) of that same monitor. And because the happens-before relation is transitive, all actions of a thread
  prior to unlocking happen-before all actions subsequent to any thread locking that monitor.
- A write to a volatile field happens-before every subsequent read of that same field. Writes and reads of volatile
  fields have similar memory consistency effects as entering and exiting monitors, but do not entail mutual exclusion
  locking.
- Thread#start(): A call to start on a thread happens-before any action in the started thread.
- Thread#join(): All actions in a thread happen-before any other thread successfully returns from a join on that thread.

### The methods of all classes in java.util.concurrent and its subpackages extend these guarantees to higher-level synchronization

- Actions in a thread prior to placing an object into any concurrent collection happen-before actions subsequent to the
  access or removal of that element from the collection in another thread.
- Actions in a thread prior to the submission of a Runnable to an Executor happen-before its execution begins.
  Similarly, for Callables submitted to an ExecutorService.
- Actions taken by the asynchronous computation represented by a Future happen-before actions subsequent to the
  retrieval of the result via Future.get() in another thread.
- Actions prior to "releasing" synchronizer methods such as Lock.unlock, Semaphore.release, and CountDownLatch.countDown
  happen-before actions subsequent to a successful "acquiring" method such as Lock.lock,
  Semaphore.acquire,Condition.await, and CountDownLatch.await on the same synchronizer object in another thread.
- For each pair of threads that successfully exchange objects via an Exchanger, actions prior to the exchange() in each
  thread happen-before those subsequent to the corresponding exchange() in another thread.
- Actions prior to calling CyclicBarrier.await and Phaser.awaitAdvance (as well as its variants) happen-before actions
  performed by the barrier action, and actions performed by the barrier action happen-before actions subsequent to a
  successful return from the corresponding await in other threads.

## Thread Pools and Work Stealing

## ThreadPoolExecutor

### Usage and Advantages

- Reducing Performance overhead for creating threads per request
- Thread management
- Thread and Task statistics
- Factory methods
    - Executors.newFixedThreadPool()

## ExecutorService Interface

| Method                                                                 | Description                                                                                                                                         |
|------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------|
| void execute(Runnable command)                                         | Executes Runnable task at some point in future.                                                                                                     |
| Future<?> submit(Runnable task)                                        | Executes Runnable task at some point in future and returns Future representing task.                                                                |
| <T> Future<T> submit(Callable<T> task)                                 | Executes Callable task at some point in future and returns Future representing pending results of task.                                             |
| <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) | Executes given tasks and waits for all tasks to complete. Returns List of Future instances in same order in which they were in original collection. |
| <T> T invokeAny(Collection<? extends Callable<T>> tasks)               | Executes given tasks and waits for at least one to complete.                                                                                        |
| boolean isShutdown()                                                   | Returns true if this executor has been shut down.                                                                                                   |
| boolean isTerminated()                                                 | Returns true if all tasks have completed following shut down.                                                                                       |
| void shutdown()                                                        | Initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted.                                  |

## Implementations of ExecutorService Interface

| Class (implementation)      | Description                                                                                              |
|-----------------------------|----------------------------------------------------------------------------------------------------------|
| ThreadPoolExecutor          | pooled threads                                                                                           |
| ScheduledThreadPoolExecutor | pooled threads  with ability to schedule commands to run after a given delay, or to execute periodically |
| ForkJoinPool                |                                                                                                          |

### ThreadPoolExecutor

### ScheduledThreadPoolExecutor

### ForkJoinPool

## Intrinsic Lock (or Monitor Lock)

## Synchronization-Based, Blocked Concurrency

- Synchronization is based/built-in on idea of Intrinsic lock or Monitor lock.
- Intrinsic lock = Monitor lock = Monitor.
- There are two Aspects of synchronization:
    1. exclusive access to object's state
    2. happens-before relationships (visibility)
- As long as a thread owns an intrinsic lock, no other thread can acquire the same lock.
- The other thread will block when it attempts to acquire the lock.

### Approaches of the Monitor Lock

- Synchronized Methods
- Synchronized Statements

## Problems in Concurrent and Multithreading Programming

- Race Condition
- Data Race
- DeadLock
- LiveLock
- Resource Starvation
- Priority Inversion

## Race Condition

- May occur when the correctness of a computation depends on the relative timing or interleaving of multiple threads by
  the runtime
- Getting the right answer relies on lucky timing.
- An example of race condition is check-then-act, where a potentially stale observation is used to make a decision on
  what to do next

## Data Race

- Multiple threads access the same of mutable shared data
- At least one of those threads writes a new value to the data
- No synchronization between reading and writing threads
- Leads to unexpected results to reader threads
- Code with data races has no useful defined semantics under the Java Memory Model

## DeadLock

- When a thread holds a lock forever, other threads attempting to acquire that lock will block forever waiting
- When thread A holds lock L and tries to acquire lock M, but at the same time thread B holds M and tries to acquire L,
  both threads will wait forever
- This situation is the simplest case of deadlock (or deadly embrace), where multiple threads wait forever due to a
  cyclic locking dependency

## LiveLock

- Is a form of liveness failure in which a thread, while not blocked, still cannot make progress because it keeps
  retrying an operation that will always fail

## Resource Starvation

## Priority Inversion

## Synchronizer Primitives

- Nonblocking synchronization attempts (tryLock) as well as blocking versions.
- Optional timeouts, so applications can give up waiting.
- Cancellability via interruption, usually separated into one version of acquire that is cancellable, and one that
  isn't.

### The Synchronizer Primitives from java.util.concurrent package

| Synchronizer   | Description                                              |
|----------------|----------------------------------------------------------|
| Lock           |                                                          |
| Semaphore      | controls access to one or more shared resources.         |
| Phaser         | is used to support a synchronization barrier.            |
| CountDownLatch | allows threads to wait for a countdown to complete.      |
| Exchanger      | supports exchanging data between two threads.            |
| CyclicBarrier  | enables threads to wait at a predefined execution point. |

### Semaphore

    controls access to one or more shared resources

### Phaser

    is used to support a synchronization barrier

### CountDownLatch

    allows threads to wait for a countdown to complete

### Exchanger

    supports exchanging data between two threads

### CyclicBarrier

    enables threads to wait at a predefined execution point

## ReentrantLock

- Mechanism
    - Count of holding lock (increase/disguise by 1)

## Mutex vs ReentrantLock

| Mutex                                                          | Reentrant                                                      |
|----------------------------------------------------------------|----------------------------------------------------------------|
| Lock on Monitor                                                | Lock on Lock object                                            |
| No way to interrupt waiting                                    | Thread Interruptibility of waiting Thread                      |
| Deadlock issue                                                 | Livelock issue                                                 |
| No guarantee that long waiting thread can capture lock monitor | Long waiting thread can capture lock instance (by fair policy) |
| Blocking nature                                                | Unblocking nature by tryLock() method                          |

## ReadWriteLock

### Implementation

- ReentrantReadWriteLock

### Mechanism

- readLock - may be hold by multiple read threads
- writeLock - exclusive lock, only one thread can hold the lock at the same time

## RunnableFuture

## Lock-free algorithms and Atomic Toolkit in Java**

1. Ordering
2. Volatile
3. Lock-free
4. Atomicity
5. Visibility
6. Compare And Swap (CAS) strategy

**Compare And Swap (CAS) Atomic Instruction**

Compare and swap:

This is a common <u>atomic instruction</u> that exists on many CPU
architectures. (x86: cmpxchg, SPARC: cas). It *compares a value in
memory with a value in a register, and if they match, overwrites the
value in memory with a third value. If successful, the operation sets a
status flag that can be used for branching.*

Compare and swap can be used to efficiently implement spinlocks.

See also Atomic instruction and Spinlock.

CAS works on three operands:

- Memory Location (M)
- The Existing Expected Value(A) of the variable
- The New Value (B) which needs to be Set

## Non-blocking Guarantees (Progress Conditions)

Blocking is undesirable for several reasons

     - dangers of deadlocks
     - reduced throughput in the system

## Wait-freedom

    A method is wait-free if every call is guaranteed to finish in a finite number of steps.
    If a method is bounded wait-free then the number of steps has a finite upper bound.

    From this definition it follows that wait-free methods are never blocking, therefore deadlock can not happen.
    Additionally, as each participant can progress after a finite number of steps (when the call finishes), wait-free
    methods are free of starvation.

## Lock-freedom

    Lock-freedom is a weaker property than wait-freedom.
    In the case of lock-free calls, infinitely often some method finishes in a finite number of steps.
    This definition implies that no deadlock is possible for lock-free calls. On the other hand,
    the guarantee that some call finishes in a finite number of steps is not enough to guarantee that all of them eventually finish.
    In other words, lock-freedom is not enough to guarantee the lack of starvation.

## Obstruction-freedom

    Obstruction-freedom is the weakest non-blocking guarantee discussed here. A method is called obstruction-free if there
    is a point in time after which it executes in isolation (other threads make no steps, e.g.: become suspended), it
    finishes in a bounded number of steps. All lock-free objects are obstruction-free, but the opposite is generally not
    true.

## Optimistic concurrency control (OCC)

    The OCC method/approach are usually obstruction-free
    The OCC approach is that every participant tries to execute its operation on the shared object,
    but if a participant detects conflicts from others, it rolls back the modifications, and tries again according to some schedule.
    If there is a point in time, where one of the participants is the only one trying, the operation will succeed.

## CompletableFuture

## CompletionService and ExecutorCompletionService

## Atomicity (or Linearizability)

## Explicit Locks in Java

Interfaces and classes providing a framework for locking and waiting for
conditions that is distinct from built-in synchronization and monitors.
The framework permits much greater flexibility in the use of locks and
conditions, at the expense of more awkward syntax.

- The
  [<u>Lock</u>](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/Lock.html)
  interface supports locking disciplines that differ in semantics
  (reentrant, fair, etc), and that can be used in non-block-structured
  contexts including hand-over-hand and lock reordering algorithms. The
  main implementation is
  [<u>ReentrantLock</u>](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReentrantLock.html).

- The
  [<u>ReadWriteLock</u>](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html)
  interface similarly defines locks that may be shared among readers but
  are exclusive to writers. Only a single implementation,
  [<u>ReentrantReadWriteLock</u>](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReentrantReadWriteLock.html),
  is provided, since it covers most standard usage contexts. But
  programmers may create their own implementations to cover nonstandard
  requirements.

- The
  [<u>Condition</u>](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/Condition.html)
  interface describes condition variables that may be associated with
  Locks. These are similar in usage to the implicit monitors accessed
  using Object.wait, but offer extended capabilities. In particular,
  multiple Condition objects may be associated with a single Lock. To
  avoid compatibility issues, the names of Condition methods are
  different from the corresponding Object versions.

- The
  [<u>AbstractQueuedSynchronizer</u>](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/AbstractQueuedSynchronizer.html)
  class serves as a useful superclass for defining locks and other
  synchronizers that rely on queuing blocked threads. The
  [<u>AbstractQueuedLongSynchronizer</u>](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/AbstractQueuedLongSynchronizer.html)
  class provides the same functionality but extends support to 64 bits
  of synchronization state. Both extend class
  [<u>AbstractOwnableSynchronizer</u>](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/AbstractOwnableSynchronizer.html),
  a simple class that helps record the thread currently holding
  exclusive synchronization. The
  [<u>LockSupport</u>](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/LockSupport.html)
  class provides lower-level blocking and unblocking support that is
  useful for those developers implementing their own customized lock
  classes.
  Flow

## Lock

### Lock Interface

Interfaces and classes providing a framework for locking and waiting for conditions that is distinct from built-in
synchronization and monitors. The framework permits much greater flexibility in the use of locks and conditions, at the
expense of more awkward syntax.
The Lock interface supports locking disciplines that differ in semantics (reentrant, fair, etc), and that can be used in
non-block-structured contexts including hand-over-hand and lock reordering algorithms. The main implementation is
ReentrantLock.
The ReadWriteLock interface similarly defines locks that may be shared among readers but are exclusive to writers. Only
a single implementation, ReentrantReadWriteLock, is provided, since it covers most standard usage contexts. But
programmers may create their own implementations to cover nonstandard requirements.
The Condition interface describes condition variables that may be associated with Locks. These are similar in usage to
the implicit monitors accessed using Object.wait, but offer extended capabilities. In particular, multiple Condition
objects may be associated with a single Lock. To avoid compatibility issues, the names of Condition methods are
different from the corresponding Object versions.
The AbstractQueuedSynchronizer class serves as a useful superclass for defining locks and other synchronizers that rely
on queuing blocked threads. The AbstractQueuedLongSynchronizer class provides the same functionality but extends support
to 64 bits of synchronization state. Both extend class AbstractOwnableSynchronizer, a simple class that helps record the
thread currently holding exclusive synchronization. The LockSupport class provides lower-level blocking and unblocking
support that is useful for those developers implementing their own customized lock classes.

### Monitor Mechanism and Lock

- Intrinsic Locks and Synchronization
- Monitor is a mechanism
- Lock or Mutex is data associated with Object
- Monitor lock is Reentrant lock
- Reentrancy - when a thread acquires a lock which is already held (own) by the same thread

Abstractions (interfaces)

- Lock
- ReadWriteLock

Implementations (classes)

- ReentrantLock
- StampedLock

ReentrantLock

- NonFair
- Fair
- Thread Parking and Unparking
- Usage in Data Structures

## Atomic

- java.util.concurrent.atomic
- state when in same time only one thread can read or write a resource.

Synchronization (a.k.a. called locking and unlocking)
Mutex - mutable execution
Modifier synchronized not allowed to constructor. Because the JVM ensures that only one thread can invoke a
constructor call (for a specific constructor) at a given point in time

The wait/notify mechanism

- communication between threads;

Lock(a.k.a) monitor

Synchronization (a.k.a called locking and unlocking)
Mutex - mutable execution
Modifier synchronized not allowed to constructor. Because the JVM ensures that only one thread can invoke a
constructor call (for a specific constructor) at a given point in time

### CAS (Compare And Set or Compare and Swap)

    - stands from Compare And Set or Compare and Swap 
    - updates the value in M to B on if only A exists in M, otherwise no

Optimistic locking

Three agreements of the CAS

- MemoryLocation
- OldValue from memory
- A NewValue

### AtomicBoolean

    A boolean value that may be updated atomically.

### AtomicInteger

    An int value that may be updated atomically.

### AtomicIntegerArray

    An int array in which elements may be updated atomically.

### AtomicIntegerFieldUpdater

    A reflection-based utility that enables atomic updates to designated volatile int fields of designated classes.

### AtomicLong

    A long value that may be updated atomically.

### AtomicLongArray

    A long array in which elements may be updated atomically.

### AtomicLongFieldUpdater

    A reflection-based utility that enables atomic updates to designated volatile long fields of designated classes.

### AtomicMarkableReference

    An AtomicMarkableReference maintains an object reference along with a mark bit, that can be updated atomically.

### AtomicReference

    An object reference that may be updated atomically.

### AtomicReferenceArray

    An array of object references in which elements may be updated atomically.

### AtomicReferenceFieldUpdater

    A reflection-based utility that enables atomic updates to designated volatile reference fields of designated classes.

### AtomicStampedReference

    An AtomicStampedReference maintains an object reference along with an integer "stamp", that can be updated atomically.

### DoubleAccumulator

    One or more variables that together maintain a running double value updated using a supplied function.

### DoubleAdder

    One or more variables that together maintain an initially zero double sum.

### LongAccumulator

    One or more variables that together maintain a running long value updated using a supplied function.

### LongAdder

    One or more variables that together maintain an initially zero long sum.

## Non-Blocking

- Functions
- Algorithms
- Data Structures

## Lock-Free

- Functions
- Algorithms
- Data Structures

## Wait-Free

- Functions
- Algorithms
- Data Structures

## Models of Non-Blocking algorithms

- Wait-free
- Lock-free
- Obstruction-freedom
