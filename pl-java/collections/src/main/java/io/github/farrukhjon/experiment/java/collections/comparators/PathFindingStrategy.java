package io.github.farrukhjon.experiment.java.collections.comparators;

/**
 * @author fsattorov
 */
public enum PathFindingStrategy {

    A_STAR(0),

    SHORTEST_PATH(1),

    LONGEST_PATH(100);

    private final int value;

    PathFindingStrategy(final int pathWight) {
        this.value = pathWight;
    }

    @Override
    public String toString() {
        return String.format("path wight: %s", this.value);
    }
}
