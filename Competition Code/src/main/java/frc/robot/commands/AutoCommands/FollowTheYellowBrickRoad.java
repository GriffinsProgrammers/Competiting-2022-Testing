// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.AutoCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class FollowTheYellowBrickRoad extends CommandBase {
  /** Creates a new FollowTheYellowBrickRoad. */
  private WPI_TalonFX LFMotor;
  private WPI_TalonFX RFMotor;
  private WPI_TalonFX LBMotor;
  private WPI_TalonFX RBMotor;
  
  public FollowTheYellowBrickRoad() {
    // Use addRequirements() here to declare subsystem dependencies.
    LFMotor = new WPI_TalonFX(1);
    RFMotor = new WPI_TalonFX(2);
    LBMotor = new WPI_TalonFX(3);
    RBMotor = new WPI_TalonFX(4);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (distanceFromLine == 0.5)
    {
      LFMotor.setSpeed(1);
      RFMotor.setSpeed(1);
      LBMotor.setSpeed(1);
      RBMotor.setSpeed(1);
    }
    else if (distanceFromLine == 0.0)
    {
      LFMotor.setSpeed(1);
      RFMotor.setSpeed(0.5);
      LBMotor.setSpeed(1);
      RBMotor.setSpeed(0.5);
    }
    else if (distanceFromLine == 1.0)
    {
      LFMotor.setSpeed(0.5);
      RFMotor.setSpeed(1);
      LBMotor.setSpeed(0.5);
      RBMotor.setSpeed(1);
    }
    

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}