/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package wolfbyte.commands;

import edu.wpi.first.wpilibj.command.Command;

public class solo extends Command {
  public solo() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    System.out.println("Command construct!!!!");
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    System.out.println("Command init!!!!");
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    System.out.println("Comand E X E C U T E D!!!!");
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    System.out.println("Button pressed!!!!");
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    System.out.println("Button pressed!!!!");
  }
}
