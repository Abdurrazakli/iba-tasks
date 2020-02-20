package lesson08.figures;

import java.util.ArrayList;

public class GeomApp {
  public static void main(String[] args) {
    ArrayList<Figure> figures = new ArrayList<>();
    RandomFigureGenerator randomFigureGenerator = new RandomFigureGenerator();
    int limiter = 25;
    int numberOfFigures = (int)(Math.random() * limiter);
    for (int i = 0; i < numberOfFigures; i++) {
        figures.add(randomFigureGenerator.getRandomFigure());
    }
    int total_area = 0;
    for (Figure f: figures) {
      System.out.println(f.getClass());
      total_area += f.area();
    }

    System.out.println(total_area);
  }
}
