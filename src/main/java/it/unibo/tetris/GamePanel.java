package main.java.it.unibo.tetris;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
    
        //Dimensions of the window
        public static final int WIDTH = 840;
        public static final int HEIGHT = 900;
    
        //refresh rate
        final int FPS = 60;
        Thread gameThread;

        PlayManager playManager;
    
        //constructor with default settings
        public GamePanel () {
            this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            this.setBackground(Color.black);
            this.setLayout(null);

            playManager = new PlayManager();
        }
    
        //launch the game
        public void launchGame() {
            gameThread = new Thread(this);
            gameThread.start();
        }
    
        //Gameloop initialization
        @Override
        public void run() {
            double drawIntervental = 1000000000 / FPS;
            double delta = 0;
            long lastTime = System.nanoTime();
            long currentTime;
    
            //refresh window
            while (gameThread != null) {
                currentTime = System.nanoTime();
    
                delta += (currentTime - lastTime) / drawIntervental;
                lastTime = currentTime;
    
                if (delta >= 1) {
                    repaint();
                    delta--;
                }
            }
        }

        //update
        public void update() {
            playManager.update();
        }

        //paint component
        public void paintComponent(Graphics g) {
            super.paintComponent(g); 

            Graphics2D g2 = (Graphics2D) g;
            playManager.draw(g2);
        }
        
}
