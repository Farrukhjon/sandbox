package io.github.farrukhjon.experiment.java.dp.behavioral.command.solution1;

//Invoker class
/**
 * @author Farrukhjon SATTOROV
 */
public class RemoteControl {

	private ICommand	command;

	public void pressButton() {
		command.execute();
	}

	public void setCommand(ICommand command) {
		this.command = command;
	}
}
