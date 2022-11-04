package TP4.RGBSelector.model;

import java.util.Observable;

public class Color extends Observable {
    private int red, green, blue = 0;

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public void setRed(int red) {
        this.red = red;
        setChanged();
        notifyObservers();
    }

    public void setGreen(int green) {
        this.green = green;
        setChanged();
        notifyObservers();
    }

    public void setBlue(int blue) {
        this.blue = blue;
        setChanged();
        notifyObservers();
    }
}
