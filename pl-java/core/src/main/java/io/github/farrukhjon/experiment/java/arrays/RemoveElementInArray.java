package io.github.farrukhjon.experiment.java.arrays;



import java.util.Arrays;

public class RemoveElementInArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 1};
        int num = 1;
        int newArray[] = removeElement(numbers, num);
        print(newArray);
    }

    private static void print(final int[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    private static int[] removeElement(final int[] numbers, final int num) {
        int newLength = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != num) {
                numbers[newLength] = numbers[i];
                newLength++;
            }
        }
        return Arrays.copyOf(numbers, newLength);
    }

}
