package lesson02;

import java.util.Scanner;

public class WarmUpTasks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = sc.nextLine();
        System.out.println("Hello, "+name+"!");
        System.out.println("Nice to meet you, "+name+"!");
        System.out.println("Bye!");
    }
}