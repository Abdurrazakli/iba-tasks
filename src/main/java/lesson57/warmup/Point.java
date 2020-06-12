package lesson57.warmup;

final class Point {
  private final int x;
  private final int y;

  static Point random() {
    return new Point(
        lesson57.warmup.Fn.random_val(lesson57.warmup.C.POINT_MIN_X, lesson57.warmup.C.POINT_MAX_X),
        lesson57.warmup.Fn.random_val(lesson57.warmup.C.POINT_MIN_Y, lesson57.warmup.C.POINT_MAX_Y)
    );
  }

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  int x() {
    return x;
  }

  int y() {
    return y;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof Point)) return false;

    Point that = (Point) o;

    return this.x == that.x
        && this.y == that.y;
  }

  @Override
  public int hashCode() {
    return x << 16 + y;
  }

  @Override
  public String toString() {
    return String.format("Point{x=%d, y=%d}", x, y);
  }
}
