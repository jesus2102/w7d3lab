package Heroes.Armory.HeavyWeapons;

import Behaviours.IHeavyWeapon;

public class Mjolnir implements IHeavyWeapon{

    private int attack;

    public Mjolnir (){
        this.attack = 150;
    }

    public int getAttack(){
        return this.attack;
    }

}
