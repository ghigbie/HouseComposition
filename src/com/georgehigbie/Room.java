package com.georgehigbie;

/**
 * Created by georgehigbie on 1/28/17.
 */
public class Room {

    private int numberWalls;
    private int numberWindows;
    private int numberDoors;
    private String roomName;

    public Room(int numberWalls, int numberWindows, int numberDoors, String roomName) {
        this.numberWalls = numberWalls;
        this.numberWindows = numberWindows;
        this.numberDoors = numberDoors;
        this.roomName = roomName;
    }
}
