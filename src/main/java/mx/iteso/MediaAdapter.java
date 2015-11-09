package main.java.mx.iteso;

import main.java.mx.iteso.Interfaces.AdvancedMediaPlayer;
import main.java.mx.iteso.Interfaces.MediaPlayer;

/**
 * Created by Arreola on 11/8/2015.
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    @Override
    public boolean play(String format) {
        if(format.equals("vlc")){
            advancedMediaPlayer = new VlcPlayer();
            advancedMediaPlayer.playVlc();
            return true;
        } else if(format.equals("mp4")){
            advancedMediaPlayer = new Mp4Player();
            advancedMediaPlayer.playMp4();
            return true;
        }
        return false;
    }
}
