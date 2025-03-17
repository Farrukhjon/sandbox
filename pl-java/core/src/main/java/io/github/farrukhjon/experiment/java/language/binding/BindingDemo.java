package io.github.farrukhjon.experiment.java.language.binding;

public class BindingDemo {

  public static void main(String[] args) {

    Parent p = new Child();

    Parent.whoAmI(); // static method, resolved at compile time
    p.whoAreYou(); // virtual method, runtime resolution
  }
}
