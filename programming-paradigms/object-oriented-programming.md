# Object-Oriented programming

## Literature and Resources

- Clean Code, by R. C. Martin
- Head First Design Patterns, by E. Freeman
- [Programming Principles](https://java-design-patterns.com/principles/)
- [Design Pattern Catalog](https://java-design-patterns.com/patterns/)
- [Object-Oriented Analysis and Design with Applications, 3rd ed., by B. Grady and M. Engle](https://learning.oreilly.com/library/view/object-oriented-analysis-and/9780201895513/)
- [The Object-Oriented Thought Process, 5th ed., by M. Weisfeld](https://learning.oreilly.com/library/view/the-object-oriented-thought/9780135182130/)
- [OOP - Learn Object-Oriented Thinking & Programming, by R. Pecinovsky](http://files.bruckner.cz/be2a5b2104bf393da7092a4200903cc0/PecinovskyOOP.pdf)
- Refactoring: Improving the Design of Existing Code 1st/2nd eds., by M. Fowler
- [Software Complexity: Bringing Order to Chaos](https://www.drdobbs.com/windows/software-complexity-bringing-order-to-ch/199901062)

## Object Model

### Class

### Subclass

### Object/Class/Interface instance

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

## Principles of Object-Oriented Programming and Design

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

## Relationships in OOP

### Inheritance - “is-a”

    A relationship among classes, wherein one class shares the structure or behavior defined in one (single inheritance)
    or more (multiple inheritance) other classes.
    Inheritance defines an "is a" hierarchy among classes in which
    a subclass inherits from one or more generalized superclasses;
    a subclass typically specializes its superclasses by augmenting or redefining existing structure and behavior.

### Aggregation - “has-a”

    A whole/part relationship where one object is composed of one or more other objects,
    each of which is considered a part of the whole.
    This relationship is a weak form of containment in that
    the lifetimes of the whole and its parts are independent.

### Composition - “part-of”

    A whole/part relationship where one object is composed of one or more other objects,
    each of which is considered a part of the whole.
    This relationship is a strong form of aggregation in that
    the lifetimes of the whole and its parts are dependent.

### Association - “has-a”

    A relationship denoting a semantic connection between two classes.

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
