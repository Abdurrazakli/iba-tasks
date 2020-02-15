package lesson05.warmup;

import java.util.Arrays;

public class ArraysTask2 {
    public static void main(String[] args) {
        int length = 20;
        int MIN = -100;
        int MAX = 100;
        int[] randomArray = generateRandomArray(length,MIN,MAX);
        System.out.printf("Before: %s \n",Arrays.toString(randomArray));
        randomArray = shiftPositive(randomArray);
        System.out.printf("After: %s",Arrays.toString(randomArray));
    }
    public static boolean isPossitive(int number){
        return number > 0;
    }
    private static int[] shiftPositive(int[] randomArray) {
        int firstPositiveIndex = -1;
        int shiftedValue = 0;
        int temp = 0;
        boolean firstPossitiveFound = false;
        for (int i = 0; i < randomArray.length; i++) {
            if(isPossitive(randomArray[i])){
                if(firstPossitiveFound == false ){
                    firstPositiveIndex = i;
                    firstPossitiveFound = true;
                    shiftedValue = randomArray[i];
                    temp = randomArray[i];
                }
                else{
                    temp = randomArray[i];
                    randomArray[i] = shiftedValue;
                    shiftedValue = temp;
                }
            }
        }
        if(firstPossitiveFound == true){
            randomArray[firstPositiveIndex] = temp;
        }
        return randomArray;
    }

    private static int[] generateRandomArray(int length,int min, int max) {
        int[] randomArray = new int[length];
        for (int i = 0; i < length ; i++) {
            randomArray[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        return randomArray;
    }
}
