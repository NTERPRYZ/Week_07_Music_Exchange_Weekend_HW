import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TshirtTest {

    Tshirt tshirt;

    @Before
    public void before(){
        tshirt = new Tshirt ("Mens", "Large", "Metalica", 5, 15);
    }

    @Test
    public void tshirtMarkup(){
        assertEquals(10, tshirt.calculateMarkUp());
    }

}
