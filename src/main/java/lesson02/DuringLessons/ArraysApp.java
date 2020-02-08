package lesson02.DuringLessons;

public class ArraysApp {
    public static void main(String[] args) {
        int MAX = 10;
        /*
        * We generate random number [0,10]. To get 10 we need to add 1 to multiplier
        * */
        int r = (int)(Math.random() * (MAX + 1));
        int[] a = new int[20];

        System.out.println((-5)%2);
        for(int i = 0; i < a.length;i++){
            a[i] = (int)(Math.random() * (MAX + 1));
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}
