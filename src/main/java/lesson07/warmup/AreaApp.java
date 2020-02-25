package lesson07.warmup;

import java.util.ArrayList;

public class AreaApp {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,4);
        Point p3 = new Point( 5,0);

        Circle f1 = new Circle(5,p1);
        Figure f4 = new Circle(5,p1);
        Figure f2 = new Rectangle(p2,p3);
        Figure f3 = new Triangle(p1,p2,p3);

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(f1);
        figures.add(f2);
        figures.add(f3);
        int totalArea = 0;
        for (Figure x:figures
             ) {
            totalArea += x.area();
        }
        System.out.printf("Total area: %d ",totalArea);
    }
}
