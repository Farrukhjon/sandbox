# Visitor Design Pattern

## Definition

    Separates an algorithm from an object structure (hierarchical structure) by moving the hierarchy of methods into one object.
    Decoupling new adding operations from the object structure.

## Intent of the pattern is:

    To represent an operation to be performed on the elements of an object structure.
    Visitor lets define a new operation without changing the classes of the elements on which it operates.

## Problem to address

## The key idea of the pattern is:

    To define a double-dispatch operation `accept(viritor)` for each Element class

## Solution

## Benefits

- Allows you to add operations to a Composite structure without changing the structure itself.
- Adding new operations is relatively easy.
- The code for operations performed by the Visitor is centralized.

## Drawbacks

- Broken encapsulation for composite classes
-

- makes adding new operation easy

## Use Cases

- want to add new operations to a composite of objects and encapsulation is not important
- many distinct and unrelated operation need to be performed on objects in an object structure
- to avoid "polluting" the object's classes with the new operations
- to keep related operations together by defining them in one class.
- object's classes rarely change