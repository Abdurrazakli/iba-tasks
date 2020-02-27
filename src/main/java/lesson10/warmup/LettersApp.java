package lesson10.warmup;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class LettersApp {
    public static void main(String[] args) {
        String s = "Hello World";
        HashMap<Character,Integer> task1 = findOccurrences(s);
        System.out.println(task1.toString());
    }
    public static HashMap<Character,Integer> findOccurrences(String input){
        HashMap<Character,Integer> letterOccurrences = new HashMap<>();
        input = input.replace(" ","");
        for (int i = 0; i < input.length(); i++) {
            if(letterOccurrences.containsKey(input.charAt(i))){
                Integer count = letterOccurrences.get(input.charAt(i));
                letterOccurrences.put(input.charAt(i),count+1);
            }
            else {
                letterOccurrences.put(input.charAt(i),1);
            }
        }
        return letterOccurrences;
    }
}
