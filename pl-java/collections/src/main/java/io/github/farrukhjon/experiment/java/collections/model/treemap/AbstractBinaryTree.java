package io.github.farrukhjon.experiment.java.collections.model.treemap;

/**
 * Binary Tree data structure.
 */
public abstract class AbstractBinaryTree<E> implements BinaryTree<E> {

    private final int size;

    protected AbstractBinaryTree(int size) {
        this.size = size;
    }

    class Node {
        private Node left;
        private Node right;
        private E value;

        public Node(E value) {
            this.value = value;
        }
    }

    public void addNode(E value) {
        Node newNode = new Node(value);
    }

    public int getSize() {
        return size;
    }
}
