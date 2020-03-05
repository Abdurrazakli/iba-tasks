package lesson12.warmup;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SentencesApp6 {
  private static List<String> list(String... items) {
    return Arrays.asList(items);
  }

  public static void main(String[] args) {
    List<String> subjects = list("Noel", "The cat", "The dog");
    List<String> verbs =    list("wrote", "chased", "slept on");
    List<String> objects =  list("the book","the ball","the bed");

//    List<Sentence> outcome =
    List<Stream<Stream<Sentence>>> collect1 = subjects.stream().map(subj ->
        verbs.stream().map(verb ->
            objects.stream().map(obj ->
                new Sentence(subj, verb, obj)
            )
        )
    ).collect(Collectors.toList());

    List<List<List<Sentence>>> collect2 =
        subjects.stream().map(subj ->
        verbs.stream().map(verb ->
            objects.stream().map(obj ->
                new Sentence(subj, verb, obj)
            ).collect(Collectors.toList())
        ).collect(Collectors.toList())
    ).collect(Collectors.toList());

//    outcome.forEach(s -> System.out.println(s));
      System.out.println(collect2.toString());
  }
}
