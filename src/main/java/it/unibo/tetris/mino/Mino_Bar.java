package main.java.it.unibo.tetris.mino;

import java.awt.Color;

import it.unibo.tetris.mino.api.Block;
import main.java.it.unibo.tetris.mino.api.*;



// Class for "Bar"
public class Mino_Bar extends Mino_Impl {

    // Constructor for Mino_Bar
    public Mino_Bar() {
        create(Color.cyan);
    }
    
    // Coordinates of the "Bar"
    public void setXY(int x, int y) {
        //
        // ° ° ° °
        //
        b[0].x = x;
        b[0].y = y;
        b[1].x = b[0].x - Block.SIZE;
        b[1].y = b[0].y;
        b[2].x = b[0].x + Block.SIZE;
        b[2].y = b[0].y;
        b[3].x = b[0].x + Block.SIZE * 2;
        b[3].y = b[0].y;

    }
}
