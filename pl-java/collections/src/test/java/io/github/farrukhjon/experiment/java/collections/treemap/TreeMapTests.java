package io.github.farrukhjon.experiment.java.collections.treemap;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTests {

    @Test
    void putMethodInActionWhenKeyIsTheSameAlways() throws Exception {
        Map<String, Integer> names = new TreeMap<>();
        for (int newVal = 20; newVal <= 32; newVal += 3) {
            String key = "Ali";
            Integer oldVal = names.put(key, newVal);
            System.out.printf("\nOld value is returned: %s, and New value is put: %s", oldVal, names.get(key));
        }
    }
}
