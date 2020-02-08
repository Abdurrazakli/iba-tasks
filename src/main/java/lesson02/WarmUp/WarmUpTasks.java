package lesson02.WarmUp;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class WarmUpTasks {

    public static void main(String[] args) {
        PrintStream out = System.out;
        InputStream in = System.in;
        Scanner sc = new Scanner(in);
        out.println("Hello, what is your name?");
        String name = sc.nextLine();
        out.printf("Hello, %s!\n",name);
        out.printf("Nice to meet you, %s!\n",name);
        out.println("Bye!");

        out.println("Please enter your age:");
        int age = sc.nextInt();
        if(age < 18){
            System.out.println("Let's go to the cinema!");
        }else {
            System.out.println("Let's go to the club");
        }
    }
}