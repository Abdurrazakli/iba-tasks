package lesson13.warmup;

public class StringCheckRotated {
  public boolean check(String origin, String rotated) {
    String originDoubled = origin+origin;
    return originDoubled.indexOf(rotated) == -1 ? false : true;
  }
}
