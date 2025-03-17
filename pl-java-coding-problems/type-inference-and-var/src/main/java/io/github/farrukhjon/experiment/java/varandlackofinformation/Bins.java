package io.github.farrukhjon.experiment.java.varandlackofinformation;

import java.io.File;

public final class Bins {

    private Bins() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static File fetchBinContent() {
        return new File(".");
    }
}
