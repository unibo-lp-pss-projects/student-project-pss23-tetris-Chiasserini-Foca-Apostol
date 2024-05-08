package main.java.it.unibo.tetris;

import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
    
    //Dimensions of the window 
    public static final int WIDTH = 840;
    public static final int HEIGHT = 900;

    public GamePanel () {

        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        this.setLayout(null);
    }
}
