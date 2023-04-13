# Producer Extends Consumer Super (PECS) (a.k.a, The Get and Put Principle)

## Literature and Resources

## PECS - Producer Extends Consumer Super, or Get/Put principles

- P (extends) - pull items from generic collection (the collection only produces items)
- C (super) - push items to generic collection (the collection only consumes items)

## Variance

- Invariant
- Covariance
- Contravariance
- Collection inheritance vs array inheritance

## Covariance and Contravariance

### Why are arrays covariant but generics collections are invariant?

When X extends Y (X subtype of Y)

#### Array Is Covariance

This means that `X[] array is subtype of Y[]` array.
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
