package lesson13.warmup;

public class StringCheckRotated {
  public boolean check(String origin, String rotated) {
    return new StringBuilder(origin).append(origin).toString().contains(rotated);
  }
}
