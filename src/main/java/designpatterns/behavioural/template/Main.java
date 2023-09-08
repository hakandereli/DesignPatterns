package designpatterns.behavioural.template;

public class Main {
    /**
     *
     *
     Template design pattern, bir algoritmanın genel yapısını tanımlayan ve bu yapının belirli adımlarını
     alt sınıflara bırakan bir davranışsal tasarım desenidir. Bu tasarım deseni, bir algoritmanın belirli adımlarını
     değiştirebilmenizi sağlarken, aynı zamanda algoritmanın genel yapısını korumanıza olanak tanır.

     Template design pattern, aşağıdaki gibi bir problemi çözer:

     Bir algoritmanın belirli adımlarını değiştirmek istediğiniz, ancak aynı zamanda algoritmanın genel yapısını korumak istediğiniz durumlar.
     Farklı alt sınıflara sahip bir sınıf hiyerarşisinde bir algoritmayı uyguladığınız durumlar.

     Gerçek bir yazılım projesinden bir örnek vermek gerekirse, bir oyun oynamak için bir algoritma düşünelim.
     Bu algoritma, oyunun başlangıcını, oyunun oynanmasını ve oyunun sonunu içerecektir. Oyunun başlangıcı ve
     sonu, her oyun için aynı olacaktır. Ancak, oyunun oynanması, oyunun türüne bağlı olarak değişecektir. Örneğin,
     bir aksiyon oyununda, oyunun oynanması, düşmanlarla savaşmayı ve seviyeleri geçmeyi içerecektir.
     Bir bulmaca oyununda, oyunun oynanması, bulmacaları çözmeyi içerecektir.

     Template design pattern, bu durumda, oyunun genel oynanma algoritmasını tanımlayan bir üst sınıf oluşturarak kullanılabilir.
     Alt sınıflar, oyunun türünü temsil edecek ve oyunun oynanma algoritmasının belirli adımlarını değiştirecektir.
     Örneğin, bir aksiyon oyunu için bir alt sınıf, düşmanlarla savaşma ve seviyeleri geçme yöntemlerini içerecektir.
     Bir bulmaca oyunu için bir alt sınıf, bulmacaları çözme yöntemlerini içerecektir.

     Java ile bir sorunu çözmek için, aşağıdaki kodu kullanabiliriz:
     *
     * */

    public static void main(String[] args) {
        System.out.println("**************************");
        Game actionGame = new ActionGame();
        actionGame.run();

        System.out.println("**************************");
        Game puzzleGame = new PuzzleGame();
        puzzleGame.run();

        System.out.println("**************************");

    }

}
