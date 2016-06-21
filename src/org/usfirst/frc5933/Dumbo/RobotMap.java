// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5933.Dumbo;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CANTalon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainBackLeft;
    public static CANTalon driveTrainBackRight;
    public static CANTalon driveTrainFrontLeft;
    public static CANTalon driveTrainFrontRight;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainBackLeft = new CANTalon(3);
        LiveWindow.addActuator("Drive Train", "Back Left", driveTrainBackLeft);
        
        driveTrainBackRight = new CANTalon(2);
        LiveWindow.addActuator("Drive Train", "Back Right ", driveTrainBackRight);
        
        driveTrainFrontLeft = new CANTalon(1);
        LiveWindow.addActuator("Drive Train", "Front Left", driveTrainFrontLeft);
        
        driveTrainFrontRight = new CANTalon(0);
        LiveWindow.addActuator("Drive Train", "Front Right", driveTrainFrontRight);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
