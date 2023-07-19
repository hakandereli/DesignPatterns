package designpatterns.behavioural.mediator;

/**
 * @author hdereli
 * @since 7/19/2023
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notifyColleague(String message) {
        this.mediator.notifyColleague(this, message);
    }

    @Override
    public void receive(String message) {
        this.setReceivedMessage(message);
    }
}
