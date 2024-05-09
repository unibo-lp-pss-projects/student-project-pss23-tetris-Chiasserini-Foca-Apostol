package main.java.it.unibo.tetris.mino.api;

import java.awt.Rectangle;
import java.awt.Color;

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

}
