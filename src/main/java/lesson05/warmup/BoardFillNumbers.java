package lesson05.warmup;

public class BoardFillNumbers {
    public static void main(String[] args) {
        int HEIGHT = 10;
        int WIDTH = 10;
        int[][] board = fillBoard(HEIGHT,WIDTH);
    }

    private static int[][] fillBoard(int rows, int columns) {

        int[][] board = new int[rows][columns];
        int value = 0;
        int row = 0;
        int column = columns - 1;
        //fixme row and columns should be specified for each case!
        Directions direction = Directions.RIGHT;
        for (int i = 0; i < rows ; i++) {
            if(direction==Directions.RIGHT) {
                board = fillTillRight(board,row,column,value);
                direction = Directions.DOWN;
            }
            else if(direction == Directions.DOWN){
                board = fillTillDown(board,row,column,value);
                direction = Directions.LEFT;
            }
            else if(direction == Directions.LEFT){
                board = fillTillLeft(board,row,column,value);
                direction = Directions.UP;
            }
            else{
                board = fillTillUp(board,row,column,value);
                direction = Directions.RIGHT;
            }
        }
        return board;
    }

    private static int[][] fillTillUp(int[][] board, int row, int column, int value) {
        for (; row > (board.length - 1 - row) ; row--) {
            board[row][column] = value;
        }
        return board;
    }

    private static int[][] fillTillLeft(int[][] board, int row, int column, int value) {
        for (; column > (board[row].length - 1 - column); column--) {
            board[row][column] = value;
        }
        return board;
    }

    private static int[][] fillTillDown(int[][] board, int row, int column, int value) {
        for (; row < (board.length - 1 - row) ; row++) {
            board[row][column] = value;
        }
        return board;
    }

    private static int[][] fillTillRight(int[][] board, int row, int column, int value) {
        for (; column < (board[0].length - column - 1); column++) {
            board[row][column] = value;
        }
        return board;
    }
}
