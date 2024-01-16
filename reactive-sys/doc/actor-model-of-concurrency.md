# Actor Model of Concurrency

## Literature and Resources

## Recommended reads

 - **Reactive Design Patterns,** by Roland Kuhn with Jamie Allen and Brian Hanafee, Manning Publications Co., ISBN 9781617291807, Feb 2017
 - **Akka in Action,** by Raymond Roestenburg and Rob Bakker, Manning Publications Co., ISBN: 9781617291012, September 2016

### Other reads about Akka and the Actor model

 - **Akka Cookbook,** by Héctor Veiga Ortiz & Piyush Mishra, PACKT Publishing, ISBN: 9781785288180, May 2017
 - **Mastering Akka,** by Christian Baxter, PACKT Publishing, ISBN: 9781786465023, October 2016
 - **Learning Akka,** by Jason Goodwin, PACKT Publishing, ISBN: 9781784393007, December 2015
 - **Reactive Messaging Patterns with the Actor Model,** by Vaughn Vernon, Addison-Wesley Professional, ISBN: 0133846830, August 2015
 - **Developing an Akka Edge,** by Thomas Lockney and Raymond Tay, Bleeding Edge Press, ISBN: 9781939902054, April 2014
 - **Effective Akka,** by Jamie Allen, O’Reilly Media, ISBN: 1449360076, August 2013
 - **Akka Concurrency,** by Derek Wyatt, artima developer, ISBN: 0981531660, May 2013
 - **Akka Essentials,** by Munish K. Gupta, PACKT Publishing, ISBN: 1849518289, October 2012
 - **Start Building RESTful Microservices using Akka HTTP with Scala,** by Ayush Kumar Mishra, Knoldus Software LLP, ISBN: 9781976762543, December 2017

## Videos

 - **Effective Akka HTTP,** by Johannes Rudolph, Reactive Systems Meetup Hamburg, November 2016
 - **Zen of Akka** - an overview of good and bad practices in Akka, by Konrad Malawski, ScalaDays New York, June 2016
 - **Learning Akka Videos,** by Salma Khater, PACKT Publishing, ISBN: 9781784391836, January 2016
 - **Building Microservice with AKKA HTTP (Video)**, by Tomasz Lelek, PACKT Publishing, ISBN: 9781788298582, March 2017

