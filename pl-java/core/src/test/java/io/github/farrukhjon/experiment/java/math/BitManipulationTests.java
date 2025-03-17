package io.github.farrukhjon.experiment.java.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitManipulationTests {

    @Test
    void testLogicalNOTBitOperation() throws Exception {
        int givenValue = 0b00000000_00000000_00000000_11111111; // 255
        int expecValue = 0b11111111_11111111_11111111_00000000; // -256

        int notGivenValue = ~givenValue; // ~ performs logical negation on each bits, converts bits to opposite value

        assertEquals(expecValue, notGivenValue);
    }

    @Test
    void testLeftArithmeticShift() throws Exception {
        int givenValue = 0b00000000_00000000_00000000_00001010; // 10
        int expecValue = 0b00000000_00000000_00000000_00010100; // 20

        int leftShiftBits = givenValue << 1; // Shifts elder bits for 1 bit to left and filling younger bit to 0; givenValue * 2 = 20

        assertEquals(expecValue, leftShiftBits);
    }

    @Test
    void testRightArithmeticShift() throws Exception {
        int givenValue = 0b00000000_00000000_00000000_00010100; // 20
        int expecValue = 0b00000000_00000000_00000000_00001010; // 10

        int leftShiftBits = givenValue >> 1; // Shifts elder bits for 1 bit to right and filling younger bit to 0; givenValue / 2 = 10

        assertEquals(expecValue, leftShiftBits);
    }
}
