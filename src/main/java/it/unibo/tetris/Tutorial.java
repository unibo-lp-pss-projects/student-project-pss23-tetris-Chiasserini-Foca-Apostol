package it.unibo.tetris;

import javax.swing.*;
import java.awt.*;

public class Tutorial extends JPanel{
    private Image mainImage;
    private ImageIcon icon = new ImageIcon("src/res/img/tutorial.png");
    // Button credits: Freepik.com
    private ImageIcon backButtonImage = new ImageIcon("src/res/img/back-button.png");

    public Tutorial(JFrame parentFrame) {
        
        mainImage = icon.getImage();
        this.setBackground(Color.black);

        //Creating JButton and setting its values

        JButton backButton = new JButton();
        backButton.setBounds(5, 5, 64, 64);
        backButton.setIcon(backButtonImage);
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
    }
}
