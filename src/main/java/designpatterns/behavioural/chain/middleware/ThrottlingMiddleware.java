package designpatterns.behavioural.chain.middleware;

/**
 * ConcreteHandler. Checks whether there are too many failed login requests.
 */

/**
 * İşleyici. Çok fazla başarısız oturum açma isteği olup olmadığını kontrol eder.
 */
public class ThrottlingMiddleware extends Middleware {

    private int requestPerMinute;
    private int request;
    private long currenTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currenTime = System.currentTimeMillis();
    }

    /**
     * Please, not that checkNext() call can be inserted both in the beginning
     * of this method and in the end.
     *
     * This gives much more flexibility than a simple loop over all middleware
     * objects. For instance, an element of a chain can change the order of
     * checks by running its check after all other checks.
     */

    /**
     * Lütfen checkNext() çağrısının her ikisinin de başlangıca eklenemeyeceğini unutmayın.
     * Bu yöntemin ve sonunda.
     * <p>
     * Bu, tüm ara yazılımlar üzerinde basit bir döngüden çok daha fazla esneklik sağlar
     * nesneler. Örneğin, bir zincirin bir elemanı sırasını değiştirebilir.
     * Diğer tüm kontrollerden sonra kendi kontrolünü çalıştırarak kontrol eder.
     */

    @Override
    public boolean check(String email, String password) {

        if (System.currentTimeMillis() > currenTime + 60_000) {
            request = 0;
            currenTime = System.currentTimeMillis();
        }

        request++;

        if (request > requestPerMinute) {
            System.out.println("Request limit exceded!");
            Thread.currentThread().stop();
        }

        return checkNext(email, password);
    }
}
