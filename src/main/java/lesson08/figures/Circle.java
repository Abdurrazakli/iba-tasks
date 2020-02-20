package lesson08.figures;

public class Circle extends Figure {
  int radius;
  Point center;

  public Circle(Point center, int radius){
    this.center = center;
    this.radius = radius;
  }

  @Override
  public int area(){
    return (int) (Math.PI * Math.pow(radius, 2));
  }
}
