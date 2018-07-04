package Rooms;

import Heroes.Characters.Character;
import Enemies.Enemy;

public abstract class Room {
    private String name;
    private Character hero;
    private Enemy enemy;


    public Room(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
