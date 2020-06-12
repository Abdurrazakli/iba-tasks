package lesson57.warmup;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Rectangles {
  private final Collection<Rectangle> rectangles;

  static Collection<Rectangle> random(int qty) {
    return Stream
        .generate(Rectangle::random)
        .limit(qty)
        .collect(Collectors.toList());
  }

  Rectangles() {
    this(lesson57.warmup.C.RECTANGLES_COUNT);
  }

  Rectangles(int qty) {
    this.rectangles = Rectangles.random(qty);
  }

  long area() {
   return rectangles.stream().flatMap(r->
            IntStream.range(Math.min(r.p1.x(),r.p2.x()),Math.max(r.p1.x(),r.p2.x())).mapToObj(x ->
                    IntStream.range(Math.min(r.p1.y(),r.p2.y()),Math.max(r.p1.y(),r.p2.y()))
                            .mapToObj(y ->
                            new Rectangle(new Point(x,y),new Point(x+1,y+1))))
    ).collect(Collectors.toSet()).size();
  }

  public List<Rectangle> list() {
    return (List<Rectangle>) rectangles;
  }
}
