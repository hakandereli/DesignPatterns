package designpatterns.behavioural.chain;

import designpatterns.behavioural.chain.middleware.Middleware;
import designpatterns.behavioural.chain.middleware.RoleCheckMiddleware;
import designpatterns.behavioural.chain.middleware.ThrottlingMiddleware;
import designpatterns.behavioural.chain.middleware.UserExistsMiddleware;
import designpatterns.behavioural.chain.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * EN: Demo class. Everything comes together here.
 *
 * TR: Tanıtım sınıfı. Burada her şey bir araya geliyor.
 */
public class Demo {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {

        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // EN: All checks are linked. Client can build various chains using the
        // same components.
        //
        // TR: Tüm kontroller bağlantılıdır. İstemci, aynı bileşenleri kullanarak çeşitli zincirler oluşturabilir.
        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        // EN: Server gets a chain from client code.
        //
        // TR: Sunucu, istemci kodundan bir zincir alır.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
