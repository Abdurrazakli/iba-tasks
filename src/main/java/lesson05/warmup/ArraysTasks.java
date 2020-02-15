package lesson05.warmup;

import java.util.Arrays;

public class ArraysTasks {
    public static void main(String[] args) {
        final int n = 5;
        int[] odds = new int[n];
        int[] evens = new int[n];
        int[] combined = new int[n * 2];
        final int MAX = 99;
        int randomNumber;
        StringBuilder stringBuilder = new StringBuilder();
        //random odds
        for (int i = 0; i < odds.length ; ) {
            randomNumber = (int) (Math.random() * MAX);
            odds[i++] = randomNumber % 2 == 0 ? randomNumber + 1 : randomNumber;
        }
        //random evens
        for (int i = 0; i < evens.length ; ) {
            randomNumber = (int)(Math.random() * MAX);
            System.out.println(randomNumber);
            evens[i++] = randomNumber % 2 == 1 ? randomNumber + 1 : randomNumber;
        }
        //combining
        for (int i = 0,index = 0; i < combined.length ;index++) {
            combined[i++] = odds[index];
            combined[i++] = evens[index];
        }
        //printing
        System.out.println(Arrays.toString(combined));


    }
}
