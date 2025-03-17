# Producer Extends Consumer Super (PECS) (a.k.a, The Get and Put Principle)

## Literature and Resources

## PECS - Producer Extends Consumer Super, or Get/Put principles

- P (? extends AType)
    - get items from a generic/wildcard container or collection
    - the generic/wildcard container only produces items from the container/collection
    - but does not accept items into the generic/wildcard container
        - other than null
- C (? super AType)
    - put/set items into generic/wildcard container or collection
    - the generic/wildcard container collection only consumes items to the container/collection
    - but does not allow to pull from the generc/wildcards container/collection
        - other than Object

Example:

```java
<T> void copy(List<? super T> dest, List<? extends T> src) {
    for (int i=0; i < srcSize; i++)
        dest.set(i, src.get(i));
    }

```

```
    List<? extends T> src/src.get(i) - Producer extends (Get Principle)
    List<? super T> dest/dest.set() - Consumer super (Put Principle)
```

## Variance

- Invariant
- Covariance
- Contravariance
- Collection inheritance vs array inheritance

## Covariance and Contravariance

### Why are arrays covariant but generics collections are invariant?

When X extends Y (X subtype of Y)

#### Array Is Covariance

This means that when X type is a subtype of Y type, then X[] array type is subtype of Y[] array type.
But ArrayStoreException is thrown when putting different object type.

Example:

    Object objArray[] = new String[3];
    objArray[0] = new Integer(0); // putting Integer object type.

#### Generic Collections Are Invariance

This means that `List<X> is not subtype of List<Y>`
So Compile-Time Error happens on violating invariance.

## Wildcards and PECS principle

    - use an `extends wildcard` (? extends) when only Get values out of a structure;
    - use `a super wildcard` (? super) when only Put values into a structure;
    - don’t use a wildcard when both Get And Put values from/into a structure;
