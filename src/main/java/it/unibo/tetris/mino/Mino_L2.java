package main.java.it.unibo.tetris.mino;

import java.awt.Color;

import main.java.it.unibo.tetris.mino.api.Block;


public class Mino_L2 extends Mino_Impl{

    // Constructor that creates Mino_L2
    public Mino_L2() {
        create(Color.blue);
    }

    // Set coordinates of the Mino_L2
    public void setXY(int x, int y) {
        //   °
        //   °
        // ° °
        b[0].x = x;
        b[0].y = y;
        b[1].x = b[0].x;
        b[1].y = b[0].y - Block.SIZE;
        b[2].x = b[0].x;
        b[2].y = b[0].y + Block.SIZE;
        b[3].x = b[0].x - Block.SIZE;
        b[3].y = b[0].y + Block.SIZE;
    }
    
}
