# Typesafe, Heterogeneous Container Pattern

## Literature and Resources

- [Effective Java, 3rd Edition, by Joshua Bloch](https://learning.oreilly.com/library/view/effective-java-3rd/9780134686097/)
    - Item 33: Consider typesafe heterogeneous containers

## Motivation

If generics are used like exemplified by the collections APIs, It restricts you to use it in
a `fixed number of type parameters per container.`

But `placing the type parameter on the key rather than the container`. We can use `Class` objects as keys for such
typesafe heterogeneous containers.

A `Class` object used in this fashion is called a `type token`.

Also, we can use a `custom key type`. For example, a `DatabaseRow` type to model a `database row (the container)`, and
a `generic type Column<T> as its key`.

## Heterogeneous Container pattern

- The idea is
    - to `parameterize the key` instead of the container;
    - then present `the parameterized key` to the container to `insert or retrieve` a value;
    - type of the value agrees with its key;

## Class literal/instance to Generic Class table

| Class literal/instance | Parametrized Class | Generic Class/Type |
|------------------------|--------------------|--------------------|
| String.class           | Class<String>      | Class<T>           |
| Integer.class          | Class<Integer>     | Class<T>           |
| Employee.class         | Class<Employee>    | Class<T>           |
| Class.class            | Class<Class>       | Class<T>           |

```java
// Typesafe heterogeneous container pattern - API
public class Favorites {
  public <T> void putFavorite(Class<T> type, T instance);

  public <T> T getFavorite(Class<T> type);
}
```

```java
// Typesafe heterogeneous container pattern - implementation
public class Favorites {
  private Map<Class<?>, Object> favorites = new HashMap<>();

  public <T> void putFavorite(Class<T> type, T instance) {
    favorites.put(Objects.requireNonNull(type), instance);
  }

  public <T> T getFavorite(Class<T> type) {
    return type.cast(favorites.get(type));
  }
}
```

```java
// Typesafe heterogeneous container pattern - client
class Client {
  public static void main(String[] args) {
    Favorites f = new Favorites();
    f.putFavorite(String.class, "Java");
    f.putFavorite(Integer.class, 0xcafebabe);
    f.putFavorite(Class.class, Favorites.class);

    String favoriteString = f.getFavorite(String.class);
    int favoriteInteger = f.getFavorite(Integer.class);
    Class<?> favoriteClass = f.getFavorite(Class.class);
    System.out.printf("%s %x %s%n", favoriteString,
        favoriteInteger, favoriteClass.getName());
  }
}
```