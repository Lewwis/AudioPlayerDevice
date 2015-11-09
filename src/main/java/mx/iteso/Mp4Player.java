package main.java.mx.iteso;

import main.java.mx.iteso.Interfaces.AdvancedMediaPlayer;

/**
 * Created by Arreola on 11/8/2015.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public boolean playVlc() {
        System.out.print("Can't play vlc: Mp4Player");
        return false;
    }

    @Override
    public boolean playMp4() {
        System.out.println("Playing mp4: Mp4Player");
        return true;
    }
}
