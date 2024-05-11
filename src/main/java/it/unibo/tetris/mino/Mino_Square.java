package main.java.it.unibo.tetris.mino;

import java.awt.Color;

import main.java.it.unibo.tetris.mino.api.Block;
import main.java.it.unibo.tetris.mino.api.Mino;
import main.java.it.unibo.tetris.mino.api.*;

public class Mino_Square extends Mino_Impl {

    // Constructor for the "Square"
    public Mino_Square() {
        create(Color.yellow);
    }

    // Set coordinates of "Square"
    public void setXY(int x, int y) {
        //
        // ° °
        // ° °
        b[0].x = x;
        b[0].y = y;
        b[1].x = b[0].x;
        b[1].y = b[0].y + Block.SIZE;
        b[2].x = b[0].x + Block.SIZE;
        b[2].y = b[0].y;
        b[3].x = b[0].x + Block.SIZE;
        b[3].y = b[0].y + Block.SIZE;

    }
}