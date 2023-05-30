package io.github.farrukhjon.experiment.guava.graph.builders;

import com.google.common.graph.GraphBuilder;
import com.google.common.graph.ImmutableGraph;
import com.google.common.graph.MutableGraph;

public class GraphBuilderDemo {

  public static void main(String[] args) {

    final String secondName = "Aliev";
    // Immutable Undirected Graph Construction:
    final ImmutableGraph<String> immutableUndirectedGraph = GraphBuilder
        .undirected()
        .<String>immutable()
        .putEdge(secondName, "Vali")
        .putEdge(secondName, "Sami")
        .putEdge(secondName, "Gani")
        .build();
    System.out.println("-=String view of the immutable undirected graph=-");
    System.out.println(immutableUndirectedGraph);

    // Mutable Undirected Graph Construction:
    final MutableGraph<String> mutableUndirectedGraph = GraphBuilder
        .undirected()
        .build();
    mutableUndirectedGraph.putEdge(secondName, "Vali");
    mutableUndirectedGraph.putEdge(secondName, "Sami");
    mutableUndirectedGraph.putEdge(secondName, "Gani");
    System.out.println("-=String view of the mutable undirected graph=-");
    System.out.println(mutableUndirectedGraph);

    // Mutable Directed Graph Construction:
    final MutableGraph<String> mutableDirectedGraph = GraphBuilder
        .directed()
        .build();
    mutableDirectedGraph.putEdge(secondName, "Vali");
    mutableDirectedGraph.putEdge(secondName, "Sami");
    mutableDirectedGraph.putEdge(secondName, "Gani");
    System.out.println("-=String view of the mutable directed graph=-");
    System.out.println(mutableDirectedGraph);

    // Immutable Directed Graph Construction:
    final ImmutableGraph<String> immutableDirectedGraph = GraphBuilder
        .directed()
        .<String>immutable()
        .putEdge(secondName, "Vali")
        .putEdge(secondName, "Sami")
        .putEdge(secondName, "Gani")
        .build();
    System.out.println("-=String view of the immutable directed graph=-");
    System.out.println(immutableDirectedGraph);

  }
}