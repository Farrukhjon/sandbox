package io.github.farrukhjon.experiment.algorithms;

public class Stopwatch {

	private final long	start;

	public Stopwatch() {
		start = System.currentTimeMillis();
	}

	public double duration() {
		long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
	}

}
