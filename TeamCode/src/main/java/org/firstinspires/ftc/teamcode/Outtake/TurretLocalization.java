package org.firstinspires.ftc.teamcode.Outtake;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TurretLocalization {
    private Servo turret = null;
    private final double posZero = 0.0;
    private final double posOne = 0.0;
    private final double posTwo = 0.0;
    private int position;
    public void initTurretLocalization(HardwareMap hwM){
        turret = hwM.get(Servo.class, "turretLocalization");
    }
    public void setTurretPos(double pos){
        turret.setPosition(pos);
    }
    public int getPosition(){
        return position;
    }
    public double getTurret(){
        return turret.getPosition();
    }
    public void setPos(int num){
        position = num;
        if(position == 0){
            setTurretPos(posZero);
        }
        if(position == 1){
            setTurretPos(posOne);
        }
        if(position == 2){
            setTurretPos(posTwo);
        }else{
        }
    }


}
