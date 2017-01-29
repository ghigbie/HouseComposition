package com.georgehigbie;

/**
 * Created by georgehigbie on 1/28/17.
 */
public class LivingRoom extends Room {

    private Sofa sofa;
    private Lights lights;
    private Television televison;


    public LivingRoom(int numberWalls, int numberWindows, int numberDoors, String roomName, Sofa sofa, Lights lights, Television television) {
        super(numberWalls, numberWindows, numberDoors, roomName);
        this.sofa = sofa;
        this.lights = lights;
        this.televison = television;
    }

    public void beARoom(){
        System.out.println("You walk into the living room.");
    }




}
