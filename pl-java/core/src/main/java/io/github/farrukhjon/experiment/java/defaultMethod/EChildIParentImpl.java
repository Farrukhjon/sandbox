package io.github.farrukhjon.experiment.java.defaultMethod;

public class EChildIParentImpl implements IParent, IParent2 {

  @Override
  public void print() {
    IParent.super.print(); //Overriden, since inherits unrelated defaults for print() from types IParent and IParent2
  }
}
