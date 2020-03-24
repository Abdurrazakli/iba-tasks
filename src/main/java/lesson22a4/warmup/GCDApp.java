package lesson22a4.warmup;

public class GCDApp {
    public int gcd(int a, int b){
        if(a % b == 0){
            return b;
        }
        return gcd(b,a%b);
    }
}
