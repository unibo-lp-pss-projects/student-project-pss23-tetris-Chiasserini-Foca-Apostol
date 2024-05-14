package main.java.it.unibo.tetris;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

/**
 * Class {@link GamePanel} that extends {@link JPanel}
 * and implements {@link Runnable}
 * 
 * Used for draw the window and launch the game.
 */
public class GamePanel extends JPanel implements Runnable{
    
        /**
         * Dimensions of the window.
         */
        public static final int WIDTH = 840;
        public static final int HEIGHT = 900;
    
        /**
         * Utility variables for manage window properties.
         */
        final int FPS = 60;
        Thread gameThread;

        /**
         * Utility variable for call the PlayManager methods.
         */
        PlayManager playManager;

        /**
         * {@link Sound} variable for play background soundtrack.
         */
        public static Sound music = new Sound();
        /**
         * {@link Sound} variable for play sound effects.
         */
        public static Sound soundEffect = new Sound();
    
        /**
         * {@link GamePanel} initial settings.
         */
        public GamePanel () {
            this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            this.setBackground(Color.black);
            this.setLayout(null);

            /*
             * Add KeyListener.
             */
            this.addKeyListener(new KeyHandler());
            this.setFocusable(true);

            playManager = new PlayManager();
        }
    
        /**
         * Launch the game.
         */
        public void launchGame() {
            gameThread = new Thread(this);
            gameThread.start();

            music.play(0, true);
        }
    
        /**
         * Run method.
         * Set repaint frequency.
         */
        @Override
        public void run() {
            double drawIntervental = 1000000000 / FPS;
            double delta = 0;
            long lastTime = System.nanoTime();
            long currentTime;
    
            /*
            * Repaint 60 times per seconds (60 FPS).
            */
            while (gameThread != null) {
                currentTime = System.nanoTime();
    
                delta += (currentTime - lastTime) / drawIntervental;
                lastTime = currentTime;
    
                if (delta >= 1) {
                    update();
                    repaint();
                    delta--;
                }
            }
        }

        /*
        * Update the game. 
        */
        public void update() {
            playManager.update();
        }

        /**
         * Paint the {@link Graphics2D component}.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g); 

            Graphics2D g2 = (Graphics2D) g;
            playManager.draw(g2);
        }
        
}
