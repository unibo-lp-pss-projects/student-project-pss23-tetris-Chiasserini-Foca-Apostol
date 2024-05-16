import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.unibo.tetris.PlayManager;
import it.unibo.tetris.mino.Mino_L2;
import it.unibo.tetris.mino.api.Block;

public class Mino_L2_Test {
    private Mino_L2 mino;

    @BeforeEach
    public void setUp() {
        mino = new Mino_L2();
        PlayManager playManager = new PlayManager();
    }

    @Test 
    public void testSetXY() {
        /**
         * Set initial position
         */
        mino.setXY(PlayManager.MINO_START_X, PlayManager.MINO_START_Y);

        /**
         * Verify the position of all blocks
         */
        assertEquals(mino.b[0].x, PlayManager.MINO_START_X);
        assertEquals(mino.b[0].y, PlayManager.MINO_START_Y);
        assertEquals(mino.b[1].x, mino.b[0].x);
        assertEquals(mino.b[1].y, mino.b[0].y - Block.SIZE);
        assertEquals(mino.b[2].x, mino.b[0].x);
        assertEquals(mino.b[2].y, mino.b[0].y + Block.SIZE);
        assertEquals(mino.b[3].x, mino.b[0].x - Block.SIZE);
        assertEquals(mino.b[3].y, mino.b[0].y + Block.SIZE);
    }

    @Test
    public void testDirection1() {
        /**
         * Set initial position
         */
        mino.setXY(PlayManager.MINO_START_X, PlayManager.MINO_START_Y);
        
        /**
         *  Call getNExtDirection with starting direction 1
         */ 
        mino.getNextDirection(1);

        /**
         * Verify the position of all blocks
         */
        assertEquals(mino.b[0].x, PlayManager.MINO_START_X);
        assertEquals(mino.b[0].y, PlayManager.MINO_START_Y);
        assertEquals(mino.b[1].x, mino.b[0].x + Block.SIZE);
        assertEquals(mino.b[1].y, mino.b[0].y);
        assertEquals(mino.b[2].x, mino.b[0].x - Block.SIZE);
        assertEquals(mino.b[2].y, mino.b[0].y);
        assertEquals(mino.b[3].x, mino.b[0].x - Block.SIZE);
        assertEquals(mino.b[3].y, mino.b[0].y - Block.SIZE);
   }

   @Test
    public void testDirection2() {
        /**
         * Set initial position
         */
        mino.setXY(PlayManager.MINO_START_X, PlayManager.MINO_START_Y);
        
        /**
         * Call getNExtDirection with starting direction 2
         */ 
        mino.getNextDirection(2);

        /**
         * Verify the position of all blocks
         */
        assertEquals(mino.b[0].x, PlayManager.MINO_START_X);
        assertEquals(mino.b[0].y, PlayManager.MINO_START_Y);
        assertEquals(mino.b[1].x, mino.b[0].x);
        assertEquals(mino.b[1].y, mino.b[0].y + Block.SIZE);
        assertEquals(mino.b[2].x, mino.b[0].x);
        assertEquals(mino.b[2].y, mino.b[0].y - Block.SIZE);
        assertEquals(mino.b[3].x, mino.b[0].x + Block.SIZE);
        assertEquals(mino.b[3].y, mino.b[0].y - Block.SIZE);
   }
}
