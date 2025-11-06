package org.firstinspires.ftc.teamcode.Intake;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp
public class Spinner {
    final double speed = 0.8;
    private DcMotor spinner;

    public void initSpinner(HardwareMap hMap) {
        spinner = hMap.get(DcMotor.class, "spinner");
        spinner.setDirection(DcMotor.Direction.FORWARD);
    }
    public void startIntake(){
        spinner.setPower(speed);
    }
    public double getSpinner(){
        return spinner.getPower();
    }
    public void stopIntake(){
        spinner.setPower(0);
    }

}
