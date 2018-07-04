package Heroes.Characters;

import Behaviours.IWeapon;

public class Barbarian extends Character{

    private IWeapon weapon;
    private IWeapon weapon2;

    public Barbarian(String name, int level, int hp, int attack, int defense, int magic, IWeapon weapon, IWeapon weapon2){
        super(name,level,hp,attack,defense,magic);
        this.weapon = weapon;
        this.weapon2 = weapon2;
    }

    public int getBarbarianHp() {
        return getDefaultHp() + (6 * getLevel());
    }

    public int getBarbarianAttack() {
        return getDefaultAttack() + (2 * getLevel()) + weapon.getAttack() + weapon2.getAttack();
    }

    public int getBarbarianDefense() {
        return getDefaultDefense() + (2 * getLevel());
    }

    public int getBarbarianMagic() {
        return getDefaultMagic() + (2 * getLevel());
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon2(IWeapon weapon2){
        this.weapon2 = weapon2;
    }
}
