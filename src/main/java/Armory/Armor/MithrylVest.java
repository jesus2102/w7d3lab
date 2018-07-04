package Armory.Armor;

import Behaviours.IArmor;

public class MithrylVest implements IArmor{

    private int defense;

    public MithrylVest(){
        this.defense = 60;
    }

    public int getDefense(){
        return this.defense;
    }
}
