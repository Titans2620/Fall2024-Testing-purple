// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;



import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class PurpleDrive extends SubsystemBase {
  private static CANSparkMax driveMotor = new CANSparkMax(Constants.DRIVEID, MotorType.kBrushless);

  private double speed = 0;

  public PurpleDrive() {
    driveMotor.restoreFactoryDefaults(true);
  }

  public void setMotorSpeed(double speed){
    this.speed = speed;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
    driveMotor.set(speed);
  }

  }
