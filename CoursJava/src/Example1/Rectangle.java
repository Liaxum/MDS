package Example1;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.x = 0;
        this.y = 0;
        this.height = height;
        this.width = width;
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void translate(int a, int b) {
        this.x += a;
        this.y += b;
    }
    public void translate(int a) {
        this.x += a;
        this.y += a;
    }
}
