# Scripts, Modules and Packages

## Module

    A module is a single file containing Python code.
    The Python example are fucntions, class definitions and other statements.
    The file name is module name with ".py" suffix appended.

## Package

    A collection of the modules that are orginized in a directory hierarchy.

A regular package is typically implemented as a directory containing an `__init__.py` file.
Example of a `parent package` with three `subpackages`:

```
parent/
    __init__.py
    one/
        __init__.py
    two/
        __init__.py
    three/
        __init__.py
```

Some popular examples of Python packages are `NumPy`, `Django`, `Pandas`, and `Matplotlib`.

## Module vs Package

|         | What is                                                  | __init__  .py file | Importing                                             |
|---------|----------------------------------------------------------|--------------------|-------------------------------------------------------|
| Module  | a `.py` file containing Python code                      | not required       | using the asterisk (*) operator to import all objects |
| Package | a directory containing numerous modules and sub-packages | required           | We can’t import all modules in a package at once      |
|         |                                                          |                    |                                                       |


A function is made up of multiple statements and expressions.
A class is made up of multiple methods (functions), variables.
A module is made up of multiple functions, classes and variables.
A package is made up of multiple modules.