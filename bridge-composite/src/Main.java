package src;

import src.shape.*;

import java.awt.Frame;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(400, 400); 

        RegularPolygon randPolygon = RegularPolygon.getRandRegularPolygon();
        System.out.println("Painting " + randPolygon.color.name + " " + randPolygon.shape.name + " color");
        frame.add(randPolygon);
        frame.setVisible(true);   
    }
}
