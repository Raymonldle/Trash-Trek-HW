
package frc.robot.commands;


import frc.robot.RobotContainer;
import frc.robot.subsystems.Drivebase;
import edu.wpi.first.wpilibj2.command.CommandBase;
//imports XboxController class
import edu.wpi.first.wpilibj.XboxController;

/** An example command that uses an example subsystem. */
public class XboxControllerDrive extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Drivebase m_db;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */

  public XboxControllerDrive(Drivebase db) {
    m_db = db;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(db);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_db.arcadeDrive(0,0);
  }
   

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      m_db.arcadeDrive(RobotContainer.m_driverController.getLeftY(), RobotContainer.m_driverController.getRightX());
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