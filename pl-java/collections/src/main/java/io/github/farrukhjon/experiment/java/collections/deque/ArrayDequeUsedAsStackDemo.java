package io.github.farrukhjon.experiment.java.collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Push and Pop operations from stack (ArrayDeque).
 */
public class ArrayDequeUsedAsStackDemo {

  public static void main(String[] args) {

    final Deque<Integer> arrayDequeAsStack = new ArrayDeque<>();
    for (int i = 0; i < 100; i++) {
      if (i % 2 == 0) {
        arrayDequeAsStack.push(i); // pushes an element at the head of the deque.
      }
    }

    // Pops all elements from the stack represented by this deque.
    // Removes and returns the first (from head) element of this deque
    while (!arrayDequeAsStack.isEmpty()) {
      System.out.printf("Item: %s \n", arrayDequeAsStack.pop());
    }

/*    arrayDequeAsStack
        .forEach(item -> System.out.printf("Item: %s \n", item));*/
  }

}