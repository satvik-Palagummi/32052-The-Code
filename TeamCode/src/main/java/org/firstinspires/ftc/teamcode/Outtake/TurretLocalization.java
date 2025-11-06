package org.firstinspires.ftc.teamcode.Outtake;

import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TurretLocalization {
    private Servo turret = null;
    public void setTurret(Servo turret){
        this.turret = turret;
    }
    public void setPos(double pos){
        turret.setPosition(pos);
    }
    public double getTurret(){
        return turret.getPosition();
    }


}
