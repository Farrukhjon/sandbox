package io.github.farrukhjon.experiment.java.language.binding;

public class Parent {

  public static void whoAmI() {
    System.out.println("Inside static method, Parent#whoAmI()");
  }

  private void who() {
    System.out.println("Inside private method Parent#who()");
  }

  public void whoAreYou() {
    who();
    System.out.println("Inside virtual method, Parent#whoAreYou()");
  }
}
