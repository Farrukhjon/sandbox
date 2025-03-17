# Execution Flow of a Java Program

## Literature and Resources

- [The Java® Language Specification, Java SE 8 Edition](https://www.safaribooksonline.com/library/view/the-java-language/9780133900767/),
- [The Java® Virtual Machine Specification, Java SE 8 Edition](https://www.safaribooksonline.com/library/view/the-java-virtual/9780133922745/),

## Class Loaders

1. Bootstrap Class Loader
2. User-Defined Class Loader

A Java program is formed in bytecode
JVM loads the binary bytecode to execute
Binary Representation of Classes and Interfaces

## Flow of execution

- Start up of JVM
- Order
- Termination
Entry point
Steps

- Loading of
    - classes and interfaces
    - loading binary representation of classes and interfaces to memory
    - binary representation is normally class file format
    - Classloaders
        - Bootstrap classloader
        - Extension classloader
        - Application classloader
- Linking of
    - classes and interfaces
    - steps: verification, validation, preparation, resolution
- Initialization of
    - classes and interfaces
- Creation of new instances (objects) of
    - classes and interfaces
    - explicit and implicit instantiations
- Finalization of instances (objects) of
    - classes and interfaces
- Unloading of
    - classes and interfaces
- Exit program

## Example of the Steps, Test class

1. Load the Class Test
2. Link
    1. Verify (bytecode verification)
    2. Prepare
    3. Resolve
3. Initialize the Test class
    1. superclass initialize (direct)
4. Invoke Test.main
