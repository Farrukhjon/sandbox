package io.github.farrukhjon.experiment.java.dp.behavioral.visitor;

/**
 * @author fsattorov
 */
public interface Visitor {

    void visitCat(CatAnimal cat);
    void visitDog(DogAnimal dog);
}
