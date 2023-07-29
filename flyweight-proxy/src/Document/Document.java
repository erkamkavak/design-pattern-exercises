package src.Document;

import java.util.ArrayList;

public class Document {
    private ArrayList<Drawable> drawables;

    public Document() {
        drawables = new ArrayList<Drawable>();
    }

    public void addDrawable(Drawable drawable) {
        drawables.add(drawable);
    }

    public void draw() {
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
