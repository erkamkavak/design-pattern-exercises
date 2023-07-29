package src.shape; 

import java.util.ArrayList;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class RegularPolygon extends Component {
    public Color color;
    public Shape shape;

    public RegularPolygon(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    public ArrayList<Point> getCorners(int center) {
        ArrayList<Point> corners = new ArrayList<>();
        double theta = 2 * Math.PI / this.shape.sides;
        System.out.println("center: " + center);

        int radius = 40; 
        for (int i = 0; i < this.shape.sides; ++i) {
            double x = center + radius * Math.cos(theta * i);
            double y = center + radius * Math.sin(theta * i);
            corners.add(new Point(x, y));
        }
        return corners;
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Polygon polygon = new Polygon(); 

        int center = g2d.getClipBounds().width / 2;
        ArrayList<Point> corners = this.getCorners(center);
        for (Point corner : corners) {
            polygon.addPoint((int)corner.x, (int)corner.y);
        }
        g2d.setColor(this.color.awtColor);
        g2d.fillPolygon(polygon);
    }

    public static ArrayList<RegularPolygon> getAllRegularPolygons() {
        ArrayList<RegularPolygon> regularPolygons = new ArrayList<>();
        ArrayList<Shape> shapes = Shape.getAllShapes();
        ArrayList<Color> colors = Color.getAllColors();
        for (Shape shape : shapes) {
            for (Color color : colors) {
                regularPolygons.add(new RegularPolygon(shape, color));
            }
        }
        return regularPolygons;
    }

    public static RegularPolygon getRandRegularPolygon() {
        ArrayList<Shape> shapes = Shape.getAllShapes();
        ArrayList<Color> colors = Color.getAllColors();

        int randShapeIndex = (int)(Math.random() * shapes.size());
        int randColorIndex = (int)(Math.random() * colors.size());
        return new RegularPolygon(shapes.get(randShapeIndex), colors.get(randColorIndex));
    }
}
