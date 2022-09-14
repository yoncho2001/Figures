package Figures.MainFactories;

import Figures.HelpingFactories.RandomCircleFactory;
import Figures.HelpingFactories.RandomRectangleFactory;
import Figures.HelpingFactories.RandomTriangleFactory;
import Figures.Types.Figure;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomFactory {
    public static Figure createFigure() {
        int max = 3;
        int min = 1;
        int random = randomGenerator(min, max);
        switch (random) {
            case 1:
                return RandomCircleFactory.create();
            case 2:
                return RandomRectangleFactory.create();
            case 3:
                return RandomTriangleFactory.create();
            default:
                throw new IllegalArgumentException("This figure dont exist.");
        }
    }

    private static int randomGenerator(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

}
