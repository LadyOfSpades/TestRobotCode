package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.TankDriveSubsystem;

public class TeleopCommand extends Command {
    TankDriveSubsystem tankDriveSubsystem;
    CommandXboxController xboxController;
    public TeleopCommand(TankDriveSubsystem tDriveSubsystem, CommandXboxController xController) {
        tankDriveSubsystem = tDriveSubsystem;
        xboxController = xController;
    }

    @Override
    public void execute() {
        System.out.println("teleoperating "+xboxController.getLeftY());
        tankDriveSubsystem.drive(xboxController.getLeftX()*-0.5, xboxController.getLeftY()*-0.5);
    }

    public boolean isFinished(){
        return false;
    }
}
