package designpatterns.behavioural.mediator;

/**
 * @author hdereli
 * @since 7/19/2023
 */
public interface Mediator {

    void notifyColleague(Colleague colleague, String message);
}
