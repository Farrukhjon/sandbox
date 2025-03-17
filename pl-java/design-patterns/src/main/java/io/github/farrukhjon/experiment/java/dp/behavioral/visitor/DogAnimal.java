package io.github.farrukhjon.experiment.java.dp.behavioral.visitor;

/**
 * @author fsattorov
 */
public class DogAnimal implements Animal {

    @Override
    public void makeSound() {
        System.out.println("dog says: Gaph!");
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visitDog(this);
    }
}
