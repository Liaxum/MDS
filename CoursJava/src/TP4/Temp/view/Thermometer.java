package TP4.Temp.view;

import TP4.Temp.model.Temperature;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class Thermometer implements Observer {
    protected Temperature model;
    protected TP4.Temp.controler.Temperature controller;
    private JFrame temperatureJFrame;
    private JSlider slider;

    public Thermometer(Temperature model, TP4.Temp.controler.Temperature controller, int posX, int posY) {
        this.model = model;
        this.controller = controller;
        temperatureJFrame = new JFrame("Thermometer");
        temperatureJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        temperatureJFrame.add(new JLabel("Thermometer"), BorderLayout.NORTH);
        slider = new JSlider(JSlider.VERTICAL, -20, 100, (int) model.getTemperature());
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                controller.setTemperature(slider.getValue());
            }
        });


        temperatureJFrame.add(slider, BorderLayout.CENTER);

        model.addObserver(this);

        temperatureJFrame.setSize(200, 500);
        temperatureJFrame.setLocation(posX, posY);
        temperatureJFrame.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        slider.setValue((int) model.getTemperature());
    }
}
