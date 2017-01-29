package com.georgehigbie;

/**
 * Created by georgehigbie on 1/28/17.
 */
public class Television {

    private int size;
    private boolean hasInternet;

    public Television(int size, boolean hasInternet) {
        this.size = size;
        this.hasInternet = hasInternet;
    }

    public void turnOn(){
        System.out.println("The TV is now on, and people are watching.");
    }

    public void getNetflix(){
        if(hasInternet == true){
            System.out.println("The TV is now showing Netflix.");
        }else{
            System.out.println("Please buy a TV with internet, you cheapskate.");
        }
    }

    public void turnOff(){
        System.out.println("The TV is now off.");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isHasInternet() {
        return hasInternet;
    }

    public void setHasInternet(boolean hasInternet) {
        this.hasInternet = hasInternet;
    }
}
