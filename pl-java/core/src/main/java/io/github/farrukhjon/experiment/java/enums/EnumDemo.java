package io.github.farrukhjon.experiment.java.enums;

public class EnumDemo {

  public static void main(String[] args) {
    for (Session s : Session.values()) {
      System.out.println(s);
    }
  }

  private enum Session {
    WINTER, SPRING, SUMMER, AUTUMN
  }

}
