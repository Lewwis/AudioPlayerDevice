package test.java.mx.iteso;

import main.java.mx.iteso.Mp4Player;
import main.java.mx.iteso.VlcPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arreola on 11/9/2015.
 */
public class VlcPlayerTest {
    VlcPlayer vlcPlayerer;

    @Before
    public void setUp(){
        vlcPlayerer = new VlcPlayer();
    }

    @Test
    public void TestplayVlc(){
        assertEquals(true, vlcPlayerer.playVlc());
    }

    @Test
    public void TestplayMp4(){
        assertEquals(false, vlcPlayerer.playMp4());
    }
}
