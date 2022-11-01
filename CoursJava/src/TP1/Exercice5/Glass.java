package TP1.Exercice5;

public class Glass {
    private int quantity, capacity;

    public Glass(int quantity, int capacity) {
        this.quantity = quantity;
        this.capacity = capacity;
    }

    public void fill(int quantity) {
        int still = this.capacity - this.quantity;
        this.quantity += quantity - still;
    }

    public void drink(int quantity) {
        this.quantity -= quantity;
        if (this.quantity < 0) {
            this.quantity = 0;
        }
    }
}
