package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp(name = "", group = "TeleOp")
public class DriverControl extends LinearOpMode {
    private PushBot pushBot;

    public void runOpMode () {
        /**
         * Instantiate objects before waitForStart();
         * */

        waitForStart();

        while (opModeIsActive()) {
            //TODO: Control the push bot using gamepad1's joystick


        }
    }

}
