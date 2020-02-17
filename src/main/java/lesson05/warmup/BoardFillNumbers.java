package lesson05.warmup;

import java.util.Scanner;

public class BoardFillNumbers {
    public static void main(String[] args) {
        System.out.print("Please enter height: ");
        Scanner sc = new Scanner(System.in);
        int HEIGHT = sc.nextInt();
        System.out.print("Please enter width: ");
        int WIDTH = sc.nextInt();
        int[][] board = fillBoard2(HEIGHT,WIDTH);
        for (int i = 0; i <board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%d ",board[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] fillBoard(int rows, int columns) {

        int[][] board = new int[rows][columns];
        int value = 0;
        int row = 0;
        int column = columns - 1;
        //fixme row and columns should be specified for each case!
        Directions direction = Directions.RIGHT;
        int column_index = 0;
        int row_index = 0;
        while(column_index < columns && row_index < rows) {
                if (direction == Directions.RIGHT) {
                    board = fillTillRight(board, row, column, value);
                    direction = Directions.DOWN;
                } else if (direction == Directions.DOWN) {
                    board = fillTillDown(board, row, column, value);
                    direction = Directions.LEFT;
                } else if (direction == Directions.LEFT) {
                    board = fillTillLeft(board, row, column, value);
                    direction = Directions.UP;
                } else {
                    board = fillTillUp(board, row, column, value);
                    direction = Directions.RIGHT;
                }
        }
        return board;
    }
    private static int[][] fillBoard2(int rows, int columns) {

        int[][] board = new int[rows][columns];
        int value = 1;
        int row = 0;
        int column = 0;
        final int DEFAULT_VALUE = 0;
        //fixme row and columns should be specified for each case!
        Directions direction = Directions.RIGHT;
        int column_index = 0;
        int row_index = 0;
        int iteration = 0;
        while(board[row][column] == 0) {
            board = fillTillRight(board, row, column, value);
            column = columns - 1 - iteration;
            board = fillTillDown(board, row, column, value);
            row = rows - 1 - iteration;
            board = fillTillLeft(board, row, column, value);
            column = iteration;
            board = fillTillUp(board, row, column, value);
            row = iteration + 1;
            column = row;
            iteration++;
            value++;
        }
        return board;
    }

    private static int[][] fillTillUp(int[][] board, int row, int column, int value) {
        int limit = board.length - 1 - row;
        for (; row > limit ; row--) {
            board[row][column] = value;
        }
        return board;
    }

    private static int[][] fillTillLeft(int[][] board, int row, int column, int value) {
        int limit = board[row].length - 1 - column;
        for (; column > limit; column--) {
            board[row][column] = value;
        }
        return board;
    }

    private static int[][] fillTillDown(int[][] board, int row, int column, int value) {
        int limit = board.length - 1 - row;
        for (; row < limit ; row++) {
            board[row][column] = value;
        }
        return board;
    }

    private static int[][] fillTillRight(int[][] board, int row, int column, int value) {
        int limit = (board[0].length - column - 1);
        for (; column < limit ; column++) {
            board[row][column] = value;
        }
        return board;
    }
}
