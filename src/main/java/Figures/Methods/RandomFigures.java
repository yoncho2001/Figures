package Figures.Methods;

import Figures.MainFactories.RandomFactory;
import Figures.Types.Figure;

import java.util.List;
import java.util.Scanner;

public class RandomFigures {
    public static void create(List<Figure> figures) {
        System.out.println("How many figures to create: ");
        Scanner scanAmount = new Scanner(System.in);
        createRandomFigures(figures, scanAmount);
    }

    public static void createRandomFigures(List<Figure> figures, Scanner scanAmount) {
        int amount = scanAmount.nextInt();
        for (int i = 0; i < amount; i++) {
            figures.add(RandomFactory.createFigure());
        }
    }
}
