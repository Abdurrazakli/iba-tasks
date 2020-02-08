package lesson02.DuringLessons;

public class FizzBuzzAfterExplanation {
    public static void main(String[] args) {
        //generating random numbers
        int[] randomSequence = new int[30];
        int MAX = 200;
        int RANGE_INDICATOR = 100;

        for (int i = 0; i < randomSequence.length; i++) {
            randomSequence[i] = RANGE_INDICATOR - (int)(Math.random()% (MAX+1));
        }
        //memory allocations
        int PE = 0;
        int PO = 0;
        int NE = 0;
        int NO = 0;
        for (int i = 0; i < randomSequence.length; i++) {
            if(randomSequence[i] > 0) {
                if(randomSequence[i]%2==0){
                    PE++;
                }else {
                    PO++;
                }
            }
            else{
                if(randomSequence[i]%2==0){
                    NE++;
                }else {
                    NO++;
                }
            }
        }

        int[] posEven = new int[PE];
        int[] posOdd = new int[PO];
        int[] negEven = new int[NE];
        int[] negOdd = new int[NO];

        for (int i = 0; i < randomSequence.length; i++) {
            if(randomSequence[i] > 0) {
                if(randomSequence[i]%2==0){
                    posEven[posEven.length - PE--] = randomSequence[i];
                }else {
                    posOdd[posOdd.length - PO--] = randomSequence[i];
                }
            }
            else{
                if(randomSequence[i]%2==0){
                    negEven[negEven.length - NE--] = randomSequence[i];
                }else {
                    negOdd[negOdd.length - NO--] = randomSequence[i];
                }
            }
        }
    }
}
