package wolfbyte.classes;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class MovementController {
    public MotorController motorController = MotorController.talon();
    public SpeedController speedController = new SpeedController(motorController);
    public DifferentialDrive drive = new DifferentialDrive(speedController.right, speedController.left);
}