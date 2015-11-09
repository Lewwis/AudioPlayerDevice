package test.java.mx.iteso;

import main.java.mx.iteso.MediaAdapter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Arreola on 11/8/2015.
 */
public class MediaAdapterTest {
    MediaAdapter mediaAdapter;

    @Before
    public void setUp() {
        mediaAdapter = new MediaAdapter();
    }

    @Test
    public void testPlay(){
        assertEquals(true, mediaAdapter.play("vlc"));
        assertEquals(true, mediaAdapter.play("mp4"));
        assertEquals(false, mediaAdapter.play("other"));
    }
}
