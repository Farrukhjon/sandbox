package io.github.farrukhjon.experiment.guava.graph;

import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GraphHasConnectedNodesTest {

  @Test
  void testWhetherGraphHasConnectedNodes() {
    MutableGraph<String> graph = GraphBuilder
        .undirected()
        .build();
    graph.addNode("Aliev");
    graph.addNode("Vali");
    Assertions.assertFalse(graph.hasEdgeConnecting("Aliev", "Va;i"));
  }
}
