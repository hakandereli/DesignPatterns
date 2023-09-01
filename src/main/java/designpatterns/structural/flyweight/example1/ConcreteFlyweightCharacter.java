package designpatterns.structural.flyweight.example1;

/**
 * @author hdereli
 * @since 9/1/2023
 */
public class ConcreteFlyweightCharacter implements FlyweightCharacter {

    private char character;

    public ConcreteFlyweightCharacter(char character) {
        this.character = character;
    }

    @Override
    public void printCharacter() {
        System.out.println(character);
    }
}
