package Characters;

import Armory.Weapons.Excalibur;
import Behaviours.IArmor;
import Behaviours.IWeapon;

public class Knight extends Character {

    private IWeapon weapon;
    private IArmor armor;

    public Knight(String name, int level, int hp, int attack, int defense, int magic, IWeapon weapon, IArmor armor){
        super(name,level,hp,attack,defense,magic);
        this.weapon = weapon;
        this.armor = armor;
    }

    public int getKnightHp() {
        return getDefaultHp() + (5 * getLevel());
    }

    public int getKnightAttack() {
        return getDefaultAttack() + (3 * getLevel()) + weapon.getAttack();
    }

    public int getKnightDefense() {
        return getDefaultDefense() + (2 * getLevel()) + armor.getDefense() ;
    }

    public int getKnightMagic() {
        return getDefaultMagic() + (2 * getLevel());
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(IArmor armor){
        this.armor = armor;
    }
}
