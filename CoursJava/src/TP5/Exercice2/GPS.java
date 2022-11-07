package TP5.Exercice2;

import java.util.ArrayList;
import java.util.Observable;

public class GPS extends Observable {
    private String position;
    private int acc;

    public GPS() {
        this.position = "unknown";
        this.acc = 0;
    }

    public String getPosition() {
        return position;
    }

    public int getAcc() {
        return acc;
    }

    public void setPosition(String position, int acc) {
        this.position = position;
        this.acc = acc;
        this.notif();
    }

    public void notif() {
        setChanged();
        notifyObservers();
    }
}
