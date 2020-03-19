package lesson21.warmup;

public class InvertString {
  // contains only [a-zA-Z]
  // abc -> ABC
  // aBc -> AbC
  // Abc -> aBC
  // 1.

  // 2. NO if. NO tern op.
  String invert(String origin) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < origin.length(); i++) {
      if('a' <= origin.charAt(i) && origin.charAt(i) <= 'z'){
        sb.append((char)(origin.charAt(i) - ('a'-'A')));
      }
      else if('A' <= origin.charAt(i) && origin.charAt(i) <= 'Z'){
        sb.append((char)(origin.charAt(i) + ('a'-'A')));
      }
    }
    return sb.toString();
  }
}
