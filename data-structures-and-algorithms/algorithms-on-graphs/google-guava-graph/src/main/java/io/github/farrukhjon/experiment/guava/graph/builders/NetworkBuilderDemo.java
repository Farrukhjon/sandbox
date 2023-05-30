package io.github.farrukhjon.experiment.guava.graph.builders;

import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;

public class NetworkBuilderDemo {

  public static void main(String[] args) {

    final MutableNetwork<String, String> mutableNetwork = NetworkBuilder
        .undirected()
        .build();
    mutableNetwork.addEdge("A", "B", "100");
    mutableNetwork.addEdge("A", "C", "101");
    mutableNetwork.addEdge("A", "D", "102");

    System.out.println(mutableNetwork);
  }

}
