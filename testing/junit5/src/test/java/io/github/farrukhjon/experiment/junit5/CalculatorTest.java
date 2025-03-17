package io.github.farrukhjon.experiment.junit5;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void testAddNumbers() {
        BigInteger a = BigInteger.valueOf(1L);
        BigInteger b = BigInteger.valueOf(2L);
        BigInteger c = calculator.add(a, b);
        assertEquals(BigInteger.valueOf(3), c);
    }

}
