package io.github.farrukhjon.experiment.java.dp.creational.abstractFactories.solution2.impl;

import io.github.farrukhjon.experiment.java.dp.creational.abstractFactories.solution2.service.Ball;
import io.github.farrukhjon.experiment.java.dp.creational.abstractFactories.solution2.service.Player;

public class PlayerB implements Player {

	@Override
	public void kick(Ball ball) {
		System.out.println("Player B");
		ball.action();
	}
}
