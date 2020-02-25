package lesson09.warmup.t3;

import java.util.Arrays;

public class Formatter3 extends Formatter {

  public Formatter3(String msg) {
    super(msg);
  }

  @Override
  protected String format(String origin) {
    char[] chars = new char[origin.length() + 6];
    Arrays.fill(chars, '*');
    String header = new String(chars);
    return String.format("%s\n*  %s  *\n%1$s\n", header, origin);
//    IntStream.range(0, origin.length() + 6).forEach(i -> sb.append("*"));
  }

}
