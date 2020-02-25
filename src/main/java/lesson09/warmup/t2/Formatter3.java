package lesson09.warmup.t2;

public class Formatter3 extends Formatter0 {
    @Override
    public void print(String message){
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
