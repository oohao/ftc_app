package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name=" TuringEchoLight", group="TuringEcho")
public class light extends  LinearOpMode {

    /* Declare OpMode members. */
    TuringEchoRobotHardware   robot           = new TuringEchoRobotHardware();

    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);
        waitForStart();
        driveforward();
        weng();
        shoot();
        stops();
        adjust();
        stops2();
        collection();
        weng2();
        shoot2();
        stops3();
        adjust2();
        stops4();
        ball1();
        ballback1();
        ball2();
        ballback2();
        turnright();
        forward();
        rightC();
        corner();
        moca1();
        moca2();
        moca3();
        moca4();
    }


    public void driveforward() throws InterruptedException {
        robot.WL.setPower(-0.1);
        robot.WR.setPower(-0.1);
        Thread.sleep(2500);
        robot.WL.setPower(0);
        robot.WR.setPower(0);}

    public void weng() throws InterruptedException {
        robot.WL.setPower(0);
        robot.WR.setPower(0);
        Thread.sleep(3500);
        robot.WL.setPower(0);
        robot.WR.setPower(0);}
    public void shoot() throws InterruptedException {
        robot.sht.setPower(1);
        Thread.sleep(900);
        robot.sht.setPower(0);}
    public void stops() throws InterruptedException {
        robot.sht.setPower(0);
        Thread.sleep(400);
        robot.sht.setPower(0);}
    public void adjust() throws InterruptedException {
        robot.sht.setPower(0.1);
        Thread.sleep(1600);
        robot.sht.setPower(0);}
    public void stops2() throws InterruptedException {
        robot.sht.setPower(0);
        Thread.sleep(200);
        robot.sht.setPower(0);}
    public void collection() throws InterruptedException {
        robot.col.setPower(0.5);
        Thread.sleep(1900);
        robot.sht.setPower(0);}

    public void weng2() throws InterruptedException {
        robot.col.setPower(0);
        Thread.sleep(3400);
        robot.col.setPower(0);}
    public void shoot2() throws InterruptedException {
        robot.sht.setPower(1);
        Thread.sleep(900);
        robot.sht.setPower(0);}
    public void stops3() throws InterruptedException {
        robot.sht.setPower(0);
        Thread.sleep(200);
        robot.sht.setPower(0);}
    public void adjust2() throws InterruptedException {
        robot.sht.setPower(0.1);
        Thread.sleep(1600);
        robot.sht.setPower(0);}
    public void stops4() throws InterruptedException {
        robot.sht.setPower(0);
        Thread.sleep(200);
        robot.sht.setPower(0);}
    public void ball1() throws InterruptedException {
        robot.WL.setPower(-0.2);
        robot.WR.setPower(-0.2);
        Thread.sleep(1500);
        robot.WL.setPower(0);
        robot.WR.setPower(0);}
    public void ballback1() throws InterruptedException {
        robot.WL.setPower(0.2);
        robot.WR.setPower(0.2);
        Thread.sleep(800);
        robot.WL.setPower(0);
        robot.WR.setPower(0);}
    public void ball2() throws InterruptedException {
        robot.WL.setPower(-0.2);
        robot.WR.setPower(-0.2);
        Thread.sleep(1500);
        robot.WL.setPower(0);
        robot.WR.setPower(0);}
    public void ballback2() throws InterruptedException {
        robot.WL.setPower(0.2);
        robot.WR.setPower(0.2);
        Thread.sleep(1480);
        robot.WL.setPower(0);
        robot.WR.setPower(0);}

    public void turnright () throws InterruptedException{
        robot.WL.setPower(-0.2);
        robot.WR.setPower(0.2);
        Thread.sleep(920);
        robot.WL.setPower(0);
        robot.WL.setPower(0);}




    public void forward() throws InterruptedException {
        robot.WL.setPower(-0.2);
        robot.WR.setPower(-0.2);
        Thread.sleep(1750);
        robot.WL.setPower(0);
        robot.WR.setPower(0);


    }

    public void rightC () throws InterruptedException{
        robot.WL.setPower(-0.2);
        robot.WR.setPower(0.2);
        Thread.sleep(550);
        robot.WL.setPower(0);
        robot.WL.setPower(0);}
    public void corner() throws InterruptedException {
        robot.WL.setPower(-0.2);
        robot.WR.setPower(-0.2);
        Thread.sleep(1340);
        robot.WL.setPower(0);
        robot.WR.setPower(0);}
    public void moca1() throws InterruptedException {
        robot.WL.setPower(-0.2);
        Thread.sleep(600);
        robot.WL.setPower(0);


    }

    public void moca2() throws InterruptedException {
        robot.WR.setPower(-0.2);
        Thread.sleep(600);
        robot.WR.setPower(0);
    }
    public void moca3() throws InterruptedException {
        robot.WL.setPower(-0.2);
        Thread.sleep(600);
        robot.WL.setPower(0);


    }
    public void moca4() throws InterruptedException {
        robot.WR.setPower(-0.2);
        Thread.sleep(600);
        robot.WR.setPower(0);
    }


}


