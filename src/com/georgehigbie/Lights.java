package com.georgehigbie;

/**
 * Created by georgehigbie on 1/28/17.
 */
public class Lights {

    private int brightness;
    private int numberLights;

    public Lights(int brightness, int numberLights) {
        this.brightness = brightness;
        this.numberLights = numberLights;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getNumberLights() {
        return numberLights;
    }

    public void setNumberLights(int numberLights) {
        this.numberLights = numberLights;
    }
}
