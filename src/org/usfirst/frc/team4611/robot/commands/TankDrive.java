package org.usfirst.frc.team4611.robot.commands;

import org.usfirst.frc.team4611.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command{
	
	public TankDrive(){
		this.requires(Robot.tankDrive);
	}
	
	protected void initialize() {}
	
	protected void execute() {
		double rightJoyVal = Robot.oi.filter(Robot.oi.rightJoy.getY());
		double leftJoyVal = Robot.oi.filter(Robot.oi.leftJoy.getY());;
	    Robot.tankDrive.move(leftJoyVal, rightJoyVal);
	  }
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	 @Override
	    protected void end() {
	    }

	    // Called when another command which requires one or more of the same
	    // subsystems is scheduled to run
	    @Override
	    protected void interrupted() {
	    }

}
