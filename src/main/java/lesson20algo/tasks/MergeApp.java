package lesson20algo.tasks;

import java.util.Arrays;

public class MergeApp {
static int[] merge(int[] data1 , int[] data2){
    int[] merged = new int[data1.length + data2.length];
    int firstSize = data1.length;
    int secondSize = data2.length;

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
    }
}
