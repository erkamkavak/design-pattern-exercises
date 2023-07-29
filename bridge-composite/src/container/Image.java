package src.container;

import java.util.ArrayList;
import src.shape.RegularPolygon;

public interface Image {    
    public ArrayList<RegularPolygon> detectShapes();
}
