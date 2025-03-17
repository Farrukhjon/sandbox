# Object-Oriented Programming

<!-- TOC -->

* [Object-Oriented Programming](#object-oriented-programming)
    * [Literature and Resources](#literature-and-resources)
    * [Object model](#object-model)
        * [Class](#class)
        * [Subclass](#subclass)
        * [Interface](#interface)
        * [Constructor](#constructor)
        * [Methods/Behaviors](#methodsbehaviors)
        * [Fields/States](#fieldsstates)
        * [Identity](#identity)
        * [Abstraction](#abstraction)
        * [Encapsulation](#encapsulation)
        * [Inheritance](#inheritance)
        * [Polymorphism](#polymorphism)
    * [Class Design](#class-design)
    * [Design Principles](#design-principles)
    * [Idea of the OOP paradigm](#idea-of-the-oop-paradigm)
    * [What Is an Object?](#what-is-an-object)
    * [What Is a Class?](#what-is-a-class)
    * [Principles of OOP and Design](#principles-of-oop-and-design)
        * [Fundamentals/Basic principles](#fundamentalsbasic-principles)
            * [Abstraction](#abstraction-1)
            * [Encapsulation](#encapsulation-1)
            * [Inheritance](#inheritance-1)
            * [Polymorphism](#polymorphism-1)
                * [Static vs Dynamic](#static-vs-dynamic)
                * [Compile-time vs Run-time polymorphism](#compile-time-vs-run-time-polymorphism)
                * [Ad-hoc polymorphism](#ad-hoc-polymorphism)
                    * [Function/Method Overloading](#functionmethod-overloading)
                    * [Function/Method Overriding](#functionmethod-overriding)
                * [Early Binding vs Late Binding](#early-binding-vs-late-binding)
                * [Parametric polymorphism](#parametric-polymorphism)
                    * [Generic function](#generic-function)
                    * [Generic programming](#generic-programming)
        * [SOLID (Modules/Classes design) principles](#solid-modulesclasses-design-principles)
            * [Single-Responsibility principle (SRP)](#single-responsibility-principle-srp)
            * [Open/Closed principle (OCP)](#openclosed-principle-ocp)
            * [Liskov Substitution principle (LSP)](#liskov-substitution-principle-lsp)
            * [Interface Segregation principle (ISP)](#interface-segregation-principle-isp)
            * [Dependency Inversion principle (DIP)](#dependency-inversion-principle-dip)
        * [Encapsulate what varies (changes in state, form or condition)](#encapsulate-what-varies-changes-in-state-form-or-condition)
        * [Favor Composition over Inheritance](#favor-composition-over-inheritance)
        * [Program to Interface not Implementation/Class](#program-to-interface-not-implementationclass)
        * [Favor Loosely Coupled design Between Objects, than interact](#favor-loosely-coupled-design-between-objects-than-interact)
        * [Common Dood principles](#common-dood-principles)
            * [KISS (Keep It Simple Stupid)](#kiss-keep-it-simple-stupid)
            * [YAGNI](#yagni)
            * [Do The Simplest Thing That Could Possibly Work](#do-the-simplest-thing-that-could-possibly-work)
            * [Separation of Concerns](#separation-of-concerns)
            * [Keep Things DRY](#keep-things-dry)
            * [Code For The Maintainer](#code-for-the-maintainer)
            * [Avoid Premature Optimization](#avoid-premature-optimization)
            * [Boy-Scout Rule](#boy-scout-rule)
        * [Inter-Module/Class Design and Coupling principles](#inter-moduleclass-design-and-coupling-principles)
            * [Minimise Coupling](#minimise-coupling)
            * [Law of Demeter](#law-of-demeter)
            * [Composition Over Inheritance](#composition-over-inheritance)
            * [Orthogonality](#orthogonality)
            * [Robustness Principle](#robustness-principle)
            * [Inversion of Control](#inversion-of-control)
        * [Module/Class design principles](#moduleclass-design-principles)
            * [Maximise Cohesion](#maximise-cohesion)
            * [Liskov Substitution Principle](#liskov-substitution-principle)
            * [Open/Closed Principle](#openclosed-principle)
            * [Single Responsibility Principle](#single-responsibility-principle)
            * [Hide Implementation Details](#hide-implementation-details)
            * [Curly's Law](#curlys-law)
            * [Encapsulate What Changes](#encapsulate-what-changes)
            * [Interface Segregation Principle](#interface-segregation-principle)
            * [Command Query Separation](#command-query-separation)
    * [Objects Relationships in OOP](#objects-relationships-in-oop)
        * [Inheritance - “is-a” relationship](#inheritance---is-a-relationship)
        * [Realization - “is-like” relationship](#realization---is-like-relationship)
        * [Association - “has-a” relationship (weakest relationship)](#association---has-a-relationship-weakest-relationship)
        * [Aggregation - “has-a” relationship (weak relationship)](#aggregation---has-a-relationship-weak-relationship)
        * [Composition - “has-a”/“part-of” relationship (strong relationship)](#composition---has-apart-of-relationship-strong-relationship)
    * [Decomposition](#decomposition)
    * [Hierarchy](#hierarchy)
    * [SOLID Principles of Class Design](#solid-principles-of-class-design)
        * [Single Responsibility](#single-responsibility)
        * [Open/Close principle](#openclose-principle)
        * [Liskov's Substitution](#liskovs-substitution)
        * [Interface Segregation Principle](#interface-segregation-principle-1)
        * [Dependency Inversion](#dependency-inversion)
    * [Inheritance](#inheritance-2)
    * [Subtype–supertype Relationship](#subtypesupertype-relationship)
    * [Inheritance (is-a) Vs Aggregation (has-a)](#inheritance-is-a-vs-aggregation-has-a)
    * [Static and Dynamic Types Of A Reference](#static-and-dynamic-types-of-a-reference)
    * [Overriding and Hiding Superclass Members](#overriding-and-hiding-superclass-members)
    * [Method Overriding Vs Method Overloading](#method-overriding-vs-method-overloading)
    * [Super Reference To Access Superclass Members](#super-reference-to-access-superclass-members)
    * [Using this() and super() Calls For Constructor Chaining](#using-this-and-super-calls-for-constructor-chaining)
    * [Abstract Classes and Methods](#abstract-classes-and-methods)
    * [The Final Modifier Classes Methods, Fields, and Local Variables](#the-final-modifier-classes-methods-fields-and-local-variables)
    * [Interfaces and Multiple Interface Inheritance](#interfaces-and-multiple-interface-inheritance)
    * [Subtyping For Reference Arrays](#subtyping-for-reference-arrays)
    * [Conversions When Assigning, Casting, and Passing References](#conversions-when-assigning-casting-and-passing-references)
    * [Resolution Of Overloaded Methods](#resolution-of-overloaded-methods)
    * [Type Of Objects and Pattern Matching Using The Instanceof Operator](#type-of-objects-and-pattern-matching-using-the-instanceof-operator)
    * [Polymorphism and How Dynamic Method Lookup Works](#polymorphism-and-how-dynamic-method-lookup-works)
    * [Enum Types](#enum-types)
    * [Record Classes](#record-classes)
    * [Sealed Classes and Interfaces](#sealed-classes-and-interfaces)
    * [Methods in Java](#methods-in-java)
        * [Types of methods](#types-of-methods)
        * [Modifiers of methods](#modifiers-of-methods)
        * [Object-Oriented nature of methods](#object-oriented-nature-of-methods)
        * [Common methods to all objects](#common-methods-to-all-objects)
        * [Behavioral classification of methods:](#behavioral-classification-of-methods)

<!-- TOC -->

## Literature and Resources

- Clean Code, by R. C. Martin
- Head First Design Patterns, by E. Freeman
- [Programming Principles](https://java-design-patterns.com/principles/)
- [Design Pattern Catalog](https://java-design-patterns.com/patterns/)
- [Object-Oriented Analysis and Design with Applications, 3rd ed., by B. Grady and M. Engle](https://learning.oreilly.com/library/view/object-oriented-analysis-and/9780201895513/)
- [The Object-Oriented Thought Process, 5th ed., by M. Weisfeld](https://learning.oreilly.com/library/view/the-object-oriented-thought/9780135182130/)
- [OOP - Learn Object-Oriented Thinking & Programming, by R. Pecinovsky](http://files.bruckner.cz/be2a5b2104bf393da7092a4200903cc0/PecinovskyOOP.pdf)
- [Refactoring: Improving the Design of Existing Code 2nd eds., by M.Fowler](https://learning.oreilly.com/library/view/refactoring-improving-the/9780134757681/)
- [Software Complexity: Bringing Order to Chaos](https://www.drdobbs.com/windows/software-complexity-bringing-order-to-ch/199901062)
- [Object-Oriented Programming Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/index.html)
- [Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- [How to Use Object: Code and Concepts by G. Holger]()
- [SOLID - wiki](https://en.wikipedia.org/wiki/SOLID)

## Object model

### Class

### Subclass

### Interface

### Constructor

### Methods/Behaviors

    How an object acts and reacts, in terms of its state changes and message passing;
    The outwardly visible and testable activity of an object.

### Fields/States

### Identity

### Abstraction

### Encapsulation

### Inheritance

### Polymorphism

## Class Design

- Access Modifiers
- Method Overloading and Overriding
- Abstract Classes
- Static and Final modifiers
- Imports
- Using instanceof
- Understanding Virtual Method Invocation
- Annotating Overridden Methods
- equals, hashCode, and toString (the Object class)
- Enums & Switch Statements
- Constructors, Fields, and Methods
- Nested Classes
    - Member Inner Classes
    - Local Inner Classes
    - Anonymous Inner Classes
    - Static Nested Classes

## Design Principles

- Concepts
    - Encapsulation
    - Inheritance
    - Polymorphism
    - Composition
    - Abstraction/Interface
    - Relationships
        - "is-a"
            - Inheritance
        - "has-a"
            - Association
            - Aggregation
            - Composition
- Object
    - Data/state/attributes of object
        - that what differentiate objects
        - identity
    - Behaviors of object
        - what an object `can do`
        - defined by `methods`
        - method call is a `message sending` to it
        - method `signature`
            - `name` of the method
            - `parameter names` of the method
            - `parameter types` of the method
            - `return type` of the method
- Object-to-Object Communication
- Class

## Idea of the OOP paradigm

      The main idea in object-oriented programming is
    -  to divide programs into smaller pieces
    -  make each piece responsible for managing its own state.

## What Is an Object?

    An object is a software bundle of related State and Behavior.

## What Is a Class?

    A class is a Prototype from which objects are created.

## Principles of OOP and Design

### Fundamentals/Basic principles

#### Abstraction

    Abstraction can be achieved by abstract classes and interfaces.
    Abstraction provides general contract for the object behavior

#### Encapsulation

    Encapsulation provides an object the ability to `hide` its `internal state` and `behavior`.
    Internal state an object is protected by `hidding its attributes/properties`
    The behavior is protected by `access modifires` like `private, protected and public`
    Provides `public interface` with `private implementation`

#### Inheritance

    Inheritance provides ability to extend state, behavior child objects from their parent.
    Provides reusable of parent code without modifying parent code

#### Polymorphism

    Polymorphism of the objects is the ability for the same `action/message` with different behavior,
    with object specific implementation of some behavior.
    There are two types of polymorphism:
        Static polymorphism (early binding, on compile time)
            Provided by method overloading for specific behavior by extra method parameters
        Dynamic polymorphism (late binding, on run-time)
            Provided by method overridden in the subclasses. 

##### Static vs Dynamic

##### Compile-time vs Run-time polymorphism

##### Ad-hoc polymorphism

###### Function/Method Overloading

###### Function/Method Overriding

##### Early Binding vs Late Binding

##### Parametric polymorphism

###### Generic function

###### Generic programming

### SOLID (Modules/Classes design) principles

#### Single-Responsibility principle (SRP)

    a class should have only one reason to change

#### Open/Closed principle (OCP)

    Classes should be Open for Extension but Closed to Modification

#### Liskov Substitution principle (LSP)

#### Interface Segregation principle (ISP)

    Many client-specific interfaces are better than one general-purpose interface

#### Dependency Inversion principle (DIP)

    - High-Level Modules should not depend on Low-Level Modules
    - Depend on Abstraction, do not depend on concrete class
    - Don’t call Us, We will call you

### Encapsulate what varies (changes in state, form or condition)

### Favor Composition over Inheritance

### Program to Interface not Implementation/Class

### Favor Loosely Coupled design Between Objects, than interact

### Common Dood principles

#### KISS (Keep It Simple Stupid)

#### YAGNI

#### Do The Simplest Thing That Could Possibly Work

#### Separation of Concerns

#### Keep Things DRY

#### Code For The Maintainer

#### Avoid Premature Optimization

#### Boy-Scout Rule

### Inter-Module/Class Design and Coupling principles

#### Minimise Coupling

#### Law of Demeter

#### Composition Over Inheritance

#### Orthogonality

#### Robustness Principle

#### Inversion of Control

### Module/Class design principles

#### Maximise Cohesion

#### Liskov Substitution Principle

#### Open/Closed Principle

#### Single Responsibility Principle

#### Hide Implementation Details

#### Curly's Law

#### Encapsulate What Changes

#### Interface Segregation Principle

#### Command Query Separation

## Objects Relationships in OOP

### Inheritance - “is-a” relationship

    A relationship among classes, wherein one class shares the structure or behavior defined in one (single inheritance)
    or more (multiple inheritance) other classes.
    Inheritance defines an "is a" hierarchy among classes in which
    a subclass inherits from one or more generalized superclasses;
    a subclass typically specializes its superclasses by augmenting or redefining existing structure and behavior.

### Realization - “is-like” relationship

### Association - “has-a” relationship (weakest relationship)

    A relationship denoting a semantic connection between two classes/objects.
    None of the objects are parts or members of another.
    Association just about that the objects “know” each other.
    In UML, association is marked with an arrow (arrowhead in one or both directions).

### Aggregation - “has-a” relationship (weak relationship)

    A whole/part relationship where one object is composed of one or more other objects,
    each of which is considered a part of the whole.
    This relationship is a weak form of containment in that
    the lifetimes of the whole and its parts are independent.
    In UML, aggregation is marked with empty dimanod line.
    In Java, difference between association and aggrgation is only logical.

### Composition - “has-a”/“part-of” relationship (strong relationship)

    A whole/part relationship where one object is composed of one or more other objects,
    each of which is considered a part of the whole.
    This relationship is a strong form of aggregation in that
    the lifetimes of the whole and its parts are dependent.
    In UML, composition is marked with fllled dimanod line.

## Decomposition

    The process of breaking a system into parts,
    each of which represents some class or object from the problem domain.
    The application of object-oriented design methods leads to an object-oriented decomposition,
    in which we view the world as a collection of objects
    that cooperate with one another to achieve some desired functionality.

## Hierarchy

    A ranking or ordering of abstractions
    - "is-a" hierarchy
    - "part-of" hierarchy

## SOLID Principles of Class Design

It's about how a coupled group of classes, functions and data should be organized

- to be easy to change
- to be easy to understand
- to be bases for components and complex structures

### Single Responsibility

- a class/method/component should have a single reason to change
- a single reason - a one responsibility

### Open/Close principle

- Modules, Classes should be Open for extension, but Closed for Modification

### Liskov's Substitution

### Interface Segregation Principle

- Client classes should not be forced to depend on interfaces they do not use.

### Dependency Inversion

- Client classes should not depend on concrete objects, but on abstraction or interface.

## Inheritance

## Subtype–supertype Relationship

## Inheritance (is-a) Vs Aggregation (has-a)

## Static and Dynamic Types Of A Reference

## Overriding and Hiding Superclass Members

## Method Overriding Vs Method Overloading

## Super Reference To Access Superclass Members

## Using this() and super() Calls For Constructor Chaining

## Abstract Classes and Methods

## The Final Modifier Classes Methods, Fields, and Local Variables

## Interfaces and Multiple Interface Inheritance

## Subtyping For Reference Arrays

## Conversions When Assigning, Casting, and Passing References

## Resolution Of Overloaded Methods

## Type Of Objects and Pattern Matching Using The Instanceof Operator

## Polymorphism and How Dynamic Method Lookup Works

    Dynamic method lookup is the process of determining which method definition a non-private method signature denotes during runtime.
    The process is based on the type of the object and the methods signature.

- Polymorphism and dynamic method lookup is a powerful programming paradigm
- It simplifies client definitions
- It encourages for object decoupling
- It supports dynamically changing relationships between objects at runtime

## Reference types (classification)

- Top-level types
    - Class
    - Interface
    - Enum
    - Record
- Nested types
    - Static Member types
        - Class
        - Interface
        - Enum
        - Record
    - Inner classes
        - Non-Static member class
        - Anonymous class
        - Local class
    - Static Local types
        - Interface
        - Enum
        - Record

```java
class TLC {                       // (1) Top-level class

  // Static member types:
  static class SMC {
  }         // (2) Static member class

  interface SMI {
  }         // (3) Static member interface, the keyword static can be omitted (implicitly static)

  enum SME {}         // (4) Static member enum, the keyword static can be omitted (implicitly static)

  record SMR() {
  }       // (5) Static member record, the keyword static can be omitted (implicitly static)

  // Non-static member class:
  class NSMC {
  }                   // (6) Inner class

  // Local types in non-static context (analogous for static context):
  void nsm() {                    // Non-static method
    class LC {
    }               // (7) Local class (inner class)
    interface SLI {
    }              // (8) Static local interface
    enum SLE {}              // (9) Static local enum
    record SLR() {
    }            // (10) Static local record
  }

  // Anonymous classes (here defined as initializer expressions):
  SMC nsf = new SMC() {
  };  // (11) Inner class in non-static context
  static SMI sf = new SMI() {
  };  // (12) Inner class in static context
}
```

- For static member enums, records and interfaces the keyword "static" can be omitted (implicitly static).
- The access modifiers (public, protected, package, private) can be specified for a static member types.

## Nested types

- Nested classes
- Nested interfaces
- Nested enums
- Nested records

## Nested classes

```java
class OuterClass {

  class InnerClass {
  }

  static class StaticNestedClass {
  }
}
```

### Inner classes (Non-static nested classes)

### Static nested classes

### Local classes

    A locals class is a class which is declared in a block (e.g: in a body of a method).

### Anonymous classes

### Use cases of Nested classes

General use cases:

- To group logically belonging togather classes in one place
- Strong encapsulation
- Yields readability for small number of classes

Local class use case:

- Need to create more than one instance of a class
- Access its constructor
- Introduce a new, named type (because, for example, you need to invoke additional methods later)

Anonymous class use case

- Need to declare fields or additional methods

Non-static nested class (or inner class) use case:

- Need to access to an enclosing instance's non-public fields and methods

Static nested class use case:

- No need to access to an enclosing instance's non-public fields and methods

## Enum types

## Record Classes

## Sealed Classes and Sealed Interfaces

## Methods in Java

### Types of methods

- Static methods
- Instance methods
- Accessor methods
- Mutator methods

#### Static methods

#### Instance methods

#### Accessor methods

#### Mutator methods

### Modifiers of methods

- abstract
- private
- public
- final
- synchronized
- native
- strictfp

#### abstract

#### private

#### public

#### final

#### synchronized

#### default

#### native

#### strictfp

### Method Overriding and Overloading

- Overriding
- Overloading

#### Overriding

#### Overloading

### Common methods to all objects

- hashCode()
- equals()
- toString()
- wait()
- notify()
- notifyAll()

#### hashCode()

#### equals()

#### toString()

#### wait()

#### notify()

#### notifyAll()

### Behavioral classification of methods

- Returns a special value
- Throws exceptions
- Blocks
- Time limit (timeout)

#### Returns a special value

#### Throws exceptions

#### Blocks

#### Time limit (timeout)