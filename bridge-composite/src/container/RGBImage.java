package src.container;

import java.util.ArrayList;

import src.shape.RegularPolygon;

public class RGBImage implements Image {
    private ArrayList<RGBPatch> rgbPatches;

    @Override
    public ArrayList<RegularPolygon> detectShapes() {
        ArrayList<RegularPolygon> shapes = new ArrayList<RegularPolygon>();
        for (RGBPatch rgbPatch : rgbPatches) {
            shapes.add(rgbPatch.detectShape());
        }
        return shapes;
    }
    
}
