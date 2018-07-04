package CharacterTest;

import Characters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Lancelot", 86, 1200, 160, 80, 50);
    }

    @Test
    public void hasName(){
        assertEquals("Lancelot", knight.getName());
    }


}
