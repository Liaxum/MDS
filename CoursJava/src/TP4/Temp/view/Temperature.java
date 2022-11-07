package TP4.Temp.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public abstract class Temperature implements Observer {
    private final String label;
    protected TP4.Temp.model.Temperature model;
    protected TP4.Temp.controller.Temperature controller;
    private final JFrame temperatureJFrame;
    private final JTextField display = new JTextField();
    private final JButton upJButton = new JButton("+");
    private final JButton downJButton = new JButton("-");

    public Temperature(String label, TP4.Temp.model.Temperature model, TP4.Temp.controller.Temperature controller, int posX, int posY) {
        this.label = label;
        this.model = model;
        this.controller = controller;
        temperatureJFrame = new JFrame(label);
        temperatureJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        temperatureJFrame.add(new JLabel(label), BorderLayout.NORTH);
        temperatureJFrame.add(this.display, BorderLayout.CENTER);
        JPanel panelButtons = new JPanel();
        panelButtons.add(this.downJButton);
        panelButtons.add(this.upJButton);
        temperatureJFrame.add(panelButtons, BorderLayout.SOUTH);

        model.addObserver(this);

        temperatureJFrame.setSize(200, 100);
        temperatureJFrame.setLocation(posX, posY);
        temperatureJFrame.setVisible(true);
    }

    public void setDisplay(String s) {
        this.display.setText(s);
    }

    public void enableWarningColor() {
        this.display.setBackground(Color.RED);
    }

    public void disableWarningColor() {
        this.display.setBackground(Color.WHITE);
    }

    public double getDisplay() {
        double result = 0.0;
        try {
            result = Double.parseDouble(display.getText());
        } catch (Exception e) {}
        return result;
    }

    public void addDisplayListener(ActionListener listener) {this.display.addActionListener(listener);}
    public void addUpListener(ActionListener listener) {this.upJButton.addActionListener(listener);}
    public void addDownListener(ActionListener listener) {this.downJButton.addActionListener(listener);}

    protected TP4.Temp.model.Temperature model() {
        return this.model;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
