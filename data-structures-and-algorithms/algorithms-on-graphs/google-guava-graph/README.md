# Google Guava Common Graph

## Literature and Resources

- [GraphsExplained](https://github.com/google/guava/wiki/GraphsExplained)

## Main Interfaces & Classes for graph-structured data in the library

- `Graph` interface
    - supports the following use cases:
        - `directed` graphs
        - `undirected` graphs
        - graphs that do/don't allow `self-loops`
        - graphs whose nodes/edges are `insertion-ordered`, `sorted`, or `unordered`
    - subtypes & implementations
        - `MutableGraph`
            - `StandardMutableGraph`
        - AbstractGraph
            - ForwardingGraph
                - `TransposedGraph`
                - `StandardMutableGraph`
                - `ImmutableGraph`
- `ValueGraph` interface
    - supports the following use cases:
        - `directed` graphs
        - `undirected` graphs
        - graphs that do/don't allow `self-loops`
        - graphs whose nodes/edges are `insertion-ordered`, `sorted`, or `unordered`
        - graphs whose edges have `associated values`
    - subtypes & implementations
        - `MutableValueGraph`
            - `StandardMutableValueGraph`
        - AbstractValueGraph
            - StandardValueGraph
                - `StandardMutableValueGraph`
                - `ImmutableValueGraph`
            - ForwardingValueGraph
                - `TransposedValueGraph`
- `Network` interface
    - supports the following use cases:
        - `directed` graphs
        - `undirected` graphs
        - graphs that do/don't allow `parallel edges`
        - graphs that do/don't allow `self-loops`
        - graphs whose nodes/edges are `insertion-ordered`, `sorted`, or `unordered`
        - graphs whose `edges are unique` objects
    - subtypes & implementations
        - `MutableNetwork`
            - `StandardMutableNetwork`
        - AbstractNetwork
            - ForwardingNetwork
                - `TransposedNetwork`
            - StandardNetwork
                - `StandardMutableNetwork`
                - `ImmutableNetwork`

## Builders of the Graph, ValueGraph and Network objects

Builder classes that construct graphs with user-defined properties:

- `GraphBuilder` class
    - constructs instances of
        - `MutableGraph`
        - `ImmutableGraph`
- `ValueGraphBuilder` class
    - constructs instances of
        - `MutableValueGraph`
        - `ImmutableValueGraph`
- `NetworkBuilder` class
    - constructs instances of
        - `MutableNetwork`
        - `ImmutableNetwork`

## Algorithms on Graph, ValueGraph and Network objects

- `Graphs` class
    - static utility methods for instances of the Graph ValueGraph, and Network
- `Traverser` class
    - forTree(SuccessorsFunction) entry point
    - forGraph(SuccessorsFunction) entry point
- `SuccessorsFunction` interface
    - is a functional interface
    - is used as the type of parameter to graph algorithms (e.g.: BST)

## Terminologies used in the library

example:

    graph.addEdge(nodeU, nodeV, edgeUV);

- Directed `graph`
    - `nodeU` is a **predecessor** of `nodeV`
    - `nodeV` is a **successor** of `nodeU`
    - `edgeUV` is an **outgoing** edge (or out-edge) of `nodeU`
    - `edgeUV` is an **incoming** edge (or in-edge) of `nodeV`
    - `nodeU` is a **source** of `edgeUV`
    - `nodeV` is a **target** of `edgeUV`
- Undirected `graph`
    - `nodeU` is a **predecessor and a successor** of `nodeV`
    - `nodeV` is a **predecessor and a successor** of `nodeU`
    - `edgeUV` is both an **incoming and an outgoing** edge of `nodeU`
    - `edgeUV` is both an **incoming and an outgoing** edge of `nodeV`
