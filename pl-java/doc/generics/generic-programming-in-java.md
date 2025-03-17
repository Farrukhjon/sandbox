# Generic Programming in Java

## Literature and Resources

- [Covariance and contravariance (computer science)](https://en.wikipedia.org/wiki/Covariance_and_contravariance_(computer_science))
- [Effective Java 3rd ed., by Joshua Bloch; Chapter 5. Generics](https://learning.oreilly.com/library/view/effective-java-3rd/9780134686097/ch5.xhtml#lev26)
- [Generics in the Java Programming Language, by G. Bracha]()
- [Java Generics and Collections, by M. Naftalin, Ph. Wadler](https://learning.oreilly.com/library/view/java-generics-and/0596527756/)
- [Java Generics FAQs - Frequently Asked Questions](http://www.angelikalanger.com/GenericsFAQ/JavaGenericsFAQ.html)
- [Parametric polymorphism - wiki](https://en.wikipedia.org/wiki/Parametric_polymorphism)
- [The Java Tutorials, Lesson: Generics (extra)](https://docs.oracle.com/javase/tutorial/extra/generics/)
- [The Java Tutorials, Lesson: Generics (Updated)](https://docs.oracle.com/javase/tutorial/java/generics/index.html)
- [Type Parameter vs Wildcard in Java Generics](https://www.baeldung.com/java-generics-type-parameter-vs-wildcard)
- [Understanding Java 8 Generics, by Ken Kousen](https://www.safaribooksonline.com/library/view/understanding-java-8/9781491978153/)

## Generics

- Arrays vs Generic Types
- Generics, Inheritance and Subtyping
- Parametric Polymorphism
- Type Parameter and Formal Parameter
- Type Safety on Compile-Time Error Detection
    - Covariant and Invariant
    - Failing at runtime and failing at compile-time
        - ArrayStoreException
    - arrays are `reifiable` vs generics are `non-reifiable` (note that, unbounded wildcard types are reifiable)
    - it is `illegal` to create `an array of a generic type` due to `ClassCastException`
- Casting and Generics
- Generic Classes and Type Parameters
- Generic Methods
- Generic Types
    - Type Parameter
        - Lower Bounded Type Parameter
        - Unbounded Wildcards Type Parameter
        - Upper Bounded Type Parameter
    - Parametrized Type
- Generics, Inheritance, and Subtypes
- Type Erasure
- Wildcards
    - Lower Bounded Wildcards
    - Unbounded Wildcards
    - Upper Bounded Wildcards
    - Wildcards and Subtyping
- PECS principle
- Restrictions on using Generics

## Why Use Generics? (Use Cases)

- input different types (as value) to the same code/algorithms
- generic types are checked at compile time, not run time
- strong Type Checking and Type Safety
    - compile time check on Generic Types
- no need type casting
- common or Generalized Algorithms on data structure of different types
- common uses of generics include
    - Collections: `Set<E> and Map<K,V>`
    - Single-Element Containers:` ThreadLocal<T> and AtomicReference<T>`

### What problems does generics solve?

- type safety problem
- type casting problem (java.lang.ClassCastException)
- compile-time type error detection problem

## Terminology used in Generics

| Term                                  | Example                       | Definition                                                          |
|---------------------------------------|-------------------------------|---------------------------------------------------------------------|
| Type Parameter                        | E                             | a placeholder for a type declared in generic                        |
| Type Argument (Actual Type Parameter) | String                        | an actual type used to parametrize generic (parametrized type)      |
| Raw Type                              | List                          |                                                                     |
| Generic Type                          | List<E>                       |                                                                     |
| Parameterized Type                    | List<String>                  |                                                                     |
| Bounded Type Parameter                | <E extends Number>            |                                                                     |
| Recursive Type Bound                  | <T extends Comparable<T>>     |                                                                     |
| Generic Method                        | <E> List<E> asList(E[] array) |                                                                     |
| Wildcard                              | <?>                           |                                                                     |
| Unbounded Wildcard Type               | List<?>                       | list of "some type", it is the most general parameterized List type |
| Bounded Wildcard Type                 | List<? extends Number>        |                                                                     |
| Type Token                            | String.class                  |                                                                     |

### Generic Type

    A Generic Type is a type with formal type parameters.
    Example, interface Collection<E>  { ... }; or ArrayList<E> 

#### Type Parameter

- A Type Parameter is a placeholder for a type argument.

        Example, <E>, <T>,...
- Use Cases
    - If a Type Parameter (like, List<E>) appears More than once in the method declaration

          <E> void printObjectsExceptOne(List<E> objects, E object) {...}

#### Parameterized Type

    A Parameterized Type is an instantiation of a Generic Type with Actual Type Parameter (type arguments).
    Example, List<String> or Collection<String> coll = new LinkedList<String>();
    Where, <String> - an actual type parameter (type argument) 

### Two Approaches Of Generalization

1. Type Parameter (aka Generic Type)
    - <T>;
    - <T extends AType>;
    - <T super AType>;
2. Wildcards
    - <?>;
    - <? extends AType>;
    - <? super AType>;

### Wildcards

- Use Cases
    - If a Type Parameter (like, List<E>) appears only once in the method declaration, use wildcard (like, List<?>)
- Upper Bounded wildcard: <? extends X>
- Unbounded wildcard: <?>
    - represents `"any type"`
- Lower Bounded wildcard: <? super X>
- Wildcards and Subtyping

## Generics, Inheritance and Subtyping ("is-a" relationship)

```java
Object someObject=new Object();
    Integer someInteger=new Integer(10);
    someObject=someInteger;   // OK
    ...
public void someMethod(Number n){ /* ... */ }

    someMethod(new Integer(10));   // OK
    someMethod(new Double(10.1));   // OK

```

### Inheritance in Generics

    Use extending or implementing mechanisms to subtype generic classes or interfaces

```
Iterable<T>
    -> Collection<E> (extends)
        -> List<E> (extends)
            -> AbstractList<E> (implements)
                -> ArrayList<E> (extends)
```

## Reifiable and Non-Reifiable

    To reify is to materialize something (generally speaking).
    In computing, reification means an explicit representation of a type - that is, run-time typeinformation.
    Because some type information is erased during compilation, not all types are available at run time.
    Types that are completely available at run time are known as reifiable types.

### Reifiable types

| Reifiable types                                                        | Example                                        |
|------------------------------------------------------------------------|------------------------------------------------|
| primitive types                                                        | int, char, and so on                           |
| non-parameterized class or interface types                             | Number, String, or Runnable                    |
| parameterized type in which all type arguments are unbounded wildcards | List<?>, ArrayList<?>, or Map<?, ?>            |
| raw types                                                              | List, ArrayList, or Map                        |
| arrays whose component type is reifiable                               | int[], Number[], List<?>[], List[], or int[][] |

### Non-Reifiable types

| Non-Reifiable types                        | Example                                                                      |
|--------------------------------------------|------------------------------------------------------------------------------|
| type variables                             | T, E and so on                                                               |
| parameterized types with actual parameters | List<Number>, ArrayList<String>, or Map<String, Integer>                     |
| parameterized types with a bound           | List<? extends Number>, Comparable<? super String> pr List<? extends Object> |