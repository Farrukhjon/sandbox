package io.github.farrukhjon.experiment.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckContainsValueInUnsortedArray {

    private static double sortDuration = 0;

    public static void main(String[] args) {

        Integer[] a = ArrayGenerator.getInteger(1000000);

        boolean isContains = useList(a, 919892);
        final Stopwatch stopwatch = new Stopwatch();
        double durationUsingList = stopwatch.duration();
        System.out.printf("%-40s %-10s %20s", "duration using list is: ", durationUsingList + " sec", "contains?: " + isContains + "\n");

        isContains = useSet(a, 919892);

        isContains = useLoop(a, 919892);
        final Stopwatch stopwatch3 = new Stopwatch();
        double durationUsingLoop = stopwatch3.duration();
        System.out.printf("%-40s %-10s %20s", "duration using loop is: ", durationUsingLoop + " sec", "contains?: " + isContains + "\n");

        isContains = useArraysBinarySearch(a, 919892);
        final Stopwatch stopwatch4 = new Stopwatch();
        double durationUsingArraysBinarySearch = stopwatch4.duration() - sortDuration;
        System.out.printf("%-40s %-10s %20s", "duration using Arrays.binarySearch() is:", durationUsingArraysBinarySearch + " sec", "contains?: " + isContains + "\n");
    }

    private static boolean useList(Integer[] a, Integer value) {
        return Arrays.asList(a).contains(value);
    }

    private static boolean useSet(Integer[] a, Integer value) {
        Set<Integer> set = new HashSet<>(Arrays.asList(a));
        Stopwatch stopwatch2 = new Stopwatch();
        final boolean contains = set.contains(value);
        double durationUsingSet = stopwatch2.duration();
        System.out.printf("%-40s %-10s %20s", "duration using set is: ", durationUsingSet + " sec", "contains?: " + contains + "\n");
        return contains;
    }

    private static boolean useLoop(Integer[] a, Integer value) {
        for (Integer i : a) {
            if (i.equals(value))
                return true;
        }
        return false;
    }

    private static boolean useArraysBinarySearch(Integer[] a, Integer value) {
        Stopwatch stopwatch5 = new Stopwatch();
        Arrays.sort(a);
        sortDuration = stopwatch5.duration();
        System.out.printf("%-40s %-10s", "Arrays.sort() duration: ", sortDuration + " sec\n");
        return (Arrays.binarySearch(a, value) > 0); // if searched index > 0 then there is the value
    }

}
