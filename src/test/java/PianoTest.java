import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(InstrumentType.KEYBOARD, InstrumentMaterial.WOOD, InstrumentColour.BLACK, "Ivory");
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }

    @Test
    public void canGetInstrumentMaterial(){
        assertEquals(InstrumentMaterial.WOOD, piano.getInstrumentMaterial());
    }

    @Test
    public void canGetInstrumentColour(){
        assertEquals(InstrumentColour.BLACK, piano.getInstrumentColour());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals("Ivory", piano.getMaterialOfKeys());
    }

    @Test
    public void guitarCanBePlayed(){
        assertEquals("I'm a KEYBOARD type instrument and I can Be played", piano.play());
    }
}
