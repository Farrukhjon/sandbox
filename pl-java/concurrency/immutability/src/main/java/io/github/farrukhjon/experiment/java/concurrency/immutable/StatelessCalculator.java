

package io.github.farrukhjon.experiment.java.concurrency.immutable;

/**
 * An Instance of this class represents a simplest immutable object which has no internal fields at all.
 */
public class StatelessCalculator {

    public int add(int a, int b) {
        return a + b;
    }

}
