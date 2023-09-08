package designpatterns.behavioural.template;

/**
 * @author hdereli
 * @since 9/8/2023
 */
public abstract class Game {

    public abstract void start();
    public abstract void play();
    public abstract void end();

    public void run(){
        start();
        play();
        end();
    }
}
