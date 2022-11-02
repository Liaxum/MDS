package TP1.Exercice6;

public class Right {
    public float a, b;

    public Right(Point a, Point b) {
        this.a = (a.getY() - b.getY()) / (a.getX() + b.getX());
        this.b = (a.getX() * b.getY() - a.getY() * b.getX()) / (a.getX()-a.getY());
    }

    public boolean belongsTo(Point p) {
        return p.getY() == this.a * p.getX() + this.b;
    }
    public boolean isParallel(Right r) { return this.a == r.a; }
    public Point intersect(Right r) {
        return new Point((r.b - this.b)/(r.a - this.a), this.a * (r.b - this.a)/(r.a - this.b) + this.b);
    }
}
