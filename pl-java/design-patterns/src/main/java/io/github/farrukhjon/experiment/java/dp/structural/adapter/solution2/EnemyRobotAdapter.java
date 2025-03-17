package io.github.farrukhjon.experiment.java.dp.structural.adapter.solution2;

//Adapter class
public class EnemyRobotAdapter implements IEnemyAttacker {

	private EnemyRobot	robot;

	public EnemyRobotAdapter(EnemyRobot robot) {
		this.robot = robot;
	}

	@Override
	public void fireWeapon() {
		robot.smashWithHeand();
	}

	@Override
	public void driveForward() {
		robot.walkForward();
	}

	@Override
	public void assignDriver(String driver) {
		robot.reactToHuman(driver);
	}

}
