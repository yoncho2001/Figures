package Figures.Types;

import lombok.Getter;

import java.util.Scanner;

public class Circle extends Figure {
    private @Getter double radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Cant have circle with these radius.");
        }
    }

    @Override
    public double perimeter() {

        return 2 * Math.PI * radius;
    }

    @Override
    public Figure clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }

    @Override
    public void fromString(String data) {
        Scanner scanner = new Scanner(data).useDelimiter("\\s");
        String name = scanner.next();
        double tempRadius = scanner.nextDouble();
        if (name.equals("circle") && tempRadius >= 0) {
            this.radius = tempRadius;
        } else {
            throw new IllegalArgumentException("Incorrect circle.");
        }
    }

    @Override
    public String toString() {

        return "circle " + radius + "\n";
    }
}

