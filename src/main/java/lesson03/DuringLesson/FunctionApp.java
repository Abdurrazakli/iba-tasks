package lesson03.DuringLesson;

public class FunctionApp {
    static int add(int a ,int b){
        return a+b;
    }
    //Taleh Tahirli
    //Nihat Şenyuva
    static double add(int a){
        return 5.6 + a;
    }
    static int add(int... vals){
        int sum = 0;
        System.out.println("without array");
        for (int a: vals
             ) {
            sum += a;
        }
        return sum;
    }
    int add(int[] vals,int x){
        System.out.println("With Array");
        int sum = 0;
        for (int a: vals
        ) {
            sum += a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(add(5)+add(3));
        System.out.println(add(3,5));
    }
}
