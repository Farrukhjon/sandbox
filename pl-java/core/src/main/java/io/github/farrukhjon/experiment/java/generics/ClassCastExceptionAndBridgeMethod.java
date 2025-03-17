package io.github.farrukhjon.experiment.java.generics;

public class ClassCastExceptionAndBridgeMethod {

    public static void main(String[] args) {
        MyNode myIntNode = new MyNode(7);
        Node aNode = myIntNode;
        aNode.setData("one"); //class String cannot be cast to class Integer
        aNode.setData(1); // it works!

    }

    private static class Node<T> {

        private T data;

        public Node(final T data) {
            this.data = data;
        }

        public void setData(final T data) {
            System.out.println(data);
            this.data = data;
        }
    }

    private static class MyNode extends Node<Integer> {
        public MyNode(Integer data) {
            super(data);
        }

        @Override
        public void setData(Integer data) {
            System.out.println("MyNode.setData");
            super.setData(data);
        }
    }

}
