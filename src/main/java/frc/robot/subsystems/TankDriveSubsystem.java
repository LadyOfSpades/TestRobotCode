package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TankDriveSubsystem extends SubsystemBase {
    Spark frontLeft;
    Spark frontRight;
    Spark backLeft;
    Spark backRight;
    DifferentialDrive driveTrain;

    public TankDriveSubsystem() {
        frontLeft = new Spark(0);
        frontRight = new Spark(1);
        backLeft = new Spark(1);
        backRight = new Spark(1);
        backLeft.addFollower(frontLeft);
        backRight.addFollower(frontRight);
        driveTrain = new DifferentialDrive(backLeft, backRight);
    }

    public void drive(double x, double r) {
        driveTrain.arcadeDrive(x, r);
    }
    

}