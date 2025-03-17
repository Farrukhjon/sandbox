package io.github.farrukhjon.experiment.java.dp.structural.bridge;


/**
 * Concrete implementation 1 for bridge pattern
 * */

public class Produce implements IWorkshop {

	@Override
	public void work() {
		System.out.print("Producing...");
	}
}
