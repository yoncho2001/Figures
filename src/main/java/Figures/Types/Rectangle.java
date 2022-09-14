package Figures.Types;

import lombok.Getter;

import java.util.Scanner;

public class Rectangle extends Figure {
    private @Getter double sideA;
    private @Getter double sideB;

    public Rectangle() {
        this.sideA = 0;
        this.sideB = 0;
    }

    public Rectangle(double sideA, double sideB) {
        if (sideA >= 0 && sideB >= 0) {
            this.sideA = sideA;
            this.sideB = sideB;
        } else {
            throw new IllegalArgumentException("Incorrect rectangle.");
        }
    }

    @Override
    public double perimeter() {

        return 2 * sideA + 2 * sideB;
    }

    @Override
    public Figure clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }

    @Override
    public void fromString(String data) {
        Scanner scanner = new Scanner(data).useDelimiter("\\s");
        String name = scanner.next();
        double tempA = scanner.nextDouble();
        double tempB = scanner.nextDouble();
        if (name.equals("rectangle") && tempA >= 0 && tempB >= 0) {
            this.sideA = tempA;
            this.sideB = tempB;
        } else {
            throw new IllegalArgumentException("Incorrect rectangle.");
        }
    }

    @Override
    public String toString() {

        return "rectangle" + " " + sideA + " " + sideB + "\n";
    }
}

