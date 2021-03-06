package lesson12.warmup;

public class Sentence {
  final String subj;
  final String verb;
  final String obj;

  public Sentence(String subj, String verb, String obj) {
    this.subj = subj;
    this.verb = verb;
    this.obj = obj;
  }

  private String build() {
    return String.format("%s %s %s", subj, verb, obj);
  }

  @Override
  public String toString() {
    return build();
  }
}
