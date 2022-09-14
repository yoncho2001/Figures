package Figures.Methods;

import Figures.Types.Figure;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FiguresFromFileTest {
    @Test
    void testCreatingCorrectFiguresFromFile() throws IOException {
        List<Figure> figures = new ArrayList<>();

        File file = new File("data");
        Scanner myReader = new Scanner(file);
        FiguresFromFile.create(myReader, figures);
        myReader.close();

        File myFile = new File("actual.txt");
        if (myFile.createNewFile()) {
            System.out.println("File created: " + myFile.getName());
        }

        FileWriter writer = new FileWriter("actual.txt");
        for (Figure figure : figures) {
            writer.write(figure.toString());
        }
        writer.close();


        File actualFile = new File("actual.txt");
        File expectedFile = new File("expected.txt");
        assertThat(actualFile).hasSameTextualContentAs(expectedFile);
    }


}