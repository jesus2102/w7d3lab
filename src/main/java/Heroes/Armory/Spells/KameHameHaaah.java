package Heroes.Armory.Spells;

import Behaviours.ISpell;

public class KameHameHaaah implements ISpell{

    private int magic;

    public KameHameHaaah(){
        this.magic = 150;
    }

    public int getMagic(){
        return this.magic;
    }
}
