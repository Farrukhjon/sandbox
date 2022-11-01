package io.github.farrukhjon.experiment.algorithms;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayListOperationsTest {

    private List<Integer> ints;

    @BeforeEach
    public void setUp() {
        ints = new ArrayList<>();
        for (int number = 1; number <= 5; number++) {
            ints.add(number);
        }
    }

    @Test
    public void test() throws Exception {
        Integer remove = ints.remove(3);

    }
}
