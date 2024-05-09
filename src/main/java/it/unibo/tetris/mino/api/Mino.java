package main.java.it.unibo.tetris.mino.api;

import java.awt.Color;

public interface Mino {

    // Create a new mino with a given color
    public void create(Color c);

    // Sets the x and y coordinates of the mino
    public void setXY(int x, int y);

    // Updates the x and y coordinates of the mino based on the given direction.
    public void updateXY(int direction);

    
}
