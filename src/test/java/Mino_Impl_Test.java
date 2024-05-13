import org.junit.jupiter.api.BeforeEach;

import java.awt.Color;

import it.unibo.tetris.mino.Mino_Impl;

public class Mino_Impl_Test {
     private Mino_Impl mino;

    @BeforeEach
    public void setUp() {
        mino = new Mino_Impl();
        //Color is not change the result of the tests.
        mino.create(Color.RED);
    }
    
}