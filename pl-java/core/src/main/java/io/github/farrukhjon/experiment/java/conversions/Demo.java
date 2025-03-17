package io.github.farrukhjon.experiment.java.conversions;

public class Demo {

  public static void main(String[] args) {
    A a = new A();
    B b = (B) a; //ClassCastException
  }

}
