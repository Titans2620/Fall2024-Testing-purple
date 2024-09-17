// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.subsystems.PurpleDrive;

public class PurpleDriveCommand extends Command {
  private PurpleDrive p_PurpleDrive;
  /** Creates a new PurpleDriveCommand. */
  public PurpleDriveCommand(PurpleDrive p_PurpleDrive) {
    this.p_PurpleDrive = p_PurpleDrive;
    addRequirements(this.p_PurpleDrive);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    p_PurpleDrive.setMotorSpeed(Constants.DRIVEID);
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
