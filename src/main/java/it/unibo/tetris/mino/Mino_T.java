package main.java.it.unibo.tetris.mino;

import java.awt.Color;

import main.java.it.unibo.tetris.mino.api.Block;



public class Mino_T extends Mino_Impl{

    // Constructor for the Mino_T
    public Mino_T() {
        create(Color.magenta);
    }

    // Set coordinates for Mino_T
    public void setXY(int x, int y) {
        // °
        // ° °
        // ° 
        b[0].x = x;
        b[0].y = y;
        b[1].x = b[0].x;
        b[1].y = b[0].y - Block.SIZE;
        b[2].x = b[0].x - Block.SIZE;
        b[2].y = b[0].y;
        b[3].x = b[0].x + Block.SIZE;
        b[3].y = b[0].y;
    }

    // Get next direction 
    public void getNextDirection(int direction) {

        switch (direction) {
            case 1:
                getDirection2();
                break;
            case 2:
                getDirection3();
                break;
            case 3:
                getDirection4();
                break;
            case 4:
                getDirection1();
                break;
        }

    }

    // First one
    private void getDirection1() {
        // °
        // ° °
        // °  
        tempB[0].x = b[0].x;
        tempB[0].y = b[0].y;
        tempB[1].x = b[0].x;
        tempB[1].y = b[0].y - Block.SIZE;
        tempB[2].x = b[0].x - Block.SIZE;
        tempB[2].y = b[0].y;
        tempB[3].x = b[0].x + Block.SIZE;
        tempB[3].y = b[0].y;

        updateXY(1);
    }

    // Second one
    private void getDirection2() {
        //
        // ° ° °
        //   °
        tempB[0].x = b[0].x;
        tempB[0].y = b[0].y;
        tempB[1].x = b[0].x + Block.SIZE;
        tempB[1].y = b[0].y;
        tempB[2].x = b[0].x;
        tempB[2].y = b[0].y - Block.SIZE;
        tempB[3].x = b[0].x;
        tempB[3].y = b[0].y + Block.SIZE;

        updateXY(2);
    }
    
}
