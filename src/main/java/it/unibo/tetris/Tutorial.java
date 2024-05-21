package it.unibo.tetris;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tutorial extends JPanel{
    private Image mainImage;
    private Dimension imageSize;
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

        //Adding Button to the panel

        this.add(backButton);

        this.imageSize = getImageSize();
        setPreferredSize(imageSize);
        setMinimumSize(imageSize);
        setMaximumSize(imageSize);
        setSize(imageSize);
        setLayout(null);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentFrame.setVisible(true);
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(Tutorial.this);
                currentFrame.dispose();
            }
        });

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int yOffset = backButtonImage.getIconHeight()+10; 
        g.drawImage(mainImage, 0, yOffset, this);
    }

    public Dimension getImageSize() {

        ImageIcon image = this.icon;
        Dimension size = new Dimension(image.getIconWidth(), image.getIconHeight()+backButtonImage.getIconHeight()+20);
        return size;
              
    }
}
