package lesson22.warmup;

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int sum = sumArray(arr);
        System.out.println(sum);
    }

    private static int sumArray(int[] arr) {
        return arr.length == 1 ? arr[0] :
                arr[arr.length - 1] + sumArray(Arrays.copyOf(arr, arr.length - 1));
    }
}
