package designpatterns.behavioural.mediator;

/**
 * @author hdereli
 * @since 7/19/2023
 */
public interface Mediator {

    //Aracı mesajın ileteceği kişiye mesaj yollar.
    void notifyColleague(Colleague colleague, String message);
}
