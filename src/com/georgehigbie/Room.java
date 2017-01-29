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

    //auto generated getters and setters
    public int getNumberWalls() {
        return numberWalls;
    }

    public void setNumberWalls(int numberWalls) {
        this.numberWalls = numberWalls;
    }

    public int getNumberWindows() {
        return numberWindows;
    }

    public void setNumberWindows(int numberWindows) {
        this.numberWindows = numberWindows;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
