package Rooms;

public abstract class Room {
    private String name;


    public Room(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
