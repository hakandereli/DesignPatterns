package designpatterns.behavioural.strategy;

/**
 * @author hdereli
 * @since 9/7/2023
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void execute(){
        strategy.execute();
    }
}
