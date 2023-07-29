package src.shape;

import java.util.ArrayList;
import java.util.Arrays;

public class Shape {
    public String name;
    public int sides;

    public Shape(String name, int sides) {
        this.name = name;
        this.sides = sides;
    }

    public static final ArrayList<Shape> getAllShapes() {
        ArrayList<Shape> shapes = new ArrayList<>(); 
        shapes.addAll(Arrays.asList(
            new Shape("Triangle", 3),
            new Shape("Square", 4),
            new Shape("Pentagon", 5),
            new Shape("Hexagon", 6),
            new Shape("Heptagon", 7),
            new Shape("Octagon", 8),
            new Shape("Circle", 100)
        ));
        return shapes;
    }
}
