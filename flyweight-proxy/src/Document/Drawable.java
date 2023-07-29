package src.Document;

public interface Drawable {
    public int[] getCoordinates();
    public String toString();
    
    public default void draw() {
        for (int i = 0; i < getCoordinates().length; i += 2) {
            System.out.println("(" + getCoordinates()[i] + ", " + getCoordinates()[i + 1] + ")");
        }
    }
}
