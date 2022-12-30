package io.github.farrukhjon.experiment.java.language;

public class FinalVariableDemo {

  private final Integer intField = 10;
  private final Integer notFinalInt = 12;

  public FinalVariableDemo() {
    printFinal(intField);
    printFinal(notFinalInt);
  }

  public static void main(String[] args) {
    new FinalVariableDemo();
  }

  private void printFinal(final Integer finalParam) {
    System.out.println(finalParam);
  }

}
