package io.github.farrukhjon.experiment.algorithms;

import static java.lang.System.out;

public class SwapTwoValuesOfIntegerInPlace {

    public static void main(String[] args) {
        int x = 11;
        int y = 10;
        out.println("before A:" + x);
        out.println("before B:" + y);
        x = x + y; // 11+10=21; 21
        y = x - y; // 21-10=11; 11
        x = x - y; //21-11=10; 10
        out.println("after A:" + x);
        out.println("after B:" + y);
    }

}
