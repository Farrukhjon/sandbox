# Design Patterns (Object-Oriented Software Design Patterns)

<!-- TOC -->
* [Design Patterns (Object-Oriented Software Design Patterns)](#design-patterns-object-oriented-software-design-patterns)
  * [Literature and Resources](#literature-and-resources)
  * [Creational patterns](#creational-patterns)
    * [Abstract factory](#abstract-factory)
    * [Builder](#builder)
    * [Factory method](#factory-method)
    * [Dependency Injection](#dependency-injection)
    * [Object pool](#object-pool)
    * [Prototype](#prototype)
    * [Singleton](#singleton)
  * [Behavioral patterns](#behavioral-patterns)
    * [Chain of Responsibility](#chain-of-responsibility)
    * [Command](#command)
    * [Interpreter](#interpreter)
    * [Iterator](#iterator)
    * [Mediator](#mediator)
    * [Memento](#memento)
    * [Null object](#null-object)
    * [Observer](#observer)
    * [State](#state)
    * [Strategy](#strategy)
    * [Template method](#template-method)
    * [Visitor](#visitor)
  * [Structural patterns](#structural-patterns)
    * [Adapter](#adapter)
    * [Bridge](#bridge)
    * [Composite](#composite)
    * [Decorator](#decorator)
    * [Facade](#facade)
    * [Flyweight](#flyweight)
    * [Proxy](#proxy)
  * [Concurrency patterns](#concurrency-patterns)
    * [Mutex](#mutex)
    * [Thread Pool](#thread-pool)
    * [Event Queue](#event-queue)
    * [Producer/Consumer](#producerconsumer)
    * [Semaphore](#semaphore)
    * [Read/Write Lock](#readwrite-lock)
    * [Double-Checked Locking](#double-checked-locking)
  * [Presentation patterns](#presentation-patterns)
    * [MVC](#mvc)
    * [MVP](#mvp)
    * [Flux](#flux)
    * [Front Controller](#front-controller)
  * [Persistent patterns](#persistent-patterns)
    * [DAO](#dao)
    * [Repository](#repository)
  * [Summary of the patterns](#summary-of-the-patterns)
    * [Creational patterns](#creational-patterns-1)
      * [Abstract factory](#abstract-factory-1)
      * [Builder](#builder-1)
      * [Factory](#factory)
      * [Prototype](#prototype-1)
      * [Singleton](#singleton-1)
    * [Structural patterns](#structural-patterns-1)
      * [Adapter](#adapter-1)
      * [Bridge](#bridge-1)
      * [Composite](#composite-1)
      * [Decorator](#decorator-1)
      * [Facade](#facade-1)
      * [Flyweight](#flyweight-1)
      * [Proxy](#proxy-1)
    * [Behavioral patterns](#behavioral-patterns-1)
      * [Chain of responsibility](#chain-of-responsibility-1)
      * [Command](#command-1)
      * [Interpreter](#interpreter-1)
      * [Iterator](#iterator-1)
      * [Mediator](#mediator-1)
      * [Memento](#memento-1)
      * [Observer](#observer-1)
      * [State](#state-1)
      * [Strategy](#strategy-1)
      * [Template method](#template-method-1)
      * [Visitor](#visitor-1)
<!-- TOC -->

## Literature and Resources

- [Design Patterns wiki](https://en.wikipedia.org/wiki/Design_Patterns)
- [Design Patterns in Java, By Petter Graff](https://learning.oreilly.com/videos/design-patterns-in/9781771374040)
- [Design Patterns: Elements of Reusable Object-Oriented Software, by GoF](https://www.safaribooksonline.com/library/view/design-patterns-elements/0201633612)
- [Effective Java, by J. Bloch](https://www.safaribooksonline.com/library/view/effective-java-third/9780134686097)
- [Head First Design Patterns, by E. Freeman](https://www.safaribooksonline.com/library/view/head-first-design/0596007124)
- [Design Patterns Explained: A New Perspective on Object-Oriented Design, 2/e, by A. Shalloway, James R. Trott](https://www.safaribooksonline.com/library/view/design-patterns-explained/0321247140)
- [Design Patterns in Java, by Douglas Schmidt](https://www.safaribooksonline.com/library/view/design-patterns-in/9780133489989)
- [Design patterns implemented in Java](http://java-design-patterns.com)
- [oodesign](http://www.oodesign.com/)
- [Patterns of Enterprise Application Architecture, by Martin Fowler](https://www.safaribooksonline.com/library/view/patterns-of-enterprise/0321127420/)
- [Design Patterns wiki](https://en.wikipedia.org/wiki/Design_Patterns)
- [Examples of GoF Design Patterns in Java's core libraries](https://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries)

## Creational patterns

- Abstract factory
- Builder
- Factory method
- Dependency Injection
- Object pool
- Prototype
- Singleton

### Abstract factory

### Builder

### Factory method

### Dependency Injection

### Object pool

### Prototype

### Singleton

## Behavioral patterns

- Chain of responsibility
- Command
- Interpreter
- Iterator
- Mediator
- Memento
- Null object
- Observer
- State
- Strategy
- Template method
- Visitor

### Chain of Responsibility

### Command

### Interpreter

### Iterator

### Mediator

### Memento

### Null object

### Observer

### State

### Strategy

### Template method

### Visitor

## Structural patterns

- Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy

### Adapter

### Bridge

### Composite

### Decorator

### Facade

### Flyweight

### Proxy

## Concurrency patterns

- Mutex
- Thread Pool
- Event Queue
- Producer/Consumer
- Semaphore
- Read/Write Lock
- Double-Checked Locking

### Mutex

### Thread Pool

### Event Queue

### Producer/Consumer

### Semaphore

### Read/Write Lock

### Double-Checked Locking

## Presentation patterns

- MVC
- MVP
- Flux
- Front Controller

### MVC

### MVP

### Flux

### Front Controller

## Persistent patterns

- DAO
- Repository

### DAO

### Repository

## Summary of the patterns

### Creational patterns

    helps to create objects loosely, rather than having to instantiate objects directly

#### Abstract factory

    groups object factories that have a common theme

#### Builder

    constructs complex objects by separating construction and representation

#### Factory

    method creates objects without specifying the exact class to create

#### Prototype

     creates objects by cloning an existing object

#### Singleton

     restricts object creation for a class to only one instance

### Structural patterns

    concern class and object composition. They use inheritance to compose interfaces and define ways to compose objects to obtain new functionality.

#### Adapter

      allows classes with incompatible interfaces to work together by wrapping its own interface around that of an already existing class

#### Bridge

      decouples an abstraction from its implementation so that the two can vary independently

#### Composite

      composes zeroormore similar objects so that they can be manipulated as one object

#### Decorator

      dynamically adds/overrides behaviour in an existing method of an object

#### Facade

      provides a simplified interface to a large body of code

#### Flyweight

      reduces the cost of creating and manipulating a large number of similar objects

#### Proxy

      provides a placeholder for another object to control access, reduce cost, and reduce complexity

### Behavioral patterns

    concerned about communication between objects

#### Chain of responsibility

      Delegate commands to a chain of processing objects

#### Command

      Create objects which encapsulate actions and parameters

#### Interpreter

      implements a specialized language

#### Iterator

      accesses the elements of an object sequentially without exposing its underlying representation

#### Mediator

      allows loose coupling between classes by being the only class that has detailed knowledge of their methods

#### Memento

      provides the ability to restore an object to its previous state undo))

#### Observer

      is a publish/subscribe pattern which allows a number of observer objects to see an event

#### State

      allows an object to alter its behavior when its internal state changes

#### Strategy

      allows one of a family of algorithms to be selected onthefly at runtime

#### Template method

      defines the skeleton of an algorithm as an abstract class, allowing its subclasses to provide concrete behavior

#### Visitor

     separates an algorithm from an object structure by moving the hierarchy of methods into one object