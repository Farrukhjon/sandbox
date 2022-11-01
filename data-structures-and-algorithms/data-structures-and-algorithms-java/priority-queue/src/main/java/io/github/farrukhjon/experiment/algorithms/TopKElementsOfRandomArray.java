package io.github.farrukhjon.experiment.algorithms;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TopKElementsOfRandomArray {

    static PriorityQueue<Integer> getTopKElementsOfArray(int[] array, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i <= k; i++)
            queue.add(array[i]);
        for (int i = 0; i < array.length; i++) {
            int minElement = queue.peek();
            if (minElement < array[i]) {
                queue.poll();
                queue.add(array[i]);
            }
        }
        return queue;
    }

    public static void main(String[] args) {
        int N = 20;
        int k = 5;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = (int) (Math.random() * N * 3);
        PriorityQueue<Integer> topK = getTopKElementsOfArray(arr, k);
        Arrays.sort(arr);
        System.out.print("Sorted random array:");
        for (int i : arr)
            System.out.print(i + ", ");
        System.out.println();

        System.out.print("Top " + k + " elemments from the random array:");
        for (int i = 0; i <= k; i++)
            System.out.print(topK.poll() + ", ");
    }

}
