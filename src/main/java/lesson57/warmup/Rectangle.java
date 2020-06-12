package lesson57.warmup;

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

  @Override
  public String toString() {
    return String.format("Rectangle{p1=%s, p2=%s}", p1, p2);
  }
}
