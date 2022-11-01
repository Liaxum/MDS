package TP1.Exercice5;

public class GlassBottle {

    public GlassBottle() {
        Bottle orange = new Bottle(100);
        Bottle water = new Bottle(100);

        Glass glass = new Glass(0, 20);
        orange.serve(glass, 12);
        water.serve(glass, 8);

        glass.drink(20);
    }
}
