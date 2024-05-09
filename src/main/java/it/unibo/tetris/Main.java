package main.java.it.unibo.tetris;

import javax.swing.JFrame;

/**
 * Class {@link Main}, the main of the project
 */
public class Main {

    /**
     * The main method.
     *
     * @param args The {@link String}[] args.
     */
    public static void main(String[] args) {
        /*
         * Create JFrame and set it visible.
         */
        JFrame gameWindow = new JFrame("Tetris"); 
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setResizable(false);        

        /*
         * Add GamePanel to the gameWindow.
         */
        GamePanel gp = new GamePanel();
        gameWindow.add(gp);
        gameWindow.pack();

        gameWindow.setLocationRelativeTo(null);
        gameWindow.setVisible(true);
    }
    
}