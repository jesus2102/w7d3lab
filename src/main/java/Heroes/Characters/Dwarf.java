package Heroes.Characters;

import Behaviours.IHeavyWeapon;

public class Dwarf extends Character {


    private IHeavyWeapon weapon;

    public Dwarf(String name, int level, int hp, int attack, int defense, int magic, IHeavyWeapon weapon){
        super(name,level,hp,attack,defense,magic);
        this.weapon = weapon;
    }

    public int getDwarfHp() {
        return getDefaultHp() + (6 * getLevel());
    }

    public int getDwarfAttack() {
        return getDefaultAttack() + (2 * getLevel()) + weapon.getAttack();
    }

    public int getDwarfDefense() {
        return getDefaultDefense() + (2 * getLevel());
    }

    public int getDwarfMagic() {
        return getDefaultMagic() + (2 * getLevel());
    }

    public IHeavyWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IHeavyWeapon weapon) {
        this.weapon = weapon;
    }

}
