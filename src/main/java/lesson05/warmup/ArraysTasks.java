package lesson05.warmup;

import java.util.Arrays;

public class ArraysTasks {
    public static void main(String[] args) {
        final int n = 5;
        System.out.printf("Combined: %s\n",Arrays.toString(combine(fill(n,true),fill(n,false))));

    }
    public static int[] fill(final int length,boolean isOdd){
        int[] array = new int[length];
        final int MAX = 100;
        int randomNumber;
        for (int i = 0; i < length;i++) {
            randomNumber = (int) (Math.random() * MAX);
            if(isOdd){
                array[i] = randomNumber % 2 == 0 ? randomNumber + 1 : randomNumber;
            }
            else {
                array[i] = randomNumber % 2 == 1 ? randomNumber + 1 : randomNumber;
            }
        }
        return array;
    }
    public static int[] combine(final int[] odds, final int[] evens){
        int[] combined = new int[odds.length + evens.length];
        int SIZE = combined.length / 2;
        for (int i = 0; i < SIZE;i++) {
            combined[i * 2] = odds[i];
            combined[i * 2 + 1] = evens[i];
        }
        return combined;
    }
}
