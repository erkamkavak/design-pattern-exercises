package src.Document;

public class Shape implements Drawable {
    private String shapeType;
    private int[] cornerCoordinates;
    private int centerX;
    private int centerY;

    public Shape(int[] cornerCoordinates, int centerX, int centerY) {
        this.cornerCoordinates = cornerCoordinates;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    @Override
    public int[] getCoordinates() {
        int[] coordinates = new int[cornerCoordinates.length];
        for (int i = 0; i < coordinates.length / 2; i += 1) {
            coordinates[2*i] = centerX + cornerCoordinates[2*i];
            coordinates[2*i + 1] = centerY + cornerCoordinates[2*i + 1];
        }
        return coordinates;
    }

    @Override
    public String toString() {
        return "Shape: " + shapeType;
    }
}
