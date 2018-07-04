package Heroes.Armory;

import Heroes.Armory.Weapons.Excalibur;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExcaliburTest {

    Excalibur excalibur;

    @Before
    public void before(){
        excalibur = new Excalibur();
    }

    @Test
    public void hasAttack(){
        assertEquals(110, excalibur.getAttack());
    }



}
