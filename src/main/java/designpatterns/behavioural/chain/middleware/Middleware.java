package designpatterns.behavioural.chain.middleware;
/**
 * Base middleware class.
 * Temel ara yazılım sınıfı.
 */
public abstract class Middleware {

    private Middleware next;

    /**
     * EN: Builds chains of middleware objects.
     *
     * TR: Ara yazılım nesnelerinin zincirlerini oluşturur
     */
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    /**
     * Subclasses will implement this method with concrete checks.
     * Alt sınıflar bu yöntemi somut kontrollerle uygulayacaktır.
     */
    public abstract boolean check(String email, String password);

    /**
     * Runs check on the next object in chain or ends traversing if we're in last object in chain.
     * Zincirdeki bir sonraki nesneyi kontrol eder veya zincirdeki son nesnedeysek çapraz geçişi sonlandırır.
     */
    protected boolean checkNext(String email, String password){

        if (next == null){
            return true;
        }

        return next.check(email,password);

    }


}
