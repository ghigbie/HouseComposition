package com.georgehigbie;

/**
 * Created by georgehigbie on 1/28/17.
 */
public class LivingRoom extends Room {

    public Sofa sofa;
    private Lights lights;
    private Television televison;


    public LivingRoom(int numberWalls, int numberWindows, int numberDoors, String roomName, Sofa sofa, Lights lights, Television television) {
        super(numberWalls, numberWindows, numberDoors, roomName);
        this.sofa = sofa;
        this.lights = lights;
        this.televison = television;
    }

    public void turnLightsOn(){
        System.out.println("Living room is turing on the lights!!!");
        lights.turnOn();
    }

    public void beARoom(){
        System.out.println("You walk into the living room.");
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Lights getLights() {
        return lights;
    }

    public Television getTelevison() {
        return televison;
    }
}
