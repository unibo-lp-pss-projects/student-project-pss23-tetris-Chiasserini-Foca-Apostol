package it.unibo.tetris;

import java.net.URL;
import javax.sound.sampled.*;

/**
 * Class {@link Sound} that manage the sounds of the game.
 */
public class Sound {
    
    /**
     * Private {@link Clip} variable
     * for manage sounds.
     */
    private Clip musicClip;

    /**
     * Private {@link URL} array
     * for storage sounds.
     */
    private URL sounds[] = new URL[10];

    /**
     * Fill {@link URL} array with soundtracks
     */
    public Sound() {
        sounds[0] = getClass().getResource("/Tetris.wav");
        sounds[1] = getClass().getResource("/delete line.wav");
        sounds[2] = getClass().getResource("/gameover.wav");
        sounds[3] = getClass().getResource("/rotation.wav");
        sounds[4] = getClass().getResource("/touch floor.wav");
    }

    /**
     * Method that plays a specified sound.
     * 
     * @param soundIndex index of the sound
     * @param music boolean for play the sound 
     */
    public void play(int soundIndex, boolean music){
        
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(sounds[soundIndex]);
            Clip clip = AudioSystem.getClip();

            if (music) {
                musicClip = clip;
            }

            /*
             * Behaviour of the class when the sound finishes playing.
             */
            clip.open(ais);
            clip.addLineListener(new LineListener() {
                @Override
                public void update(LineEvent event){
                    if (event.getType() == LineEvent.Type.STOP) {
                        clip.close();
                    }
                }
            });
            ais.close();
            clip.start();
        } catch (Exception e){

        }
    }

    /**
     * Method for playing a sound in looping mode.
     */
    public void loop() {
        musicClip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    /**
     * Stop the sound that is currently playing
     */
    public void stop() {
        musicClip.stop();
        musicClip.close();
    }

    /**
     * Set a specified volume value. 
     * range in db (-80.0 - 6.0).
     * 
     * @param volume float value of the volume.
     */
    public void setVolume(float volume) {
        if (musicClip != null) {
            FloatControl control = (FloatControl)musicClip.getControl(FloatControl.Type.MASTER_GAIN);
            control.setValue(volume);
        }
    } 
}
