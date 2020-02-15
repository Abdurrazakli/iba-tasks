package lesson05.warmup;

public class Arrays {
    public static void main(String[] args) {
        int n = 20;
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
        for (int i = 0; i < n ; i++) {
            combined[i] = odds[i];
            combined[i + 1] = evens[i];
        }
        //printing
        for (int x:combined) {
            stringBuilder.append(x);
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.toString());
    }
}
