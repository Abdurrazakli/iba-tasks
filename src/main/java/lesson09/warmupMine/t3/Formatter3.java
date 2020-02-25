package lesson09.warmupMine.t3;



public class Formatter3 {
    String message;
    public Formatter3(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int n = message.length() + 3 * 2 ;
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }
        sb.append(String.format("\n*  %s  *\n",message));
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }
        return sb.toString();
    }
}
