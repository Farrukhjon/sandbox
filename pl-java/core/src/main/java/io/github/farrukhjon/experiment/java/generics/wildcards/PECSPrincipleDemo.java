package io.github.farrukhjon.experiment.java.generics.wildcards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PECSPrincipleDemo {

    public static void main(String[] args) {

        List<Wolf> wolfs = new ArrayList<>();
        wolfs.add(new Wolf("white"));
        wolfs.add(new Wolf("black"));
        wolfs.add(new Wolf("grey"));

        List<? extends Animal> animals = wolfs;

        for (final Animal anAnimal : animals) {
            System.out.println(anAnimal);
        }

        // animals.add(new WildAnimal()); //Compile-time error: capture#1 of ?

        List<? super Wolf> allTypesOfWolfs = wolfs;

        allTypesOfWolfs.add(new Wolf("white"));

        allTypesOfWolfs.add(new SiberianWolf("black"));

        Iterator<? super Wolf> allWolfsiterator = allTypesOfWolfs.iterator();
        while (allWolfsiterator.hasNext()) {
            Object aWolf = allWolfsiterator.next();
            System.out.println(aWolf);
        }
    }


}

class Animal {

    public String toString() {
        return "I'm an animal";
    }

}

class WildAnimal extends Animal {
    @Override
    public String toString() {
        return "I'm a wild animal";
    }
}

class Wolf extends WildAnimal {

    private final String color;

    public Wolf(final String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "I am a " + this.color + " wolf";
    }

}

class SiberianWolf extends Wolf {

    public SiberianWolf(final String color) {
        super(color);
    }

    @Override
    public String toString() {
        return super.toString() + " siberian";
    }

}