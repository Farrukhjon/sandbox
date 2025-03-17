package io.github.farrukhjon.experiment.java.dp.creational.builder.solution3;

public class RobotEngeneer {

	private RobotBuilder	robotBuilder;

	public RobotEngeneer(RobotBuilder robotBuilder) {
		this.robotBuilder = robotBuilder;
	}

	public void makeRobot() {
		robotBuilder.buildRobotHead();
		robotBuilder.buildRobotTorso();
		robotBuilder.buildRobotArms();
		robotBuilder.buildRobotLegs();
	}

	public Robot getRobot() {
		return robotBuilder.getRobot();
	}

}
