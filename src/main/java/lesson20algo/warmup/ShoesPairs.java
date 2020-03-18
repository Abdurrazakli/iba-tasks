package lesson20algo.warmup;

import java.util.Stack;

public class ShoesPairs {
  int calc(String origin) {
    int workers = 0;
    int left = 0;
    int right = 0;

    for (int i = 0; i < origin.length(); i++) {
      switch (origin.charAt(i)){
        case 'L':
          left++;break;
        case 'R':
          right++;break;
        default:break;
      }
      if(left==right){
        workers++;
      }
    }
    return workers;
  }
}
