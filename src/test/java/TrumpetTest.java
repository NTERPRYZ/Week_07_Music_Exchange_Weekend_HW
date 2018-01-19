import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(InstrumentType.BRASS, InstrumentMaterial.METAL, InstrumentColour.GOLD, 100, 150, 3);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
    }

    @Test
    public void canGetInstrumentMaterial(){
        assertEquals(InstrumentMaterial.METAL, trumpet.getInstrumentMaterial());
    }

    @Test
    public void canGetInstrumentColour(){
        assertEquals(InstrumentColour.GOLD, trumpet.getInstrumentColour());
    }

    @Test
    public void canGetNumberOfValues(){
        assertEquals(3, trumpet.getNumberOfValues());
    }

    @Test
    public void guitarCanBePlayed(){
        assertEquals("I'm a BRASS type instrument and I can Be played", trumpet.play());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(100, trumpet.getBuyingPrice());
    }

    @Test
    public void canGetSellingingPrice(){
        assertEquals(150, trumpet.getSellingPrice());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(50, trumpet.calculateMarkUp());
    }
}
