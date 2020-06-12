package lesson57.warmup;

public class Application {

  public static void main(String[] args) {
    Rectangles rectangles = new Rectangles(2);
    System.out.printf("List of generated rectangles is: %s\n", rectangles.list());
    System.out.printf("The square of all the rectangles is: %d\n", rectangles.area());
  }

}
