package test.java.mx.iteso;

import main.java.mx.iteso.AudioPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Arreola on 11/8/2015.
 */
public class AudioPlayerTest {
    AudioPlayer audioPlayer;

    @Before
    public void setUp() {
        audioPlayer = new AudioPlayer();
    }

    @Test
    public void testPlay() {
        assertEquals(true, audioPlayer.play("mp4"));
        assertEquals(true, audioPlayer.play("vlc"));
    }
}
