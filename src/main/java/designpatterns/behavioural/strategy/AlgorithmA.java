package designpatterns.behavioural.strategy;

/**
 * @author hdereli
 * @since 9/7/2023
 */
public class AlgorithmA implements Strategy {

    @Override
    public void execute() {
        System.out.println("Algorithm A is executed.");
    }
}
