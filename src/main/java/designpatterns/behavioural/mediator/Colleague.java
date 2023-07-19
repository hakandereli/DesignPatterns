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

    //Kullanıcılara bildirim gönder
    public abstract void notifyColleague(String message);

    //gelen messeagı alır.
    abstract void receive(String message);

    //alınan mesajı döner
    public String getReceivedMessage() {
        return this.receivedMessage;
    }

    //gelen mesajı setler.
    public void setReceivedMessage(String receivedMessage) {
        this.receivedMessage = receivedMessage;
    }
}

