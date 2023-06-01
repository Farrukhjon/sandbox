package io.github.farrukhjon.experiment.guava.graph.algorithms;

import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;
import java.util.HashSet;
import java.util.Set;

public class TraversingUndirectedGraphByNodes {

  public static void main(String[] args) {
    final MutableGraph<String> graph = GraphBuilder
        .<String>undirected()
        .build();
    final String firstName = "Aliev";
    graph.putEdge(firstName, "Vali");
    graph.putEdge(firstName, "Sami");
    graph.putEdge(firstName, "Gani");

    final Set<String> setNodes = new HashSet<>();
    for (String neighborNode : graph.adjacentNodes("Sami")) {
      setNodes.addAll(graph.adjacentNodes(neighborNode));
    }
    setNodes.remove("Sami");
    System.out.println(setNodes);
  }

}
