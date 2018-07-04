package Characters;

import Behaviours.IWeapon;

public class Knight extends Character {

    private IWeapon weapon;

    public Knight(String name, int level, int hp, int attack, int defense, int magic){
        super(name,level,hp,attack,defense,magic);
    }

    public int getKnightHp() {
        return getDefaultHp() + (5 * getLevel());
    }

    public int getKnightAttack() {
        return getDefaultAttack() + (3 * getLevel());
    }

    public int getKnightDefense() {
        return getDefaultDefense() + (2 * getLevel()) ;
    }

    public int getKnightMagic() {
        return getDefaultMagic() + (2 * getLevel());
    }
}
