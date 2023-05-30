# Representations (Underlying Data Structures) of Graphs in Memory

## Models Of Representations Of Graph In Memory (Underlying Data Structures)

- List of Edges (simple pair of edges)
- Matrix (two-dimensional arrays)
    - Adjacency Matrix
    - Incidence Matrix
- Adjacency Lists
    - Objects
    - Pointers
    - LinkedList
- Adjacency Set

## Efficiency of the Underlying Data Structures

| underlying data structure | space | add edge u-v | adjacency check (u is adjacent to v) | iteration over u adjacent to v |
|---------------------------|-------|--------------|--------------------------------------|--------------------------------|
| List of Edges             | E     | 1            | E                                    | E                              |
| Adjacency Matrix/Array    | V^2   | 1            | 1                                    | V                              |
| Adjacency List            | E + V | 1            | degree(v)                            | degree(v)                      |
| Adjacency Set             | E + V | logV         | logV                                 | logV + degree(v)               |

