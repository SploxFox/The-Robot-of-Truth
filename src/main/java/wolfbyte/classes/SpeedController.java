package wolfbyte.classes;

import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class SpeedController {
    SpeedControllerGroup left;
    SpeedControllerGroup right;
    
    SpeedController(MotorController motorController){
        this.left = new SpeedControllerGroup(motorController.front.left, motorController.rear.left);
        this.right = new SpeedControllerGroup(motorController.front.right, motorController.rear.right);
    }
}