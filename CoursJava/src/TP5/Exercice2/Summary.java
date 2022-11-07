package TP5.Exercice2;

import java.util.Observer;

public class Summary implements Observer {

    @Override
    public void update(java.util.Observable o, Object arg) {
        if (o instanceof GPS) {
            System.out.println("Position: " + ((GPS)o).getPosition());
        }
    }
}