package io.github.farrukhjon.experiment.java.java.concurrency.communication.ch4;

public class CoffeeShop {

	public static void main(String[] args) {

		CoffeeMachine coffeeMachine = new CoffeeMachine();
		Waiter waiter = new Waiter();

		coffeeMachine.start();
		waiter.start();

	}

}
