package io.github.farrukhjon.experiment.algorithms;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReverseWordsTest {

    @Test
    public void testReverseWords() {
        ReverseWords reverseWordsSolution1 = new ReverseWordsSolution1();

        assertEquals(reverseWordsSolution1.reverseWords("I like eating"), "eating like I");
        assertEquals(reverseWordsSolution1.reverseWords("I like flying"), "flying like I");
        assertEquals(reverseWordsSolution1.reverseWords("The world is nice"), "nice is world The");
    }
}
