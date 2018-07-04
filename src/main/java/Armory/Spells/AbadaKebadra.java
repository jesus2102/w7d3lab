package Armory.Spells;

import Behaviours.ISpell;

public class AbadaKebadra implements ISpell{

    private int magic;

    public AbadaKebadra(){
        this.magic = 90;
    }

    public int getMagic(){
        return this.magic;
    }
}
