package Figures.HelpingFactories;

import Figures.Types.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomCircleFactoryTest {
    @Test
    void testRandomCircleFactories() {
        Circle circle = RandomCircleFactory.create();
        String strC = circle.toString();
        assertFalse(strC.isEmpty());

    }

}