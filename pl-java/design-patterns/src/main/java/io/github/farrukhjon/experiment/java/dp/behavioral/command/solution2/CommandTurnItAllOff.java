package io.github.farrukhjon.experiment.java.dp.behavioral.command.solution2;

import java.util.List;

public class CommandTurnItAllOff implements ICommand {

	private List<IElectronicDevice>	devices;

	public CommandTurnItAllOff(List<IElectronicDevice> devices) {
		this.devices = devices;
	}

	@Override
	public void execute() {
		for (IElectronicDevice device : devices) {
			device.off();
		}
	}
}
