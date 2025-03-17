package io.github.farrukhjon.experiment.java.collections.comparators;

import java.util.Comparator;
import java.util.List;

/**
 * @author fsattorov
 */
public class ThenComparing {

    public static void main(String[] args) {
        List<Comparator<AgentMotion>> comparatorList = List.of(
            new AStarAgentMotion(),
            new ShortestPathAgentMotion(),
            new LongestPathAgentMotion()
        );

        Comparator<AgentMotion> comparator = Comparator.comparingInt(agentMotion -> 0);

        for (Comparator<AgentMotion> strategyComparator : comparatorList) {
            comparator = comparator.thenComparing(strategyComparator);
        }

    }

}
