package io.github.farrukhjon.experiment.java.dp.structural.proxy.solution1;

public class Proxy implements ProxyBase {

	private ProxyBase	implementation;

	public Proxy() {
		implementation = new ProxyBaseImpl();
	}

	public Proxy(ProxyBase implementation) {
		this.implementation = implementation;
	}

	@Override
	public void taskOne() {
		implementation.taskOne();
	}

	@Override
	public void taskThree() {
		implementation.taskThree();
	}

	@Override
	public void taskTwo() {
		implementation.taskTwo();
	}
}
