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
}