package org.ajvid.service;


import org.ajvid.model.JigglerVariable;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class JigglerService {

    JigglerVariable jigglerVariable = new JigglerVariable();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private void welcomeMessage(){
        System.out.println("Welcome in Mouse Jiggler");
    }

    private void setJigglingFieldAndTime(){
        jigglerVariable.setMaxXAxis(screenSize.getWidth());
        jigglerVariable.setMaxYAxis(screenSize.getHeight());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide time between mouse move: ");

        jigglerVariable.setTimeDelayBetweenMove((scanner.nextInt()*1000));
    }

    public void moveMouse() throws AWTException, InterruptedException {
        welcomeMessage();
        setJigglingFieldAndTime();

        Robot robot = new Robot();
        Random random = new Random();

        while (true){
            robot.mouseMove(random.nextInt((int)jigglerVariable.getMaxXAxis()),(int)jigglerVariable.getMaxYAxis());
            try{
                Thread.sleep(jigglerVariable.getTimeDelayBetweenMove());
                System.out.println("Jiggling.");
            }catch (InterruptedException exception){
                System.out.println("Jiggler stopped working.");
            }
        }

    }
}
