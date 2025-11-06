package org.firstinspires.ftc.teamcode.Outtake;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp
public class Turret {
    final double speed = 0.8;
    private DcMotor spinner;
    public void initTurret(HardwareMap hw) {
        spinner = hw.get(DcMotorEx.class, "Turret");
        spinner.setDirection(DcMotor.Direction.FORWARD);
    }
    public void startOuttake(){
        spinner.setPower(speed);
    }
    public double getTurret(){
        return spinner.getPower();
    }
    public void stopOuttake(){
        spinner.setPower(0);
    }

}
