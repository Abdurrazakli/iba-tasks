package lesson20algo.sort;

import java.util.*;
import java.util.stream.Collectors;

public class MergeApp {
static int[] merge(int[] data1 , int[] data2){
    int[] merged = new int[data1.length + data2.length];
    int firstSize = data1.length;
    int secondSize = data2.length;
    // initalizing indexes for tracking
    int first = 0;
    int second = 0;
    int mergedIndex = 0;

    while (first < firstSize && second < secondSize){
        if(data1[first] <= data2[second]){
            merged[mergedIndex++] = data1[first++];
        }
        else {
            merged[mergedIndex++] = data2[second++];
        }
    }
    while (first < firstSize){
            merged[mergedIndex++] = data1[first++];
    }
    while (second < secondSize){
        merged[mergedIndex++] = data2[second++];
    }
    return merged;
}

    public static void main(String[] args) {
        int[] d1 = {1,2,3};
        int[] d2 = {10,11}; // 1,2,3,10,11
        System.out.println(Arrays.toString(merge(d1,d2)));
        int[] d1a = {1,3,5};
        int[] d2a = {2,4};  // 1,2,3,4,5
        System.out.println(Arrays.toString(merge(d1a,d2a)));

        Comparator<Apple> appleComparator = (o1, o2) -> o1.size - o2.size;

        List<Apple> apples1 = new Random().ints(10, 30).limit(10)
                .mapToObj(n -> new Apple(n)).sorted(appleComparator).collect(Collectors.toList());
        List<Apple> apples2 = new Random().ints(10, 30).limit(10)
                .mapToObj(n -> new Apple(n)).sorted(appleComparator).collect(Collectors.toList());
        System.out.println(apples1);
        System.out.println(apples2);
        List<Apple> apples3 = mergeApples(apples1, apples2);
        System.out.println(apples3);
        List<Apple> apples4 = mergeApplesByComparator(apples1, apples2,appleComparator);
        System.out.println(apples4);
    }

    private static List<Apple> mergeApples(List<Apple> apples1, List<Apple> apples2) {
        List<Apple> apples = new ArrayList<>();
        int firstSize = apples1.size();
        int secondSize = apples2.size();
        int first = 0;
        int second = 0;
        int merged = 0;
        while (first < firstSize && second < secondSize){
            if(apples1.get(first).size <= apples2.get(second).size){
               apples.add(apples1.get(first++));
            }
            else {
                apples.add(apples2.get(second++));
            }
        }
        while (first < firstSize){
            apples.add(apples1.get(first++));
        }
        while (second < secondSize){
            apples.add(apples2.get(second++));
        }
        return apples;
    }
    private static List<Apple> mergeApplesByComparator(List<Apple> apples1, List<Apple> apples2,Comparator<Apple> comparator) {
        List<Apple> apples = new ArrayList<>();
        int firstSize = apples1.size();
        int secondSize = apples2.size();
        int first = 0;
        int second = 0;
        while (first < firstSize && second < secondSize){
            if(comparator.compare(apples1.get(first),apples2.get(second)) < 0){
                apples.add(apples1.get(first++));
            }
            else {
                apples.add(apples2.get(second++));
            }
        }
        while (first < firstSize){
            apples.add(apples1.get(first++));
        }
        while (second < secondSize){
            apples.add(apples2.get(second++));
        }
        return apples;
    }

}
