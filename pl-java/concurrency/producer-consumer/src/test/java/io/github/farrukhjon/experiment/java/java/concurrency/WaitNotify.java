

package io.github.farrukhjon.experiment.java.java.concurrency;

public class WaitNotify {

    public static void main(String[] args) {
        Product bred = new Product("Bread");
        new Thread(new Producer(bred)).start();
        new Thread(new Consumer(bred)).start();
    }

    private static class Producer implements Runnable {

        private final Product product;

        private Producer(final Product product) {
            this.product = product;
        }

        @Override
        public void run() {
            synchronized (product) {
                while (true) {
                    try {
                        product.wait(1000);
                        System.out.println("The product " + product + " is produced...");
                        product.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    private static class Consumer implements Runnable {

        private final Product product;

        private Consumer(final Product product) {
            this.product = product;
        }

        @Override
        public void run() {
            synchronized (product) {
                while (true) {
                    try {
                        product.wait();
                        System.out.println("The product " + product + " is consumed...");
                        product.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

    private static class Product {

        private String name;

        public Product(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Product {");
            sb.append("name='").append(name).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }


}
