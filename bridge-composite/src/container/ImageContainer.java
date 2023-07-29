package src.container;

import java.util.ArrayList;

import src.shape.RegularPolygon;

public class ImageContainer {
    private ArrayList<Image> images;

    public ImageContainer() {
        images = new ArrayList<Image>();
    }

    public void addImage(Image image) {
        images.add(image);
    }

    public ArrayList<RegularPolygon> detectShapes() {
        ArrayList<RegularPolygon> shapes = new ArrayList<RegularPolygon>();
        for (Image image : images) {
            shapes.addAll(image.detectShapes());
        }
        return shapes;
    }
}
