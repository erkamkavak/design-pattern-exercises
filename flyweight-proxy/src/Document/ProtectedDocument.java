package src.Document;

public class ProtectedDocument {
    private Document document;

    public ProtectedDocument(Document document) {
        this.document = document;
    }

    private boolean isDrawableOkay(Drawable drawable) {
        int[] coordinates = drawable.getCoordinates(); 
        boolean hasEvenNumberOfCoordinates = coordinates.length % 2 == 0;
        if (!hasEvenNumberOfCoordinates) {
            return false;
        }

        boolean isFirstCoordEqualToLast = 
            coordinates[0] == coordinates[coordinates.length - 2] && 
            coordinates[1] == coordinates[coordinates.length - 1]; 
        if (!isFirstCoordEqualToLast) {
            return false;
        }

        return true;
    }

    public void addDrawable(Drawable drawable) {
        if (!isDrawableOkay(drawable)) {
            throw new IllegalArgumentException("Drawable is not okay: " + drawable.toString() + ".");
        }
        document.addDrawable(drawable);
    }

    public void draw() {
        document.draw();
    }
}
