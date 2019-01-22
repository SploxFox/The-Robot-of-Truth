package wolfbyte.classes;

import edu.wpi.first.wpilibj.SpeedControllerGroup;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class MotorController {
    MotorSide front = new MotorSide();
    MotorSide rear = new MotorSide();
    public static MotorController talon(){
        MotorController talonController = new MotorController();
        talonController.front.left = new WPI_TalonSRX(0);
        talonController.front.right = new WPI_TalonSRX(2);
        talonController.rear.left = new WPI_TalonSRX(1);
        talonController.rear.right = new WPI_TalonSRX(3);

        return talonController;
    }
}