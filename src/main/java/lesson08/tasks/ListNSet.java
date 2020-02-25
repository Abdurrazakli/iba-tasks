package lesson08.tasks;

import java.util.*;

public class ListNSet<Anytype> {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Adil");
        names.add("Resul");
        names.add("Tural");
        names.add("Vahid");
        names.add("Nahid");
        names.add("John");
        ArrayList<String> randomNames = new ArrayList<>();
        int numberOfItems = 5;
        randomNames = generateRandomListFromList(names,numberOfItems);
        System.out.printf("Random names %s",randomNames.toString());
    }

    private static ArrayList<String> generateRandomListFromList(ArrayList<String> items, int numberOfItems) {
        Random random = new Random();
        ArrayList<String> randomized = new ArrayList<>();
        while (numberOfItems-- > 0){
            randomized.add(items.get(random.nextInt(items.size())));
        }
        return randomized;
    }

    private static void task1(){
        ArrayList<Integer> randoms = new ArrayList<>();
        int start = -10;
        int end = 10;
        int numberOfElements = 30;
        randoms = generateRandomList(start,end,numberOfElements);
        HashSet<Integer> uniques = new HashSet<>();
        uniques.addAll(randoms);
        System.out.printf("Original list %s\n", randoms.toString());
        System.out.printf("Unique list %s\n",uniques.toString());
        ArrayList<Integer> sortedUniques = new ArrayList<>(uniques);
        Collections.sort(sortedUniques);
        System.out.printf("Sorted %s",sortedUniques.toString());
    }
    private static ArrayList<Integer> generateRandomList(int start,int end,int numberOfElements) {
        ArrayList<Integer> randoms = new ArrayList<>();
        int random = 0;
        while (numberOfElements-- > 0){
            random = start + (int)(Math.random() * (end - start + 1));
            randoms.add(random);
        }
        return randoms;
    }


}
