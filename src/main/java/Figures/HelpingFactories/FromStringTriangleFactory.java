package Figures.HelpingFactories;

import Figures.Types.Triangle;

public class FromStringTriangleFactory {
    public static Triangle create(String data) {
        Triangle triangle = new Triangle();
        triangle.fromString(data);
        return triangle;
    }
}
