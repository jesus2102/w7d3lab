package Characters;

import Behaviours.ISpell;

public class Warlock extends Character{

    ISpell spell;

    public Warlock(String name, int level, int hp, int attack, int defense, int magic, ISpell spell) {
        super(name, level, hp, attack, defense, magic);
    }


    public int getWarlockHp() {
        return getDefaultHp() + (4 * getLevel());
    }

    public int getWarlockAttack() {
        return getDefaultAttack() + (2 * getLevel());
    }

    public int getWarlockDefense() {
        return getDefaultDefense() + (3 * getLevel());
    }

    public int getWarlockMagic() {
        return getDefaultMagic() + (3 * getLevel()) + spell.getMagic();
    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }
}
