package io.github.farrukhjon.experiment.java.dp.behavioral.state;

public class SilentAlertState implements IMobileAlertState {

	@Override
	public void alert(AlertStateContext context) {
		System.out.println(context.getSilent());
	}

}
