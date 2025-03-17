package io.github.farrukhjon.experiment.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfTwoIntsTest {

    @Test
    void testName() {
        var summer = new SumOfTwoInts();

        int result = summer.sum(10, 20);

        Assertions.assertEquals(30, result);
    }


    
}
