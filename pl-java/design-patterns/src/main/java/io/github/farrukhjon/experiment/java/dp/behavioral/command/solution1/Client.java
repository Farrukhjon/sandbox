package io.github.farrukhjon.experiment.java.dp.behavioral.command.solution1;

public class Client {

	public static void main(String[] args) {

		RemoteControl control = new RemoteControl();

		Light light = new Light();

		ICommand lightOn = new LightOnCommand(light);
		ICommand lightOff = new LightOffCommand(light);

		// switching on
		control.setCommand(lightOn);
		control.pressButton();

		// switching off
		control.setCommand(lightOff);
		control.pressButton();
	}
}
