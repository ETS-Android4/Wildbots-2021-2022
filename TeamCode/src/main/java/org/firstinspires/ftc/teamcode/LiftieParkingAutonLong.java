package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.libraries.DrivingLibrary;

@Autonomous(name = "Liftie Parking Auton Long")
public class LiftieParkingAutonLong extends LinearOpMode{

    private DrivingLibrary drivingLibrary;

    @Override
    public void runOpMode() throws InterruptedException {
        drivingLibrary = new DrivingLibrary(this);
        drivingLibrary.setSpeed(1.0);

        telemetry.addData("status", "initialized");
        telemetry.update();

        waitForStart();

        if (opModeIsActive()) {
            sleep(2000);

            drivingLibrary.bevelDrive(1, 0, 0); //left on the red side
            sleep(720);

            drivingLibrary.bevelDrive(0, 1, 0);
            sleep(4500);

            drivingLibrary.brakeStop();
        }
    }
}