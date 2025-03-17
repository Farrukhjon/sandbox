package io.github.farrukhjon.experiment.java.dp.behavioral.visitor;

/**
 * @author fsattorov
 */
public class CatAnimal implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat says: meow!");
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visitCat(this);
    }

}
