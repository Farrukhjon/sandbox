package io.github.farrukhjon.experiment.java.dp.creational.abstractFactories.solution2;

import io.github.farrukhjon.experiment.java.dp.creational.abstractFactories.solution2.impl.BasketBallFactory;
import io.github.farrukhjon.experiment.java.dp.creational.abstractFactories.solution2.service.AbstractGameFactory;

public class Games {

	public static void main(String[] args) {

		AbstractGameFactory kp = new BasketBallFactory();
		// AbstractGameFactory kd = new FootBallFactory();

		Match game1 = new Match(kp);
		// Match game2 = new Match(kd);

		game1.play();
		// game2.play();
	}
}
