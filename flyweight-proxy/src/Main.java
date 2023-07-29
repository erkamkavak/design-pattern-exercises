package src;

import src.Document.*;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        ProtectedDocument protectedDocument = new ProtectedDocument(document);

        for (int i = 0; i < 26; i++) {
            char character = (char) ('A' + i);
            try {
                protectedDocument.addDrawable(new MyCharacter(character, 5, 5));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
