package lesson07.warmup;

public class Triangle extends Figure {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public int area() {
        double a = distance(p1,p2);
        double b = distance(p2,p3);
        double c = distance(p1,p3);
        double perimeter = a + b + c;
        double halfPerimeter = perimeter / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b)
                * (halfPerimeter - c));
        return (int)area;
    }
}
