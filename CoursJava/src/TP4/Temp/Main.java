package TP4.Temp;

import TP4.Temp.model.Temperature;
import TP4.Temp.view.Thermometer;

public class Main {
    public Main() {
        Temperature tempMod = new Temperature();
        TP4.Temp.controller.Temperature tempContC = new TP4.Temp.controller.Temperature(tempMod);
        TP4.Temp.controller.Temperature tempContF = new TP4.Temp.controller.Temperature(tempMod);

        TP4.Temp.view.TemperatureCelsius pvc = new TP4.Temp.view.TemperatureCelsius(tempMod, tempContC, 100, 200);
        TP4.Temp.view.TemperatureFarenheit pvf = new TP4.Temp.view.TemperatureFarenheit(tempMod, tempContF, 100, 350);
        Thermometer tvc = new Thermometer(tempMod, tempContC, 500, 200);

        tempContC.addView(pvc);
        tempContF.addView(pvf);
        tempContC.addThermometer(tvc);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
