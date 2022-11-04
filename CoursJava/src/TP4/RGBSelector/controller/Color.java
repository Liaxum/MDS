package TP4.RGBSelector.controller;

public class Color  {
    private final TP4.RGBSelector.model.Color model;
    private TP4.RGBSelector.view.Color view;

    public Color(TP4.RGBSelector.model.Color model) {
        this.model = model;
    }
    public void setGreen(int value) {
        model.setGreen(value);
        if (model.getGreen() < 0 && model.getGreen() > 255) view.enableError("green");
        else view.disableError("green");
    }
    public void setBlue(int value) {
        model.setBlue(value);
        if (model.getBlue() < 0 && model.getBlue() > 255) view.enableError("blue");
        else view.disableError("blue");
    }
    public void setRed(int value) {
        model.setRed(value);
        if (model.getRed() < 0 && model.getRed() > 255) view.enableError("red");
        else view.disableError("red");
    }

    public int getGreen() {
        return model.getGreen();
    }
    public int getBlue() {
        return model.getBlue();
    }
    public int getRed() {
        return model.getRed();
    }

    public void addView(TP4.RGBSelector.view.Color view) {this.view = view; this.model.addObserver(view);}
}
