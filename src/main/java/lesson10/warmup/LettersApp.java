package lesson10.warmup;

import java.util.*;
import java.util.stream.Stream;

public class LettersApp {
    public static void main(String[] args) {
        String s = "Hello World";
        HashMap<Character,Integer> task1 = findOccurrences(s);
        System.out.printf("all letters occurrences: %s\n",formatter(task1.toString()));
        HashMap<Character, ArrayList<Integer>> task2 = countCharactersAndPlaces(s);
        System.out.printf("all character positions alongside with character: %s\n",formatter(task2.toString()));
        HashMap<Character, HashMap<Integer, ArrayList<Integer>>> task3 = letterOccurencesPlaces(s);
        System.out.printf("combine task 1 & 2: %s\n",formatter(task3.toString()));
        TreeMap<Character, HashMap<Integer, ArrayList<Integer>>> sorted = new TreeMap<>(task3);
        System.out.printf("Sorted: %s",formatter(sorted.toString()));
        //todo task3.entrySet().stream().sorted((a,b)->);
    }

    private static HashMap<Character, HashMap<Integer, ArrayList<Integer>>> letterOccurencesPlaces(String input) {
        HashMap<Character, HashMap<Integer, ArrayList<Integer>>> map = new HashMap<>();
        HashMap<Character, ArrayList<Integer>> charAndPlace = countCharactersAndPlaces(input);
        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            if(currentCharacter == ' '){
                continue;
            }
            else {
                HashMap<Integer,ArrayList<Integer>> temp = new HashMap<>();
                temp.put(charAndPlace.get(currentCharacter).size(),charAndPlace.get(currentCharacter));
                map.put(currentCharacter,temp);
            }
        }
        return map;
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
    public static String formatter(String input){
        //"H:1:<1>, e:1:<2>, l:3:<3,4,10>,"
        return input.replace("{","").replace("}","").
                replace("=",":").replace("[","<").
                replace("]",">");
    }
    public static HashMap<HashMap<Character,Integer>, ArrayList<Integer>> doTask3(String input){
        //todo it needs to be implemented
        HashMap<HashMap<Character,Integer>, ArrayList<Integer>> map = new HashMap<>();
        HashMap<Character, ArrayList<Integer>> charAndPlace = countCharactersAndPlaces(input);
        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            if(currentCharacter == ' '){
                continue;
            }
            else {
                HashMap<Character,Integer> temp = new HashMap<>();
                temp.put(currentCharacter,charAndPlace.get(currentCharacter).size());

                map.put(temp,charAndPlace.get(currentCharacter));
            }
        }
        return map;
    }

}
