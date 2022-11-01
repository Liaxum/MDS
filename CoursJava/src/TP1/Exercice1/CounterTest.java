package TP1.Exercice1;

public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.click();
        counter.click();
        System.out.println("Counter value: " + counter.getVal());
        counter.raz();
        System.out.println("Counter value: " + counter.getVal());
    }
}
