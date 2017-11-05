package org.usfirst.frc.team4611.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static RobotDrive driveTrain;
	
	public static Victor driveTrainFL;
	public static Victor driveTrainFR;
	public static Victor driveTrainBL;
	public static Victor driveTrainBR;
	
	public static int leftJoyPort = 0;
	public static int rightJoyPort = 1;
	
	public static void init () {
		driveTrainFL = new Victor(3);
		driveTrainFR = new Victor(0);
		driveTrainBL = new Victor(2);
		driveTrainBR = new Victor(1);
		
		driveTrain =  new RobotDrive(driveTrainFL, driveTrainBL, driveTrainFR, driveTrainBR);
				
	}
}
