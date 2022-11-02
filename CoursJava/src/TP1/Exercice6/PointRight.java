package TP1.Exercice6;

public class PointRight {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(3, 5);

        Right r1 = new Right(p1, p2);

        System.out.println("P3 is on the right: " + r1.belongsTo(p3));
    }
}
