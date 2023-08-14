package org.ajvid.gui;

import javax.swing.*;

public class JigglerGui{

    public static void initializeGui(){
        JFrame f=new JFrame();

        JButton b=new JButton("Jiggle");
        b.setBounds(100,50,100, 40);

        f.add(b);

        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }


}
