package org.firstinspires.ftc.teamcode.examples;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ExampleIntake {
    public ExampleIntake(HardwareMap hardwareMap){
        DcMotor intakeL;
        DcMotor intakeR;

        intakeL = hardwareMap.get(DcMotor.class, "intakeL");
        intakeL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        intakeR = hardwareMap.get(DcMotor.class, "intakeR");
        intakeR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }
}
