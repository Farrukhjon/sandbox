package io.github.farrukhjon.experiment.java.arrays;

/**
 * @author fsattorov
 */
public class ArrayUtil<T> {

    private final T[] array;

    public ArrayUtil(final T[] array) {
        this.array = array;
    }

    protected void swapArray(final T[] arr, final int j, final int i) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    protected void print() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        final int length = this.array.length;
        for (int i = 0; i < length; i++) {
            sb.append(this.array[i]);
            if (i < length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }

}
