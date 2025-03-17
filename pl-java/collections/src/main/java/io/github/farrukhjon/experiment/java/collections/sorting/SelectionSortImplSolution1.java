package io.github.farrukhjon.experiment.java.collections.sorting;

public class SelectionSortImplSolution1<T extends Comparable<T>> implements SelectionSort<T> {

    private final Swapper<T> swapper;

    public SelectionSortImplSolution1() {
        this.swapper = new Swapper<>();
    }

    @Override
    public void sort(T[] array) {
        int count = array.length;
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    swapper.swap(array, i, j);
                }
            }
        }
    }

}
