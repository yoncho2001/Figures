package Figures.Types;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @ParameterizedTest
    @CsvSource(value = {"-2.5, 23.5", "-10.25, -2.45", "0.5,-58.40"})
    void testConstructor(double sideA, double sideB) {
        assertThrows(IllegalArgumentException.class,
                () -> new Rectangle(sideA, sideB));
    }

    @ParameterizedTest
    @CsvSource({"2.2,13.823,32.046", "5.0,31.4159,72.8318", "15.3,96.132,222.864"})
    void testPerimeter(double sideA, double sideB, double expected) {
        Rectangle rectangle = new Rectangle(sideA, sideB);
        assertEquals(expected, rectangle.perimeter(), 0.001);
    }

    @ParameterizedTest
    @CsvSource(value = {"rectangle 2,5 3,8|2.5|3.8",
            "rectangle 20,2 36,5|20.2|36.5",
            "rectangle 0,5 0,7|0.5|0.7"}, delimiter = '|')
    void testFromString(String data, double expectedA, double expectedB) {
        Rectangle rectangle = new Rectangle();
        rectangle.fromString(data);
        assertEquals(expectedA, rectangle.getSideA());
        assertEquals(expectedB, rectangle.getSideB());
    }

    @ParameterizedTest
    @CsvSource(value = {"circle 2,2 3,6", "circle -10,25 -23,86", "rectangle 20,3 -55,32"}, delimiter = '|')
    void testFromStringIncorrect(String data) {
        Rectangle rectangle = new Rectangle();
        assertThrows(IllegalArgumentException.class,
                () -> rectangle.fromString(data));
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(2.2, 3.6);
        assertEquals("rectangle 2.2 3.6\n", rectangle.toString());
    }

}