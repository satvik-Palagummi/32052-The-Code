package org.firstinspires.ftc.teamcode.Outtake;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class PushServo {
    private Servo push0 = null;
    private Servo push1 = null;
    private Servo push2 = null;
    private ElapsedTime time = new ElapsedTime();

    public void initPushServos(HardwareMap hweM){
        push0 = hweM.get(Servo.class, "push1");
        push1 = hweM.get(Servo.class, "push2");
        push2 = hweM.get(Servo.class, "push3");
    }
    public void propel(int servoNum){
        if(servoNum == 0){
            push0.setPosition(0.5);
            while(time.seconds() < 0.5){

            }
            push0.setPosition(0.3);
        }
        if(servoNum == 1){
            push1.setPosition(0.5);
            while(time.seconds() < 0.5){

            }
            push1.setPosition(0.3);
        }
        if(servoNum == 2){
            push2.setPosition(0.5);
            while(time.seconds() < 0.5){

            }
            push2.setPosition(0.3);
        }
    }
}
