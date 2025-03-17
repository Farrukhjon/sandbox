package io.github.farrukhjon.experiment.java.oop.polymorphism;

public class DecouplingClientFromApiTypesOfParameterAndReturn {

    interface Movable {
        Number move(Integer steps);
    }

    static class Animal implements Movable {

        @Override
        public Number move(Integer steps) { //accepts type or subtypes and Returns type or Supertype
            if (steps % 2 == 0)
                return 1d;
            return 2;
        }
    }

    public static void main(String[] args) {
        Movable movable = new Animal();
        Client client = new Client(movable);
        client.doWithEvenNum();
        client.doWithOddNum();
    }

    private static class Client {

        private final Movable movable;

        public Client(Movable movable) {
            this.movable = movable;
        }

        public void doWithEvenNum() {
            Number move = movable.move(1);
            int doubleValue = move.intValue();
            System.out.println("Int value is: " + doubleValue);

        }

        public void doWithOddNum() {
            Number move = movable.move(2);
            double doubleValue = move.doubleValue();
            System.out.println("Double value is: " + doubleValue);
        }
    }
}
