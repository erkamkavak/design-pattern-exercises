package src.container;

import java.util.ArrayList;

import src.shape.RegularPolygon;

public class PointCloudImage implements Image {
    private ArrayList<PointCloudPatch> pointCloudPatches;

    @Override
    public ArrayList<RegularPolygon> detectShapes() {
        ArrayList<RegularPolygon> shapes = new ArrayList<RegularPolygon>();
        for (PointCloudPatch pointCloudPatch : pointCloudPatches) {
            shapes.add(pointCloudPatch.detectShape());
        }
        return shapes;
    } 
}