## Akka in Github

 - [Awesome Akka 1](https://github.com/homerquan/awesome-akka)
 - [Awesome Akka 2](https://github.com/ReactivePlatform/awesome-akka)
 - [Awesome Scala](https://github.com/lauris/awesome-scala)

# Blogs

 - A list of blogs and presentations curated by the Akka team.

# Classic Akka Actors is about

 - no type safety
 - sending/receiving message types can be any types

# Actor vs Thread

 - Actors are lightweight because they run on top of dispatchers
 - Actors aren’t necessarily directly proportional to the number of threads

# TDD with the Classic Akka Test module

 - Artifact: `com.typesafe.akka`:`akka-testkit`:`<version>`
 - Approaches and Use Cases
   - **Synchronous/Unit** Testing: `TestActorRef`
     - JUnit style test
     - is exclusively for use during unit testing in a `single-threaded` environment
     - possible to test the actual actor instance directly, just as testing normal objects.
     - overwrites:
       - the dispatcher to `CallingThreadDispatcher`.`global`
       - the `receiveTimeout` to `None`
   - **Asynchronous/Integration** Testing by using `TestKit`
     - actors are run using a normal dispatcher in a multithreaded environment
     - provides/contains an internal actor: `testActor`
     - `testActor` is the entry point for messages to be examined with the various `expectMsg...` assertions
     - `testActor` reference is obtained using the `getRef()`
     - Timing: when to assert expected values in the unit test
     - Actors are meant to be run in parallel on several threads
     - Statelessness:
       - An actor hides its internal state and doesn’t allow access to this state
       - Access should only be possible through the ActorRef
       - Calling a method on an actor and checking its state, which is something you’d like to be able to do when unit testing, is prevented by design
   - **Asynchronous/Integration** Testing by using `TestProbe` (Multiple Probe Actors)
     - is a wrapped-up TestKit
     - can be injected into message flows
   - `CallingThreadDispatcher`
   - Expecting Exceptions: `TestActorRef.receive(new Exception())` and `Assert.fail()`

# The Actor Model Principles (fundamental)
- Everything is an Actor
- In the Actor Model, an Actor is a first-class citizen
- An Actor has a mailbox to store data
- Actors should communicate with each other asynchronously
- Actors should communicate with each other in a non-blocking way
- Actors communicate with each other by sending messages
- All computations should be performed within an Actor
- An Actor can send or receive message to or from another Actor
- There is no direct communication between Actors
- Each Actor is identified using a unique name or address
- An Actor can send messages to other Actors whose addresses it has
- An Actor can have state or behavior or both
- An Actor can have state, but it's accessible by itself only, which means that only an Actor can modify its state; no other Actor or non-Actor can access or modify it—that's the beauty of the Actor Model
- An Actor should process only one message at a time
- An Actor should receive only one message at a time
- Messages are delivered arbitrarily, that is, messages are delivered to Actors in any order
- Messages are immutable objects, which means we cannot modify them once they are created
- An Actor can process any kind of messages
- Each message is delivered at most once only, which means a message is delivered from the sender Actor to the receiver Actor either zero times or once; so there is no chance of delivering duplicate messages in the Actor Model
 - When an Actor receives a message, based on the context, it does one or more of the following things:
    - It can change its state
    - It can change its behavior
    - It can change both its state and behavior
    - It can create some more Actors
    - It can send messages to other Actors
    - It can forward messages to other Actors
    - It can acknowledge a message to a sender Actor
    - It can decide what to do with the next message, that is, how to handle them

### Analogy between OOP vs FP vs Actor Model
- In the OOP paradigm, an object is a fundamental unit of computation.
- In the FP paradigm, a Function is a fundamental unit of computation.
- In the Actor Model paradigm, an Actor is a fundamental unit of computation.
- Like OOP's Object, `Actor = State + Behavior`

### ActorSystem (Akka) - Roles and Responsibilities
- It acts as runtime for all Actors
- It creates Actors
- It can stop Actors
- It supervises related Actors
- It creates threads and assigns them to the Actor's dispatcher to process the messages
- It manages the lifecycle of Actors
- It can shut down the whole Akka Actor environment
- It creates the following three base Actors to help other Actors:
    - Root Actor (/)
    - User Guardian Actor(/user)
    - System Guardian Actor(/system)
- It supervises or monitors those top-level Actors
- When we run ActorSystem.terminate(), it is responsible for terminating all the available Actors automatically

### An Akka Actor's main components under-the-hood:
- `ActorRef` - proxy for the Actor
- `Dispatcher` (`MessageDispatcher`)
    - `takes` the incoming message (from sender - actor or non-cator)
    - `publishes` that message to its Actor's mailbox message queue
    - `checks` whether its Actor is available or not to process that message
    - `picks up` the message `from the message queue` and `hands it over to its Actor`
    - follows the dispatcher design pattern
    - `sends` those messages to the `DeadLetter` actor (`If the required Actor is not available`)
- `MailBox`
    - is `a message queue` for an Actor
    - `stores` incoming messages
    - acts like a queue
    - each Actor has `its own mailbox`
    - messages are `picked up, read and processed` `one-by-one` `in oder of arrival` (default)
    - mailbox `types` (default - `Unbounded and Non-blocking`)
        - Bounded/Unbounded
        - Priority
        - Blocking/Non-blocking
- `Actor`
    - an actual `instance` of the actor
    - encapsulates `state` and `behavior`
    - `does NOT receive messages directly` from the outside world
    - it receives messages from `ActorRef` to `dispatcher` to `itself` only.

### The lifecycle of an Akka Actor
#### Lifecycle methods managed by Actor's Supervisor:
- `ActorSystem.actorOf()`
    - creates `top-level` Actors
- `ActorContext.actorOf()`
    - creates `child` (subordinate) Actors
- `Actor.receive()`
- `Actor.preStart()`
    - is invoked
        - immediately `after creating` a new Actor
        - before moving to the `Started` state
        - If an Actor is going to be `restarted by its parent` Actor
    - this method can be `overriden`
- `Actor.postStop()`
    - is invoked
        - immediately `after stopping` an Actor
        - before moving to the `Stopped` state
- `Actor.preRestart()`
    - is invoked before moving to the `Restarted` state
    - Actor picks up all its subordinate Actors and stops them
    - then it invokes its `postStop()` method
- `Actor.postRestart()`
    - when invoked, Actor enters into the `Restarted` state
    - makes a call to that Actor's `preStart()` method
- `ActorContext.stop()` or `ActorSystem.stop()`
    - shutting down this Actor and all Children gracefully and recursively
- `ActorSystem.terminate()`
    - shuts down the whole ActorSystem so that all of its Actors are stopped automatically

### Akka Actor Basic Operations
- `Create` an Actor
- `Send` messages
- `Receive` messages
    - during receive, an actor may `change` its internal `state` and `behavior`
- `Stop` an Actor
- `Become`/`Unbecoming` an Actor (actual in FSM DSL context)
- `Supervise` an Actor

### Sending messages approaches to an Actor
- `tell` (!) function
    - `Fire and Forget` model
    - sends a message `asynchronously` and `return immediately`
- `ask` (?) function
    - `Send and Receive` model (Ask pattern)
    - sends a message asynchronously and return `Future`
    - and retrieve results sometime in the future

### Replaying messages approaches from an Actor
- `Actor-to-Actor` communication
    - sender(): ActorRef
- `Actor-to-non-Actor` communication
    - when there is no `sender` and when akka actor tries to send a message, then the message goes to the `DeadLetter`

### Supervising Actors (in face of failure)
- is about `fault-tolerance` property
- follows to `let it crash` principle
    - instead of mixing fine-grained recovery, move that responsibility somewhere else - to Supervision
- allows to `declaratively` describe `what should happen when certain types of exceptions are thrown` in an actor
- a parent Actor takes a decision and may perform
    - `Resume`:
        - Resume an Actor or all of its children Actors
    - `Restart`:
        - Restarts an Actor or all of its children Actors
    - `Stop`:
        - Stops Actor or all of its children Actors permanently
    - `Escalate`:
        - If it cannot decide what to do, it escalates to its `supervisor` Actor `with the failure` and `fails itself`
