package lesson56.warmup;

class Rectangle {
  public final Point p1;
  public final Point p2;

  static Rectangle random() {
    return new Rectangle(Point.random(), Point.random());
  }

  Rectangle(Point p1, Point p2) {
    this.p1 = p1;
    this.p2 = p2;
  }
  int area(){
    return Math.abs((p1.x()- p2.x()) * (p1.y() - p2.y()));
  }

  @Override
  public String toString() {
    return String.format("Rec{p1=%s, p2=%s}", p1, p2);
  }
}
