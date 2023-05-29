package io.github.farrukhjon.experiment.guava.graph;

import com.google.common.graph.GraphBuilder;
import com.google.common.graph.ImmutableGraph;
import com.google.common.graph.MutableGraph;
import com.google.common.graph.MutableValueGraph;
import com.google.common.graph.ValueGraphBuilder;

public class GraphConstructionsDemo {

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
    System.out.println("-=String view of the immutable graph=-");
    System.out.println(immutableUndirectedGraph);

    // Mutable Undirected Graph Construction:
    final MutableGraph<String> mutableUndirectedGraph = GraphBuilder
        .undirected()
        .build();
    mutableUndirectedGraph.putEdge(secondName, "Vali");
    mutableUndirectedGraph.putEdge(secondName, "Sami");
    mutableUndirectedGraph.putEdge(secondName, "Gani");
    System.out.println("-=String view of the mutable graph=-");
    System.out.println(mutableUndirectedGraph);

    //Weighted Value Graph Construction:
    final MutableValueGraph<String, String> weightedGraph = ValueGraphBuilder
        .directed().build();
    weightedGraph.addNode(secondName);
    weightedGraph.putEdgeValue(secondName, "Vali", "parent");  // also adds nodes 2 and 3 if not already present
    weightedGraph.putEdgeValue(secondName, "Sami", "parent");  // edge values (like Map values) need not be unique
    weightedGraph.putEdgeValue(secondName, "Gani", "parent");  // updates the value for (2,3) to 2.0
    System.out.println("-=String view of the weighted value graph=-");
    System.out.println(weightedGraph);

  }
}