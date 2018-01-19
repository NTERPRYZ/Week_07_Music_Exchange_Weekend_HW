import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Drumstick", 3, 6);
    }

    @Test
    public void drumStickMarkUp(){
        assertEquals(3, drumSticks.calculateMarkUp());
    }
}
