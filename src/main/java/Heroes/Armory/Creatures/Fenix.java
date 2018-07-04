package Heroes.Armory.Creatures;

import Behaviours.ICreature;

public class Fenix implements ICreature{

    private int defense;

    public Fenix(){
        this.defense = 70;
    }

    public int getDefense(){
        return this.defense;
    }



}
