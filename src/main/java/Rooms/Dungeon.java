package Rooms;

import Enemies.Enemy;
import Heroes.Characters.Character;

public class Dungeon extends Room {

    private Enemy enemy;
    private Character hero;

    public Dungeon(String name){
        super(name);
        this.enemy = enemy;
        this.hero = hero;
    }
}
