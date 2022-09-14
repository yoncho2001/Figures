package Figures.Types;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @ParameterizedTest
    @CsvSource(value = {"-2.5", "-10.25", "-0.5"})
    void testConstructor(double radius){
        assertThrows(IllegalArgumentException.class,
                () -> new Circle(radius));
    }
    @ParameterizedTest
    @CsvSource({"2.2,13.823", "5.0,31.4159", "15.3,96.132"})
    void testPerimeter(double radius, double expected) {
        Circle circle = new Circle(radius);
        assertEquals(expected, circle.perimeter(),0.001);
    }

    @ParameterizedTest
    @CsvSource(value = {"circle 2,5|2.5",
            "circle 10,24|10.24",
            "circle 200,23|200.23"},delimiter = '|')
    void testFromString(String data, double expected){
        Circle circle = new Circle();
        circle.fromString(data);
        assertEquals(expected,circle.getRadius());
    }

    @ParameterizedTest
    @CsvSource(value = {"rectangle 2,5", "circle -10,12", "triangle 0"},delimiter = '|')
    void testFromStringIncorrect(String data){
        Circle circle = new Circle();
        assertThrows(IllegalArgumentException.class,
                () -> circle.fromString(data));
    }

    @Test
    void testToString(){
        Circle circle = new Circle(2.2);
        assertEquals("circle 2.2\n",circle.toString());
    }

}