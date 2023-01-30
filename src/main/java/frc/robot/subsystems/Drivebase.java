// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.SerialPort.Port;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


public class Drivebase extends subsystems {

    CANSparkMax m_leftMotor1 = new CANSparkMax(1, MotorType.kBrushless);
    CANSparkMax m_leftMotor2 = new CANSparkMax(2, MotorType.kBrushless);
    CANSparkMax m_leftMotor3 = new CANSparkMax(3, MotorType.kBrushless);
    CANSparkMax m_rightMotor1 = new CANSparkMax(4, MotorType.kBrushless);
    CANSparkMax m_rightMotor2 = new CANSparkMax(5, MotorType.kBrushless);
    CANSparkMax m_rightMotor3 = new CANSparkMax(6, MotorType.kBrushless);

    MotorControllerGroup m_leftGroup = new MotorControllerGroup(m_leftMotor1,m_leftMotor2,m_leftMotor3);
    MotorControllerGroup m_rightGroup = new MotorControllerGroup(m_rightMotor1,m_rightMotor2,m_rightMotor3);

    DifferentialDrive m_differentialDrive = new DifferentialDrive(m_leftGroup, m_rightGroup);

    public void arcadeDrive(double speed, double rotation){
      m_differentialDrive.arcadeDrive(speed,rotation);
    }


  public Drivebase() {

    m_rightGroup.setInvert(true);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
