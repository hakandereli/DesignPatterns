package designpatterns.behavioural.state;

/**
 * @author hdereli
 * @since 9/6/2023
 */
public class WalkingState implements State {

    @Override
    public void move() {
        System.out.println("Character is walking.");
    }

    @Override
    public void attack() {
        System.out.println("Character is walking. Cannot attack.");
    }

    @Override
    public void idle() {
        System.out.println("Character is walking.");
    }
}
