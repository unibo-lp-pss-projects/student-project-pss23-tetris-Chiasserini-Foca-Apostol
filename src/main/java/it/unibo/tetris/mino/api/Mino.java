package main.java.it.unibo.tetris.mino.api;

import java.awt.Color;
import java.awt.Graphics2D;

public interface Mino {

    // Create a new mino with a given color
    public void create(Color c);

    // Sets the x and y coordinates of the mino
    public void setXY(int x, int y);

    // Updates the x and y coordinates of the mino based on the given direction.
    public void updateXY(int direction);

    // Sets the next direction for the mino
    public void getNextDirection(int direction);

    // Checks for collisions when moving the mino
    public void checkMovementCollision();

    // Checks for collisions when rotating the mino
    public void checkRotationCollision();

    // Checks for collisions when the mino becomes static.
    public void checkStaticBlockCollision();

    // Updates the mino's state based on its current state and game rules.
    public void update();

    // Draws the mino on the given Graphics2D object.
    public void draw(Graphics2D g2);
}
