package io.github.farrukhjon.experiment.java.recursion;

import io.github.farrukhjon.experiment.java.recursion.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit level test for calculating factorial recursively.
 */
class FactorialTest {

  @Test
  void testFactorial() {
    //factorial method is called
    long factorial_from_0 = Factorial.factorial(0);
    long factorial_from_1 = Factorial.factorial(1);
    long factorial_from_5 = Factorial.factorial(5);
    long factorial_from_10 = Factorial.factorial(10);

    //expected result is returned
    assertEquals(1, factorial_from_0);
    assertEquals(1, factorial_from_1);
    assertEquals(120, factorial_from_5);
    assertEquals(3628800, factorial_from_10);
  }
}
