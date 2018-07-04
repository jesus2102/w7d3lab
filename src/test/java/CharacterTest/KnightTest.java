package CharacterTest;

import Characters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Lancelot", 10, 1200, 160, 80, 50);
    }

    @Test
    public void hasName(){
        assertEquals("Lancelot", knight.getName());
    }

    @Test
    public void hasLevel(){
        assertEquals(10, knight.getLevel());
    }

    @Test
    public void hasHP(){
        assertEquals(1250, knight.getKnightHp());
    }

    @Test
    public void hasDefaulttHp(){
        assertEquals(1200, knight.getDefaultHp());
    }

    @Test
    public void hasAttack(){
        assertEquals(190, knight.getKnightAttack());
    }

    @Test
    public void hasDefense(){
        assertEquals(100, knight.getKnightDefense());
    }

    @Test
    public void hasMagic(){
        assertEquals(70, knight.getKnightMagic());
    }




}
