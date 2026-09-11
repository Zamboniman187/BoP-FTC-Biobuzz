package org.firstinspires.ftc.teamcode.examples;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ExampleIntake {
    DcMotor intakeL;
    DcMotor intakeR;
    public ExampleIntake(HardwareMap hardwareMap){
        intakeL = hardwareMap.get(DcMotor.class, "intakeL");
        intakeL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        intakeR = hardwareMap.get(DcMotor.class, "intakeR");
        intakeR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        //Triangle for intake
        //Square for reversing the intake

    }
    public void spin(double power){
        intakeL.setPower(power);
        intakeR.setPower(power);
    }
    public void update(Gamepad gamepad1){
        spin((gamepad1.y) ?1: (gamepad1.x) ?-1:0);
    }
}
