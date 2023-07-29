package src.Document;

public class CharacterType {
    private char character;
    private int[] cornerCoordinates;

    public CharacterType(char character, int[] cornerCoordinates) {
        this.character = character;
        this.cornerCoordinates = cornerCoordinates;
    }

    public int[] getCoordinates() {
        return cornerCoordinates;
    }

    public char getCharacter() {
        return character;
    }
}
