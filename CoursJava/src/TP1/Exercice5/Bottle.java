package TP1.Exercice5;

public class Bottle {
    private int quantity;
    private boolean isOpen = false;

    public Bottle(int quantity) {
        this.quantity = quantity;
    }

    public void open() { this.isOpen = true; }
    public void close() { this.isOpen = false; }
    public void serve(Glass g, int quantity) {
        if (isOpen) {
            g.fill(quantity);
            this.quantity -= quantity;
        }
    }
}
