package lesson08.figures;

public class RandomFigureGenerator {
    public Figure getRandomFigure(){
        int numberOfFigures = 3;
        int figureDeterminer = random_number(numberOfFigures);
        Figure figure = getRandomCircle();
        switch (figureDeterminer){
            case 0:
                figure = getRandomCircle();
                break;
            case 1:
                figure = getRandomRectangle();
                break;
            case 2:
               figure = getRandomTriangle();
               break;
            default: break;
        }
        return figure;
    }
    public Circle getRandomCircle(){
        int limiter = 50;
        int radius = random_number(limiter);
        return new Circle(getRandomPoint(),radius);
    }
    public Triangle getRandomTriangle(){
        return new Triangle(getRandomPoint(),getRandomPoint(),getRandomPoint());
    }
    public Rectangle getRandomRectangle(){
        return new Rectangle(getRandomPoint(),getRandomPoint());
    }
    public Point getRandomPoint(){
        int limiter = 100;
        return new Point( random_number(100),random_number(100));
    }
    public int random_number(int limiter){
        return (int)(Math.random() * limiter);
    }
}
