package Characters;

public abstract class Character {

    private String name;
    private int level;
    private int hp;
    private int attack;
    private int defense;
    private int magic;

    public Character(String name, int level, int hp, int attack, int defense, int magic) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.magic = magic;
    }

    public String getName() {
        return name;
    }
}