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
    


    @Override
    public void create(Color c) {
        // TO DO
    }

    @Override
    public void setXY(int x, int y) {
        // TO DO
    }

    @Override
    public void updateXY(int direction) {
        // TO DO
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
