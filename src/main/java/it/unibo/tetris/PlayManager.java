package main.java.it.unibo.tetris;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class PlayManager {
        //border thickness
        private static final int BORDER = 4;

        //hypotetical height of the written title 
        public static final int TITLE_HEIGHT = 200;
    
        //Playarea measures
        final int WIDTH = 360;
        final int HEIGHT = 600;
    
        //Playarea bounds
        public static int left_x;
        public static int right_x;
        public static int top_y;
        public static int bottom_y;

        //Variables for Score.
        int level = 1;
        int lines;
        int score;
    
        public PlayManager() {
            //Set Playarea dimensions
            left_x = 50;
            right_x = left_x + WIDTH;
            top_y = 50;
            bottom_y = top_y + HEIGHT;
        }
    
        public void update() {
            //TO DO
        }
    
        public void draw(Graphics2D g2) {
            //Draw the PlayArea.        
            g2.setColor(Color.white);
            g2.setStroke(new BasicStroke(4f));
            g2.drawRoundRect(left_x - BORDER, top_y + TITLE_HEIGHT - BORDER, WIDTH + BORDER * 2, HEIGHT + BORDER * 2, 25, 25);

            //Draw the nextMino window
            int x = right_x + 130;
            int y = bottom_y - 200;
            g2.drawRoundRect(x, y + TITLE_HEIGHT, 200, 200, 25, 25);
            g2.setFont(new Font("Arial", Font.PLAIN, 30));
            g2.drawString("NEXT", x + 60, y + TITLE_HEIGHT + 60);

            //Draw Scoreboard
            g2.drawRoundRect(x, top_y + TITLE_HEIGHT, 250, 300, 25, 25);
            x += 40;
            y = top_y + TITLE_HEIGHT + 90;
            g2.drawString("LEVEL:  " + level, x, y);
            y += 70;
            g2.drawString("LINES:  " + lines, x, y);
            y += 70;
            g2.drawString("SCORE:  " + score, x, y);
            y += 70;

            //Draw Game Title.
            x = WIDTH/4;
            y = top_y + 30;
            g2.setColor(Color.white);
            g2.setFont(new Font("Verdana", Font.ITALIC, 60));
            g2.drawString("Alex - Raul - Tommy", x + 20, y);
            g2.setFont(new Font("Verdana", Font.BOLD, 80));
            g2.drawString("TETRIS", x * 2 + 60, y + 100);
        }
}
