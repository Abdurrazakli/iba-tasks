package lesson09.warmup.t3;

public class Formatter2 extends Formatter {

  public Formatter2(String msg) {
    super(msg);
  }

  @Override
  protected String format(String origin) {
    return origin.toUpperCase();
  }

}
