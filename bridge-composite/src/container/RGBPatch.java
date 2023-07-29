package src.container;

import src.shape.RegularPolygon;

public class RGBPatch {
            
    public RegularPolygon detectShape() {
        RegularPolygon regularPolygon = RegularPolygon.getRandRegularPolygon();
        return regularPolygon;
    }
}
