package frc.robot;

import wolfbyte.commands.*;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;

public class OI {
    Joystick joystick = new Joystick(0);
    Button dForwards = new JoystickButton(joystick, 1);
    Button dBackwards = new JoystickButton(joystick, 2);
    public OI() {
        /*for (int i = 0; i < 10; i++){
            JoystickButton button = new JoystickButton(Robot.joystick, i);
            button.whenPressed(new SolenoidForward());
        }*/
        dForwards.whenPressed(new solo());
        dBackwards.whenPressed(new solo());
        System.out.println("test test");
    }
}




/*
if (VexRT[Btn4u] == 1)
{motor}*/