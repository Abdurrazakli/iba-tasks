package lesson21.warmup;

public class BinaryToInteger {
  public static void main(String[] args) {
    String binary = "00010010"; // 18
    int result = 0;

    for (int i = 0; i < binary.length() ; i++) {
      result += 1<<(binary.length() - i - 1);
    }

    System.out.println(result); // 18
  }
}
