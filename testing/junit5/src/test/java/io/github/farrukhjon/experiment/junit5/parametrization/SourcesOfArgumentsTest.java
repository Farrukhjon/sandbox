package io.github.farrukhjon.experiment.junit5.parametrization;

import io.github.farrukhjon.experiment.junit5.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SourcesOfArgumentsTest {

    Calculator calculator = new Calculator();

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, 11})
    void testIsNumberOdd(int arg) {
        final boolean result = calculator.isOdd(arg);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4, 6, 8, 10})
    void testIsNumberEven(int arg) {
        final boolean result = calculator.isEven(arg);
        Assertions.assertTrue(result);
    }

}
