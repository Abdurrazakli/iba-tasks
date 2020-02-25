package lesson09.warmup.t4;

public class Formatter2 implements Formattable {
  private final Formattable f;

  public Formatter2(Formattable f) {
    this.f = f;
  }

  public Formatter2() {
//    this(s -> s);
    this(new Formattable() {
      @Override
      public String fmt(String orig) {
        return orig;
      }
    });
  }

  @Override
  public String fmt(String orig) {
    String step1 = f.fmt(orig);
    String step2 = step1.toUpperCase();
    return step2;
  }
}
