package designpatterns.behavioural.mediator;

/**
 * @author hdereli
 * @since 7/19/2023
 */
//KULLANICI 1
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    //Aracı sayesinde mesaj yollar.
    @Override
    public void notifyColleague(String message) {
        this.mediator.notifyColleague(this, message);
    }

    //Aracı sayesinde mesaj alır.
    @Override
    public void receive(String message) {
        this.setReceivedMessage(message);
    }
}
