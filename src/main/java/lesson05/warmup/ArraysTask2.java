package lesson05.warmup;

import java.util.Arrays;

public class ArraysTask2 {
    public static void main(String[] args) {
        int length = 10;
        int MIN = -100;
        int MAX = 100;
        int[] randomArray = generateRandomArray(length,MIN,MAX);
        int[] randomArray2 = Arrays.copyOf(randomArray,randomArray.length);
        int[] randomArray3 = Arrays.copyOf(randomArray,randomArray.length);

        System.out.printf("Original: %s \n",Arrays.toString(randomArray));
        randomArray = shiftPositive(randomArray);
        System.out.printf("After:positive: %s\n",Arrays.toString(randomArray));
        randomArray2 = shiftNegative(randomArray2);
        System.out.printf("After:negative: %s\n",Arrays.toString(randomArray2));
        randomArray3 = combineShifting(randomArray3);
        System.out.printf("After:full %s\n",Arrays.toString(randomArray3));
        randomArray = shiftNegative(randomArray);
        System.out.printf("Original:first positive,then negative: %s\n",Arrays.toString(randomArray));

    }

    private static int[] combineShifting(int[] randomArray) {
        randomArray = shiftNegative(randomArray);
        randomArray = shiftPositive(randomArray);
        return randomArray;
    }

    private static int[] shiftNegative(int[] randomArray) {
        int firstNegativeIndex = -1;
        int shiftedValue = 0;
        int temp = 0;
        boolean firstNegativeFound = false;
        for (int i = randomArray.length - 1; i >= 0; i--) {
            if(isNegative(randomArray[i])){
                if(firstNegativeFound == false ){
                    firstNegativeIndex = i;
                    firstNegativeFound = true;
                    shiftedValue = randomArray[i];
                }
                else{
                    temp = randomArray[i];
                    randomArray[i] = shiftedValue;
                    shiftedValue = temp;
                }
            }
        }
        if(firstNegativeFound == true){
            randomArray[firstNegativeIndex] = shiftedValue;
        }
        return randomArray;
    }

    private static boolean isNegative(int number) {
        return number < 0;
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
                }
                else{
                    temp = randomArray[i];
                    randomArray[i] = shiftedValue;
                    shiftedValue = temp;
                }
            }
        }
        if(firstPossitiveFound == true){
            randomArray[firstPositiveIndex] = shiftedValue;
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
