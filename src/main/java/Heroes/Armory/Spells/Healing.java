package Heroes.Armory.Spells;

import Behaviours.ISpell;

public class Healing implements ISpell{

    private int magic;

    public Healing(){
        this.magic = 50;
    }

    public int getMagic(){
        return this.magic;
    }
}