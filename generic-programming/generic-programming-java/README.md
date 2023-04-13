# Generic Programming in Java

## Literature and Resources

- [Java Generics and Collections, by P. Wadler, M. Naftalin](https://learning.oreilly.com/library/view/java-generics-and/0596527756/)
- [Effective Java 3rd ed., by Joshua Bloch; Chapter 5. Generics](https://learning.oreilly.com/library/view/effective-java-3rd/9780134686097/ch5.xhtml#lev26)
- [Understanding Java 8 Generics, by Ken Kousen](https://www.safaribooksonline.com/library/view/understanding-java-8/9781491978153/)
- [Generics in the Java Programming Language, by G. Bracha]()
- [The Java™ Tutorials/Lesson: Generics (Updated)](https://docs.oracle.com/javase/tutorial/java/generics/index.html)
- [Java Generics FAQs - Frequently Asked Questions](http://www.angelikalanger.com/GenericsFAQ/JavaGenericsFAQ.html)
- [Type Parameter vs Wildcard in Java Generics](https://www.baeldung.com/java-generics-type-parameter-vs-wildcard)

## Topics

- Use Cases
- Generic Types
    - Type Parameter
        - Upper Bounded Type Parameter
        - Unbounded Wildcards Type Parameter
        - Lower Bounded Type Parameter
    - Parametrized Type
- Generic Methods
- Generics, Inheritance, and Subtypes
- Wildcards
    - Upper Bounded Wildcards
    - Unbounded Wildcards
    - Lower Bounded Wildcards
    - Wildcards and Subtyping
- Type Erasure
- Restrictions on using Generics
- PECS principle

### Use Cases of Generics

- Strong Type Checking and Type Safety
    - Compile time check on Generic Types
- Elimination of Type Casting
- Common or Generalized Algorithms on data structure of different types
- Common uses of generics include
    - Collections: `Set<E> and Map<K,V>`
    - Single-Element Containers:` ThreadLocal<T> and AtomicReference<T>`

#### What problems does generics solve?

- Type Safety problem
- Type Casting problem (java.lang.ClassCastException)
- Compile-Time Type Error Detection problem

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

### Terminology Table for Generics Types/Wildcards

| Term                                                     | Examples                                           |
|----------------------------------------------------------|----------------------------------------------------|
| Generic Type <br/> (Generic Interface/Class)             | `List<E>, Class<T>`                                |
| Type Parameter                                           | `E, T`                                             |
| Parameterized Type <br/> (Parameterized Interface/Class) | `List<String>, Class<Integer>`                     |
| Actual Type Parameter <br/> (Type Argument)              | `String, Employee`                                 |
| Raw Type                                                 | `List, Class`                                      |
| Bounded Type Parameter                                   | `<T extends Number>`                               |
| Unbounded Wildcard                                       | `List<?>, Class<?>`                                |
| Recursive Type Bound                                     | `<T extends Comparable<T>>`                        |
| Bounded Wildcard                                         | `List<? extends Number>, Class<? extends Integer>` |
| Generic Method                                           | `static <E> List<E> asList(E[] a)`                 |
| Type Token                                               | `String.class, Employee.class`                     |

### Generic Methods

### Generics, Inheritance, and Subtypes

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

### Type Erasure

### Restrictions on using Generics
