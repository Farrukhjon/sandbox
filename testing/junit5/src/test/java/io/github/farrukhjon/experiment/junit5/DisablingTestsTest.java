package io.github.farrukhjon.experiment.junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisablingTestsTest {

    @Test
    void anActiveTestMethod() {

    }

    @Test
    @Disabled("Disabled for some reason")
    void aDisabledTestMethod() {

    }
}
