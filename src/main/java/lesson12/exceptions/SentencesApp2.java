package lesson12.exceptions;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.SocketHandler;
import java.util.stream.Stream;

public class SentencesApp2 {
  public static void main(String[] args)  {
    Map<String, List<String>> sv = new HashMap<>();
    Map<String, List<String>> vo = new HashMap<>();
    try {
       sv = read("subj_verb.txt");
    }
    catch (FileNotFoundException e){
      System.out.println("File couldn't load");
    }
    try {
      vo = read("verb_obj.txt");
    }
    catch (FileNotFoundException e){
      System.out.println("File couldn't load");
    }
    try {
      List<Sentence> sentences = makeSentences(sv, vo);
      write(sentences, "sentences.txt");
    }
    catch (IOException e){
      System.out.println("IO exception happened");
    }
  }

  private static List<Sentence> makeSentences(Map<String, List<String>> sv, Map<String, List<String>> vo) {
    List<Sentence> outcome = new ArrayList<>();
    for (String subj: sv.keySet()) {
      List<String> verbs = sv.get(subj);
      for (String verb: verbs) {
        List<String> objs = vo.get(verb);
        for (String obj: objs) {
          Sentence sent = new Sentence(subj, verb, obj);
          outcome.add(sent);
        }
      }
    }
    return outcome;
  }

  private static void write(List<Sentence> sentences, String filename) throws IOException {
    File ofile = new File(filename);
    BufferedWriter bw = new BufferedWriter(new FileWriter(ofile));
    for (Sentence line: sentences) {
      bw.write(line.represent());
      bw.write("\n");
    }
    bw.close();
  }

  private static Map<String, List<String>> read(String filename) throws FileNotFoundException {
    File file = new File(filename);
    BufferedReader br = new BufferedReader(new FileReader(file));

    HashMap<String, List<String>> dict = new HashMap<>();
    Stream<String> lines = br.lines();
    //  splitted[0] splitted[1]
    // wrote: the book, the letter, the code
    lines.forEach(line -> {
      String[] splitted = line.split(":");
      String key = splitted[0].trim();
      String[] values_dirty = splitted[1].split(",");
      ArrayList<String> values = new ArrayList<>();
      for (String v: values_dirty) {
        values.add(v.trim());
      }
      dict.put(key, values);
    });
    return dict;
  }
}
