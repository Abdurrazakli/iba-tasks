package lesson08.collections;

import java.util.HashSet;
import java.util.List;

public class SetApp {
    public static void main(String[] args) {
        HashSet<Box<Integer>> hs = new HashSet<>();
        hs.add(new Box<Integer>(1));
        hs.add(new Box<Integer>(1));
        hs.add(new Box<Integer>(1));
        System.out.println(hs.size());
    }
}
