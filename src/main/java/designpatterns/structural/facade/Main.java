package designpatterns.structural.facade;

import designpatterns.structural.facade.model.Customer;
import designpatterns.structural.facade.model.Product;

public class Main {
    public static void main(String[] args) {

       /*
       * Facade tasarım kalıbı, yazılım geliştirmede karmaşık bir alt sistemi basitleştirerek,
       * istemci tarafından daha kolay erişilebilir hale getirir. Bu kalıp, aşağıdaki gibi
       * belirli sorunları çözmek için kullanılabilir:
       * 1 Karmaşık alt sistemlerin soyutlanması
       * 2 Arayüz sadeleştirme
       * 3 Bağımlılıkları yönetme
       * 4 Kolay kullanım ve entegrasyon
       *
       *
       *  */
        /*
        * Birçok web uygulaması, farklı özelliklere sahip farklı servis sağlayıcılarla entegre olabilir. Örneğin,
        * bir e-ticaret uygulaması, ürün envanterini kontrol etmek, kullanıcıları yönetmek, ödemeleri işlemek ve diğer
        *  birçok işlemi gerçekleştirmek için farklı servis sağlayıcılarını kullanabilir.
        *
        *
        * Kısaca şöylece özetlenebilir aslında bu tasarım kalıbı sürekli olarak kullandığımız bir yapı ama farkında değiliz.
        * Şöyle ki örneğin bir eticaret uygulamasında gelen bir istek ile ilgili bir dünya iş yapılmaktadır.
        * Bu işlerin hepsini biz örneğin controller dan aldık servis katmanında pek çok iş yaptık veritabanına gittik başka servisler tükettik
        * gibi karmaşık işler yaptık ama bunu controller dan gelen sadece tek bir istek üzerine örneğin sipariş oluştur.
        * service katmanı yani business logic kısmında hallettik aslında bizim business katmanında yaptığımız iş
        * facade tasarım kalıbı olmuş oluyor.
        *
        * Aşağıdaki örnek temsilidir sipariş yönetiminin çok daha karmaşık yapıları olacaktır.
        * */
        OrderFacade orderFacade = new OrderFacade();

        Product product = new Product("PC",5000D, 5L);
        Customer customer = new Customer("Hakan", "hakandereli28@gmail.com", "İstanbul");
        orderFacade.placeOrder(product, customer, 5000D);


        /*
        * Facade tasarım kalıbı olmasaydı, aşağıdaki durumlar ortaya çıkabilir:

Karmaşık alt sistemlerin kullanımı: Facade tasarım kalıbı, alt sistemlerin karmaşıklığını gizler ve istemciye basit bir arayüz sağlar. Facade olmadan, istemci doğrudan alt sistemlerle etkileşim kurmak zorunda kalır ve karmaşık detaylara hakim olması gerekir.

Bağımlılık sorunları: İstemci, bir sistemin alt bileşenlerine doğrudan bağımlı olduğunda, alt sistemlerdeki herhangi bir değişiklik, istemciyi de etkileyebilir. Facade tasarım kalıbı, alt sistemler arasındaki bağımlılığı azaltır ve istemciyi değişikliklere karşı daha az hassas hale getirir.

Kod karmaşıklığı: Karmaşık sistemlerde, istemci kodu alt sistemlerle doğrudan etkileşim kurduğunda, kod karmaşık hale gelebilir. Facade tasarım kalıbı, istemci kodunu basitleştirir ve daha anlaşılır bir yapı sunar.

Esneklik eksikliği: Facade tasarım kalıbı, alt sistemlerin iç detaylarından soyutlandığı için, alt sistemlerin değiştirilmesi veya yeni alt sistemlerin eklenmesi daha kolay olur. Facade olmadan, alt sistemlerin değiştirilmesi veya yeni alt sistemlerin entegrasyonu daha karmaşık ve zaman alıcı olabilir.

Tekrarlanan kod: İstemci, aynı işlemleri farklı alt sistemler için tekrar tekrar yapmak zorunda kalabilir. Facade tasarım kalıbı, bu tekrarı önler ve istemciye daha basit ve tekrarsız bir arayüz sağlar.

Bu nedenlerle, Facade tasarım kalıbı, bir sistemdeki karmaşık alt sistemlerin yönetimini ve istemci kodunun basitleştirilmesini sağlar. Bu tasarım kalıbı olmadığında, daha karmaşık, bağımlı, tekrarlayan ve zor yönetilebilir bir kod yapısı ortaya çıkabilir.
        * */
    }
}
