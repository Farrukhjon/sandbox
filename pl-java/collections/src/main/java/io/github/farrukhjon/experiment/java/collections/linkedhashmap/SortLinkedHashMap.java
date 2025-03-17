package io.github.farrukhjon.experiment.java.collections.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortLinkedHashMap {

    public static void main(String[] args) {

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("X", 0);
        linkedHashMap.put("D", 1);
        linkedHashMap.put("F", 2);
        linkedHashMap.put("A", 3);
        linkedHashMap.put("S", 4);

        System.out.println("Insertion-Order Map (LinkedHashMap): " + linkedHashMap);
        Map<String, Integer> treeMap = new TreeMap<>(linkedHashMap);
        System.out.println("Key-Order Map (TreeMap): " + treeMap);
    }

}
