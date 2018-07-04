package Heroes.Armory.Creatures;

import Behaviours.ICreature;

public class Dragon implements ICreature {

    private int defense;

    public Dragon(){
        this.defense = 90;
    }

    public int getDefense(){
        return this.defense;
    }
}
