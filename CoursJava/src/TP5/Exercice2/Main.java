package TP5.Exercice2;

public class Main {
    public static void main(String[] args) {
        GPS gps = new GPS();
        All allObserver = new All();
        Summary sumObserver = new Summary();

        gps.addObserver(sumObserver);

        gps.setPosition("N 39°59°993 / W 123°00°000", 4);

        gps.addObserver(allObserver);

        gps.setPosition("N 37°48°898 / W 124°12°011", 5);
    }
}
