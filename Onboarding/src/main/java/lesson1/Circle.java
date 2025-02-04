package lesson1;

public class Circle extends Shape {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public Circle(int x, int y) {
        super(x, y);
    }




    @Override
    public void printWhoIAm() {
        System.out.println("Circle");
    }

    @Override
    public void draw() {
        System.out.printf("Drawing circle at (%d,%d) with radius %d\\\\n", x, y, radius);
    }
}
