import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecorderTest {

    Recorder recorder;

    @Before
    public void before(){
        recorder = new Recorder(InstrumentType.WIND, InstrumentMaterial.PLASTIC, InstrumentColour.WHITE, 5, 10, 8);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.WIND, recorder.getInstrumentType());
    }

    @Test
    public void canGetInstrumentMaterial(){
        assertEquals(InstrumentMaterial.PLASTIC, recorder.getInstrumentMaterial());
    }

    @Test
    public void canGetInstrumentColour(){
        assertEquals(InstrumentColour.WHITE, recorder.getInstrumentColour());
    }

    @Test
    public void canGetNumberOfHoles(){
        assertEquals(8, recorder.getNumberOfHoles());
    }

    @Test
    public void guitarCanBePlayed(){
        assertEquals("I'm a WIND type instrument and I can Be played", recorder.play());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(5, recorder.getBuyingPrice());
    }

    @Test
    public void canGetSellingingPrice(){
        assertEquals(10, recorder.getSellingPrice());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(5, recorder.calculateMarkUp());
    }
}
