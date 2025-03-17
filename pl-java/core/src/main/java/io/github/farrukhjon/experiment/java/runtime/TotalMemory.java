package io.github.farrukhjon.experiment.java.runtime;

public class TotalMemory {

  public static void main(String[] args) {
    long mem = Runtime.getRuntime().totalMemory();
    System.out.println(mem / 1000000F);
  }
}
