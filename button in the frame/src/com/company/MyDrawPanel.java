package com.company;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel{
    public void paintComponent(Graphics g) {
//        Image image = new ImageIcon("D:\\Univer\\Git\\eclipse_git\\button in the frame\\src\\com\\company\\1.jpg").getImage();
//        g.drawImage(image, 60,60, this);
//        g.setColor(Color.pink);
//        g.fillRoundRect(100,100, 100, 100, 100, 100 );
//        g.fillRect(0,0, this.getWidth(), this.getHeight());

//        g.setColor(randColor);
//        g.fillOval(70,70,100,100);
        int red1 = (int) (Math.random() * 255);
        int green1 = (int) (Math.random() * 255);
        int blue1 = (int) (Math.random() * 255);

        Color randColor1 = new Color(red1,green1,blue1);

        int red2 = (int) (Math.random() * 255);
        int green2 = (int) (Math.random() * 255);
        int blue2 = (int) (Math.random() * 255);

        Color randColor2 = new Color(red2,green2,blue2);
        Graphics2D g2d  = (Graphics2D) g;
        GradientPaint grad = new GradientPaint(70,70, randColor1, 200,200, randColor2);

        g2d.setPaint(grad);
        g2d.fillOval(70,70,200,200);
    }
}
