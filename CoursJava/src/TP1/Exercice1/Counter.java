package TP1.Exercice1;

public class Counter {
    private int val;

    public Counter() {
        this.val = 0;
    }

    public int getVal() {
        return val;
    }

    public void raz() {
        this.val = 0;
    }

    public void click() {
        this.val++;
    }
}
