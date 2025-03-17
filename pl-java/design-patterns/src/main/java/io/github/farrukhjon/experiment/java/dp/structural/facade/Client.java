package io.github.farrukhjon.experiment.java.dp.structural.facade;

import io.github.farrukhjon.experiment.java.dp.structural.facade.subSystem.DVDPlayer;
import io.github.farrukhjon.experiment.java.dp.structural.facade.subSystem.PopcornPopper;
import io.github.farrukhjon.experiment.java.dp.structural.facade.subSystem.Projector;
import io.github.farrukhjon.experiment.java.dp.structural.facade.subSystem.Screen;
import io.github.farrukhjon.experiment.java.dp.structural.facade.subSystem.TheaterLights;
import io.github.farrukhjon.experiment.java.dp.structural.facade.subSystem.Tuner;

public class Client {

	public static void main(String[] args) {

		HomeTheaterFacade facade = new HomeTheaterFacade(new Tuner(), new DVDPlayer(), new Projector(), new Screen(), new TheaterLights(), new PopcornPopper());
		facade.watchMove("Terminator 1");
		facade.endMove();
	}

}
