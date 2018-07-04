package Heroes.Characters;

import Behaviours.ICreature;
import Behaviours.ISpell;

public class Warlock extends Character{

    ISpell spell;
    ICreature creature;

    public Warlock(String name, int level, int hp, int attack, int defense, int magic, ISpell spell, ICreature creature) {
        super(name, level, hp, attack, defense, magic);
        this.spell = spell;
        this.creature = creature;
    }


    public int getWarlockHp() {
        return getDefaultHp() + (4 * getLevel());
    }

    public int getWarlockAttack() {
        return getDefaultAttack() + (1 * getLevel());
    }

    public int getWarlockDefense() {
        return getDefaultDefense() + (2 * getLevel()) + creature.getDefense();
    }

    public int getWarlockMagic() {
        return getDefaultMagic() + (3 * getLevel()) + spell.getMagic();
    }

    public ISpell getSpell() {
        return this.spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public ICreature getCreature() {
        return creature;
    }

    public void setcreature(ICreature creature) {
        this.creature = creature;
    }
}
