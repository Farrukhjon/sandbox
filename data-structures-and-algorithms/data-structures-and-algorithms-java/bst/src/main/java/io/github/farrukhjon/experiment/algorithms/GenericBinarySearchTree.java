package io.github.farrukhjon.experiment.algorithms;

/**
 * Complete me!
 **/
public class GenericBinarySearchTree<K extends Comparable<K>, V> {

  private Node root;

  class Node {
    K key;
    V value;
    Node left;
    Node right;

    public Node(K key, V value) {
      this.key = key;
      this.value = value;
    }

  }


} 
