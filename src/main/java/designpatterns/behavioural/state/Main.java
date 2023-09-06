package designpatterns.behavioural.state;

public class Main {
    /**
     *
     *
     State tasarım kalıbı, bir nesnenin durumunu temsil etmek ve bu durumun değişmesine göre davranışını değiştirmek için kullanılır.
     Bu kalıp, bir nesnenin birden fazla durumu varsa ve bu durumların her biri için farklı davranış gerekiyorsa kullanışlıdır.

     State tasarım kalıbı, aşağıdaki sorunları çözer:

     Bir nesnenin birden fazla durumu varsa ve bu durumların her biri için farklı davranış gerekiyorsa,
     bu kalıp durumu temsil etmek ve bu durumun değişmesine göre davranışı değiştirmek için kullanılabilir.
     Bir nesnenin durumunun değişmesine göre davranışının değişmesini sağlamak için bu kalıp kullanılabilir.
     Bir nesnenin durumunun yanlışlıkla değiştirilmesini önlemek için bu kalıp kullanılabilir.
     Gerçek yazılım dünyasından bir hata örneği, bir oyunun karakterinin durumunu temsil etmek için bir değişken kullanılmasıdır.
     Bu durumda, karakterin durumunun değişmesine göre davranışının değişmesini sağlamak için state tasarım kalıbı kullanılabilir.
     *
     * */

    public static void main(String[] args) {

        GameCharacter gameCharacter = new GameCharacter();

        gameCharacter.move();
        gameCharacter.attack();
        gameCharacter.idle();

        System.out.println(" \n --------------------------------------------\n ");

        gameCharacter.setState(new AttackingState());
        gameCharacter.move();
        gameCharacter.attack();
        gameCharacter.idle();

        System.out.println(" \n --------------------------------------------\n ");

        gameCharacter.setState(new WalkingState());
        gameCharacter.move();
        gameCharacter.attack();
        gameCharacter.idle();


    }


}
