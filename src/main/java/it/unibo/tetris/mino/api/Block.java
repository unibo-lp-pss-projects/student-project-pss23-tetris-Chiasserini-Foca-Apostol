package main.java.it.unibo.tetris.mino.api;

import java.awt.Rectangle;
import it.unibo.tetris.PlayManager;
import java.awt.Color;
import java.awt.Graphics2D;

public class Block extends Rectangle {
    
    // Constant for the margin of the block
    public static final int MARGIN = 2;

    // Constant for the size of the block
    public static final int SIZE = 30;

    // Coordinates ot the block
    public int x, y;

    public Color c;

    // Create Constructor of "Block"
    public Block(Color c) { 
        this.c = c;
    }

    // Drawing the "Block"
    public void draw(Graphics2D g2) { 
        g2.setColor(c);
        //g2.fillRect(x + MARGIN, y + PlayManager.TITLE_HEIGHT + MARGIN, SIZE - (MARGIN * 2), SIZE - (MARGIN * 2));
        g2.fillRoundRect(x + MARGIN, y + PlayManager.TITLE_HEIGHT + MARGIN, SIZE - (MARGIN * 2), SIZE - (MARGIN * 2), 8, 8);
    }

}
