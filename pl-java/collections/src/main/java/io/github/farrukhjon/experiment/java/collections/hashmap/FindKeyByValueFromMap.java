package io.github.farrukhjon.experiment.java.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FindKeyByValueFromMap {

    public static void main(String[] argv) {

        Map<String, String> map = new HashMap<>();

        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");

        String three = findKeyByValue(map, "three");
        System.out.println(three);
        String nullValue = findKeyByValue(map, "hundred");
        System.out.println(nullValue);
    }

    public static <K, V> K findKeyByValue(Map<K, V> map, V value) {
        for (K key : map.keySet()) {
            V valueTmp = map.get(key);
            if (value.equals(valueTmp) && value.hashCode() == valueTmp.hashCode()) {
                return key;
            }
        }
        return null;
    }
}
