package org.ajvid.gui;

import org.ajvid.service.JigglerService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JigglerGui {
    private JButton jiggleButton;
    private JPanel panel1;
    private JButton stopButton;
    private JLabel label1;

    public JPanel getPanel1() {
        return panel1;
    }

    public JigglerGui(){

        final Thread thread = new Thread(new JigglerService());
        jiggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread.start();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread.interrupt();
            }
        });
    }
}
