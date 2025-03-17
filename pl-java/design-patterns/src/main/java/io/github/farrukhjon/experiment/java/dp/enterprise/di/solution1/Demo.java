package io.github.farrukhjon.experiment.java.dp.enterprise.di.solution1;

import io.github.farrukhjon.experiment.java.dp.enterprise.di.solution1.impl.AImpl;
import io.github.farrukhjon.experiment.java.dp.enterprise.di.solution1.impl.BImpl;
import io.github.farrukhjon.experiment.java.dp.enterprise.di.solution1.impl.CImpl;

public class Demo {

	public static void main(String[] args) {

		ClientClass clientClass = new Factory().getClientClass();
		clientClass.doSomeThing();

		clientClass = new Factory().getClientClass(new AImpl(), new BImpl(), new CImpl());
		clientClass.doSomeThing();
	}
}
