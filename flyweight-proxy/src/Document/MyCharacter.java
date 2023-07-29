package src.Document;

public class MyCharacter implements Drawable {
    private CharacterType characterType;
    private int centerX;
    private int centerY;

    public MyCharacter(Character character, int centerX, int centerY) {
        this.characterType = CharacterFactory.getInstance().getCharacterType(character); 
        this.centerX = centerX;
        this.centerY = centerY;
    }

    @Override
    public int[] getCoordinates() {
        int[] coordinates = new int[characterType.getCoordinates().length];
        for (int i = 0; i < coordinates.length / 2; i += 1) {
            coordinates[2*i] = centerX + characterType.getCoordinates()[2*i];
            coordinates[2*i + 1] = centerY + characterType.getCoordinates()[2*i + 1];
        }
        return coordinates;
    }

    @Override
    public String toString() {
        return "Character: " + characterType.getCharacter();
    }
}
