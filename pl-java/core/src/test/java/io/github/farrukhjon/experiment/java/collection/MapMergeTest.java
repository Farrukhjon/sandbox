package io.github.farrukhjon.experiment.java.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMergeTest {

    @Test
    public void mergeIntoMap() {
        List<String> letters = Arrays.asList("A", "AA", "CC", "DDE", "S");
        Map<String, Integer> map = new HashMap<>();

        for (String letter : letters) {
            map.put(letter, letter.length());
            map.merge(letter, letter.length() * 2, Integer::sum);
        }
        Assert.assertTrue(map.isEmpty());
    }
}
