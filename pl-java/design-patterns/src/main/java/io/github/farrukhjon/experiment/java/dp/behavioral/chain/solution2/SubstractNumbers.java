package io.github.farrukhjon.experiment.java.dp.behavioral.chain.solution2;

public class SubstractNumbers implements IChain {

	private IChain	nextChain;

	@Override
	public void setNextChain(IChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		if (request.getCalcWanted().equals("sub")) {
			System.out.println(request.getNumber1() + "-" + request.getNumber2() + "=" + (request.getNumber1() - request.getNumber2()));
		} else {
			nextChain.calculate(request);
		}
	}

}
