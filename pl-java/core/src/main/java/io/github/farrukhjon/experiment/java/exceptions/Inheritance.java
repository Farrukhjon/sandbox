package io.github.farrukhjon.experiment.java.exceptions;

public class Inheritance {

  public static void main(String[] args) {
    try {
      throwsParentException();
    } catch (Exception e) {
      System.out.println(e.getCause());
      System.out.println(e.getClass());
      System.out.println(e);
    }
  }

  private static void throwsParentException() throws Exception {
    throw new RuntimeException(new ParentException("Parent exception is thrown"));
  }

  static class ParentException extends Exception {
    public ParentException(final String message) {
      super(message);
    }
  }

}
