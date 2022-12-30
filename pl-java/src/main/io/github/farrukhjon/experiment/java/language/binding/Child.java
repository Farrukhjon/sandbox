package io.github.farrukhjon.experiment.java.language.binding;

public class Child extends Parent {

  public static void whoAmI() {
    System.out.println("Child#whoAmI()");
  }

  private void who() {
    System.out.println("Child#who()");
  }

  @Override
  public void whoAreYou() {
    who();
    System.out.println("Child#whoAreYou()");
  }
}
