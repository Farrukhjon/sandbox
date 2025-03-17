package io.github.farrukhjon.experiment.java.dp.behavioral.chain.solution1;

/**
 * @author Farrukhjon SATTOROV
 */
public class NegativeProcessor implements IChain {

	private IChain	nextInChain;

	public void process(Number request) {
		if (request.getNumber() < 0) {
			System.out.println("NegativeProcessor : " + request.getNumber());
		} else {
			nextInChain.process(request);
		}
	}

	public void setNext(IChain nextInChain) {
		this.nextInChain = nextInChain;
	}

}
