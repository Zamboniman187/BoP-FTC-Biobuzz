package org.firstinspires.ftc.teamcode.examples;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class exampleMotor extends OpMode {
    DcMotor fLeft;
    DcMotor fRight;
    DcMotor bRight;
    DcMotor bLeft;

    @Override
    public void init() {
        fLeft = hardwareMap.get(DcMotor.class, "fLeft");
        fLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        fRight = hardwareMap.get(DcMotor.class, "fRight");
        fRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        bRight = hardwareMap.get(DcMotor.class, "bRight");
        bRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        bLeft = hardwareMap.get(DcMotor.class, "bLeft");
    }

    @Override
    public void loop() {
        double x = gamepad1.left_stick_x;
        double y = gamepad1.left_stick_y;
        double r = gamepad1.right_stick_x;
        fLeft.setPower(y+x+r);
        fRight.setPower(y-x-r);
        bLeft.setPower(y-x+r);
        bRight.setPower(y+x-r);

    }
}
