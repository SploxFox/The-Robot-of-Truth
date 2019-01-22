/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import wolfbyte.classes.MovementController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import wolfbyte.commands.*;


/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 */
public class Robot extends TimedRobot {
  //private DifferentialDrive m_myRobot;

  public static OI oi;
  MovementController controller;

  //public static 
  //DifferentialDrive diffDrive;
  Timer timer;

  ADXRS450_Gyro gyro;

  double speed;

  private double desiredHeading = 90;
  private int time = 0;

  public static DoubleSolenoid piston;

  JFrame frame;
  JTextArea textArea;

  //Solenoid s0;
  //Solenoid s1;
  
  /*Joystick joystick;
  Button dForwards;
  Button dBackwards;*/

  int currentTruth;

  @Override
  public void robotInit() {
    //robot = new DifferentialDrive(new PWMVictorSPX(0), new PWMVictorSPX(1));

    oi = new OI();
    gyro = new ADXRS450_Gyro();
    controller = new MovementController();
    timer = new Timer();
    speed = 0.5;
    piston = new DoubleSolenoid(0,1);
    piston.set(Value.kOff);

    currentTruth = 0;

    gyro.reset(); 

    //robotBase.arcadeDrive(joystick.getY(), joystick.getX());

    /*joystick = new Joystick(0);
    dForwards = new JoystickButton(joystick, 1);
    dBackwards = new JoystickButton(joystick, 2);

    dForwards.whenPressed(new SolenoidForward());
    dBackwards.whenPressed(new SolenoidBackward());*/

    System.out.println("hello!!!!!!");

    frame = new JFrame("The Truth");
    frame.setBounds(100,100,400,400);
    textArea = new JTextArea();
    textArea.setLineWrap(true);
    frame.getContentPane().add(new JScrollPane(textArea));
  }

  @Override
  public void teleopPeriodic() {
    //System.out.println(joystick.getY());
    controller.drive.tankDrive(oi.joystick.getY(), oi.joystick.getX());
    /*//System.out.println("Gyro Angle:" + gyro.getAngle());
    if (time % 300 == 0) {
      piston.set(DoubleSolenoid.Value.kForward);
      //s0.set(true);
      //s1.set(false);
      System.out.println("Piston forwards!");
    } else if (time % 300 == 100) {
      piston.set(DoubleSolenoid.Value.kReverse);
      //s0.set(false);
      //s1.set(true);
      System.out.println("Piston reverse!");
    } else if (time % 300 == 200) {
      piston.set(DoubleSolenoid.Value.kOff);
      //s0.set(false);
      //s1.set(false);
      System.out.println("Piston off!");
    }*/
    //piston.set(Value.kReverse);
    //System.out.println(time % 300);
    //time++;
  }

  @Override
  public void autonomousInit() {
    //System.out.println(TheTruth.truth);
    frame.setVisible(true);
  }

  @Override
  public void autonomousPeriodic(){
    /*if (time < 10) {
      controller.drive.tankDrive(-speed,-speed);
    } else if (Math.abs(desiredHeading - gyro.getAngle()) > 0.2){
      controller.drive.tankDrive(speed,-speed);
      System.out.println("Working: " + gyro.getAngle());
    } else {
      desiredHeading += 90;
      desiredHeading %= 360;
      time = -1;
    }
    time++;
    //controller.drive.tankDrive(1.0,1.0);*/
    
    textArea.setText(textArea.getText() + TheTruth.truth.toCharArray()[currentTruth]);
    currentTruth++;
  }
}
