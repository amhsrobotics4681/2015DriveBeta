package org.usfirst.frc.team4681.robot;

import edu.wpi.first.wpilibj.PIDOutput;

public class PIDConstant implements PIDOutput{
	// Initializes constant as 1.0. At this value it would have no effect on the motor's speed
	double constant = 1.0;
	
	// Constructor
	public PIDConstant(double c){
		constant = c;
	}

	// writes the value to the constant
	public void pidWrite(double value) {
		constant = value;	
	}
	
}
