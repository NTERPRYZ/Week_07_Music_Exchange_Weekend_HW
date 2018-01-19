import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(InstrumentType.STRING, InstrumentMaterial.WOOD, InstrumentColour.BROWN, 20, 30, 6);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void canGetInstrumentMaterial(){
        assertEquals(InstrumentMaterial.WOOD, guitar.getInstrumentMaterial());
    }

    @Test
    public void canGetInstrumentColour(){
        assertEquals(InstrumentColour.BROWN, guitar.getInstrumentColour());
    }


    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void guitarCanBePlayed() {
        assertEquals("I'm a STRING type instrument and I can Be played", guitar.play());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(20, guitar.getBuyingPrice());
    }

    @Test
    public void canGetSellingingPrice(){
        assertEquals(30, guitar.getSellingPrice());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(10, guitar.calculateMarkUp());
    }


}
