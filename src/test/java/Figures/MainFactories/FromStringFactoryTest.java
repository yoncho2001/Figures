package Figures.MainFactories;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FromStringFactoryTest {
    @ParameterizedTest
    @CsvSource(value = {"triangle 2,5 3,8 5,5|triangle 2.5 3.8 5.5",
            "circle 2,5|circle 2.5",
            "rectangle 20,5 36,6|rectangle 20.5 36.6"}, delimiter = '|')
    void testCreatingCorrectFigure(String data, String expected) {
        assertEquals(expected + '\n', FromStringFactory.createFigure(data).toString());

    }

    @ParameterizedTest
    @CsvSource(value = {"rectangle -2,5 3,8 2,55",
            "circle -10,25 -28,66 -58,66",
            "triangle 20,3 -53,12 33,22"}, delimiter = '|')
    void testCreatingIncorrectFigure(String data) {
        assertThrows(IllegalArgumentException.class,
                () -> FromStringFactory.createFigure(data));
    }

}