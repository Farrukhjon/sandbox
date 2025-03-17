package io.github.farrukhjon.experiment.java.collections.linkedlist;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingleLinkedList<T> implements LinkedList<T> {

  private Node head;

  private int n;

  class Node {
    T data;
    Node next;

    public Node(T data) {
      this.data = data;
    }
  }

  @Override
  public void addFirst(T data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
    n++;
  }

  @Override
  public void addLast(T data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node tmp = head;
      while (tmp.next != null) {
        tmp = tmp.next;
      }
      tmp.next = newNode;
    }
    n++;
  }

  @Override
  public T getFirst() {
    return null;
  }

  @Override
  public T getLast() {
    return null;
  }

  @Override
  public void removeFirst() {
    if (head != null) {
      Node tmp = head.next;
      head = tmp;
      n--;
    }
  }

  @Override
  public void removeLast() {
    head = removeLastItem();
  }

  private Node removeLastItem() {
    if (head != null) {
      Node tmp = head;
      while (tmp.next.next != null) // loop until second last node is reached ..next.next != null
      {
        tmp = tmp.next;
      }
      tmp.next = null;
    }
    return head;
  }

  @Override
  public int size() {
    return n;
  }

  @Override
  public void printList() {
    log.info("List: ");
    if (head == null) {
      return;
    }
    Node tmp = head;
    while (tmp != null) {
      log.info(" {} ", tmp.data);
      tmp = tmp.next;
    }
  }

}


