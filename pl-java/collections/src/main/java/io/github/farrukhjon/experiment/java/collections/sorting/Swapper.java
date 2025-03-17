package io.github.farrukhjon.experiment.java.collections.sorting;

public class Swapper<T extends Comparable<T>> {

    public void swap(T[] array, int i, int j) {
        T tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }

}
