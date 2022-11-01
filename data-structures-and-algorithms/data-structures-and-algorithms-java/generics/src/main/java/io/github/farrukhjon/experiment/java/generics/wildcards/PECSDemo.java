package io.github.farrukhjon.experiment.java.generics.wildcards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PECSDemo {

    public static void main(String[] args) {

        List<Wolf> wolfs = new ArrayList<>();
        wolfs.add(new Wolf());

        List<? extends Animal> animals = wolfs;

        Iterator<? extends Animal> animalIter = animals.iterator();
        while (animalIter.hasNext()) {
            Animal anAnimal = animalIter.next();
            System.out.println(anAnimal);
        }

        // animals.add(new WildAnimal()); //Compile-time error: capture#1 of ?

        List<? super Wolf> allTypesOfWolfs = wolfs;

        allTypesOfWolfs.add(new Wolf());

        allTypesOfWolfs.add(new SiberianWolf());

        Iterator<? super Wolf> iterator = allTypesOfWolfs.iterator();
        while (iterator.hasNext()) {
            Wolf next = (Wolf) iterator.next();
            System.out.println(next);
        }
    }


}

class Animal {

    public String toString() {
        return "I'm an animal";
    }

}

class WildAnimal extends Animal {
    public String toString() {
        return "I'm a wild animal";
    }
}

class Wolf extends WildAnimal {

    public String toString() {
        return "I'm a wolf";
    }

}

class SiberianWolf extends Wolf {

    public String toString() {
        return "I'm a Siberian wolf";
    }

}