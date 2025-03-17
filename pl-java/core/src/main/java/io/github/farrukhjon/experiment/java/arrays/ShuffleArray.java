package io.github.farrukhjon.experiment.java.arrays;

/**
 * @author fsattorov
 */
public class ShuffleArray {

    public static void main(String[] args) {
        Integer[] years = {2022, 2023, 2024, 2025, 2026};
        var shufflerIntArr = new ArrayShuffler<Integer>(years);
        shufflerIntArr.print();
        shufflerIntArr.shuffle();
        shufflerIntArr.print();

        String[] names = {"Ali", "Vali", "Gani", "Sami"};
        var shufflerStrArr = new ArrayShuffler<String>(names);
        shufflerStrArr.print();
        shufflerStrArr.shuffle();
        shufflerStrArr.print();
    }

    private static class ArrayShuffler<T> extends ArrayUtil<T> {

        private final T[] array;

        public ArrayShuffler(final T[] array) {
            super(array);
            this.array = array;
        }

        public void shuffle() {
            for (int i = 0; i < this.array.length; i++) {
                final int randomPos = (int) (Math.random() * (i + 1));
                swapArray(this.array, randomPos, i);
            }
        }

    }
}
