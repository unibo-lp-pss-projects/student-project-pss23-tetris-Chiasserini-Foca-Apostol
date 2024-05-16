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

    @Test
    public void testRotationCollisionWithCollision() {
        /**
         * Move the mino to the left so that it collides with the left boundary
         */
        mino.tempB[0].x = PlayManager.left_x - Block.SIZE;
        mino.tempB[1].x = PlayManager.left_x - Block.SIZE;
        mino.tempB[2].x = PlayManager.left_x - Block.SIZE;
        mino.tempB[3].x = PlayManager.left_x - Block.SIZE;

        /**
         * Perform rotation collision check
         */
        mino.checkRotationCollision();

        /**
         * Verify that left collision is detected correctly
         */
        assertTrue(mino.isLeftCollision());
    }
    
}