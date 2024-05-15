package main.java.it.unibo.tetris;

import java.awt.*;
import javax.swing.*;

public class Menu extends JPanel{
    
    private JPanel mainPanel;
    private JFrame frame;

    private Toolkit toolkit = Toolkit.getDefaultToolkit();
    private Dimension screenSize = toolkit.getScreenSize();

    //Utility costant
    public final int WIDTH = screenSize.width; 
    //Utility costant
    public final Integer HEIGHT = screenSize.height; 

    public Menu() {

        //Create the JFrame
        this.frame = createFrame("Tetris", screenSize);

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
