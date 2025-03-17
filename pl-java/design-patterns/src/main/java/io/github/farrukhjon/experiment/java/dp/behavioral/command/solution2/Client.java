package io.github.farrukhjon.experiment.java.dp.behavioral.command.solution2;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		IElectronicDevice tvDevice = new EDTelevision();

		IElectronicDevice radioDevice = new EDRadio();

		ICommand tvOnCmd = new CommandDeviceOn(tvDevice);

		RemoteControlButton onPressed = new RemoteControlButton(tvOnCmd);
		onPressed.press();

		ICommand radioOnCmd = new CommandDeviceOn(radioDevice);
		onPressed.setCommand(radioOnCmd);
		onPressed.press();

		ICommand radioVolumeUpCmd = new CommandDeviceVolumeUp(radioDevice);
		onPressed.setCommand(radioVolumeUpCmd);
		onPressed.press();
		onPressed.press();
		onPressed.press();

		ICommand tvVolumeUpCmd = new CommandDeviceVolumeDown(tvDevice);
		onPressed.setCommand(tvVolumeUpCmd);
		onPressed.press();
		onPressed.press();
		onPressed.press();

		List<IElectronicDevice> allDevice = new ArrayList<>();
		allDevice.add(tvDevice);
		allDevice.add(radioDevice);

		ICommand allDeviceTornOffCmd = new CommandTurnItAllOff(allDevice);

		onPressed.setCommand(allDeviceTornOffCmd);
		onPressed.press();

	}

}
