package lesson56.warmup;

import java.util.stream.IntStream;

public class Board {
    private final int xSize;
    private final int ySize;
    private boolean[][] board;
    public Board(int xSize, int ySize) {
        this.xSize = xSize;
        this.ySize = ySize;
        board = new boolean[ySize][xSize];
    }
    public void fill(Rectangle r){
        int minX = Math.min(r.p1.x(),r.p2.x());
        int maxX = Math.max(r.p1.x(),r.p2.x());
        int minY = Math.min(r.p1.y(),r.p2.y());
        int maxY = Math.max(r.p1.y(),r.p2.y());
        IntStream.range(minY-1,maxY-1).forEach(
                y->
                IntStream.range(minX-1,maxX-1).forEach(x->
                        board[y][x]=true)
        );
    }
    public long totalFilled(){
        return IntStream.range(0,ySize).flatMap(
                y-> IntStream.range(0,xSize).map(x-> board[y][x] ? 1 : 0)
        ).sum();
    }

}
