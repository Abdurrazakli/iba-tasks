package lesson14.warmup;

import java.util.Stack;

public class Brackets {

  public int calc(String origin) {
    int max = 0;
    int count = 0;
    for (int i = 0; i < origin.length(); i++) {
        while(origin.charAt(i) == '('){
          count++;
          i++;
        }
          max = Math.max(count,max);
          count = 0;
    }
    return max;
  }

}
