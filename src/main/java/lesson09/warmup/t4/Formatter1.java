package lesson09.warmup.t4;

public class Formatter1 implements Formattable {

  private final Formattable f;

  public Formatter1(Formattable f) {
    this.f = f;
  }

  public Formatter1() {
    this(new FormatterPlain());
  }

  @Override
  public String fmt(String orig) {
    String step1 = f.fmt(orig);
    String step2 = step1.toLowerCase();
    return step2;
  }
}
