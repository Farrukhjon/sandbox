package io.github.farrukhjon.experiment.java.basic;

public class IncrementExpressionCalc {

  public static void main(String[] args) {
    int result = 0;
    result = ++result;
    System.out.println(result);

    result = 0;
    result = result++;
    System.out.println(result);
  }

}
