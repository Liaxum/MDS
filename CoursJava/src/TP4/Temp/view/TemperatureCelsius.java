package TP4.Temp.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class TemperatureCelsius extends Temperature{

    public TemperatureCelsius(TP4.Temp.model.Temperature model, TP4.Temp.controller.Temperature controller, int posX, int posY) {
        super("Temperature_Celsius", model, controller, posX, posY);
        this.setDisplay("" +  model.getTemperature());
        addUpListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.addCelsius();
            }
        });
        addDownListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.removeCelsius();
            }
        });
        addDisplayListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.fixCelsius(getDisplay());
            }
        });
    }

    public void update(Observable o, Object obj) {
        setDisplay("" + model().getTemperature());
    }
}
