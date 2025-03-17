package io.github.farrukhjon.experiment.java.defaultMethod;

public interface IParent2 {

  default void print() {
    System.out.println("Printing from the IParent2 Interface");
  }

}
