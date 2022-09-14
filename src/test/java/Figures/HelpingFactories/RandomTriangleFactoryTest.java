package Figures.HelpingFactories;

import Figures.Types.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomTriangleFactoryTest {
    @Test
    void testRandomTriangleFactories() {

        Triangle triangle = RandomTriangleFactory.create();
        String strT = triangle.toString();
        assertFalse(strT.isEmpty());
    }

}