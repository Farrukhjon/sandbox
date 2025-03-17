package io.github.farrukhjon.experiment.junit5;

import java.math.BigInteger;

public class Calculator {
    public BigInteger add(BigInteger a, BigInteger b) {
        return a.add(b);
    }

    public boolean isOdd(int arg) {
        return arg % 2 == 1;
    }

    public boolean isEven(int arg) {
        return arg % 2 == 0;
    }
}
