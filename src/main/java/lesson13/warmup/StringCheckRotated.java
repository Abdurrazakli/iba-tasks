package lesson13.warmup;

public class StringCheckRotated {
  public boolean check(String origin, String rotated) {
    return new StringBuilder(origin).append(origin).toString().indexOf(rotated) == -1 ? false : true;
  }
}
