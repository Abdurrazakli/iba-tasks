package lesson09.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        int[] a = {1,5,-96,23};
        OptionalInt min = Arrays.stream(a).
                filter(x -> x > 0).filter(x -> x < 0).min();
        System.out.println(min);
        List<Integer > collect = Stream.generate(() -> (int)(Math.random()*100)).
                limit(15).sorted((x, y) -> {

            return (x - y);
        })
                .collect(Collectors.toList());

    }
}
