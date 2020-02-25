package lesson09.warmup.t3;

public abstract class Formatter {
  protected final String msg;

  public Formatter(String msg) {
    this.msg = msg;
  }

  abstract protected String format(String origin);

  @Override
  public String toString() {
    return format(msg);
  }
}
