package lesson12.exceptions;

import java.util.Optional;

public class StrToIntApp {
    public static void main(String[] args) {
        Optional<Integer> value1 = strToInt("123");
        Optional<Integer> value2 = strToInt("123q");

        Integer integer = strToInt("1v").
                map(x -> x + 10).
                orElse(-5);
        System.out.println(integer);
    }

    private static Optional<Integer> strToInt(String raw) {
        try {
            return Optional.of(Integer.parseInt(raw.trim()));
        }
        catch (NumberFormatException e){
            return Optional.empty();
        }
    }
}
