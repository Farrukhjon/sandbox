package io.github.farrukhjon.experiment.algorithms;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HashMapTest {

    @Test
    public void testCopmuteMethod() {
        //given:
        Map<String, Integer> map = new HashMap<>();
        map.put("Hello", 5);
        map.put("World", 5);
        map.put("!", 1);

        //when:
        map.compute("Hello", (k, v) -> v * 2);
        map.compute("Privet", (k, v) -> 3);
        map.compute("!", (k, v) -> null);

        //then:
        assertTrue(map.get("Hello") == 10);
        assertTrue(map.get("Privet") == 3);
        assertTrue(map.get("!") == null);
        assertTrue(map.size() == 3);
    }

    @Test
    public void testMerge() {
        //given:
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(4, "D");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "X");
        map2.put(2, "Y");
        map2.put(3, "Z");
        map2.put(5, "W");

        map2.forEach(
                (map2Key, map2Value) -> map1.merge(map2Key, map2Value, (oldValue, newValue) -> newValue)
        );
        //then:
        Map<Integer, String> expectedMap = Map.of(1, "X", 2, "Y", 3, "Z", 4, "D", 5, "W");
        assertEquals(expectedMap, map1);
    }

    @Test
    public void testPutAll() {
        //given:
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(4, "D");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "X");
        map2.put(2, "Y");
        map2.put(3, "Z");
        map2.put(5, "W");

        map1.putAll(map2);
        //then:
        Map<Integer, String> expectedMap = Map.of(1, "X", 2, "Y", 3, "Z", 4, "D", 5, "W");
        assertEquals(expectedMap, map1);
    }

    @Test
    public void testCountingKeysUsingMerge() {
        //given:
        Map<String, Integer> counterMap = new HashMap<>();
        String[] names = {"Ali", "Vali", "Smai", "Gani", "Vali", "Ali", "Vali"};

        //when:
        for (String name : names) {
            counterMap.merge(name, 1, Integer::sum);
        }

        //then:
        assertEquals(2, counterMap.get("Ali"));
        assertEquals(3, counterMap.get("Vali"));
    }
}
