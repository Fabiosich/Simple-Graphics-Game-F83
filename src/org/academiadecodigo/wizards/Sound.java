package org.academiadecodigo.wizards;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Sound {

    private String location;

    public Sound(String location) {
        this.location = location;
    }

    public static void playMusic(String location) throws UnsupportedAudioFileException, IOException, LineUnavailableException, LineUnavailableException, IOException {

        File musicPath = new File(location);

        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);

        Clip clip = AudioSystem.getClip();

        clip.open(audioInput);

        clip.start();

    }
}