package io.github.farrukhjon.experiment.java.dp.behavioral.command.solution1;

//Receiver class
/**
 * @author Farrukhjon SATTOROV
 */
public class Light {

	private boolean	on;

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public void switchOff() {
		setOn(false);
		System.out.println("light is off");
	}

	public void switchOn() {
		setOn(true);
		System.out.println("light is on");
	}
}
