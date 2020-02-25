package lesson09.warmup.t1;

public class Formatter3 implements Formatter0 {
  @Override
  public String format(String origin) {
    StringBuilder sb = new StringBuilder();
    sb.append("***********\n");
    sb.append("*  ");
    sb.append(origin);
    sb.append("  *\n");
    sb.append("***********\n");

    return sb.toString();
  }
}
