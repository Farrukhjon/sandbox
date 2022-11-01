package io.github.farrukhjon.experiment.algorithms;

import java.util.Map;
import java.util.TreeMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeMapTests {

    private Map<String, Integer> names;

    @BeforeEach
    public void setUp() {
        names = new TreeMap<>();
    }

    @Test
    void putMethodInActionWhenKeyIsTheSameAlways() throws Exception {
        for (int i = 20; i <= 32; i += 3) {
            String key = "Ali";
            Integer put = names.put(key, i);
            System.out.printf("\nOld value is returned: %s, and New value is passed: %s", put, names.get(key));
        }
    }
}
