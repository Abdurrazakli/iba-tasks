package lesson08.warmup;

public class Rectangle extends Figure {
    private Point leftLower;
    private Point rightUpper;
    private double width;
    private double height;

    public Rectangle(Point leftLower, Point rightUpper) {
        this.leftLower = leftLower;
        this.rightUpper = rightUpper;
        width = lengthX(leftLower,rightUpper);
        height = lengthY(leftLower,rightUpper);
    }

    @Override
    public int area() {
        return (int)(width * height);
    }
}
