package io.github.farrukhjon.experiment.java.dp.enterprise.di.solution1;

import io.github.farrukhjon.experiment.java.dp.enterprise.di.solution1.behavior.IAInterface;
import io.github.farrukhjon.experiment.java.dp.enterprise.di.solution1.behavior.IBInterface;
import io.github.farrukhjon.experiment.java.dp.enterprise.di.solution1.behavior.ICInterface;

/**
 * @author Farrukhjon SATTOROV
 */
public class ClientClass {

	private IAInterface aInterface;
	private IBInterface bInterface;
	private ICInterface cInterface;

	public ClientClass(IAInterface aInterface, IBInterface bInterface, ICInterface cInterface) {
		this.aInterface = aInterface;
		this.bInterface = bInterface;
		this.cInterface = cInterface;
	}

	// Application logic
	public void doSomeThing() {
		// Do IAInterface specific thing
		// Do IBInterface specific thing
		// Do ICInterface specific thing
	}

	public IAInterface getaInterface() {
		return aInterface;
	}

	public IBInterface getbInterface() {
		return bInterface;
	}

	public ICInterface getcInterface() {
		return cInterface;
	}
}
