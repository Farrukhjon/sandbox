package io.github.farrukhjon.experiment.java.dp.behavioral.chain.solution1;

public interface IChain {

	public abstract void process(Number request);

	public abstract void setNext(IChain nextInChain);

}
