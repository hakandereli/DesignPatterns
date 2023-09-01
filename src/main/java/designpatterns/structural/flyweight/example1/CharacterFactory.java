package designpatterns.structural.flyweight.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hdereli
 * @since 9/1/2023
 */
public class CharacterFactory {

    private Map<Character, ConcreteFlyweightCharacter> characters = new HashMap<>();

    public ConcreteFlyweightCharacter getCharacter(char c) {

        Character key = Character.valueOf(c);

        if (characters.containsKey(c)) {
            return characters.get(c);
        } else {
            ConcreteFlyweightCharacter newCharacter = new ConcreteFlyweightCharacter(c);
            characters.put(c, newCharacter);
            return newCharacter;
        }
    }
}
