package io.github.farrukhjon.experiment.junit5.repetition;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestsTest {

    @Test
    @RepeatedTest(7)
    void testSomeNumberTimes() {

    }
}
