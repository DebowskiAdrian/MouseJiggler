package org.ajvid;

import org.ajvid.gui.JigglerGui;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JigglerGui");
        frame.setContentPane(new JigglerGui().getPanel1());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}