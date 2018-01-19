import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(InstrumentType.KEYBOARD, InstrumentMaterial.WOOD, InstrumentColour.BLACK, 1500, 2000, "Ivory");
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

    @Test
    public void canGetBuyingPrice(){
        assertEquals(1500, piano.getBuyingPrice());
    }

    @Test
    public void canGetSellingingPrice(){
        assertEquals(2000, piano.getSellingPrice());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(500, piano.calculateMarkUp());
    }
}
