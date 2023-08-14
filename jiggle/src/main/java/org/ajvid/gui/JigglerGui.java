package org.ajvid.gui;

import org.ajvid.service.JigglerService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JigglerGui{

    private String labelValue;
    JigglerService jigglerService = new JigglerService();

    public  String getLabelValue() {
        return labelValue;
    }

    public  void setLabelValue(String labelValue) {
        this.labelValue = labelValue;
    }

    public  void initializeGui(){
        JFrame frame=new JFrame();

        final JLabel label=new JLabel();
        label.setBounds(100, 20, 100, 40);
        setLabelValue("Jiggler is waiting");
        label.setText(getLabelValue());

        JButton button=new JButton("Jiggle");
        button.setBounds(100,70,100, 40);

        frame.add(label);
        frame.add(button);

        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelValue("Jiggling!");
                label.setText(getLabelValue());

                /*try {
                    jigglerService.moveMouse();
                } catch (AWTException ex) {
                    throw new RuntimeException(ex);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }*/
            }
        });
    }


}
