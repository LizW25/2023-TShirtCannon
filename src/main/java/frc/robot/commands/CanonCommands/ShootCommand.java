package frc.robot.commands.CanonCommands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.CanonSubsystem;

public class ShootCommand extends SequentialCommandGroup {
    public ShootCommand (CanonSubsystem canonSubsystem) {
        addCommands(
            new InstantCommand(() -> canonSubsystem.Fire()),
            new WaitCommand(.5),
            new InstantCommand(() -> canonSubsystem.Close())
        );
    }
}