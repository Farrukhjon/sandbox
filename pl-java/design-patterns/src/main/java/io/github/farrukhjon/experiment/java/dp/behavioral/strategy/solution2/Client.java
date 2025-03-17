package io.github.farrukhjon.experiment.java.dp.behavioral.strategy.solution2;

public class Client {

	public static void main(String[] args) {

		Duck mallardDuck = new MallardDuck();

		mallardDuck.setFlyBehavior(new FlyWithWings());
		mallardDuck.setQuackBehavior(new Quack());

		mallardDuck.performFly();
		mallardDuck.performQuack();

		Duck rabberDuck = new RubberDuck();

		rabberDuck.setFlyBehavior(new FlyNoWay());
		rabberDuck.setQuackBehavior(new MuteQuack());

		rabberDuck.performFly();
		rabberDuck.performQuack();

	}

}
