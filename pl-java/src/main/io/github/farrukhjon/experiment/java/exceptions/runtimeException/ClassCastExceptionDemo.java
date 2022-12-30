package io.github.farrukhjon.experiment.java.exceptions.runtimeException;

public class ClassCastExceptionDemo {

  public static void main(String[] args) {

    Object obj = Integer.valueOf(0);
    String str = (String) obj;
  }

}
