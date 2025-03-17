package io.github.farrukhjon.experiment.java.collections.linkedlist;

import io.github.farrukhjon.experiment.java.collections.linkedlist.LinkedList;
import io.github.farrukhjon.experiment.java.collections.linkedlist.SingleLinkedList;

class SingleLinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> list = new SingleLinkedList<>();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.addFirst("D");
        list.addFirst("E");
        list.addFirst("F");

        list.addLast("X");
        list.addLast("Y");
        list.addLast("Z");

        System.out.printf("Size of list: %s \n", list.size());

        list.printList();

        System.out.println("Remove first element and print");
        list.removeFirst();
        list.printList();

        System.out.println("Remove last element and print");
        list.removeLast();
        list.printList();

    }

}

