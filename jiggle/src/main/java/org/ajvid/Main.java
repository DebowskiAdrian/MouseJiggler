package org.ajvid;

import org.ajvid.service.JigglerService;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, AWTException {
        JigglerService jigglerService = new JigglerService();
        jigglerService.moveMouse();
    }
}