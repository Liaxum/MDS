package TP1.Exercice6;

import java.util.Objects;

public class Point {
    private float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public boolean same(Point p) {
        if (this.x == p.x && this.y == p.y) return true;
        else return false;
    }

    public float distance(Point p) {
        return (float) Math.sqrt(Math.pow(this.x + p.x, 2) + Math.pow(this.y + p.y, 2));
    }
}
