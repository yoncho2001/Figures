package Figures.Methods;

import Figures.MainFactories.FromStringFactory;
import Figures.Types.Figure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class FiguresFromFile {
    public static void create(Scanner scanner, List<Figure> figures) {
        boolean check = true;
        while (check) {
            String figureData = scanner.nextLine();
            if (!Objects.equals(figureData, "exit")) {
                figures.add(FromStringFactory.createFigure(figureData));
            } else {
                check = false;
            }
        }
    }

    public static void createFromIn(List<Figure> figures) {
        System.out.println("Input figures or write exit to end: ");
        Scanner scanFigure = new Scanner(System.in);
        create(scanFigure, figures);
        scanFigure.close();
    }

    public static void createFromFile(List<Figure> figures) throws FileNotFoundException {
        System.out.println("Input file name: ");
        Scanner scanIn = new Scanner(System.in);
        String fileName = scanIn.nextLine();

        File file = new File(fileName);
        Scanner data = new Scanner(file);
        create(data, figures);

        data.close();
        scanIn.close();
    }
}
