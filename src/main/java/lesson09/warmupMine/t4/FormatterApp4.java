package lesson09.warmupMine.t4;

public class FormatterApp4 {
  public static void main(String[] args) {
    // task4
    System.out.println(new Formatter1("Hello"));  // hello
    System.out.println(new Formatter2("Hello"));  // HELLO
    System.out.println(new Formatter3("Hello"));  // ***********
                                                      // *  Hello  *
                                                      // ***********

    System.out.println(new Formatter2(new Formatter3("Hello"))); // ***********
                                                // *  HELLO  *
                                                // ***********

    System.out.println(new Formatter1(new Formatter3("Hello"))); // ***********
                                                // *  hello  *
                                                // ***********



  }
}
