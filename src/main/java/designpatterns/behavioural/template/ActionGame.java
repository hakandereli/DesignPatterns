package designpatterns.behavioural.template;

/**
 * @author hdereli
 * @since 9/8/2023
 */
public class ActionGame extends Game {


    @Override
    public void start() {
        System.out.println("Action game started");
    }

    @Override
    public void play() {
        System.out.println("Fighting enemies");
        System.out.println("Passing levels");
    }

    @Override
    public void end() {
        System.out.println("Action game ended");
    }
}
