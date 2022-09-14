package Figures.MainFactories;

import Figures.Types.Figure;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RandomFactoryTest {
    @Test
    void testCorrectRandomGeneration() {
        for (int i = 0; i < 100; i++) {
            Figure figure = RandomFactory.createFigure();
            Scanner scanner = new Scanner(figure.toString());
            String name = scanner.next();

            assertThat(name).isIn("circle", "rectangle", "triangle");

            scanner.close();
        }
    }

}