package TP4.Temp.controler;

import TP4.Temp.view.Thermometer;

public class Temperature {
    private TP4.Temp.model.Temperature model;
    private TP4.Temp.view.Temperature view = null;
    private Thermometer thermometer = null;
    private EditTemp editTemp = new EditTempAdd1();

    public Temperature(TP4.Temp.model.Temperature model) {
        this.model = model;
        control();
    }

    public void addCelsius() {
        this.model.setTemperature(editTemp.add(model.getTemperature()));
        control();
    }

    public void removeCelsius() {
        this.model.setTemperature(editTemp.less(model.getTemperature()));
        control();
    }

    public void fixCelsius(double temp) {
        model.setTemperature(temp);
        control();
    }

    public void addFar() {
        this.model.setTemperatureF(editTemp.add(model.getTemperatureF()));
        control();
    }

    public void removeFar() {
        this.model.setTemperatureF(editTemp.less(model.getTemperatureF()));
        control();
    }

    public void fixFar(double temp) {
        model.setTemperatureF(temp);
        control();
    }

    public void setTemperature(double temp) {
        this.model.setTemperature(temp);
        control();
    }

    public void control() {
        if (view != null) {
            if (model.getTemperature() > 40.0) view.enableWarningColor();
            else view.disableWarningColor();
        }
    }

    public void addView(TP4.Temp.view.Temperature view) {
        this.view = view;
    }

    public void addThermometer(Thermometer thermometer) {this.thermometer = thermometer;}
}
