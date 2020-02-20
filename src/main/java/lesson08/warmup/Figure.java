package lesson08.warmup;

public class Figure {
    public int area(){
        throw new IllegalArgumentException("It needs to be implemented");
    }
    public double distance(Point p1, Point p2){
        return Math.sqrt((p1.X - p2.X) * (p1.X - p2.X) + (p1.Y - p2.Y) * (p1.Y - p2.Y));
    }
    public double lengthY(Point p1, Point p2){
        return Math.abs(p1.Y - p2.Y);
    }
    public double lengthX(Point p1, Point p2){
        return Math.abs(p1.X - p2.X);
    }
}
