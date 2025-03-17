package io.github.farrukhjon.experiment.java.java.concurrency.concurrent.atomic.counter;

public class SynchronizedCounter {

	private int	c	= 0;

	public synchronized void increment() {
		c++;
	}

	public synchronized void decrement() {
		c--;
	}

	public synchronized int value() {
		return c;
	}

}
