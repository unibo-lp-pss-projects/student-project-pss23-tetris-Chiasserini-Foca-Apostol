package main.java.it.unibo.tetris;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    
    public static boolean upPressed,
            downPressed,
            rightPressed,
            pausePressed;

    @Override
    public void keyTyped(KeyEvent e) {
        // Not implemented
    }

    // Method thad manage what key is being pressed

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e){
        //Not implemented
    }
}
