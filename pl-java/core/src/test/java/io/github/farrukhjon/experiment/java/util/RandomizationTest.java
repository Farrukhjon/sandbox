package io.github.farrukhjon.experiment.java.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @author fsattorov
 */
public class RandomizationTest {

    @Test
    void testRandomInts() {
        final Random randomizer = new Random();
        int int1 = randomizer.nextInt();
        int int2 = randomizer.nextInt();
        int int3 = randomizer.nextInt();

        Assertions.assertNotEquals(int1, int2);
        Assertions.assertNotEquals(int1, int3);
        Assertions.assertNotEquals(int2, int3);
    }
}
