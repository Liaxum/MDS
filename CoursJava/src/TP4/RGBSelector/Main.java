package TP4.RGBSelector;

import TP4.RGBSelector.model.Color;

public class Main {
    public Main() {
        Color colorMod = new Color();
        TP4.RGBSelector.controller.Color colorCont = new TP4.RGBSelector.controller.Color(colorMod);
        TP4.RGBSelector.view.Color colorView = new TP4.RGBSelector.view.Color(colorCont);

        colorCont.addView(colorView);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
