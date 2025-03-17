package io.github.farrukhjon.experiment.java.dp.behavioral.command.solution2;

public class CommandDeviceVolumeUp implements ICommand {

	private IElectronicDevice	device;

	public CommandDeviceVolumeUp(IElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.volumeUp();
	}
}
