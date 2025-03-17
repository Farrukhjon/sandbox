package io.github.farrukhjon.experiment.java.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnionTwoArraysTest {

    /**
     * Subject under test.
     */
    private UnionTwoArrays sut;

    @BeforeEach
    public void setUp() {
        sut = new UnionTwoArrays();
    }

    @Test
    void shouldTestUnionTwoArrays() {
        String[] names1 = {"A", "B", "C", "D"};
        String[] names2 = {"E", "C", "F", "A", "G"};

        String[] unionedNames = sut.union(names1, names2);
    }
}
