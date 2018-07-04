package Heroes.Armory.Weapons;

import Behaviours.IWeapon;

public class Excalibur implements IWeapon {

    private int attack;

    public Excalibur (){
        this.attack = 110;
    }

    public int getAttack(){
        return this.attack;
    }


}
