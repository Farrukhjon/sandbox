package io.github.farrukhjon.experiment.java.collections.stack;

/**
 * Stack Abstract Data Type (Stack ADT).
 **/

public interface Stack<T> {

    void push(T item);

    T pop();

    boolean isEmpty();

    T peek();

    void printStack();

}

