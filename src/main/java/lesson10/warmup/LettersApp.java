package lesson10.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class LettersApp {
    public static void main(String[] args) {
        String s = "Hello World";
        HashMap<Character,Integer> task1 = findOccurrences(s);
        HashMap<Character, ArrayList<Integer>> task2 = countCharactersAndPlaces(s);
        System.out.printf("all letters occurrences: %s\n",task1.toString());
        System.out.printf("all character positions alongside with character: %s\n",task2);
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
    public static HashMap<Character, ArrayList<Integer>> countCharactersAndPlaces(String input){
        HashMap<Character,ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            if(currentCharacter == ' ') continue;
            if(map.containsKey(currentCharacter)){
                map.get(currentCharacter).add(i+1);
            }
            else {
                ArrayList<Integer> places = new ArrayList<>();
                places.add(i+1);
                map.put(input.charAt(i),places);
            }
        }
        return map;
    }
}
