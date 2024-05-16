import org.junit.jupiter.api.BeforeEach;

import it.unibo.tetris.PlayManager;
import it.unibo.tetris.mino.Mino_L2;

public class Mino_L2_Test {
    private Mino_L2 mino;

    @BeforeEach
    public void setUp() {
        mino = new Mino_L2();
        PlayManager playManager = new PlayManager();
    }
}
