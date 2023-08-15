package org.ajvid.service;


import org.ajvid.model.JigglerVariable;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class JigglerService implements Runnable {

    JigglerVariable jigglerVariable = new JigglerVariable();

    //private boolean jiggle = true;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    @Override
    public void run() {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Random random = new Random();

        boolean jiggle = true;

        jigglerVariable.setMaxXAxis(screenSize.getWidth());
        jigglerVariable.setMaxYAxis(screenSize.getHeight());

        while (jiggle){
            robot.mouseMove(random.nextInt((int)jigglerVariable.getMaxXAxis()),(int)jigglerVariable.getMaxYAxis());
            try{
                Thread.sleep(5000);
            }catch (InterruptedException exception){
                jiggle = false;
            }
        }
    }
}
