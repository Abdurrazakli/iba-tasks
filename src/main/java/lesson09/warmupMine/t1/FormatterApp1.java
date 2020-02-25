package lesson09.warmupMine.t1;

public class FormatterApp1 {
  public static void main(String[] args) {
    Formatter0 fmt1 = new Formatter1();
    Formatter0 fmt2 = new Formatter2();
    Formatter0 fmt3 = new Formatter3();

    // task1
    print("Hello", fmt1); // hello
    print("Hello", fmt2); // HELLO
    print("Hello", fmt3); // ***********
                                  // *  Hello  *
                                  // ***********
  }
  private static void print(String message,Formatter0 fmt){
    if(fmt instanceof Formatter1){
      print1(message);
    }
    else if(fmt instanceof Formatter2){
      print2(message);
    }
    else if(fmt instanceof Formatter3){
      print3(message);
    }
  }
  private static void print1(String message){
    System.out.println(message.toLowerCase());
  }
  private static void print2(String message){
    System.out.println(message.toUpperCase());
  }
  private static void print3(String message){
    StringBuilder sb = new StringBuilder();
    int n = message.length() + 3 * 2 ;
    for (int i = 0; i < n; i++) {
      sb.append("*");
    }
    sb.append(String.format("\n*  %s  *\n",message));
    for (int i = 0; i < n; i++) {
      sb.append("*");
    }
    System.out.println(sb.toString());
  }
}
