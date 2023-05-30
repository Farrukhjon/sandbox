package io.github.farrukhjon.experiment.guava.graph.builders;

import com.google.common.graph.MutableValueGraph;
import com.google.common.graph.ValueGraphBuilder;

public class ValueGraphBuilderDemo {

  public static void main(String[] args) {

    final String secondName = "Aliev";
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