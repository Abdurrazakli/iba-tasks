package lesson07.warmup;

public class Circle extends Figure {
    private int radius;
    private Point center;
    private final static double PI = 3.14;

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public int area() {
        return (int)(PI * radius * radius);
    }
}
