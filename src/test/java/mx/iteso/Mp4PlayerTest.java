package test.java.mx.iteso;

import main.java.mx.iteso.Mp4Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Arreola on 11/9/2015.
 */
public class Mp4PlayerTest {
    Mp4Player mp4Player;

    @Before
    public void setUp(){
        mp4Player = new Mp4Player();
    }

    @Test
    public void TestplayVlc(){
        assertEquals(false, mp4Player.playVlc());
    }

    @Test
    public void TestplayMp4(){
        assertEquals(true, mp4Player.playMp4());
    }
}
