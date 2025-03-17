package io.github.farrukhjon.experiment.java.collections.model.treemap;

public class BinaryTreeHeight {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree("data");
        tree.left = new BinaryTree("lData");
        tree.left.left = new BinaryTree("llData");
        tree.right = new BinaryTree("rData");
        tree.right.right = new BinaryTree("rrData");
        tree.right.right.right = new BinaryTree("rrrData");
        int btHeight = findBtHeight(tree);
        System.out.printf("Height of the binary tree is %s", btHeight);
    }

    private static int findBtHeight(BinaryTree tree) {
        if (tree == null)
            return 0;
        int leftHeight = findBtHeight(tree.left);
        int rightHeight = findBtHeight(tree.right);
        return Math.max(leftHeight, rightHeight) + 1; //1 is counting value
    }

    private static class BinaryTree {
        BinaryTree left;
        BinaryTree right;
        private final Object data;
        public BinaryTree(Object data) {
            this.data = data;
        }
    }
}
