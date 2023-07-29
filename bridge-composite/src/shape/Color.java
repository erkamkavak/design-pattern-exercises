package src.shape;

import java.util.ArrayList;
import java.util.Arrays;

public class Color {
    public String name;
    public java.awt.Color awtColor;

    public Color(String name, java.awt.Color awtColor) {
        this.name = name;
        this.awtColor = awtColor;
    }

    public static final ArrayList<Color> getAllColors() {
        ArrayList<Color> colors = new ArrayList<>();
        colors.addAll(Arrays.asList(
            new Color("RED", java.awt.Color.RED),
            new Color("GREEN", java.awt.Color.GREEN),
            new Color("BLUE", java.awt.Color.BLUE),
            new Color("YELLOW", java.awt.Color.YELLOW)
        ));
        return colors;
    }
}
