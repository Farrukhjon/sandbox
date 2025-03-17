# Memory Management and Garbage Collection in Java

<!-- TOC -->

* [Memory Management and Garbage Collection in Java](#memory-management-and-garbage-collection-in-java)
    * [Literature and Resources](#literature-and-resources)
    * [JVM](#jvm)
    * [Garbage Collection (GC)](#garbage-collection-gc)
        * [GC in Java versions](#gc-in-java-versions)
            * [Java < 8](#java--8)
            * [Java 8](#java-8)
            * [Java 9](#java-9)
            * [Java 11](#java-11)
            * [Java 12](#java-12)
            * [Java 14](#java-14)
            * [Java 15](#java-15)
    * [Execution](#execution)
    * [Memory/Data](#memorydata)
    * [Memory management (mm)](#memory-management-mm)
    * [JVM](#jvm-1)
    * [GC](#gc)
        * [Metrics of JVM Performance](#metrics-of-jvm-performance)
        * [Monitoring:](#monitoring)
    * [Glossary of performance terminology](#glossary-of-performance-terminology)

<!-- TOC -->

## Literature and Resources

- [Advanced Java Performance: Hotspot GC Tuning LiveLessons, by Monica Beckwith](https://www.safaribooksonline.com/library/view/advanced-java-performance/9780134653273/)
- [Garbage First Garbage Collector Tuning, by M. Beckwith](http://www.oracle.com/technetwork/articles/java/g1gc-1984535.html)
- [HotSpot - wiki](https://en.wikipedia.org/wiki/HotSpot)
- [Java Bytecode - wiki](https://en.wikipedia.org/wiki/Java_bytecode)
- [Java Classloader - wiki](https://en.wikipedia.org/wiki/Java_Classloader)
- [Java Garbage Collection Basics](http://www.oracle.com/webfolder/technetwork/tutorials/obe/java/gc01/index.html)
- [Java Garbage Collection handbook](https://plumbr.io/java-garbage-collection-handbook)
- [Java Performance Companion, by Charlie Hunt](https://www.safaribooksonline.com/library/view/java-performance-companion/9780133796896/)
- [Java Performance LiveLessons (Video Training), by Charlie Hunt](https://www.safaribooksonline.com/library/view/java-performance-livelessons/9780133443561/)
- [Java Performance, by Charlie Hunt](https://www.safaribooksonline.com/library/view/javatm-performance/9780132905244/)
- [Java Performance: The Definitive Guide, by Scott Oaks](https://www.safaribooksonline.com/library/view/java-performance-the/9781449363512/)
- [Java Platform, Standard Edition HotSpot Virtual Machine Garbage Collection Tuning Guide](https://docs.oracle.com/javase/8/docs/technotes/guides/vm/gctuning/toc.html)
- [Java Virtual Machine](https://en.wikipedia.org/wiki/Java_virtual_machine)
- [Memory Management and Garbage Collection](http://www.memorymanagement.org/)
- [The Garbage Collection Handbook, by E. Moss , A. Hosking , R. Jones](https://www.safaribooksonline.com/library/view/the-garbage-collection/9781315388007/)
- [The Java Virtual Machine Specification, Java SE 8/e, by A. Buckley, G. Bracha, F. Yellin , T. Lindholm](https://www.safaribooksonline.com/library/view/the-java-virtual/9780133922745/)
- [Under the Hood - Articles about the inner workings of Java technology](https://www.artima.com/underthehood/)
- [Understanding bytecode makes you a better programmer](https://www.ibm.com/developerworks/library/it-haggar_bytecode/index.html)
- [Understanding Java Garbage Collection and what you can do about it](https://www.youtube.com/watch?v=we_enrM7TSY)
- [Virtual Machine Showdown: Stack Versus Registers](https://www.usenix.org/legacy/events%2Fvee05%2Ffull_papers/p153-yunhe.pdf)

## JVM

    What is JVM?
    How is JVM made?
    How does JVM work?

Stack-based vs Register-based VMs
Stack machine

What is a Classloader?
How is a Classloader made?
How does a Classloader work?

What is Bytecode?
How is Bytecode made

## Garbage Collection (GC)

### How is memory allocated?

    The `new` keyword creates an object and allocates memory to the JVM `heap`.
    `Heap` is main `memory pool`, accessible to the whole of application.
    If there is not enough memory available in the pool, JVM attempts to release some memory from the heap using
    `garbage collection`. `OutOfMemoryError` is thrown if JVM cannot obtain enough memory and `JVM exists`.

### What is the difference between `heap` and `stack`?

    A: JVM memory split in two major parts, `the heap` and `the stack`.
    `The Heap` is main `memory pool`, accessible to the whole of application and all objects allocated to the heap.
    `The Stack` is the memory in which stored any `primitive` values, `references to objects` and `methods`.
    All method call, block of code, loops and functions call are stored in the stack. If there is no enough space in the
    stack
    and method call is recursively fill up the stack `StackOverflowError` is thrown.

### the size of the heap for the JVM?

    Using command line argument `-Xmx<size><prefix>` for `maximum size` and `-Xms<size><prefix>` for initial size.
    Where <size> is integer value and <prefix>  one of `K, M and G` for kilo, mega and gigo-bytes.

Q: Can you explicitly tell JVM `to perform grabage collection`?

A: Yes, using `System.gc()` or `Runtime.gc()` but in not guarantee than GC will be performed and also it's not
recommended
way to do GC, because `memory leaks` has chance be occurred.

### the finalize method do?

    When the JVM decides to GC the object it calls finalize methods of the object is there is no `references` to the object.

### GC in Java versions

#### Java < 8

    - Serial
    - Parallel
    - ParallelOld
    - CMS
    - iCMS

#### Java 8

    - G1

#### Java 9

    - Removed iCMS
    - G1 (Default GC)

#### Java 11

    - Epsilon
    - Z (Experimental)

#### Java 12

    - Shenandoah (Experimental)

#### Java 14

    - Remove CMS

#### Java 15

    - Shenandoah
    - Z

## Execution

Q: When a Java `program exit`?

A:
Java program `terminates` or `exists` only in two cases:

- All the `not daemon thread` terminate their execution
- If some thread invokes `Runtime.exit()` or `System.exit()`

### String Pool

    In Java a `String Pool` is a special `storage area` in `Java Heap`. When a string is created and if the string already
    exists
    in the pool, the `reference of the existsing string will be returnd`. instead of creating a new object and returning its
    reference.

## Memory/Data

- Allocation
    - Techniques
        - First fit
        - Buddy system
        - Sub-allocators
- De-allocation
    - Techniques
        - Tracing collectors
        - Reference counts
- Problems
    - Memory leak

## Memory management (mm)

## Levels

### Hardware mm

### Operating System mm

### Application mm

## Types

### Manual memory management

### Automatic memory management

## Garbage Collection: an object is reclaimed only when there is no pointer to it from a reachable object.

## by tracing collections

## Reference counting

## Parallel

## Concurrent

## Real-Time

## Marking

## mark-sweep

## mark-compact

## JVM

• What is?
◦ An Abstract Machine
◦ A Specification
◦ An Implementation
◦ A Run-time system
• What does?
◦ Operations
▪ Load compiled Byte-code
▪ Verify/Validate code
▪ Execute code
The Components of the JVM
• Class Loader
• Class/Method area
• Heap
• Stack
• Execution engine

## GC

• Fundamentals and Key Mechanism of GC
• High-level view to memory allocation
◦ a working Thread
▪ references to Heap objects from Stack
• references to/from objects inside Heap
◦ when?
▪ root set achievable/ not achievable objects
◦ Heap structure by
▪ Generations of Objects
• Young generation
◦ Eden
◦ Survivor spaces
▪ S0 ()
▪ S1
◦ new objects
◦ on fill minor GC
▪ Stop-the-World (STW) event on minor GC (always)
• Old (Tuned) generation
◦ Long (survived) living objects
◦ on fill major GC
▪ Stop-the-World (STW) event on minor GC
• Permanent generation
◦ metadata-space for app
◦ filled on run-time
◦ jre classes/objects allocation pace
◦ on fill full GC
• Algorithms of GC
◦ mark-sweep
◦ mark-compact
• Implementations of GC
◦ Serial
◦ Parallel
◦ CMS (Concurrent Mark Sweep)
◦ G1 (default in JDK 9)
• Performance characteristics of GC
◦ Throughput
◦ Predictability
◦ Footprint: the amount of used memory by GC
◦ Trade-off (balance) between
▪ Throughput
▪ Footprint
▪ Latency
• Stop-The-World Event
◦ Application is Stopped upon GC work
▪ Objects are “frozen” by
• Interval chunks
• Background

Heap versus Off-Heap
• int and Integer

Characteristics
int
Integer
Size
4 bytes (4*8=32 bits)
16 bytes (16*8=64 bits)

### Metrics of JVM Performance

### Monitoring:

• GC logs: -XX:+PrintGCDetails
• VisualGC of VisualVM
• -XX:+PrintApplicationConcurrentTime

## Glossary of performance terminology

• Throughput (of a system)
◦ Unit if information or data (bytes, kilobytes, megabytes etc) a System can Process (input, transform, output) in a
given period of Time
◦ High is best
◦ Mostly applicable/relevant in Data Pipeline Systems
◦ Measurable
• Latency (of a system)
◦ Delay of time (milliseconds, seconds etc.) a System can take to process ((input, transform, output)) a given of amount
data
◦ Low is best
◦ Mostly applicable/relevant in Request-Response Systems
◦ Measurable
• Capacity (of a system)
◦ Amount of data size (in Disk or RAM) a System can store
◦ Measurable
• Bandwidth (of a system)
◦ The Maximum I/O throughput
◦ Measurable
• Bottleneck (in a system)
◦ A situation when Demands/Requests of data/resource is higher/greater than Capacity of a system
◦ Demands/Requests > Capacity
◦ Measurable
• Fault tolerance (ability of a system)
◦ in the event of failure of one or more components of the system
▪ to Respond to the Failure
▪ to Recover from the Failure
▪ to Continue Operate (partially or fully)
• Fail-safe (system)
◦ ability of a system to go to Safe Status in the event of failure
• CAP
◦ Consistency
◦ Availability
◦ Partition tolerance
• Scalability
◦ ability of a system to increase/decrease its performance in demand of changes
• Scale In
◦ adding more CPUs and Memory within Application
◦ vertical scaling
• Scale Out
◦ distributing Application by adding into more computation nodes
◦ balancing incoming demands among distributed applications
• Overhead
◦ High cost a system pays to solve a problem by given memory/time
◦ Types
▪ Space/memory overhead
▪ Time processing overhead
• Utilization
• Efficiency
• Scalability
• Degradation

