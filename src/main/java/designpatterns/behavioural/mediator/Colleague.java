package designpatterns.behavioural.mediator;

/**
 * @author hdereli
 * @since 7/19/2023
 */

public abstract class Colleague {

    protected Mediator mediator;

    private String receivedMessage;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void notifyColleague(String message);

    abstract void receive(String message);

    public String getReceivedMessage() {
        return this.receivedMessage;
    }

    public void setReceivedMessage(String receivedMessage) {
        this.receivedMessage = receivedMessage;
    }
}

