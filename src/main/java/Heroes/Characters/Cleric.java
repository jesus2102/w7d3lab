package Heroes.Characters;

import Behaviours.ISpell;


    public class Cleric extends Character {

        ISpell spell;

        public Cleric(String name, int level, int hp, int attack, int defense, int magic, ISpell spell) {
            super(name, level, hp, attack, defense, magic);
        }


        public int getClericHp() {
            return getDefaultHp() + (4 * getLevel());
        }

        public int getClericAttack() {
            return getDefaultAttack();
        }

        public int getClericDefense() {
            return getDefaultDefense() + (2 * getLevel());
        }

        public int getClericMagic() {
            return getDefaultMagic() + (5 * getLevel()) + spell.getMagic();
        }

        public ISpell getSpell() {
            return spell;
        }

        public void setSpell(ISpell spell) {
            this.spell = spell;
        }


}
