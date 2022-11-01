package io.github.farrukhjon.experiment.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit level test for calculating fibonacci recursively.
 */
class FibonacciTest {

  @Test
  void fibonacciTest() {
    //subject under test is created.
    Fibonacci fibonacci = new Fibonacci();

    //and, the helping values holder is created.
    long[] fibonaccies = new long[10];

    // method fibonacci is called
    for (int i = 0; i < 10; i++) {
      fibonaccies[i] = fibonacci.fibonacci(i);
    }

    //expected result is returned.
    assertEquals(0, fibonaccies[0]);
    assertEquals(1, fibonaccies[1]);
    assertEquals(1, fibonaccies[2]);
    assertEquals(2, fibonaccies[3]);
    assertEquals(3, fibonaccies[4]);
    assertEquals(5, fibonaccies[5]);
    assertEquals(8, fibonaccies[6]);
    assertEquals(13, fibonaccies[7]);
    assertEquals(21, fibonaccies[8]);
    assertEquals(34, fibonaccies[9]);
  }
}
