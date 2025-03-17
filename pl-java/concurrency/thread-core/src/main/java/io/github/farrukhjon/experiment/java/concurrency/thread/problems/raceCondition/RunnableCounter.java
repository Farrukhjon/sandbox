package io.github.farrukhjon.experiment.java.concurrency.thread.problems.raceCondition;

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
