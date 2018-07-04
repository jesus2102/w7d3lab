package Enemies;

public abstract class Enemy {

    private String name;
    private int hp;
    private int attack;
    private int defense;
    private int magic;

    public Enemy(String name, int hp, int attack, int defense, int magic) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.magic = magic;
    }
}
