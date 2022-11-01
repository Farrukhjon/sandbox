package io.github.farrukhjon.experiment.algorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ConcatTwoArraysInANewArrayTest {

    private final String[] maleNames = {"Ali", "Vali", "Sami", "Gani", "Jomi"};
    private final String[] femaleName = {"Salomat", "Ibodat", "Sabohat"};
    private final String[] expectedConcatenatedAllNames = {"Ali", "Vali", "Sami", "Gani", "Jomi", "Salomat", "Ibodat", "Sabohat"};

    @Test
    public void testConcatTwoArraysByArraysCopyOfAndSystemArrayCopy() {
        //when:
        String[] allNames = ConcatTwoArraysInANewArray.concatByArraysCopyOfAndSystemArrayCopy(maleNames, femaleName);

        //then:
        assertArrayEquals(expectedConcatenatedAllNames, allNames);
    }

    @Test
    public void testConcatTwoArraysByArraysCopyOfAndSystemArrayCopy2() {
        //when:
        String[] allNames = ConcatTwoArraysInANewArray.concatByArraysCopyOfAndSystemArrayCopy2(maleNames, femaleName);

        //then:
        assertArrayEquals(expectedConcatenatedAllNames, allNames);
    }

    @Test
    public void testConcatTwoArraysByStreamConcatMethod() {
        //when:
        String[] allNames = ConcatTwoArraysInANewArray.concatByStreamConcatApi(maleNames, femaleName);

        //then:
        assertArrayEquals(expectedConcatenatedAllNames, allNames);
    }

    @Test
    public void testConcatTwoArraysByStreamFlatMapMethod() {
        //when:
        String[] allNames = ConcatTwoArraysInANewArray.concatByStreamFlatMapApi(maleNames, femaleName);

        //then:
        assertArrayEquals(expectedConcatenatedAllNames, allNames);
    }
}