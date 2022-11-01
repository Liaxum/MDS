package TP1.Exercice6;

public class Right {
    public float a, b;

    public Right(Point a, Point b) {
        this.a = (a.getY() - b.getY()) / (a.getX() + b.getX());
        this.b = (a.getX() * b.getY() - a.getY() * b.getX()) / (a.getX()-a.getY());
    }

    public boolean belongsTo(Point p) { return false; }
    public boolean isParallel() { return false; }
    public Point intersect(Right r) {
        return new Point((r.b - this.a)/(r.a - this.b), this.a * (r.b - this.a)/(r.a - this.b) + this.b);
    }
}
