package TP4.Temp.model;

import java.util.Observable;

public class Temperature extends Observable {
    private double temperature = 20;

    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
        setChanged();
        notifyObservers();
    }

    public double getTemperatureF() {
        return this.temperature * 9.0 / 5.0 + 32.0;
    }

    public void setTemperatureF(double temp) {
        this.temperature = (temp - 32) * 5.0 / 9.0;
        setChanged();
        notifyObservers();
    }
}
