package TP5.Exercice2;

import java.util.Observer;

public class All implements Observer {

    @Override
    public void update(java.util.Observable o, Object arg) {
        if (o instanceof GPS) {
            System.out.println("Position: " + ((GPS) o).getPosition() +
                    ", Accuracy:," + ((GPS) o).getAcc());
        } else System.out.println("This not a GPS");
    }
}
