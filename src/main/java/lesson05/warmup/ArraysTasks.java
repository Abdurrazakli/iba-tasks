package lesson05.warmup;

import java.util.Arrays;

public class ArraysTasks {
    public static void main(String[] args) {
        final int n = 5;
        System.out.println(Arrays.toString(combine(fill(n,true),fill(n,false))));

    }
    public static int[] fill(final int length,boolean isOdd){
        int[] array = new int[length];
        int oddValue = isOdd ? 1 : 0;
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
        for (int i = 0,index = 0; i < combined.length ;index++) {
            combined[i++] = odds[index];
            combined[i++] = evens[index];
        }
        return combined;
    }
}
