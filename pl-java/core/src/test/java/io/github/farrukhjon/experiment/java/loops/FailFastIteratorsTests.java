package io.github.farrukhjon.experiment.java.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class FailFastIteratorsTests {

    private static final ArrayList<Integer> numbers = new ArrayList<>();

    static {
        for (int i = 0; i <= 9; i++) {
            numbers.add(i);
        }
    }

    @Test
    void testThrowsConcurrentModificationException() {
        Iterator<Integer> iterator = numbers.iterator();
        iterator.next(); // loops over the numbers is started here.
        Assertions.assertThrows(ConcurrentModificationException.class, () -> {
            numbers.remove(5);
            iterator.next();
        });
    }

}
