package lesson02.DuringLessons;

public class FizzBuzzApp {
    public static void main(String[] args) {
        /*int limit = 30;
        for (int i = 0; i < limit ; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)){
                System.out.println("Fizz Buzz");
            }else if(i%2==0){
                System.out.println("Fizz");
            }else if(i%3==0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }*/

        int[] randomSequence = new int[30];
        int MAX = 200;
        int rangeIndicator = 100;
        for (int i = 0; i < randomSequence.length; i++) {
            randomSequence[i] = rangeIndicator - (int)(Math.random() * (MAX+1));
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < randomSequence.length; j++) {
                if(i == 0 && randomSequence[j] < 0 && !(randomSequence[j]%2==0)){
                    System.out.printf("%d ",randomSequence[j]);//neg odd
                }else if(i==1 && randomSequence[j] > 0 && !(randomSequence[j]%2==0))
                {
                    System.out.printf("%d ",randomSequence[j]);//pos odd
                }else if(i==2 && randomSequence[j] < 0 && (randomSequence[j]%2==0))
                {
                    System.out.printf("%d ",randomSequence[j]);//neg even
                }else if(i==3 && randomSequence[j] > 0 && (randomSequence[j]%2==0))
                {
                    System.out.printf("%d ",randomSequence[j]);//pos even
                }
            }
            System.out.println();
        }
    }
}
