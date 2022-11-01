package TP1.Exercice4;

public class RationalTest {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);

        System.out.println(r1 + " + " + r2);
        r1.plus(r2);
        System.out.println(r1);
        System.out.println();

        r1 = new Rational(-5, 8);
        r1.times(new Rational(6, 5));
        System.out.println(r1);
        r1.divide(new Rational(9, 10));
        System.out.println(r1);
        System.out.println();

        r1 = new Rational(9, 8);
        r1.divide(new Rational(7, 6));
        System.out.println(r1);
        r1.minus(new Rational(5, 4));
        System.out.println(r1);
    }
}
