package io.github.farrukhjon.experiment.java.arithmetic;

// see https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.17.3
public class FloatingPointRemainderOperator {

  public static void main(String[] args) {
    double a = 5.0 % 3.0;  // 2.0

    double b = 5.0 % (-3.0);  // 2.0
    System.out.println("5.0%(-3.0) produces " + b);

    double c = (-5.0) % 3.0;  // -2.0
    System.out.println("(-5.0)%3.0 produces " + c);

    double d = (-5.0) % (-3.0);  // -2.0
    System.out.println("(-5.0)%(-3.0) produces " + d);
  }
}
