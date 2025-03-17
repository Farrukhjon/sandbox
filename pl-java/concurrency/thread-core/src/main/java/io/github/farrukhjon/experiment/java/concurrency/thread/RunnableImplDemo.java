package io.github.farrukhjon.experiment.java.concurrency.thread;

public class RunnableImplDemo implements Runnable {

	public static void main(String[] args) {
		Thread thread = new Thread(new RunnableImplDemo());
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("Hello from thread");
	}

}
