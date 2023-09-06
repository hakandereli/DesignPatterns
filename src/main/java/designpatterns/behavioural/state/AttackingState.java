package designpatterns.behavioural.state;

/**
 * @author hdereli
 * @since 9/6/2023
 */
public class AttackingState implements State{

    @Override
    public void move() {
        System.out.println("Character is attacking. Cannot move.");
    }

    @Override
    public void attack() {
        System.out.println("Character is attacking.");
    }

    @Override
    public void idle() {
        System.out.println("Character is attacking.");
    }
}
