package io.github.farrukhjon.experiment.java.dp.creational.abstractFactories.solution2;

import io.github.farrukhjon.experiment.java.dp.creational.abstractFactories.solution2.service.AbstractGameFactory;
import io.github.farrukhjon.experiment.java.dp.creational.abstractFactories.solution2.service.Ball;
import io.github.farrukhjon.experiment.java.dp.creational.abstractFactories.solution2.service.Player;

/**
 * @author Farrukhjon SATTOROV
 */
public class Match {

	private Player player;
	private Ball ball;

	public Match(AbstractGameFactory factory) {
		player = factory.makePlayer();
		ball = factory.makeObstacle();
	}

	public void play() {
		player.kick(ball);
	}
}
