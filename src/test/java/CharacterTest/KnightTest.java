package CharacterTest;

import Heroes.Armory.Armor.MithrylVest;
import Heroes.Armory.Weapons.Excalibur;
import Heroes.Armory.Weapons.LonginusSpear;
import Heroes.Characters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KnightTest {

    Knight knight;
    Excalibur excalibur;
    MithrylVest mithrylVest;
    LonginusSpear longinusSpear;

    @Before
    public void before(){
        excalibur = new Excalibur();
        mithrylVest = new MithrylVest();
        longinusSpear = new LonginusSpear();
        knight = new Knight("Lancelot", 10, 1200, 160, 80, 50, excalibur, mithrylVest);
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
        assertEquals(300, knight.getKnightAttack());
    }

    @Test
    public void hasDefense(){
        assertEquals(160, knight.getKnightDefense());
    }

    @Test
    public void hasMagic(){
        assertEquals(70, knight.getKnightMagic());
    }

    @Test
    public void hasWeapon(){
        assertNotNull(knight.getWeapon());
    }

    @Test
    public void canSetWeapon(){
        knight.setWeapon(longinusSpear);
        assertEquals(70, knight.getWeapon().getAttack());

    }






}
