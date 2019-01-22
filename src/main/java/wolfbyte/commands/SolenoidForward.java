package wolfbyte.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class SolenoidForward extends Command {
    public SolenoidForward() {
        System.out.println("Initialized");
        //System.out.println("Button pressed!!!!");
    }

    protected void initialize() {
        Robot.piston.set(Value.kForward);
        System.out.println("Button pressed!!!!");
    }

    protected void execute() {
        System.out.println("Button pressed!!!!");
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
        System.out.println("Button pressed!!!!");
    }

    protected void interrupted() {
        System.out.println("Button pressed!!!!");
    }
}
