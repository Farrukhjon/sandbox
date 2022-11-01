package io.github.farrukhjon.experiment.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateElementsInArray {

    public static void main(String[] args) {
        String[] names = {"Ali", "Vali", "Sami", "Gani", "Jomi", "Vali", "Karomat", "Salomat", "Ibidat", "Karomat"};
        //List<String> duplicates = findDuplicates(names);
        //System.out.println("Duplicate elements: " + duplicates);

        int[] numbers = {0, 1, 2, 3, 4, 5, 3, 5, 7, 8, 9, 1};
        List<Integer> duplicates = findDuplicateNumbers2(numbers);
        System.out.println("Duplicate elements: " + duplicates);
    }

    private static List<String> findDuplicates(final String[] names) {
        List<String> duplicates = new ArrayList<>();
        HashSet<String> helperSet = new HashSet<>();
        for (String s : names) {
            boolean contains = helperSet.add(s);
            if (!contains) {
                duplicates.add(s);
            }
        }
        return duplicates;
    }

    /**
     * Time complexity O(n)
     * Space complexity O(1)
     * But the source array will be altered after method done.
     *
     * @param array
     */
    public static List<Integer> findDuplicateNumbers(int[] array) {
        List<Integer> dups = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i != array[i] && array[i] == array[array[i]]) {
                dups.add(array[i]);
                array[array[i]] = i;
            }
        }
        return dups;
    }

    /**
     * Time complexity O(n)
     * Space complexity O(n)
     *
     * @param array
     */
    public static List<Integer> findDuplicateNumbers2(int[] array) {
        int[] arrayCopy = new int[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, array.length);
        List<Integer> dups = new ArrayList<>();
        for (int i = 0; i < arrayCopy.length; i++) {
            if (i != arrayCopy[i] && arrayCopy[i] == arrayCopy[arrayCopy[i]]) {
                dups.add(arrayCopy[i]);
                arrayCopy[arrayCopy[i]] = i;
            }
        }
        return dups;
    }

    //Doesn't work for all case dups.
    public static int duplicate(int[] numbers) {
        int length = numbers.length;
        int sum1 = 0;
        for (int number : numbers) {
            if (number < 0 || number > length - 2) {
                throw new IllegalArgumentException("Invalid number... " + number);
            }
            sum1 += number;
        }
        int sum2 = ((length - 1) * (length - 2)) >> 1;
        return sum1 - sum2;

    }

    public List<String> findDuplicates2(final String[] array) {
        ArrayList<String> duplicates = new ArrayList<>();
        int size = array.length - 1;
        for (int i = 0; i < size; i++) {
            String s = array[i];
            for (int j = i; j < size; j++) {
                if (s.equals(array[j + 1])) {
                    duplicates.add(array[i]);
                }
            }
        }
        return duplicates;
    }


}
