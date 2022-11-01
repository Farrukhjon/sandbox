package io.github.farrukhjon.experiment.algorithms;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class UniquenessTest {

    @Test
    void testIsUniqueCharacters() {

        Uniqueness solution1 = new UniquenessSolution1();

        String str = "Language";
        boolean result = solution1.isUniqueCharacters(str);
        assertFalse(result);

    }
}
