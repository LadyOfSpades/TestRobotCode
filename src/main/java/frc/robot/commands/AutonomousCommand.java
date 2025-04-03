package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TankDriveSubsystem;

public class AutonomousCommand extends Command {
    TankDriveSubsystem tankDriveSubsystem;
    Timer timer;
    public AutonomousCommand(TankDriveSubsystem tankDriveSubsystem){
        this.tankDriveSubsystem = tankDriveSubsystem;
        timer = new Timer();
    }

    public void initialize(){
        timer.reset();
    }

    public void execute(){
        tankDriveSubsystem.drive(.5, 0);
    }

    public boolean isFinished(){
        return timer.get() > 5;
    }
}
