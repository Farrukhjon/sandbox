package io.github.farrukhjon.experiment.java.defaultMethod;

public interface IParent {

  default void print() {
    System.out.println("Printing from the IParent Interface");
  }

}
