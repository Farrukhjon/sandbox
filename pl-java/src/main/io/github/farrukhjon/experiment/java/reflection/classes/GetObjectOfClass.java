package io.github.farrukhjon.experiment.java.reflection.classes;

public class GetObjectOfClass {

  public static void main(String[] args) {
    Class<?> c = Integer.class;
    System.out.println(c.getCanonicalName());
    System.out.println(c.getSuperclass().getName());
    System.out.println(c.getModifiers());
  }
}
