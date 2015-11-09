package main.java.mx.iteso;

import main.java.mx.iteso.Interfaces.AdvancedMediaPlayer;

/**
 * Created by Arreola on 11/8/2015.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public boolean playVlc() {
        System.out.println("Playing mvlc: VlcPlayer");
        return true;
    }

    @Override
    public boolean playMp4() {
        System.out.println("Can't play mvlc: VlcPlayer");
        return false;
    }
}
