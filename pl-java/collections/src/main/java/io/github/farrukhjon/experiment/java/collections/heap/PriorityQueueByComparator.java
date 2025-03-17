package io.github.farrukhjon.experiment.java.collections.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;

public class PriorityQueueByComparator {

    public static void main(String[] args) {

        PriorityQueue<String> minVowelWordFirstPriorityQueue = new PriorityQueue<>(10, new VowelCountComparator());

        minVowelWordFirstPriorityQueue.add("orange");
        minVowelWordFirstPriorityQueue.add("fig");
        minVowelWordFirstPriorityQueue.add("watermelon");
        minVowelWordFirstPriorityQueue.add("lemon");

        //Print by retrieving and removing from the head of the queue.
        while (!minVowelWordFirstPriorityQueue.isEmpty()) {
            System.out.println(minVowelWordFirstPriorityQueue.remove());
        }
    }

    public static class VowelCountComparator implements Comparator<String> {

        public static final Set<Character> VOWELS = Set.of('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');

        @Override
        public int compare(String aWord, String bWord) {
            return Integer.compare(getVowelCount(aWord), getVowelCount(bWord));
        }

        public int getVowelCount(String word) {
            return Math.toIntExact(word.chars().filter(ch -> VOWELS.contains((char) ch)).count());
        }

    }
}
