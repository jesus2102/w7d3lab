package Characters;

import Behaviours.IWeapon;

public class Barbarian extends Character{

    private IWeapon weapon;
    private IWeapon weapon2;

    public Knight(String name, int level, int hp, int attack, int defense, int magic, IWeapon weapon, IWeapon weapon2){
        super(name,level,hp,attack,defense,magic);
        this.weapon = weapon;
        this.weapon2 = weapon2;
    }

    public int getKnightHp() {
        return getDefaultHp() + (5 * getLevel());
    }

    public int getKnightAttack() {
        return getDefaultAttack() + (3 * getLevel()) + weapon.getAttack() + weapon2.getAttack();
    }

    public int getKnightDefense() {
        return getDefaultDefense() + (2 * getLevel());
    }

    public int getKnightMagic() {
        return getDefaultMagic() + (2 * getLevel());
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = null;
        this.weapon = weapon;
    }

    public void setWeapon2(IWeapon weapon2){
        this.weapon2 = null;
        this.weapon2 = weapon2;
    }
}
