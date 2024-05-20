package it.unibo.tetris;

import java.awt.*;
import javax.swing.*;

public class Menu extends JPanel{
    private JButton startButton;
    private JButton tutorialButton;
    private JButton quitButton;
    
    private JPanel mainPanel;
    private JFrame frame;

    private Toolkit toolkit = Toolkit.getDefaultToolkit();
    private Dimension screenSize = toolkit.getScreenSize();

    //Utility costant
    public final int WIDTH = screenSize.width; 
    //Utility costant
    public final Integer HEIGHT = screenSize.height; 

    public Menu() {

        //Creating JButtons
        this.startButton = this.createButton("START", this.WIDTH/9, this.HEIGHT/8);
        this.tutorialButton = this.createButton("TUTORIAL", this.WIDTH/9, this.HEIGHT/8);
        this.quitButton = this.createButton("QUIT", this.WIDTH/9, this.HEIGHT/8);

        //Create the JFrame
        this.frame = createFrame("Tetris", screenSize);

        //Create the JPanel
        this.mainPanel = new JPanel();
        mainPanel.setBackground(Color.black);

    }

    private JButton createButton(String name, int width, int height) {
        JButton button = new JButton(name);
        button.setPreferredSize(new Dimension(width, height));
        button.setMaximumSize(new Dimension(width, height));
        button.setMinimumSize(new Dimension(width, height));
        button.setFont(new Font("Arial", Font.BOLD, 24));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setOpaque(true);
        button.setBackground(new Color(0x444444));
        button.setForeground(Color.WHITE);
        return button;
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
