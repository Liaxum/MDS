package TP4.Temp.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class TemperatureFarenheit extends Temperature {

    public TemperatureFarenheit(TP4.Temp.model.Temperature model, TP4.Temp.controller.Temperature controller, int posX, int posY) {
        super("Temperature_Farenheit", model, controller, posX, posY);
        this.setDisplay("" +  model.getTemperatureF());
        addUpListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.addFar();
            }
        });
        addDownListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.removeFar();
            }
        });
        addDisplayListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.fixFar(getDisplay());
            }
        });
    }

    public void update(Observable o, Object obj) {
        setDisplay("" + model().getTemperatureF());
    }
}
