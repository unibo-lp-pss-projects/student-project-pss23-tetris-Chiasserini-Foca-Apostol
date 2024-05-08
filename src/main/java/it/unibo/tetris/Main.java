package main.java.it.unibo.tetris;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        //Create JFrame and set it visible
        JFrame gameWindow = new JFrame("Tetris"); 
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setResizable(false);
        gameWindow.pack();
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setVisible(true);
    }
    
}