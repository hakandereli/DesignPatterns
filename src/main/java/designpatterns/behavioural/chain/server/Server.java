package designpatterns.behavioural.chain.server;

import designpatterns.behavioural.chain.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {

    // Key : email , value: password
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    /**
     * EN : Client passes a chain of object to server. This improves flexibility and
     * makes testing the server class easier.
     */

    /**
     * TR: Müşteri, bir nesne zincirini sunucuya iletir. Bu, esnekliği artırır ve
     * sunucu sınıfının test edilmesini kolaylaştırır.
     */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successfull!");

            //EN: Do something useful here for authorized users.
            //TR: Burada yetkili kullanıcılar için yararlı bir şeyler yapın.

            return true;
        }
        return false;
    }

    //Kullanıcı ekliyor
    public void register(String email, String password){
        users.put(email,password);
    }

    //gelen emalini kontrol ediyor map de var mı diye. ContainsKey keyleri arar email zaten key di.
    public boolean hasEmail(String email){
        return users.containsKey(email);
    }

    //Get metodu içine girilen key in value sunu dönüyor valuue password zaten .equals ile bunu kontrol ediyor.
    //gelen veri ile map deki eşit mi diye.
    public boolean isValidPassword(String email, String password){
        return users.get(email).equals(password);
    }

}
