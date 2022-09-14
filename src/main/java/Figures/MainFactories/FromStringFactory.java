package Figures.MainFactories;

import Figures.HelpingFactories.FromStringCircleFactory;
import Figures.HelpingFactories.FromStringRectangleFactory;
import Figures.HelpingFactories.FromStringTriangleFactory;
import Figures.Types.Figure;

import java.util.Scanner;

public class FromStringFactory {
    public static Figure createFigure(String data) {
        Scanner scanData = new Scanner(data).useDelimiter("\\s");
        String name = scanData.next();
        name = name.toLowerCase();

        switch (name) {
            case "circle":
                return FromStringCircleFactory.create(data);
            case "rectangle":
                return FromStringRectangleFactory.create(data);
            case "triangle":
                return FromStringTriangleFactory.create(data);
            default:
                throw new IllegalArgumentException("Incorrect figure.");
        }
    }
}
