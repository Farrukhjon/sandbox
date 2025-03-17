

package io.github.farrukhjon.experiment.java.concurrency.immutable;

/**
 * An Instance of this class represents a simplest immutable object which has a final field at all.
 */
public class ImmutableCalculator {

    private final int offset;

    public ImmutableCalculator(final int a) {
        this.offset = a;
    }

    public int add(int b) {
        return offset + b;
    }


}
