package io.github.farrukhjon.experiment.java.collections.linkedlist;
public interface LinkedList<T> {

    void addFirst(T item);

    void addLast(T item);

    T getFirst();

    T getLast();

    void removeFirst();

    void removeLast();

    int size();

    void printList();

}


