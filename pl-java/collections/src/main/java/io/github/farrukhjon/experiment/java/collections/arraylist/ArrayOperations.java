package io.github.farrukhjon.experiment.java.collections.arraylist;


public class ArrayOperations {

    public static int delete(int[] a, int index) {
        int deletedVale = a[index];
        int size = a.length;
        System.arraycopy(a, index + 1, a, index, size - index - 1);
        return deletedVale;
    }

}
