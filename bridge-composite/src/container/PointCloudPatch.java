package src.container;

import src.shape.RegularPolygon;

public class PointCloudPatch {
    
    public RegularPolygon detectShape() {
        RegularPolygon regularPolygon = RegularPolygon.getRandRegularPolygon();
        return regularPolygon;
    }
}
