package org.ajvid.service;


import org.ajvid.model.JigglerVariable;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class JigglerService {

    JigglerVariable jigglerVariable = new JigglerVariable();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


    public void moveMouse() throws AWTException, InterruptedException {

        Robot robot = new Robot();
        Random random = new Random();

        jigglerVariable.setMaxXAxis(screenSize.getWidth());
        jigglerVariable.setMaxYAxis(screenSize.getHeight());

        while (true){
            robot.mouseMove(random.nextInt((int)jigglerVariable.getMaxXAxis()),(int)jigglerVariable.getMaxYAxis());
            try{
                Thread.sleep(5000);
                System.out.println("Jiggling.");
            }catch (InterruptedException exception){
                System.out.println("Jiggler stopped working.");
            }
        }

    }
}
