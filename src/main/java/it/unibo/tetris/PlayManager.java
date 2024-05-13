package it.unibo.tetris;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import it.unibo.tetris.mino.Mino_Impl;
import it.unibo.tetris.mino.api.Block;

/**
 * Class {@link PlayManager}.
 * Contains the core of the game.
 */
public class PlayManager {
        /**
         * Utility constant for border thickness.
         */
        private static final int BORDER = 4;

        /**
         * Utility constant for height of the title.
         */ 
        public static final int TITLE_HEIGHT = 200;
    
        /**
         * Utility constant for PlayArea measures.
         */
        final int WIDTH = 360;
        final int HEIGHT = 600;
    
        /**
         * PlayArea bounds.
         */
        public static int left_x;
        public static int right_x;
        public static int top_y;
        public static int bottom_y;

        /**
         * Variables for Score.
         */
        int level = 1;
        int lines;
        int score;

        //Current Mino
        Mino_Impl currentMino;
        public static int MINO_START_X; 
        public static int MINO_START_Y;

        //Next Mino
        Mino_Impl nextMino;
        final int NEXTMINO_X;
        final int NEXTMINO_Y;

    
        /**
         * Set Playarea bounds
         */
        public PlayManager() {
            left_x = 50;
            right_x = left_x + WIDTH;
            top_y = 50;
            bottom_y = top_y + HEIGHT;

            // Set the starting Mino position
            MINO_START_X = left_x + (WIDTH / 2) - Block.SIZE;
            MINO_START_Y = top_y + Block.SIZE;

            // Set the nextMino position
            NEXTMINO_X = right_x + 175;
            NEXTMINO_Y = top_y + 500;
        }
    
        public void update() {
            //TO DO
        }
    
        /**
         * Method that draw graphic elements.
         * 
         * @param g2 {@link Graphics2D} element that rappresent the Game Window.
         */
        public void draw(Graphics2D g2) {
            /*
             * Draw the PlayArea.
             */        
            g2.setColor(Color.white);
            g2.setStroke(new BasicStroke(4f));
            g2.drawRoundRect(left_x - BORDER, top_y + TITLE_HEIGHT - BORDER, WIDTH + BORDER * 2, HEIGHT + BORDER * 2, 25, 25);

            /*
             * Draw the nextMino window.
             */
            int x = right_x + 130;
            int y = bottom_y - 200;
            g2.drawRoundRect(x, y + TITLE_HEIGHT, 200, 200, 25, 25);
            g2.setFont(new Font("Arial", Font.PLAIN, 30));
            g2.drawString("NEXT", x + 60, y + TITLE_HEIGHT + 60);

            /*
             * Draw Scoreboard
             */
            g2.drawRoundRect(x, top_y + TITLE_HEIGHT, 250, 300, 25, 25);
            x += 40;
            y = top_y + TITLE_HEIGHT + 90;
            g2.drawString("LEVEL:  " + level, x, y);
            y += 70;
            g2.drawString("LINES:  " + lines, x, y);
            y += 70;
            g2.drawString("SCORE:  " + score, x, y);
            y += 70;

            /*
             * Draw Game Title.
             */
            x = WIDTH/4;
            y = top_y + 30;
            g2.setColor(Color.white);
            g2.setFont(new Font("Verdana", Font.ITALIC, 60));
            g2.drawString("Alex - Raul - Tommy", x + 20, y);
            g2.setFont(new Font("Verdana", Font.BOLD, 80));
            g2.drawString("TETRIS", x * 2 + 60, y + 100);
        }
}
