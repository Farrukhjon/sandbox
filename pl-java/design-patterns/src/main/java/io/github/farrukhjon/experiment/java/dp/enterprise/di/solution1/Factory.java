package io.github.farrukhjon.experiment.java.dp.enterprise.di.solution1;

import io.github.farrukhjon.experiment.java.dp.enterprise.di.solution1.behavior.IAInterface;
import io.github.farrukhjon.experiment.java.dp.enterprise.di.solution1.behavior.IBInterface;
import io.github.farrukhjon.experiment.java.dp.enterprise.di.solution1.behavior.ICInterface;
import io.github.farrukhjon.experiment.java.dp.enterprise.di.solution1.impl.AImpl;
import io.github.farrukhjon.experiment.java.dp.enterprise.di.solution1.impl.BImpl;
import io.github.farrukhjon.experiment.java.dp.enterprise.di.solution1.impl.CImpl;

public class Factory {

	public ClientClass getClientClass() {
		return new ClientClass(new AImpl(), new BImpl(), new CImpl());
	}

	public ClientClass getClientClass(IAInterface ia, IBInterface ib, ICInterface ic) {
		return new ClientClass(ia, ib, ic);
	}
}
