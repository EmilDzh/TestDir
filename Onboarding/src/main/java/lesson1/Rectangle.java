package lesson1;

public class Rectangle extends Shape {
    private int w;
    private int h;

    public Rectangle(int x, int y, int w, int h) {
        super(x, y);
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing rectangle at (%d,%d) with width %d and height %d\\\\n", x, y, w, h);
    }
}
