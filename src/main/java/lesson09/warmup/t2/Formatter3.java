package lesson09.warmup.t2;

public class Formatter3 extends Formatter0 {
  @Override
  public void print(String s) {
    StringBuilder sb = new StringBuilder();
    sb.append("***********\n");
    sb.append("*  ");
    sb.append(s);
    sb.append("  *\n");
    sb.append("***********\n");

    System.out.println(sb.toString());
  }
}
