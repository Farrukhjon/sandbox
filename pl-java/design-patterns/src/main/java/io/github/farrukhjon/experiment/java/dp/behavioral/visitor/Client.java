package io.github.farrukhjon.experiment.java.dp.behavioral.visitor;

/**
 * @author fsattorov
 */
public class Client {

    public static void main(String[] args) {
        Animal cat = new CatAnimal();
        cat.makeSound();

        Animal dog = new DogAnimal();
        dog.makeSound();

        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            animal.accept(new VisitorImpl());
        }
    }

}
