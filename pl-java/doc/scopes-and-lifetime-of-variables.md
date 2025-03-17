# Scopes and Lifetime of Variables in Java

## Literature and Resources

Scope is about accessibility and visibility of variables within some code.

## Types of Scopes in Java

- Class scope
    - instance variables (non-static fields)
    - class variables (static fields)
- Method scope
    - method body and method parameters
- Block scope
    - loop, if, switch blocks and local variables

## Class scope

| Variable type              | scope (accessible)                       | Lifetime                                     |
|----------------------------|------------------------------------------|----------------------------------------------|
| instance variables (field) | entire body of class, except static code | until instance/object is available in memory |
| class (static) variables   | entire body of class                     | until end of program                         |
| local variables            | within a block                           | until control leaves the block               |

## Scope Rules