package TP4;

import TP4.model.Temperature;

public class Main {
    public Main() {
        Temperature tempMod = new Temperature();
        TP4.controler.Temperature tempContC = new TP4.controler.Temperature(tempMod);
        TP4.controler.Temperature tempContF = new TP4.controler.Temperature(tempMod);

        TP4.view.TemperatureCelsius pvc = new TP4.view.TemperatureCelsius(tempMod, tempContC, 100, 200);
        TP4.view.TemperatureFarenheit pvf = new TP4.view.TemperatureFarenheit(tempMod, tempContF, 100, 350);
        tempContC.addView(pvc);
        tempContF.addView(pvf);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
