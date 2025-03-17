package io.github.farrukhjon.experiment.java.metaprogrammingandreflection.method;

import java.lang.reflect.Method;
import java.util.Vector;

public class GetAllMethodsFromString {

  public static void main(String[] args) throws SecurityException, NoSuchMethodException {

    Method[] method = String.class.getMethods();
    for (int i = 0; i < method.length; i++) {
      System.out.println(method[i].toString());
    }
    System.out.println("--------------------------------------");
    Method m = Vector.class.getMethod("get", int.class);
    System.out.println(m);
  }
}
