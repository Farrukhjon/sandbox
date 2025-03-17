package io.github.farrukhjon.experiment.java.java.concurrency.problems.raceCondition;

public class RunnableCounter implements Runnable {

	public void inc(){
		Counter.count++;
		System.out.println(Counter.count + " ");
	}

	@Override
	public void run() {
		inc();
		inc();
		inc();
	}

}
