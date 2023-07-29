package src.Document;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static CharacterFactory instance = null;

    private static final Map<Character, int[]> characterMap = new HashMap<>();
    private static Map<Character, CharacterType> characterTypeMap = new HashMap<>();

    private CharacterFactory() {
        initializeCharacterMap();
    }

    private void initializeCharacterMap() {
        characterMap.put('A', new int[]{0, 4, 2, 0, 4, 4, 3, 1, 1, 1, 0, 4});
        characterMap.put('B', new int[]{0, 0, 0, 4, 2, 4, 2, 2, 2, 0, 4, 0, 4, 1, 2, 1, 4, 3, 2, 3, 4, 4, 0, 0});
        characterMap.put('C', new int[]{4, 0, 0, 0, 0, 4, 4, 4, 4, 1, 1, 1, 4, 0});
        characterMap.put('D', new int[]{0, 0, 0, 4, 3, 4, 4, 3, 4, 1, 3, 0, 0, 0});
        characterMap.put('E', new int[]{4, 0, 0, 0, 0, 4, 4, 4, 0, 2, 2, 2, 4, 0});
        characterMap.put('F', new int[]{4, 0, 0, 0, 0, 4, 0, 2, 2, 2, 4, 0});
        characterMap.put('G', new int[]{4, 0, 0, 0, 0, 4, 4, 4, 4, 1, 1, 1, 2, 1, 3, 1, 4, 1, 4, 2, 3, 2, 4, 0});
        characterMap.put('H', new int[]{0, 0, 0, 4, 0, 2, 4, 0, 4, 4, 4, 2, 0, 0});
        characterMap.put('I', new int[]{2, 0, 2, 4, 1, 0, 3, 0, 1, 4, 3, 4, 2, 0});
        characterMap.put('J', new int[]{3, 0, 3, 4, 2, 0, 1, 0, 1, 4, 3, 0});
        characterMap.put('K', new int[]{0, 0, 0, 4, 0, 2, 4, 0, 1, 2, 3, 4, 0, 0});
        characterMap.put('L', new int[]{0, 0, 0, 4, 0, 0, 4, 0, 0, 0});
        characterMap.put('M', new int[]{0, 4, 0, 0, 2, 2, 4, 0, 4, 4});
        characterMap.put('N', new int[]{0, 4, 0, 0, 4, 4, 4, 0, 0, 4});
        characterMap.put('O', new int[]{0, 0, 0, 4, 4, 4, 4, 0, 0, 0});
        characterMap.put('P', new int[]{0, 4, 0, 0, 3, 0, 4, 1, 3, 2, 0, 2, 0, 4});
        characterMap.put('Q', new int[]{0, 0, 0, 4, 4, 4, 4, 0, 0, 0, 3, 1, 4, 0, 0});
        characterMap.put('R', new int[]{0, 4, 0, 0, 3, 0, 4, 1, 3, 2, 0, 2, 3, 2, 4, 4, 0, 4});
        characterMap.put('S', new int[]{4, 0, 0, 0, 0, 2, 4, 2, 4, 4, 0, 4});
        characterMap.put('T', new int[]{0, 0, 4, 0, 2, 0, 2, 4, 0, 0});
        characterMap.put('U', new int[]{0, 0, 0, 4, 4, 4, 4, 0, 0, 0});
        characterMap.put('V', new int[]{0, 0, 2, 4, 4, 0, 0});
        characterMap.put('W', new int[]{0, 0, 0, 4, 2, 2, 4, 4, 4, 0, 0, 0});
        characterMap.put('X', new int[]{0, 0, 4, 4, 0, 4, 4, 0, 0, 0});
        characterMap.put('Y', new int[]{0, 0, 2, 2, 4, 0, 2, 2, 2, 4, 0, 0});
        characterMap.put('Z', new int[]{0, 0, 4, 0, 0, 4, 4, 4, 0, 0});
    }

    public static CharacterFactory getInstance() {
        if (instance == null) {
            instance = new CharacterFactory();
        }
        return instance;
    }

    public CharacterType getCharacterType(char character) {
        CharacterType characterType = characterTypeMap.getOrDefault(character, null); 
        if (characterType == null) {
            characterType = new CharacterType(character, characterMap.get(character));
            characterTypeMap.put(character, characterType);
        }
        return characterType;
    }
}
