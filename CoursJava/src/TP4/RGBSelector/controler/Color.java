package TP4.RGBSelector.controler;

public class Color {
    private TP4.RGBSelector.model.Color model;
    private TP4.RGBSelector.view.Color view;

    public Color(TP4.RGBSelector.model.Color model) {
        this.model = model;
    }

    public void addView(TP4.RGBSelector.view.Color view) {this.view = view;}
}
