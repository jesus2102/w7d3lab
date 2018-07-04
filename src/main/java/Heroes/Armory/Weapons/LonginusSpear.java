package Heroes.Armory.Weapons;

import Behaviours.IWeapon;

public class LonginusSpear implements IWeapon{

    private int attack;

    public LonginusSpear(){
        this.attack = 70;
    }

    public int getAttack(){
        return this.attack;
    }
}
