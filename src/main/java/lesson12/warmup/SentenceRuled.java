/*
package lesson12.warmup;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SentenceRuled {

    public static void main1(String[] args) {
        HashMap<String, List<String>> subjectVerbs = new HashMap<>();
        HashMap<String, List<String>> verbObjects = new HashMap<>();
        ArrayList<Sentence> sentences = new ArrayList<>();
        subjectVerbs = getInput("./src/main/java/lesson12/warmup/subj_verb.txt");
        verbObjects = getInput("./src/main/java/lesson12/warmup/verb_obj.txt");
        for (String subj: subjectVerbs.keySet()){
            List<String> verbs = subjectVerbs.get(subj);
            for (String verb: verbs){
                List<String> objs = verbObjects.get(verb);
                for (String obj: objs) {
                    sentences.add(new Sentence(subj, verb, obj ));
                }
            }
        }
        System.out.println(sentences.toString());
        write(sentences,"name");
    }

   */
/* private static void write(ArrayList<Sentence> sentences, String name) throws IOException {
        File file = new File(name);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fw);
        for (Sentence sentence:sentences
             ) {

        }
    }*//*


    private static HashMap<String, List<String>> getInput(String file) {
        File subjects = new File(file);
        HashMap<String, List<String>> output = new HashMap<>();
        try {
            Scanner reader = new Scanner(subjects);
            while (reader.hasNextLine()) {
                String line = reader.nextLine().trim();//.replace(",","");
                String key = line.substring(0, line.indexOf(":"));
                line = line.substring(line.indexOf(":") + 1);
                List<String> values = new ArrayList<>();
                for (String verb : line.split(",")
                ) {
                    values.add(verb.trim().replace(",", ""));
                }
                output.put(key, values);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return output;
    }
}
*/
