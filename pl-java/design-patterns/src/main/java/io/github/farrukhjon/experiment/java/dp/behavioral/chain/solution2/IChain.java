package io.github.farrukhjon.experiment.java.dp.behavioral.chain.solution2;

public interface IChain {

	public void setNextChain(IChain nextChain);

	public void calculate(Numbers request);
}
