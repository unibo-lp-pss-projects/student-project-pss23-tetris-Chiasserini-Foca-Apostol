package main.java.it.unibo.tetris;

import java.awt.*;
import javax.swing.*;

public class Menu extends JPanel{
    
    private JPanel mainPanel;
    private JFrame frame;


    public Menu() {

        //Create the JFrame

    }

    private JFrame createFrame(String title, Dimension screenSize ) {

        JFrame window = new JFrame(title);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(screenSize);
        window.setPreferredSize(screenSize);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        //Manage the icon
        return window;
    }
}
