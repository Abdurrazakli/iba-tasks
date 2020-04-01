package lesson26a8.warmup;

import java.util.Arrays;
import java.util.Random;

public class AdjacentSum {
    public static void main(String[] args) {
        int[] array = new Random().ints(10, 50)
                .limit(5)
                .toArray();
        System.out.println(Arrays.toString(array));
        findMinSumAdjacent(array);
    }

    private static void findMinSumAdjacent(int[] array) {
        int inx = -1;
        int minSum = Integer.MAX_VALUE;
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length-1 ; i++) {
            sum = array[i] + array[i+1];
            if(sum < minSum){
                inx = i;
                minSum = sum;
            }
        }

            System.out.printf("index: %d\n",inx);
            System.out.printf("Number 1: %d\n",array[inx]);
            System.out.printf("Number 2: %d\n", array[inx+1]);
            System.out.printf("Sum: %d\n",minSum);
    }
}
