package designpatterns.behavioural.state;

/**
 * @author hdereli
 * @since 9/6/2023
 */
public class GameCharacter {

    private State state;

    public GameCharacter(){
        //İlk başta boşta olsun karakter yani her hangi bir şey yapmadan beklediği durum
        IdleState idleState = new IdleState();
        setState(idleState);
    }

    public void setState(State state){
        this.state = state;
        System.out.println("State Change : " + state.getClass().getSimpleName());
    }

    public void move(){
        this.state.move();
    }

    public void attack(){
        this.state.attack();
    }

    public void idle(){
        this.state.idle();
    }
}
