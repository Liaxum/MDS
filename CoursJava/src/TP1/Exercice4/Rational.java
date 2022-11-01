package TP1.Exercice4;

import static java.lang.Math.*;

public class Rational {
    public int numerator, denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void normalize() {
        int max = Math.max(this.numerator, this.denominator);
        int min = Math.min(this.numerator, this.denominator);
        max = Math.abs(max);
        min = Math.abs(min);
        while (min != 0) {
            max -= min;
            int tmp = min;
            min = Math.min(max, min);
            max = Math.max(max, tmp);
        }
        this.numerator /= max;
        this.denominator /= max;
    }

    public void plus(Rational r) {
        this.numerator = this.numerator * r.denominator + this.denominator * r.numerator;
        this.denominator *= r.denominator;
        this.normalize();
    }
    public void times(Rational r) {
        this.numerator *= r.numerator;
        this.denominator *= r.denominator;
        this.normalize();
    }
    public void opposite() {
        this.numerator = -this.numerator;
    }
    public void invert() {
        int tmp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = tmp;
    }
    public void minus(Rational r) {
        r.opposite();
        this.plus(r);
        r.opposite();
        this.normalize();
    }
    public void divide(Rational r) {
        this.numerator *= r.denominator;
        this.denominator *= r.numerator;
        this.normalize();
    }

    @Override
    public String toString() {
        return "(" + this.numerator + "/" + this.denominator + ")";
    }
}
