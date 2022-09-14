package Figures.HelpingFactories;

import Figures.Types.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomRectangleFactoryTest {
    @Test
    void testRandomRectangleFactories() {

        Rectangle rectangle = RandomRectangleFactory.create();
        String strR = rectangle.toString();
        assertFalse(strR.isEmpty());

    }
}