package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Intake.Ball;
import org.firstinspires.ftc.teamcode.Intake.Spinner;
import org.firstinspires.ftc.teamcode.MecanumDrive.Nightcall;
import org.firstinspires.ftc.teamcode.Outtake.Turret;
import org.firstinspires.ftc.teamcode.Outtake.TurretLocalization;
import org.firstinspires.ftc.teamcode.Sensor.ColorSensor;

@TeleOp
public class Frankenstein extends LinearOpMode {

    private final Nightcall nightcall = new Nightcall();
    private final Turret turret = new Turret();
    private final TurretLocalization turretLocalization = new TurretLocalization();
    private final ColorSensor colorSensor = new ColorSensor();
    private final Spinner spinner = new Spinner();
    private final Ball ball = new Ball();
    @Override
    public void runOpMode() throws InterruptedException {

    }
}
