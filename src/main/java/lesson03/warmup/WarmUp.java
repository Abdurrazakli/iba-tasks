package lesson03.warmup;

import java.util.Arrays;
import java.util.Scanner;


public class WarmUp {
    public static void main(String[] args) {
        //run(5,10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter width");
        final int width = scanner.nextInt();
        System.out.println("Please enter height");
        final int height = scanner.nextInt();
        fixedSolution(height,width);

    }
    private static void fixedSolution(int height,int width){
        double tan = ((double) width)/height;
        StringBuilder allInOne = new StringBuilder();
        for (int y = 1; y <= height; y++) {
            for (int x = 1; x <= width ; x++) {
                if(y == 1 || x == 1 || y == height || x == width
                        || x == (int)(y * tan) || x == (width + 1 - ((int) (y * tan)))){
                    allInOne.append('*');
                }else{
                    allInOne.append(' ');
                }
            }
            allInOne.append('\n');
        }
        System.out.println(allInOne.toString());
    }
    private static void run(int height, int width){
        char[][] mass = new char[height][width];
        int arrayLastIndex = height - 1;
        int distanceIndex = width/height;
        for (int i = 0; i < width ; i++) {
            mass[0][i] = '*';
            mass[height-1][i] = '*';
        }
        for (int i = 0; i < height ; i++) {
            mass[i][0] = '*';
            mass[i][width - 1] = '*';
        }
        for (int y = 1; y < height - 1; y++) {
           // if(y < (height/2 + 1)) {
                for (int x = 0; x < width; x++) {
                    mass[y][y * distanceIndex + 2] = '*';
                    mass[y][width - (y * distanceIndex + 3)] = '*';
                }
           /* }
            else
            {
                for (int x = 0; x < width; x++) {
                    mass[y][y * distanceIndex + 2] = '*';
                    mass[y][width - ((height - 1 - y) * distanceIndex + 3)] = '*';
                }
            }*/
        }
        printArray(mass);
    }

    private static void printArray(char[][] mass) {
        for (int i = 0; i < mass.length ; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j]);
            }
            System.out.println();
        }
    }

}
