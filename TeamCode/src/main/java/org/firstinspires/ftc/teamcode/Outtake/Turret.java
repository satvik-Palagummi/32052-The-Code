package org.firstinspires.ftc.teamcode.Outtake;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class Turret {
    final double speed = 0.8;
    private DcMotor spinner;
    public void setSpinner(DcMotor spinner) {
        //Initialize the parameter
        this.spinner = spinner;
        //set the direction could be removed because DcMotors are default forward but whatever
        spinner.setDirection(DcMotorSimple.Direction.FORWARD);
    }
    public void startOuttake(){
        spinner.setPower(speed);
    }
    public void stopOuttake(){
        spinner.setPower(0);
    }

}
