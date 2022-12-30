package io.github.farrukhjon.experiment.java.arithmetic;

import static java.lang.Math.floor;

public class ModFunction {
  public int mod(int divisible, int divisor) {
    if (divisor == 0) {
      throw new IllegalArgumentException("The divisor can't be 0");
    }
    double a = (double) divisible / (double) divisor;
    return (int) (divisible - divisor * floor(a));
  }
}
