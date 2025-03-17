package io.github.farrukhjon.experiment.java.dp.behavioral.visitor;

/**
 * @author fsattorov
 */
public class VisitorImpl implements Visitor {

    @Override
    public void visitCat(CatAnimal cat) {
        System.out.println("Cat: walking...");
    }

    @Override
    public void visitDog(final DogAnimal dog) {
        System.out.println("Dog: walking...");
    }

}
