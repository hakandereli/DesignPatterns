package designpatterns.structural.bridge;

import main.java.designpatterns.structural.bridge.*;

public class Main {

//    Bridge tasarım kalıbı, yapısal bir tasarım kalıbıdır ve iki ayrı hiyerarşiyi birbirinden bağımsız olarak
//    geliştirmek ve birleştirmek için kullanılır. Bu kalıp, birbirleriyle ilişkili olan sınıflar arasındaki sıkı
//    bağımlılığı azaltır ve değişikliklere daha esnek bir şekilde yanıt verebilme imkanı sağlar.
//
//    Bridge tasarım kalıbının kullanılmasının bazı avantajları şunlardır:
//
//    Soyutlama ve uygulama ayrımı: Kalıpta, soyutlama (abstraction) ve uygulama (implementation) kavramları ayrılır.
//    Bu sayede her ikisini bağımsız olarak değiştirme ve geliştirme imkanı sağlanır.
//
//   Genişletilebilirlik: Kalıp, yeni soyutlama sınıfları veya uygulama sınıfları eklenmesine olanak tanır.
//   Bu sayede sistemin genişletilebilirliği artar.
//
//   Esneklik: Bridge tasarım kalıbı, birbirine bağımlı sınıflar arasında bir kopukluk sağlar.
//   Bu sayede bir tarafın değişmesi diğer tarafı etkilemez. Bu da daha esnek ve bakımı kolay bir yapı sağlar.
//


//    Diyelim ki bir taşıt (vehicle) sınıfı ve bu sınıftan türetilen araba (car) ve kamyon (truck) sınıfları var.
//    Ayrıca, taşıtların farklı yakıt türlerini (benzin, dizel, elektrik) desteklediğini düşünelim.
//    İlk başta, yakıt türünü taşıt sınıfına doğrudan ekleyelim

    public static void main(String[] args) {
        Vehicle car = new Car(new Petrol());
        car.start(); //"Benzinle Çalıştırılıyor"

        Vehicle truck = new Truck(new Diesel());
        truck.start();// Dizel ile çalıştırılıyor
    }

}
