package lesson09.warmup.t4;

public class FormatterApp4 {
  public static void main(String[] args) {
    // task4
    System.out.println(new FormatterPlain().fmt("Hello"));  // Hello
    System.out.println(new Formatter1().fmt("Hello"));  // hello
    System.out.println(new Formatter2().fmt("Hello"));  // HELLO
    String s1 = new Formatter1(new Formatter2()).fmt("Hello");
    String s2 = new Formatter2(new Formatter1()).fmt("Hello");
    System.out.println(s1);
    System.out.println(s2);
  }
}
