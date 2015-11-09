package main.java.mx.iteso;

/**
 * Created by Arreola on 11/8/2015.
 */
public class AdapterPatternDemo {

    public static void main (String [ ] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp4");
        audioPlayer.play("vlc");

    }
}
