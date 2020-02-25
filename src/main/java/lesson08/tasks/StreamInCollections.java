package lesson08.tasks;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamInCollections {
    public static void main(String[] args) {
        List<Integer> ints = Stream.generate(() -> (int) (Math.random() * 20) - 10)
                .limit(30)
                .collect(Collectors.toList());

        List<Integer> uniques = ints.stream()
                .distinct()
                .collect(Collectors.toList());
        new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }

        };
        List<Integer> sorted = uniques.stream().sorted((a,b)->b-a)
                .collect(Collectors.toList());

        List<Box> boxes = Stream.generate(() -> (int) (Math.random() * 20 - 10))
                .limit(30)
                .map(x -> new Box(x))
                .distinct().collect(Collectors.toList());

        System.out.printf("Origin:%s\n", ints);
        System.out.printf("Unique:%s\n", uniques);
        System.out.printf("Unique Sorted:%s\n", sorted);
        System.out.printf("Boxes: %s",boxes);
    }
}
