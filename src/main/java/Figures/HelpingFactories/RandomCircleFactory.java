package Figures.HelpingFactories;

import Figures.Types.Circle;

public class RandomCircleFactory {
    public static Circle create() {

        return new Circle(Math.random() * 10.0);
    }
}
