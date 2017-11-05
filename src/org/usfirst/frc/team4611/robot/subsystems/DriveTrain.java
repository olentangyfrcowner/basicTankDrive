package org.usfirst.frc.team4611.robot.subsystems;

import org.usfirst.frc.team4611.robot.RobotMap;
import org.usfirst.frc.team4611.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

	public void move(double left, double right) {
		 /*RobotMap.driveTrainBL.set(-left);
		 RobotMap.driveTrainBR.set(-right);
		 RobotMap.driveTrainFL.set(left);
		 RobotMap.driveTrainFR.set(right);*/
		 
		 RobotMap.driveTrain.tankDrive(-left, -right);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new TankDrive());
	}
}
