package io.github.farrukhjon.experiment.java.bitwise;

/**
 * << - Left shift: Multiply a Value by 2^n (Power of Two)
 * >> - Right shift: Divide a Value by 2^n (Power of Two)
 * The Value should be an Integral type: int, long, short, byte and char
 * n - is an integer value from 0 to max int value
 */
public class ShiftOperatorsDemo {
    public static void main(String[] args) {
        //Shift Left Operator "<<". Shifting a Value to the Left (<<) results in Multiplying the Value by a Power of 2. Like
        // The general form of a left shift operation is: value << number-of-bits
        //Example: 1 << numberOfBits = 1 * 2^numberOfBits
        int val = 1;
        for (int numberOfBits = 1; numberOfBits <= 10; numberOfBits++) {
            int powerOfTwo = val << numberOfBits; // val * 2^numberOfBits.
            String powerOfTwoBitsStr = Integer.toBinaryString(powerOfTwo);
            System.out.printf("%s * 2^%s is %s [bary rep: %s] %n", val, numberOfBits, powerOfTwo, powerOfTwoBitsStr);
        }

        int val1 = 1024;
        for (int numberOfBits = 1; numberOfBits <=10; numberOfBits++) {
            int powerOfTwo = val1 >> numberOfBits; // val1/ * 2^numberOfBits.
            String powerOfTwoBitsStr = Integer.toBinaryString(powerOfTwo);
            System.out.printf("%s / 2^%s is %s [bary rep: %s] %n", val1, numberOfBits, powerOfTwo, powerOfTwoBitsStr);
        }
    }
}
