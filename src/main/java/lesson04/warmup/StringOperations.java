package lesson04.warmup;

import java.util.Random;

/*
1. generate a string of length 30 containing random small letters
2. generate a string of length 25 containing random capital letters
3. generate a string of length 35 containing random mixed capital + small letters
4. generate a string of length 20 containing only vowels small letters
5. generate a string of length 20 containing only consonants small letters
6. generate a string of length 20 containing only vowels capital letters
7. generate a string of length 20 containing only consonants capital letters
8. generate a string of length 20 containing only consonants capital and small letters
9. ...
10. split given string into capital and small letters
11. split given string into vowel and consonant letters
12. split given string into vowel small, vowel capital, consonant small and consonant capital letters

* */
public class StringOperations {
    private static final char[] VOWELS = {'a','e','i','o','u','A','E','I','O','U'};
    public static void main(String[] args) {
        System.out.println(generateRandomLetters(30,LetterSizes.SMALL));
        System.out.println(generateRandomLetters(25,LetterSizes.CAPITAL));
        System.out.println(generateRandomLetters(35,LetterSizes.MIXED));
        System.out.println(generateRandomVowels(20,LetterSizes.SMALL));
        System.out.println(generateRandomVowels(20,LetterSizes.CAPITAL));
        System.out.println(generateRandomConsonants(20,LetterSizes.SMALL));
        System.out.println(generateRandomConsonants(20,LetterSizes.CAPITAL));
        System.out.println(generateRandomConsonants(20,LetterSizes.MIXED));

    }
    private static boolean isVowel(char letter){
        for (int i = 0; i < VOWELS.length ; i++) {
            if(letter == VOWELS[i]){
                return true;
            }
        }
        return false;
    }
    private static String generateRandomConsonants(int length,LetterSizes sizes){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length ; ) {
            char randomLetter;
            randomLetter = generateRandomLetter(sizes);
            if(isConsonant(randomLetter)){
                i++;
               stringBuilder.append(randomLetter);
            }
        }
        return stringBuilder.toString();
    }
    private static boolean isConsonant(char letter){
        return !isVowel(letter);
    }
    private static String generateRandomVowels(int length,LetterSizes sizes){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length;) {
            char letter = (char) VOWELS[generateRandomNumber(0,VOWELS.length - 1)];
            if(isVowel(letter)) {
                i++;

                if (sizes == LetterSizes.SMALL) {
                    stringBuilder.append(Character.toLowerCase(letter));
                } else if (sizes == LetterSizes.CAPITAL) {
                    stringBuilder.append(Character.toUpperCase(letter));
                }
                else{
                    throw new IllegalArgumentException("No such size implemented");
                }
            }
        }
        return stringBuilder.toString();
    }
    private static String generateRandomLetters(int length,LetterSizes size){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length;i++ ) {
            stringBuilder.append(generateRandomLetter(size));
        }
        return stringBuilder.toString();
    }
    private static char generateRandomLetter(LetterSizes size){
        char start = 'a';
        char end = 'z';
        if(size == LetterSizes.SMALL){
            start = 'a';
            end = 'z';
        }else if(size == LetterSizes.CAPITAL){
            start = 'A';
            end = 'Z';
        }
        if(size == LetterSizes.MIXED){
            int symbol = (generateRandomNumber(0,1)) % 2 == 0 ?
                    generateRandomNumber('a','z') : generateRandomNumber('A','Z');
            return (char)symbol;
        }else {
            return (char)generateRandomNumber(start,end);
        }
    }
    private static int generateRandomNumber(int start, int end){
        Random random = new Random();
        return random.nextInt(end - start + 1) + start;
    }
}
