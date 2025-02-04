package lesson1;

public abstract class Shape {

    protected int x;

    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape() {
    }

    public void printWhoIAm() {
        System.out.println("Unknown");
    }

    public abstract void draw();


}
