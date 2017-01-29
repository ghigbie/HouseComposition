package com.georgehigbie;

/**
 * Created by georgehigbie on 1/28/17.
 */
public class Sofa {

    private int numberSeats;
    private String plushness;


    public Sofa(int numberSeats, String plushness) {
        this.numberSeats = numberSeats;
        this.plushness = plushness;
    }

    public void letPeopleSit(){
        System.out.println("People are now sitting in this sofa. Yay!");
    }

    public void kickPeopleOff(){
        System.out.println("The sofa just came to life and kicked people off. Everyone leaves the house screaming!");
    }

    //auto generated getters and setters
    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getPlushness() {
        return plushness;
    }

    public void setPlushness(String plushness) {
        this.plushness = plushness;
    }
}
