package lesson22.warmup;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int sum = sumArray(arr);
        System.out.println(sum);

        System.out.println(sumTo(5));
        System.out.println(factorial(5));
        System.out.println(fibonacci(5));
    }

    private static int fibonacci(int n) {
        if(n==2 || n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    private static int factorial(int n) {
        return n == 0 ? 1 : (n * factorial(n-1));
    }

    private static int sumTo(int n) {
        return n==1? 1 : (n + sumTo(n-1));
    }

    private static int sumArray(int[] arr) {
        return arr.length == 1 ? arr[0] :
                arr[arr.length - 1] + sumArray(Arrays.copyOf(arr, arr.length - 1));
    }
    
}
