package Figures.HelpingFactories;

import Figures.Types.Circle;

public class FromStringCircleFactory {
    public static Circle create(String data) {
        Circle circle = new Circle();
        circle.fromString(data);
        return circle;
    }
}