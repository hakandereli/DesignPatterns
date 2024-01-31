package designpatterns.behavioural.memento;

/**
 * @author hdereli
 * @since 9/4/2023
 */
// Memento: Durumu temsil eden sınıf
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }


}
