package main.java.mx.iteso;

import main.java.mx.iteso.Interfaces.MediaPlayer;

/**
 * Created by Arreola on 11/8/2015.
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    public AudioPlayer() {
        mediaAdapter = new MediaAdapter();
    }

    @Override
    public boolean play(String format) {
        mediaAdapter.play(format);
        return true;
    }
}
