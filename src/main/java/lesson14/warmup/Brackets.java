package lesson14.warmup;

public class Brackets {

  public int calc(String origin) {
    int max = 0;
    int count = 0;
    for (int i = 0; i < origin.length(); i++) {
        if(origin.charAt(i) == '('){
          count++;
        }
        else{
          max = Math.max(count,max);
          count = 0;
        }
    }
    return max;
  }

}
