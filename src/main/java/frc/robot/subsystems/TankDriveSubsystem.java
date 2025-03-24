package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.sim.SparkMaxSim;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TankDriveSubsystem extends SubsystemBase {
    SparkMax frontLeft;
    SparkMax frontRight;
    SparkMax backLeft;
    SparkMax backRight;
    DifferentialDrive driveTrain;

    public TankDriveSubsystem() {
        frontLeft = new SparkMax(4, MotorType.kBrushed);
        frontRight = new SparkMax(2, MotorType.kBrushed);
        backLeft = new SparkMax(1,MotorType.kBrushed);
        backRight = new SparkMax(3, MotorType.kBrushed);
        driveTrain = new DifferentialDrive(frontLeft, frontRight);
    }

    public void drive(double x, double r) {
        driveTrain.arcadeDrive(x, r);
    }
    

}