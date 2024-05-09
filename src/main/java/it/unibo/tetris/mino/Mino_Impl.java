package main.java.it.unibo.tetris.mino;

import java.awt.Color;
import java.awt.Graphics2D;

import main.java.it.unibo.tetris.mino.api.Block;
import main.java.it.unibo.tetris.mino.api.Mino;

public class Mino_Impl implements Mino {
    private static final int NUM_OF_BLOCK_OF_A_MINO = 4;
    private static final int STARTING_DIRECTION = 1;
    // Create and instantiate 2 array of Block
    public Block b[] = new Block[NUM_OF_BLOCK_OF_A_MINO];
    public Block tempB[] = new Block[NUM_OF_BLOCK_OF_A_MINO];

    // Utility counter
    int autoDropCounter = 0, deactivateCounter = 0;

    // Starting direction
    public int direction = STARTING_DIRECTION;

    // Boolean for detect collisions and for activate and deactivate
    boolean leftCollision,
            rightCollision,
            bottomCollision;
    public boolean active = true, deactivating;

    // Creates a new Mino_Impl with the given Color.
    @Override
    public void create(Color c) {
        b[0] = new Block(c);
        b[1] = new Block(c);
        b[2] = new Block(c);
        b[3] = new Block(c);
        tempB[0] = new Block(c);
        tempB[1] = new Block(c);
        tempB[2] = new Block(c);
        tempB[3] = new Block(c);
    }
    
    @Override
    public void setXY(int x, int y) {
        
    }

    @Override
    public void updateXY(int direction) {
        checkRotationCollision();

        if (leftCollision == false &&
                rightCollision == false &&
                bottomCollision == false) {
            /**
             * We use a temp variable to handle the collision.
             */
            this.direction = direction;
            b[0].x = tempB[0].x;
            b[0].y = tempB[0].y;
            b[1].x = tempB[1].x;
            b[1].y = tempB[1].y;
            b[2].x = tempB[2].x;
            b[2].y = tempB[2].y;
            b[3].x = tempB[3].x;
            b[3].y = tempB[3].y;
        }

    }

    @Override
    public void getNextDirection(int direction) {
        // TO DO
    }

    @Override
    public void checkMovementCollision() {
        // TO DO
    }

    @Override
    public void checkRotationCollision() {
        // TO DO
    }

    @Override
    public void checkStaticBlockCollision() {
        // TO DO
    }

    @Override
    public void update() {
        // TO DO
    }

    @Override
    public void draw(Graphics2D g2) {
        // TO DO
    }
}

