package Characters;

import Behaviours.ICreature;
import Behaviours.ISpell;

public class Wizard extends Character {

    ISpell spell;
    ICreature creature;

    public Wizard(String name, int level, int hp, int attack, int defense, int magic, ISpell spell, ICreature creature) {
        super(name, level, hp, attack, defense, magic);
        this.spell = spell;
        this.creature = creature;
    }


    public int getWizardHp() {
        return getDefaultHp() + (4 * getLevel());
    }

    public int getWizardAttack() {
        return getDefaultAttack() + (1 * getLevel());
    }

    public int getWizardDefense() {
        return getDefaultDefense() + (2 * getLevel()) + creature.getDefense();
    }

    public int getWizardMagic() {
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
