package io.github.farrukhjon.experiment.java.dp.behavioral.strategy.solution2;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("SilentAlertState quack...");
	}

}
