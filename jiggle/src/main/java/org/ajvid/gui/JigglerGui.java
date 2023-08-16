package org.ajvid.gui;

import org.ajvid.service.JigglerService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JigglerGui {
    private JButton jiggleButton;
    private JPanel panel1;
    private JButton stopButton;
    private JLabel label1;

    public JPanel getPanel1() {
        return panel1;
    }

    public JigglerGui(){

        label1.setForeground(Color.BLACK);
        label1.setText("Waiting");

        final Thread thread = new Thread(new JigglerService());
        jiggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setForeground(Color.GREEN);
                label1.setText("Jiggling");
                thread.start();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setForeground(Color.RED);
                label1.setText("Stoped");
                thread.interrupt();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                System.exit(0);
            }
        });
    }
}
