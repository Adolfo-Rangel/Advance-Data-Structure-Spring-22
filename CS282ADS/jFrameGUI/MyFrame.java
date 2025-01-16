package com.codewithadolfo;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("JFrame title goes here"); //this sets title on this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevents this from being resized
        this.setSize(420,420); //this sets the x dimension and y dimension
        this.setVisible(true);

        ImageIcon image = new ImageIcon("xtrmlvllogo.jpg"); //creates an image icon
        this.setIconImage(image.getImage()); //change icon of this
        this.getContentPane().setBackground(new Color(255,0,255));

    }
}
