package TP4.RGBSelector.view;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class Color implements Observer {
    private final TP4.RGBSelector.controller.Color controller;

    private final JFrame window;
    private JPanel panel1;
    private JSlider redSlider;
    private JSlider greenSlider;
    private JSlider blueSlider;
    private JTextField redText;
    private JTextField greenText;
    private JTextField blueText;
    private JPanel colorSelector;
    private JTextField previewColor;

    public Color(TP4.RGBSelector.controller.Color controller) {
        this.controller = controller;
        this.window = new JFrame("RGB Selector");
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setContentPane(this.panel1);

        this.redText.setText("" + controller.getRed());
        this.greenText.setText("" + controller.getGreen());
        this.blueText.setText("" + controller.getBlue());

        this.redSlider.setValue(controller.getRed());
        this.greenSlider.setValue(controller.getGreen());
        this.blueSlider.setValue(controller.getBlue());

        this.initListenners();
        this.changeBackground();

        this.window.pack();
        this.window.setVisible(true);
    }

    private void initListenners() {
        this.redSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                controller.setRed(redSlider.getValue());
            }
        });
        this.redText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    controller.setRed(Integer.parseInt(redText.getText()));
                } catch (NumberFormatException ignored) {}
            }
        });
        this.greenSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                controller.setGreen(greenSlider.getValue());
            }
        });
        this.greenText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    controller.setGreen(Integer.parseInt(greenText.getText()));
                } catch (NumberFormatException ignored) {
                }
            }
        });
        this.blueSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                controller.setBlue(blueSlider.getValue());
            }
        });
        this.blueText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    controller.setBlue(Integer.parseInt(blueText.getText()));
                } catch (NumberFormatException ignored) {
                }
            }
        });
    }

    public void enableError(String error) {
        switch (error) {
            case "red" -> this.redText.setBackground(java.awt.Color.RED);
            case "green" -> this.greenText.setBackground(java.awt.Color.GREEN);
            case "blue" -> this.blueText.setBackground(java.awt.Color.BLUE);
            default -> {
            }
        }
    }

    public void disableError(String error) {
        switch (error) {
            case "red" -> this.redText.setBackground(java.awt.Color.WHITE);
            case "green" -> this.greenText.setBackground(java.awt.Color.WHITE);
            case "blue" -> this.blueText.setBackground(java.awt.Color.WHITE);
            default -> {
            }
        }
    }

    private void changeBackground() {
        this.previewColor.setBackground(new java.awt.Color(controller.getRed(), controller.getGreen(), controller.getBlue()));
    }

    @Override
    public void update(Observable o, Object arg) {
        this.redText.setText("" + controller.getRed());
        this.redSlider.setValue(controller.getRed());
        this.greenText.setText("" + controller.getGreen());
        this.greenSlider.setValue(controller.getGreen());
        this.blueText.setText("" + controller.getBlue());
        this.blueSlider.setValue(controller.getBlue());
        this.changeBackground();
    }
}
