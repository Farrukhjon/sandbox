package io.github.farrukhjon.experiment.java.reflection.method;

import java.lang.reflect.Method;

public class SyntheticMethod {

  public static void main(String[] args) {

    NestedClass nc = new NestedClass();
    System.out.println("Nested Variable:" + " " + nc.privateVariable);
    int a = nc.a; // getting value by synthetic method: access$2

    Double d = nc.d; // access$?
    char ch = nc.ch; // access$?
    String str = nc.str; // access$?

    Class clazz = nc.getClass();
    Method[] methods = clazz.getDeclaredMethods();
    for (Method method : methods) {
      System.out.println("Method name: " + method.getName() + ", isSynthetic: " + method.isSynthetic());
    }
  }

  private static final class NestedClass {
    public String str = "str"; //?
    private Double d = 1.1; //?
    Character ch = 'c'; // ?
    private final String privateVariable = "A Private Variable";
    private final Integer a = 10;
  }
}
