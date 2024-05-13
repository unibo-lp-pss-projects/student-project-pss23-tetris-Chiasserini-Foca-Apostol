package main.java.it.unibo.tetris;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

// This class manages the sounds of the game

public class Sound {
    
    //Variable that manages sounds
    private Clip musicClip;

    //Private array for storaging sounds
    private URL sounds[] = new URL[10];

    //Fill array with soundtracks

    public Sound() {
        sounds[0] = getClass().getResource("/Tetris.wav");
        sounds[1] = getClass().getResource("/delete line.wav");
        sounds[2] = getClass().getResource("/gameover.wav");
        sounds[3] = getClass().getResource("/rotation.wav");
        sounds[4] = getClass().getResource("/touch floor.wav");
    }

    //Method that plays a specified sound
    public void play(int soundIndex, boolean music){
        
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(sounds[soundIndex]);
            Clip clip = AudioSystem.getClip();

            if (music) {
                musicClip = clip;
            }
        } catch (Exception e){
            
        }
    }

}
