package main.java.it.unibo.tetris.mino;

import java.awt.Color;

import main.java.it.unibo.tetris.mino.api.Block;

public class Mino_Z1 extends Mino_Impl {

    // Constructor for Mino_Z1
    public Mino_Z1() {
        create(Color.red);
    }

    // Set coordinates 
    public void setXY(int x, int y) {
        //   °
        // ° °
        // °
        b[0].x = x;
        b[0].y = y;
        b[1].x = b[0].x;
        b[1].y = b[0].y - Block.SIZE;
        b[2].x = b[0].x - Block.SIZE;
        b[2].y = b[0].y;
        b[3].x = b[0].x - Block.SIZE;
        b[3].y = b[0].y + Block.SIZE;
    }

    // Get next direction (only 2)
    public void getNextDirection(int direction) {

        switch (direction) {
            case 1:
                getDirection2();
                break;
            case 2:
                getDirection1();
                break;
        }
    }
    
}
