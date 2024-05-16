import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Color;

import it.unibo.tetris.PlayManager;
import it.unibo.tetris.mino.Mino_Impl;
import it.unibo.tetris.mino.api.Block;

public class Mino_Impl_Test {
     private Mino_Impl mino;

    @BeforeEach
    public void setUp() {
        mino = new Mino_Impl();
        //Color is not change the result of the tests.
        mino.create(Color.RED);
    }

}