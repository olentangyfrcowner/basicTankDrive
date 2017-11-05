package org.usfirst.frc.team4611.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick leftJoy;
	public Joystick rightJoy;
	
	public OI (){
		leftJoy = new Joystick(RobotMap.leftJoyPort);
		rightJoy = new Joystick(RobotMap.rightJoyPort);
	}
	
	public double filter(double raw) //used to cut interference
    {
        if (Math.abs(raw) < .15) {
            return 0;
        } else {
            return  raw * 0.7;
        }
    }
}
