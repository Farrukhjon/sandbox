package io.github.farrukhjon.experiment.java.dp.behavioral.templateMethod.ch1;

public class IPhoneCompiler extends CrossCompiler {

	@Override
	protected void collectSource() {
		System.out.println("IPhone specific collect");
	}

	@Override
	protected void compileToTarget() {
		System.out.println("IPhone specific compile");
	}

}
