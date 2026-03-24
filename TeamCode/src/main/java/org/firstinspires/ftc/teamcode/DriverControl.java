package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp(name = "Driver", group = "TeleOp")
public class DriverControl extends LinearOpMode {
    private PushBot pushBot;

    public void runOpMode () {
        /**
         * Instantiate hardware objects before waitForStart();
         * */

        waitForStart();

        while (opModeIsActive()) {
            //TODO: Control the push bot using gamepad1's joystick, the left bumper should override the joysticks input and force the robot to stop
            //the joystick returns normalized double values from -1 and 1 for both the x and y axis


        }
    }

}
