package io.github.farrukhjon.experiment.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveOddElementFromList {

    public static void main(String[] args) {

        List<Integer> intArrayList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println("intArrayList before removing odd elements: " + intArrayList);

        removeOddElement(intArrayList);
        //removeOddElement2(intArrayList);
        //removeOddElement3(intArrayList); Throws ConcurrentModificationException
        System.out.println("intArrayList after removing odd elements: " + intArrayList);
        Integer[] integerArray = Arrays.copyOf(intArrayList.toArray(), intArrayList.size(), Integer[].class);
        System.out.println(Arrays.toString(integerArray));
    }

    private static void removeOddElement(List<Integer> integerList) {
        Iterator<Integer> itr = integerList.iterator();
        while (itr.hasNext()) {
            if (itr.next() % 2 == 1) {
                itr.remove();
            }
        }
    }

    private static void removeOddElement2(List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 2 == 1) {
                integerList.remove(i);
            }
        }
    }

    private static void removeOddElement3(List<Integer> integerList) {
        for (Integer ar: integerList) {
            if (ar % 2 == 1) {
                integerList.remove(ar);
            }
        }
    }
}
