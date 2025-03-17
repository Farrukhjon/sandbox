# Type Erasure

## Literature and Resources

- [The Java Tutorials/Generics/Type Erasure](https://docs.oracle.com/javase/tutorial/java/generics/erasure.html)

## Topic

- Type Erasure
    - Erasure of Generic Types
    - Erasure of Generic Methods
- Bridge Methods

### Type Erasure

- Replace all `Type parameters` in `Generic Types`
    - with their `bounds types`
    - with `Object` if the type parameters are `unbounded`
    - the produced bytecode, therefore, contains only ordinary classes, interfaces, and methods
- Insert Type Casts if necessary to preserve type safety.
- Generate bridge methods to preserve polymorphism in extended generic types

#### Erasure of Generic Types

- _Unbounded_ type parameter (`<T>`) is replaced with `Object` type
- _Bounded_ type parameter (`<T extends AType>`) is rebalanced with first bound class `AType`, where `AType` is an
  interface or class

##### Example of erasure of _unbounded type parameter_ <T> for a generic type:

```java
//This generic type (with bounded <T extends Comparable<T>> type parameter):
public class Node<T extends Comparable<T>> {
  private T data;
  private Node<T> next;

  public Node(T data, Node<T> next) {
    this.data = data;
    this.next = next;
  }

  public T getData() {
    return data;
  }
}
```

```java
//Is replaced/erased to:
public class Node {
  private Comparable data;
  private Node next;

  public Node(Comparable data, Node next) {
    this.data = data;
    this.next = next;
  }

  public Comparable getData() {
    return data;
  }
}
```

#### Erasure of Generic Methods

- _Unbounded_ type parameter (`<T>`) is replaced with `Object` type
- _Bounded_ type parameter (`<T extends AType>`) is rebalanced with first bound class `AType`, where `AType` is an
  interface or class

##### Example of erasure of _unbounded_ type parameter <T> for a _generic method_

```
// This generic method:
public <T> int count(T[] anArray, T elem){}
```

```
//Is replaced/erased to:
public int count(Object[] anArray, Object elem){}
```

##### Example of erasure of _bounded_ type parameter <T extends Shape> for a _generic method_

```
//This generic method:
public <T extends Shape> void draw(T shape) {}
```

```
// Is replaced/erased to:
public void draw(Shape shape) {}
```

```
// Where such class hierarchy is defined
class Shape {}
class Circle extends Shape {}
class Rectangle extends Shape {}
```

### Bridge Methods