package io.github.farrukhjon.experiment.guava.graph.algorithms;

import com.google.common.graph.GraphBuilder;
import com.google.common.graph.ImmutableGraph;
import com.google.common.graph.Traverser;

public class GraphTraversalsDemo {
  public static void main(String[] args) {

    final String secondName = "Aliev";
    final ImmutableGraph<String> immutableUndirectedGraph = GraphBuilder
        .undirected()
        .<String>immutable()
        .putEdge(secondName, "Vali")
        .putEdge(secondName, "Sami")
        .putEdge(secondName, "Gani")
        .build();
    System.out.println("-=String view of the graph=-");
    System.out.println(immutableUndirectedGraph);

    //DFS traversal:
    System.out.println("-=DFS traversal=-");
    Traverser
        .forGraph(immutableUndirectedGraph)
        .depthFirstPostOrder(secondName)
        .forEach(System.out::println);


    //BFS traversal:
    System.out.println("-=BFS traversal=-");
    Traverser
        .forGraph(immutableUndirectedGraph)
        .breadthFirst(secondName)
        .forEach(System.out::println);

  }
}