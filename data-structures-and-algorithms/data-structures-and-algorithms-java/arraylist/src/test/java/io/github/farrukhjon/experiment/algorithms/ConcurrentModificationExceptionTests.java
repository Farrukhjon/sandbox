package io.github.farrukhjon.experiment.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ConcurrentModificationExceptionTests {

    @Test
    public void shouldNotThrowConcurrentModificationException() {
        String phoneToRemove = "iPhone 5";

        int expectedSizeBefore = 5;
        int expectedSizeAfter = 4;

        List<String> listOfPhones = new ArrayList<>();
        listOfPhones.add("iPhone 6S");
        listOfPhones.add("iPhone 6");
        listOfPhones.add("iPhone 5");
        listOfPhones.add("Samsung Galaxy 4");
        listOfPhones.add("Lumia Nokia");

        assertEquals(expectedSizeBefore, listOfPhones.size());

        for (Iterator<String> itr = listOfPhones.iterator(); itr.hasNext(); ) {
            String phone = itr.next();
            if (phone.equals(phoneToRemove)) {
                itr.remove();
            }
        }

        assertEquals(expectedSizeAfter, listOfPhones.size());
    }
}
