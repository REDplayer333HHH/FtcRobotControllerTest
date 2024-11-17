package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

// test

@TeleOp(name="Basic: Omni Linear OpMode", group="Linear OpMode")
public class BasicOmniOpMode_Linear extends LinearOpMode {

    private DcMotor motor = null;

    @Override
    public void runOpMode() {
        // Wait for the game to start (driver presses START)
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        motor = hardwareMap.get(DcMotor.class, "MotorTest");

        waitForStart(); // wait until PLAY is pressed

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            telemetry.addData("Status", "Running");
            telemetry.update();

            double power = -gamepad1.left_stick_y;
            motor.setPower(power);
        }
    }
}
