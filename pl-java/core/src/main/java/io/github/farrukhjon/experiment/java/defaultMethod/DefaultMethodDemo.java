package io.github.farrukhjon.experiment.java.defaultMethod;

public class DefaultMethodDemo {

  public static void main(String[] args) {
    IParent aChild = new AChildIParentImpl();
    aChild.print();

    IParent bChild = new BChildIParentImpl();
    bChild.print();

    IParent cChild = new CChildIParentImpl();
    cChild.print();

    IParent eChild = new EChildIParentImpl();
    eChild.print();
  }

}
