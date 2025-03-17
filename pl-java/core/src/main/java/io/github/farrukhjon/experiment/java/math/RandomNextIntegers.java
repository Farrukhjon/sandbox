package io.github.farrukhjon.experiment.java.math;

import java.util.Random;

public class RandomNextIntegers {

    public static void main(String[] args) {
        Random rand = new Random();
        int rndInt = 0;
        do {
            System.out.println("Random number: " + rndInt);
        } while ((rndInt = rand.nextInt(101)) != 100);

    }
}
