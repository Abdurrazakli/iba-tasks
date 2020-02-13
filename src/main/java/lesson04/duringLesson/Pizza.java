package lesson04.duringLesson;
import lesson04.warmup.StringOpRightWay;
import lesson04.warmup.StringOperations;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pizza {
    String name;
    int size;
    double price;
    static int count = 0;
    Pizza(String name,int size, double price){
        count++;
        this.name = name;
        this.size = size;
        this.price = price;
    }
    public String toString(){
        return String.format("name: %s, size: %d, price: %.2f",name,size,price);
    }
    public static void main(String[] args) {
        Pizza f = new Pizza("pepperoni",25,3.6);
        System.out.println(f.toString());
        StringOpRightWay name = new StringOpRightWay();
        Pizza[] pizzas = new Pizza[10];
        for (int i = 0; i < pizzas.length ; i++) {
            pizzas[i] = new Pizza(name.generateRandomLetters(20),
                    (int)(Math.random()*20),Math.random()*15);
        }
        System.out.println(Arrays.toString(pizzas));
        System.out.println(count);
    }
}
