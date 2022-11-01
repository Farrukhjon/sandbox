package io.github.farrukhjon.experiment.algorithms;


import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FailFastIteratorsTests {

  private final ArrayList<Integer> numbers = new ArrayList<>();

  @BeforeEach
  public void setUp() {
    for (int i = 0; i <= 9; i++) {
      numbers.add(i);
    }
  }

  @Test
  void failFastIteratingTest() {
    Iterator<Integer> iterator = numbers.iterator();

    iterator.next(); // iteration over the numbers is started here.

    Assertions.assertThrows(ConcurrentModificationException.class, () -> numbers.remove(5));

    iterator.next();

  }
}
