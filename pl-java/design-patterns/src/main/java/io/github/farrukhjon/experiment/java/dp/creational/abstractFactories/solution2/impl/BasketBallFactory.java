package io.github.farrukhjon.experiment.java.dp.creational.abstractFactories.solution2.impl;


import io.github.farrukhjon.experiment.java.dp.creational.abstractFactories.solution2.service.AbstractGameFactory;
import io.github.farrukhjon.experiment.java.dp.creational.abstractFactories.solution2.service.Ball;
import io.github.farrukhjon.experiment.java.dp.creational.abstractFactories.solution2.service.Player;

public class BasketBallFactory implements AbstractGameFactory {

	@Override
	public Ball makeObstacle() {
		return new BasketBall();
	}

	@Override
	public Player makePlayer() {
		return new PlayerA();
	}
}
