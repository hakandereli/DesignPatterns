package designpatterns.behavioural.state;

/**
 * @author hdereli
 * @since 9/6/2023
 */
public interface State {

    void move();
    void attack();
    void idle();
}
