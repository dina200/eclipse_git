package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewFrame {

    JFrame frame;
    JLabel label;
    JButton button;
    JButton button1;

    class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == button1) label.setText("Ouch!");
        }
    }
    class ColorListener implements ActionListener {
        public  void actionPerformed(ActionEvent event) {
            if (event.getSource() == button) frame.repaint();
        }
    }

   public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Change color...");
        button.addActionListener(new ColorListener());

        button1 = new JButton("Change label");
        button1.addActionListener(new LabelListener());

        label = new JLabel("I'm a label");
        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.EAST,button1);
        frame.getContentPane().add(BorderLayout.WEST,label);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }


}
